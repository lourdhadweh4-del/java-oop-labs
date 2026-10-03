# Java OOP Labs
This repository contains Java Object-Oriented Programming (OOP) lab exercises completed as part of my Computer Science coursework.

[Back to portfolio](https://github.com/lourdhadweh4-del) · [Coursework index](https://github.com/lourdhadweh4-del/lourdhadweh4-del/blob/main/COURSEWORK.md)

## Repository guide

These are learning exercises. Each source folder is compiled separately because some exercises reuse class names.

| Source folder | Java files | Programs with a `main` method |
| --- | ---: | --- |
| [.](./) | 19 | [Course_Main](Course_Main.java), [Employee_Main](Employee_Main.java), [Patient_Main](Patient_Main.java), [Product_Main](Product_Main.java), [Transaction_Main](Transaction_Main.java) |
| [src](src) | 11 | [Average](src/Average.java), [Average1](src/Average1.java), [PersonAccess](src/PersonAccess.java), [Person_Main](src/Person_Main.java), [ProfessorAccess](src/ProfessorAccess.java), [StudentAccess](src/StudentAccess.java), [TestAccount](src/TestAccount.java) |

## Compile and run

Install a JDK with `javac` and `java` available. The source folders below were compiled successfully with **JDK 24.0.2**. Run commands from the repository root.

### Root exercises

```bash
mkdir -p build/root
javac -d build/root *.java
java -cp build/root Courses.Course_Main
```

### src

```bash
mkdir -p build/src
javac -d build/src src/*.java
java -cp build/src Average
```

Choose another entry point from the table to run a different exercise. Some programs prompt for console input; others demonstrate object construction without printing output.

## Scope

These repositories document programming practice and coursework. Successful compilation is a basic check; it does not mean every exercise has complete input validation or production-level behavior.
