del /s /q src\edu\toronto\cs\model\goal\*
del /s /q  META-INF
del /s /q  build.properties
del /s /q  plugin.*
del /s /q  ..\edu.toronto.cs.goal.edit
del /s /q  ..\edu.toronto.cs.goal.editor
del /s /q  ..\edu.toronto.cs.goal.tests
copy ..\backup\*.* src\edu\toronto\cs\model\goal
