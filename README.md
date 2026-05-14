# HOLA ESTE REPOSITORIO ES UN RECORRID DE TODO LO QUE APRENDIDO ASTA EL MOMENTO

## TIPOS DE DATOS PRIMITIVOS EN JAVA

|NOMBRE |TIPO| DESCRIPCION|USO|
|:---|:---|:---|:---|
|byte|Entero |Rango de -128 a 127|Representar numeros poco gigantes: edad de una persona|
|int|Entero|Rango de -2 millones a 2 millones|Representar numeros estandares : cantidades|
|long|Entero|Rango de -9 trillones a 9 trillones|Representar numeros imensos :IDs de una db|
|float|Decimal|Rango de $-3.4 \times 10^{38}$ a  $3.4 \times 10^{38}$|Representar numeros fijos en decimales: coordenadas graficas |
|double|Decimal|Rango de $-1.79 \times 10^{308}$ a  $1.7 \times 10^{308}$|Representar numeros decimales extensos: Calculos Cientificos|
|boolean|Estado logico|Verdadero o flaso|Representar estados logicos: verdadero o false|
|char|Caracter| Es unicode solo almacena un caracter|Almacenar un caracter:parser|

## TIPO DE DATOS NO PRIMITIVOS

| NOMBRE | TIPO | DESCRIPCION | USO |
| :--- | :--- | :--- | :--- |
| **String** | Cadena | Almacenar una cadena de texto | Representar texto: URL, JSON, etc. |
| **Object** | Objeto | Creado por el programador | Representar objetos del mundo real. |

---

## OPERACIONES EN PROGRAMACIÓN

### 1. ARITMÉTICOS
Se usan para cálculos matemáticos.

| SÍMBOLO | OPERACIÓN | USO |
| :---: | :--- | :--- |
| `+` | Suma | Concatenar strings o sumar números. |
| `-` | Resta | Diferencia entre valores. |
| `*` | Multiplicación | Producto de factores. |
| `/` | División | Cociente (si usas `int`, el resultado será entero). |
| `%` | Módulo | El residuo de una división (ej. saber si un número es par). |

### 2. LÓGICOS
Se usan para combinar expresiones booleanas.

| SÍMBOLO | OPERACIÓN | USO |
| :---: | :--- | :--- |
| `&&` | AND (Y) | Devuelve `true` si AMBAS condiciones son verdaderas. |
| `||` | OR (O) | Devuelve `true` si AL MENOS UNA es verdadera. |
| `!` | NOT (NO) | Invierte el valor (true a false y viceversa). |

### 3. COMPARACIÓN
Siempre devuelven un valor **boolean**.

| SÍMBOLO | OPERACIÓN | USO |
| :---: | :--- | :--- |
| `==` | Igual a | Verifica si dos valores son idénticos. |
| `!=` | Diferente de | Verifica si dos valores no coinciden. |
| `>` | Mayor que | Comparación de magnitud. |
| `<` | Menor que | Comparación de magnitud. |
| `>=` | Mayor o igual | Comparación inclusiva. |
| `<=` | Menor o igual | Comparación inclusiva. |

### 4. DESPLAZAMIENTO BITS (Bitwise)
Operaciones de bajo nivel sobre la representación binaria.

| SÍMBOLO | OPERACIÓN | USO |
| :---: | :--- | :--- |
| `<<` | Desplazamiento Izq. | Multiplica el número por potencias de 2. |
| `>>` | Desplazamiento Der. | Divide el número por potencias de 2. |
| `&` | AND a nivel de bits | Filtrar bits específicos (máscaras). |
| `^` | XOR | Criptografía básica o intercambio de valores. |

---

## LA ESTRUCTURA CONDICIONAL IF

Hace uso de un dato **boolean** (o una expresión que resulte en boolean) para decidir si ejecuta un bloque de código.

### Ejemplo en Java
```java
int edad = 18;

if (edad >= 18) {
    System.out.println("Es mayor de edad");
} else {
    System.out.println("Es menor de edad");
}




