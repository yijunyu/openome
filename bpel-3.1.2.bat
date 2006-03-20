@echo off
set IDE=D:\IDE\java\eclipse
set IDE2=D:/IDE/java/eclipse
set ECLIPSE_HOME=%IDE%\sdk\3.1.2\eclipse
rmdir /q /s %ECLIPSE_HOME%\links
mkdir %ECLIPSE_HOME%\links
echo path=%IDE2%/test/3.1.0 > %ECLIPSE_HOME%\links\test.link
echo path=%IDE2%/emf/2.1.2 > %ECLIPSE_HOME%\links\emf.link
echo path=%IDE2%/delta/3.1.2 > %ECLIPSE_HOME%\links\delta.link
set DATA=.
set CONFIG=%DATA%\.configuration
rmdir /q /s %CONFIG%
mkdir %CONFIG%
set JVM="C:\Program files\java\jre1.5.0_06\bin\javaw.exe"
copy %ECLIPSE_HOME%\configuration\config.ini %CONFIG%
%ECLIPSE_HOME%\eclipse.exe -vm %JVM% -configuration %CONFIG% -data %DATA% -showLocation -nosplash -vmargs -Xms256m -Xmx512m
