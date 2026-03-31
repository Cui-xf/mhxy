#!/bin/bash

#/Library/Java/JavaVirtualMachines/jdk1.8.0_411.jdk/Contents/Home/jre/bin/java -cp /Users/cxf/temp/mhxy/mnq/kemnnx64/KEmulator.jar -Djava.library.path=/Users/cxf/temp/mhxy/mnq/kemnnx64 -XstartOnFirstThread -Dfile.encoding=UTF-8 -javaagent:/Users/cxf/temp/mhxy/mnq/kemnnx64/KEmulator.jar emulator.Emulator -awt -lwj -mascotgl -s
#/Library/Java/JavaVirtualMachines/jdk1.8.0_411.jdk/Contents/Home/jre/bin/java -cp /Users/cxf/temp/mhxy/mnq/kemnnx64/KEmulator.jar  -Djava.library.path=/Users/cxf/temp/mhxy/mnq/kemnnx64 -XstartOnFirstThread emulator.Emulator "/Users/cxf/temp/mhxy/mhxy_s/games.jar" -awt -lwj -mascotgl -s
/Library/Java/JavaVirtualMachines/jdk1.8.0_411.jdk/Contents/Home/jre/bin/java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005 -cp /Users/cxf/temp/mhxy/mnq/kemnnx64/KEmulator.jar  -Djava.library.path=/Users/cxf/temp/mhxy/mnq/kemnnx64 -XstartOnFirstThread emulator.Emulator "/Users/cxf/temp/mhxy/mhxy_s/bin/mhxy_s.jar" -awt -lwj -mascotgl -s
