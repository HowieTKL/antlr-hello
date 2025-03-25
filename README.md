# antlr-hello
Simple Java hello world parser generated with antlr. Documented here because it took me quite a while to find a [build.gradle](build.gradle) script, which has been subsequently streamlined, that worked alongside IntelliJ. [Hello.g4](src/main/antlr/org/howietkl/parser/Hello.g4) grammar is as follows:

```
grammar Hello;
msg   : 'Hello' ID;
ID  : [a-z]+ ;
WS  : [ \t\r\n]+ -> skip ;
```

IntelliJ's Antlr plugin parse tree in action with "Hello world":

<img width="536" alt="antlr hello" src="https://github.com/user-attachments/assets/ce14f407-5ed9-4997-82af-694639b93462" />

Enclosed a simple [visitor](src/main/java/org/howietkl/MyVisitor.java) implementation:
```
> gradlew.bat run
world says hello
```
