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
|NOMBRE|TIPO|DESCRIPCION|USO|
|:---|:---|:---|
|String|cadena|Almacenar una cadena de texto|Representar  texto: url,json,etc|
|objt|Objeto|Este tipo de dato es creado por el programador|Representar objetos del mundo real|
## OPERACIONES EN PROGRAMACIÓNARITMÉTICOS
Se usan para cálculos matemáticos.SÍMBOLOOPERACIÓNUSO+SumaConcatenar strings o sumar números.-RestaDiferencia entre valores.*MultiplicaciónProducto de factores./DivisiónCociente (ojo: si usas int, el resultado será entero).%MóduloEl residuo de una división (útil para saber si un número es par).LÓGICOSSe usan para combinar expresiones booleanas.SÍMBOLOOPERACIÓNUSO&&AND (Y)Devuelve true si AMBAS condiciones son verdaderas.||OR (O)Devuelve true si AL MENOS UNA condición es verdadera.!NOT (NO)Invierte el valor (true a false y viceversa).COMPARACIÓNSiempre devuelven un valor boolean.SÍMBOLOOPERACIÓNUSO==Igual aVerifica si dos valores son idénticos.!=Diferente deVerifica si dos valores no coinciden.>Mayor queComparación de magnitud.<Menor queComparación de magnitud.>=Mayor o igualComparación inclusiva.<=Menor o igualComparación inclusiva.DESPLAZAMIENTO BITS (Bitwise)Operaciones de bajo nivel sobre la representación binaria.SÍMBOLOOPERACIÓNUSO<<Desplazamiento IzquierdaMultiplica el número por potencias de 2.>>Desplazamiento DerechaDivide el número por potencias de 2 (mantiene el signo).&AND a nivel de bitsFiltrar bits específicos (máscaras).^XORCriptografía básica o intercambio de valores.LA ESTRUCTURA CONDICIONAL IFHace uso de un dato boolean (o una expresión que resulte en boolean) para decidir si ejecuta un bloque de código.Ejemplo en JavaJavaint edad = 18;

if (edad >= 18) {
    System.out.println("Es mayor de edad");
} else {
    System.out.println("Es menor de edad");
}





