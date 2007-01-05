@echo off
set JVM="C:\Program files\java\jre1.5.0_09\bin\javaw.exe"
set IDE=C:\IDE
set SDK=.
set projects=
for %%p IN (%products%) DO call %%p.bat
pushd %IDE%
set IDEPATH=%CD%
popd
pushd %SDK%
set SDKPATH=%CD%
popd
goto :main
REM ==================================================================

:configure_eclipse_products
for %%p IN (%products%) DO call :%%p
goto :eof

:open_projects
for %%p IN (%projects%) DO call :open_project %%p 
goto :eof

:close_projects
for %%p IN (%projects%) DO call :close_project %%p 
goto :eof

:open_project
if not exist %1 %IDE%\bin\junction.exe %1 %SDKPATH%\%1
goto :eof

:close_project
if exist %1 %IDE%\bin\junction.exe /d %1
goto :eof

:main
call :open_projects
call :get_ide_path
call :configure_eclipse_path
call :configure_eclipse_products
call :start_eclipse
call :close_projects
goto :eof

:configure_eclipse_path
set ECLIPSE_HOME=%IDEPATH%\sdk\3.2\eclipse
rmdir /q /s %ECLIPSE_HOME%\links
mkdir %ECLIPSE_HOME%\links
set DATA=.
set CONFIG=%DATA%\.configuration
rmdir /q /s %CONFIG%
mkdir %CONFIG%
copy %ECLIPSE_HOME%\configuration\config.ini %CONFIG%
goto :eof

:start_eclipse
%ECLIPSE_HOME%\eclipse.exe -vm %JVM% -configuration %CONFIG% -data %DATA% -showLocation -nosplash -vmargs -Xms256m -Xmx512m
goto :eof

:subversion
call :link_product Subversive 1.1.0.M9a
goto :eof

:core
goto :eof

:wbimodel
call :link_product emf 2.2.0
goto :eof

:openome
call :link_product openome 0.0.17
goto :eof

:q7
call :link_product emf 2.2.0
call :oaw
goto :eof

:pf
call :oaw
goto :eof

:oaw
call :link_product emf 2.2.0
call :link_product oaw 4.1.1
goto :eof

:telos
call :link_product batik 1.6.0
goto :eof

:java.ast
call :link_product emf 2.2.0
goto :eof

:goalmodel
call :link_product emf 2.2.0
goto :eof

:fmp
call :link_product emf 2.2.0
call :link_product fmp 0.6.6
goto :eof

:bpel
call :link_product bpel 0.0.1
goto :eof

:get_ide_path
echo %IDEPATH% | %IDE%\bin\sed "s/openome\\\.\.\\//g" | %IDE%\bin\sed "s/\\/\//g" | %IDE%\bin\sed "s/ //" > t.t
set /p ide_path=< t.t
del t.t
goto :eof

:link_product
setlocal
REM %1 = product name
REM %2 = product version
echo path=%ide_path%/%1/%2 > %ECLIPSE_HOME%\links\%1.link
endlocal
goto :eof
