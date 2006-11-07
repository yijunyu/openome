@echo off
REM -- Change the following paths according to your file system --
set IDE=C:\IDE
set IDE2=C:/IDE
set JVM="C:\Program files\java\jre1.5.0_06\bin\javaw.exe"
REM --------------------------------------------------------------
set ECLIPSE_HOME=%IDE%\sdk\3.2\eclipse
rmdir /q /s %ECLIPSE_HOME%\links
mkdir %ECLIPSE_HOME%\links
echo path=%IDE2%/emf/2.2.0 > %ECLIPSE_HOME%\links\emf.link
echo path=%IDE2%/test/3.2.0 > %ECLIPSE_HOME%\links\test.link
echo path=%IDE2%/batik/1.6.0 > %ECLIPSE_HOME%\links\batik.link
echo path=%IDE2%/emft/1.0.1 > %ECLIPSE_HOME%\links\emft.link
echo path=%IDE2%/xerces/2.8.0 > %ECLIPSE_HOME%\links\xerces.link
echo path=%IDE2%/bpel/0.0.1 > %ECLIPSE_HOME%\links\bpel.link
echo path=%IDE2%/fmp/0.6.6 > %ECLIPSE_HOME%\links\fmp.link
REM echo path=%IDE2%/openome/0.0.15 > %ECLIPSE_HOME%\links\openome.link
echo path=%IDE2%/delta/3.2.0 > %ECLIPSE_HOME%\links\delta.link
REM echo path=%IDE2%/subclipse/1.0.3 > %ECLIPSE_HOME%\links\subclipse.link
set DATA=.
set CONFIG=%DATA%\.configuration
rmdir /q /s %CONFIG%
mkdir %CONFIG%
copy %ECLIPSE_HOME%\configuration\config.ini %CONFIG%
%ECLIPSE_HOME%\eclipse.exe -vm %JVM% -configuration %CONFIG% -data %DATA% -showLocation -nosplash -vmargs -Xms256m -Xmx512m
