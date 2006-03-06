@echo off
set ECLIPSE_HOME=D:\IDE\java\eclipse\sdk\3.1.2\eclipse
set JVM="C:\Program files\java\jre1.5.0_06\bin\javaw.exe"
mkdir %ECLIPSE_HOME%\links
echo path=D:/IDE/java/eclipse/emf/2.1.2 > %ECLIPSE_HOME%\links\emf.link
echo path=D:/IDE/java/eclipse/testframework/3.1.2 > %ECLIPSE_HOME%\links\test.link
echo path=D:/IDE/java/eclipse/subclipse/0.9.105 > %ECLIPSE_HOME%\links\subclipse.link
REM echo path=D:/IDE/java/eclipse/mylar/0.4.6.1 > %ECLIPSE_HOME%\links\mylar.link
REM echo path=D:/IDE/java/eclipse/openome/0.0.14 > %ECLIPSE_HOME%\links\openome.link
copy %ECLIPSE_HOME%\configuration\config.ini .configuration
%ECLIPSE_HOME%\eclipse.exe -vm %JVM% -configuration .configuration -data . -showLocation -nosplash -vmargs -Xms256m -Xmx386m
del /s /q %ECLIPSE_HOME%\links
