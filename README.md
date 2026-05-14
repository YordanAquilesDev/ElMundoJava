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

if (edad >= 18) { // si es true dentra  al bloque de codigo
    System.out.println("Es mayor de edad"); 
} else { //  si no  entra al otro bloque de codigo
    System.out.println("Es menor de edad");
}
 ```

## LA ESTRUCTURA CONDICIONAL SWITCH

Busca simplificar  a la condicional if anidada o multiple 
### Ejemplo en java
```java
int dia = 3;
String nombreDia;

switch (dia) {
    case 1:
        nombreDia = "Lunes";
        break;
    case 2:
        nombreDia = "Martes";
        break;
    case 3:
        nombreDia = "Miércoles";
        break;
    default:
        nombreDia = "Día no válido";
        break;
}

System.out.println("Hoy es: " + nombreDia);
 ```
## BUCLES
### BUCLE FOR
 Es el buble que se  usa caundo se sabe cuantas  veces quieres repetir una accion
 ### ejemplo en java
 ```java
 // su estructura es 
 // se declra la variable  a evaluar
 // se ase un condicion con limite conocido o especificado 
 // se incrementa para asercar a su condicion asa que cumpla
 for(int i=1;i<=7;i++){// recorre por dias de la semana
   switch(i){
    case 1: 
        System.out.println("El dia es " + "Lunes");
         break;
    case 2: 
         System.out.println("El dia es " + "Martes");
         break;
    case 3: 
         System.out.println("El dia es " + "Miercoles");
        break;
    case 4: 
          System.out.println("El dia es " + "Jueves");
         break;
    case 5: 
           System.out.println("El dia es " + "Viernes");
           break;
    case 6: 
          System.out.println("El dia es " + "Sabado");
         break;
    default:
          System.out.println("El dia es " + "Domingo");
         break;
   }

 }
 ```
 Tambien podemos ver un for muy distinto alo  tradicional 
el For-Each (Mejorado)
 ```java
String[] nombres = {"Ana", "Luis", "Juan"};
// este es un for-each  mas simple y facil de implementar 
// que el for tradicional

// su estructura es simple  declaras una varibale  del mismo tipo de tu vector
// :  el nombre de tu vector 
for (String nombre : nombres) {
    System.out.println("Persona: " + nombre);
}

// util para recorrer un vector 
int[] edades= {13,32,18}
for(int edad: edades){
     System.out.println("Edad: " + edad);
}

 ```
## WHILE
Este bucle  ya no es com en for que sabes  cuantas veces quieres repetir 
   este bucle se usa cuando   no saves cuantas veces se repetira una accion
   ### ejemplo en java
   ```java
    String dejarDeJugar="NO"
   boolean juegoTerminado=false
   while(juegoTerminado){
    String dejarDeJugar="NO"
    if(dejarDEJugar!="NO"){
        juegoTerminado=true;
    }else{
        juegoTerminado=false
    }
    System.out.println("Quiere seguir jugando");
   dejarDeJugar=scanner.nextLine();



   }