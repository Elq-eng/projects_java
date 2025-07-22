# 📦 Project 01 - Java Fundamentals

Este es un proyecto básico en Java que explora conceptos fundamentales del lenguaje, como:

- Tipos primitivos
- Operadores básicos
- Organización en paquetes
- Estructura de carpetas estándar (`src/main/java`)

---

## 🗂️ Estructura del Proyecto
project_01/
├── src/
│ └── main/
│       └── java/
│           └── com/
│               └── project/
│                   ├── Main.java
│                   └── bases/
│                   ├── operadores_basicos/
│                   |   └── OperatorBasic.java
│                   └── datos_primitivos/
│                       └── TiposPrimitivos.java
├── target/ # Archivos .class compilados van aquí
└── README.md

## (linux)
```bash

rm -rf target
mkdir target
javac -d target $(find src/main/java -name "*.java")
java -cp target main.java.com.project.Main
```

## (windows)
```bash
Remove-Item -Recurse -Force target
New-Item -ItemType Directory -Path target
javac -d target (Get-ChildItem -Recurse -Filter *.java -Path src\main\java | ForEach-Object { $_.FullName })
java -cp target main.java.com.project.Main
```
