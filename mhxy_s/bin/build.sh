#!/bin/bash
#
# Build / preverify / jar for mhxy_s
# Run only from this directory (mhxy_s/bin).
#
set -e

DEMO=mhxy_s

# TODO: 设置 JDK 8 路径
#JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_411.jdk/Contents/Home"  # e.com.cc.g. /Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home
JAVA_HOME="/mhxy/jdk1.4/j2sdk1.4.2_19"  # e.com.cc.g. /Library/Java/JavaVirtualMachines/zulu-8.jdk/Contents/Home

# TODO: 设置 J2ME 工具路径（包含 lib/ 和 bin/preverify）
J2ME_HOME="/mhxy/j2me/WTK2.5.2"  # e.com.cc.g. /opt/j2me

LIB_DIR="${J2ME_HOME}/lib"
CLDCAPI="${LIB_DIR}/cldcapi10.jar"
# project: MIDP 1.0 (see mhxy_s.jad / project.properties)
MIDPAPI="${LIB_DIR}/midpapi20.jar"
PREVERIFY="${J2ME_HOME}/bin/preverify"

JAVAC="${JAVA_HOME}/bin/javac"
JAR="${JAVA_HOME}/bin/jar"

# --- 检查工具是否存在 ---
if [ ! -x "$JAVAC" ]; then
  echo "*** JDK not found: $JAVAC"
  exit 1
fi
if [ ! -f "$CLDCAPI" ]; then
  echo "*** CLDC API jar not found: $CLDCAPI"
  exit 1
fi
if [ ! -f "$MIDPAPI" ]; then
  echo "*** MIDP API jar not found: $MIDPAPI"
  exit 1
fi

if [ ! -x "$PREVERIFY" ]; then
  echo "*** preverify not found: $PREVERIFY"
  exit 1
fi

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"

if [ ! -f "${SCRIPT_DIR}/${DEMO}.jad" ]; then
  echo "*** Run this script from its location directory only. ***"
  exit 1
fi

# 收集所有 Java 源文件
SRC_LIST="${SCRIPT_DIR}/mhxy_s_sources.txt"
find "${SCRIPT_DIR}/../src" -name '*.java' > "$SRC_LIST" 2>/dev/null

if [ ! -s "$SRC_LIST" ]; then
  echo "*** No .java files found under ../src"
  exit 1
fi
echo "*** Java sources (javac @file: $SRC_LIST)"
echo "***"

echo "*** Creating directories ***"
mkdir -p "${SCRIPT_DIR}/../tmpclasses"
mkdir -p "${SCRIPT_DIR}/../classes"

echo "*** Compiling source files ***"
# Source files are UTF-8
"$JAVAC" -encoding UTF-8 \
  -bootclasspath "${CLDCAPI}:${MIDPAPI}" \
  -source 1.4 -target 1.4 \
  -d "${SCRIPT_DIR}/../tmpclasses" \
  -classpath "${SCRIPT_DIR}/../tmpclasses" \
  @"$SRC_LIST"

echo "*** Preverifying class files ***"
"$PREVERIFY" \
  -classpath "${CLDCAPI}:${MIDPAPI}:${SCRIPT_DIR}/../tmpclasses" \
  -d "${SCRIPT_DIR}/../classes" \
  "${SCRIPT_DIR}/../tmpclasses"

echo "*** Jaring preverified class files ***"
"$JAR" cmf "${SCRIPT_DIR}/MANIFEST.MF" "${SCRIPT_DIR}/${DEMO}.jar" \
  -C "${SCRIPT_DIR}/../classes" .

if [ -d "${SCRIPT_DIR}/../res" ]; then
  echo "*** Jaring resource files ***"
  "$JAR" uf "${SCRIPT_DIR}/${DEMO}.jar" -C "${SCRIPT_DIR}/../res" .
fi

echo "***"
echo "*** Don't forget to update the JAR file size in the JAD file!!! ***"
echo "***"
