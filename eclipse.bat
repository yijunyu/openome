@echo off
set ECLIPSE_HOME=D:\IDE\sdk\3.2M4\eclipse
D:\IDE\junction %ECLIPSE_HOME%\links .configuration\links
copy %ECLIPSE_HOME%\configuration\config.ini .configuration
%ECLIPSE_HOME%\eclipse.exe -vm "C:\Program files\java\jre1.5.0_06\bin\javaw.exe" -configuration .configuration -data . -showLocation -nosplash -vmargs -Xms256m -Xmx386m
D:\IDE\junction /d %ECLIPSE_HOME%\links
