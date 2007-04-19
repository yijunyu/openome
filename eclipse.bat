set ECLIPSE_SDK=C:\IDE\sdk\3.2.1
del /y configuration
mkdir configuration
copy %ECLIPSE_SDK%\eclipse\configuration\config.ini configuration
rd /s /q %ECLIPSE_SDK%\eclipse\links
mkdir %ECLIPSE_SDK%\eclipse\links
copy links\*.* %ECLIPSE_SDK%\eclipse\links
start /b %ECLIPSE_SDK%\eclipse\eclipse.exe -plugincustomization plugin_customization.ini -configuration configuration -data workspace
