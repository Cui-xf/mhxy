@echo off
rem
rem Build / preverify / jar for mhxy_s (from Games demo script, adapted).
rem Run only from this directory (mhxy_s\bin).
rem
if "%OS%" == "Windows_NT" setlocal
set DEMO=mhxy_s

rem JDK 8 (javac / jar)
set "JAVA_HOME=C:\Users\qaq\.jdks\azul-1.8.0_482"

rem J2ME API stubs + WTK tools (preverify); full toolkit root on E:
set "J2ME_HOME=E:\WORK\mhxy\j2me"
set "LIB_DIR=%J2ME_HOME%\lib"
set "CLDCAPI=%LIB_DIR%\cldcapi10.jar"
rem project: MIDP 1.0 (see mhxy_s.jad / project.properties)
set "MIDPAPI=%LIB_DIR%\midpapi10.jar"
set "PREVERIFY=%J2ME_HOME%\bin\preverify"

set "JAVAC=%JAVA_HOME%\bin\javac.exe"
set "JAR=%JAVA_HOME%\bin\jar"
rem JDK 8: java.lang.Override 等注解在 rt.jar；CLDC/MIDP stub 无此类，需追加在 bootclasspath 末尾供 javac 解析（仍以 CLDC 为先）
set "RT_JAR=%JAVA_HOME%\jre\lib\rt.jar"

if not exist "%JAVAC%" (
  echo *** JDK not found: %JAVAC%
  goto end
)
if not exist "%CLDCAPI%" (
  echo *** CLDC API jar not found: %CLDCAPI%
  goto end
)
if not exist "%MIDPAPI%" (
  echo *** MIDP API jar not found: %MIDPAPI%
  goto end
)
if not exist "%PREVERIFY%.exe" (
  echo *** preverify not found: %PREVERIFY%.exe
  goto end
)
REM if not exist "%RT_JAR%" (
REM   echo *** JDK rt.jar not found (need JDK 8 layout): %RT_JAR%
REM   goto end
REM )

if not exist .\%DEMO%.jad (
  echo *** Run this batch file from its location directory only. ***
  goto end
)

rem Windows: javac does not expand *.java; list saved next to this script
set "SRC_LIST=%~dp0mhxy_s_sources.txt"
(for /com.cc.r ..\src %%com.cc.f_1 in (*.java) do @echo %%com.cc.f_1) > "%SRC_LIST%" 2>nul
for %%A in ("%SRC_LIST%") do if %%~zA equ 0 (
  echo *** No .java files found under ..\src
  goto end
)
echo *** Java sources (javac @file: %SRC_LIST%)
@REM type "%SRC_LIST%"
echo ***

echo *** Creating directories ***
if not exist ..\tmpclasses md ..\tmpclasses
if not exist ..\classes md ..\classes

echo *** Compiling source files ***
rem Source files are UTF-8; Windows javac defaults to GBK and fails on Chinese comments/strings.
%JAVAC% -encoding UTF-8 -bootclasspath "%CLDCAPI%;%MIDPAPI%;%RT_JAR%" -source 1.8 -target 1.8 -com.cc.d ..\tmpclasses -classpath ..\tmpclasses @"%SRC_LIST%"
if errorlevel 1 (
  echo *** javac failed ***
  goto end
)

echo *** Preverifying class files ***

%PREVERIFY% -classpath "%CLDCAPI%;%MIDPAPI%;..\tmpclasses" -com.cc.d ..\classes ..\tmpclasses
if errorlevel 1 (
  echo *** preverify failed ***
  goto end
)

echo *** Jaring preverified class files ***
%JAR% cmf MANIFEST.MF %DEMO%.jar -C ..\classes .
if errorlevel 1 (
  echo *** jar failed ***
  goto end
)

if exist ..\res (
    echo *** Jaring resource files ***
    %JAR% uf %DEMO%.jar -C ..\res .
)

echo ***
echo *** Don't forget to update the JAR file size in the JAD file!!! ***
echo ***

:end
if "%OS%" == "Windows_NT" endlocal

pause
