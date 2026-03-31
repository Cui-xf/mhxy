@REM -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005
@REM
@REM E:\WORK\mhxy\temp\KEmulatorLite\jre\bin\java.exe  -cp "E:\WORK\mhxy\temp\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "E:\WORK\mhxy\temp\java版梦回西游3区251011.jar" -awt -lwj
@REM E:\WORK\mhxy\jdk8u472-b08\bin\java.exe  -cp "E:\WORK\mhxy\temp\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "E:\WORK\mhxy\temp\java版梦回西游3区251011.jar" -awt -lwj
@REM
@REM E:\WORK\mhxy\jdk8u472-b08\bin\java.exe -javaagent:E:\WORK\mhxy\agent\target\hook-agent.jar  -cp "E:\WORK\mhxy\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "E:\WORK\mhxy\java版梦回西游3区251011.jar" -awt -lwj >>log.out
@REM
@REM E:\WORK\mhxy\jdk8u472-b08\bin\java.exe -javaagent:E:\WORK\mhxy\agent\target\hook-agent.jar  -cp "E:\WORK\mhxy\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "E:\WORK\mhxy\java版梦回西游3区251011.jar" -awt -lwj
@REM
@REM E:\WORK\mhxy\jdk8u472-b08\bin\java.exe  -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005 -javaagent:E:\WORK\mhxy\agent\target\hook-agent.jar  -cp "E:\WORK\mhxy\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "E:\WORK\mhxy\java版梦回西游3区251011.jar" -awt -lwj
@REM
@REM E:\WORK\mhxy\jdk8u472-b08\bin\java.exe  -javaagent:E:\WORK\mhxy\agent\target\hook-agent.jar  -cp "E:\WORK\mhxy\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "E:\WORK\mhxy\java版梦回西游3区251011.jar" -awt -lwj >>log.out
@REM
@REM
@REM E:\WORK\mhxy\jdk8u472-b08\bin\java.exe  -cp "E:\WORK\mhxy\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "C:\Users\qaq\j2mewtk\2.5.2\apps\Games\bin\games.jar" -awt -lwj

@REM 32位jdk 闭源模拟器
E:\WORK\mhxy\jdk8u472-b08\bin\java.exe -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005 -cp "E:\WORK\mhxy\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "E:\WORK\mhxy\mhxy_s\bin\mhxy_s.jar" -awt -lwj


@REM 反编译 java
@REM java -cp "/Applications/IntelliJ IDEA.app/Contents/plugins/java-decompiler/lib/java-decompiler.jar" org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler -dgs=true "/Users/cxf/temp/mhxy/java版梦回西游3区251011.jar" "/Users/cxf/temp/mhxy/mhxy_s/src"


@REM 32位jdk 开源模拟器
@REM E:\WORK\mhxy\jdk8u472-b08\bin\java.exe -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=5005  -cp "E:\WORK\mhxy\KEmulatorLite\KEmulator.jar" emulator.Emulator -jar "E:\WORK\mhxy\mhxy_s\bin\mhxy_s.jar" -awt -lwj

@REM 64 位jdk 开源模拟器
@REM C:\Users\qaq\.jdks\azul-1.8.0_482\bin\java.exe    -cp "E:\WORK\mhxy\mnq\kemnnx64\KEmulator.jar" -Djava.library.path=E:\WORK\mhxy\mnq\kemnnx64 emulator.Emulator  "E:\WORK\mhxy\mhxy_s\bin\mhxy_s.jar" -awt -lwj
