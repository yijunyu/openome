@echo off
set JVM="C:\Program files\java\jre1.5.0_06\bin\javaw.exe"
goto :main

:configure_eclipse_products
call :openome
goto :eof
call :telos
call :q7
call :goalmodel
call :ast
call :fmp
call :bpel
goto :eof

:main
call :get_ide_path
call :configure_eclipse_path
call :configure_eclipse_products
call :start_eclipse
goto :eof

:configure_eclipse_path
set ECLIPSE_HOME=%CD%\IDE\sdk\3.2\eclipse
rmdir /q /s %ECLIPSE_HOME%\links
mkdir %ECLIPSE_HOME%\links
set DATA=.
set CONFIG=%DATA%\.configuration
rmdir /q /s %CONFIG%
mkdir %CONFIG%
copy %ECLIPSE_HOME%\configuration\config.ini %CONFIG%
goto :eof

:start_eclipse
start /b %ECLIPSE_HOME%\eclipse.exe -vm %JVM% -configuration %CONFIG% -data %DATA% -showLocation -nosplash -vmargs -Xms256m -Xmx512m
goto :eof

:openome
call :link_product openome 0.0.17
goto :eof

:q7
goto :eof

:telos
call :link_product batik 1.6.0
goto :eof

:ast
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
call :link_product emf 2.2.0
call :link_product jem 1.2.0
call :link_product draw2d 2.2.0
call :link_product gef 3.2.0M2
call :link_product xerces 2.8.0
call :link_product wsdl4j 1.4.0.v200606181221
call :link_product wsil4j 1.4.0.v200606181221
call :link_product uddi4j 2.0.3
call :link_product wst 1.0.1
call :link_product bpel 0.0.1
goto :eof

:get_ide_path
echo %CD%\IDE | IDE\sed "s/\\/\//g" | IDE\sed "s/ //" > t.t
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
