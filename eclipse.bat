@echo off
set ECLIPSE_HOME=C:\IDE\sdk\3.2M4\eclipse
junction %ECLIPSE_HOME%\links .configuration\links
copy %IDE%\sdk\eclipse\configuration\config.ini .configuration
%ECLIPSE_HOME%\eclipse.exe -configuration .configuration -data . -showLocation -nosplash -vmargs -Xms256m -Xmx386m
junction /d %ECLIPSE_HOME%\links
del .configuration\config.ini
