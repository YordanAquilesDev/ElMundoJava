package dominarJava.javaSE.javaBasico;

import java.util.Hashtable;

public class BusquedaSecuelcial {

    public void BusquedaSecuencialorBloque() {
        int[] datos = { 15, 26, 76, 24, 36,
                45, 81, 43, 28, 19, 14, 55, 99, 78, 62, 88, 47, 83, 72, 68, 49 };
        int vaslorBuscado = 68;
        int tamanoBloque = 5;

        int posicion = BusquedaPorBloque(datos, vaslorBuscado, tamanoBloque);
        if (posicion != -1) {
            System.out.println("El vlaor " + vaslorBuscado + "se encuantra en la posicion " + posicion + ".");
        } else {
            System.out.println(" el valor buscado" + vaslorBuscado + " no se encuantra");
        }

    }

    public int BusquedaPorBloque(int[] arreglos, int valor, int tamaño) {
        int n = arreglos.length;

        for (int i = 0; i < n; i++) {
            int fin = Math.min(i + tamaño, n);
            System.out.println("revisando Bloque Posicion" + i + " a" + (fin - 1));
            for (int j = i; j < fin; j++) {
                System.out.println("Comparando con posicion" + j + ":" + arreglos[j]);
                if (arreglos[j] == valor) {
                    return j;
                }
            }
        }

        return -1;

    }

    public void BusquedaSecuencialPorIndice() {
        int[] datos = { 15, 26, 76, 24, 36,
                45, 81, 43, 28, 19, 14, 55, 99, 78, 62, 88, 47, 83, 72, 68, 49 };
        int vaslorBuscado = 68;
        int indice = BuscarPorIndice(datos, vaslorBuscado);
        if (indice != -1) {
            System.out.println("El vlaor " + vaslorBuscado + "se encuantra en la posicion " + indice + ".");
        } else {
            System.out.println(" el valor buscado" + vaslorBuscado + " no se encuantra");
        }
    }

    public int BuscarPorIndice(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Comparando con indice" + i + ":" + arreglo[i]);
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;

    }

    public void Ejercicio1() {

        String datos[] = { "Juan", "Johana", "Paul", "Julia", "Pablo", "Roberto", "Cinthia", "Maria", "Meury", "Pamela"

        };
        int tamanoBloque = 3;
        String valorBuscado = "Maria";
        int posicion = BusquedaPorBloque(datos, valorBuscado, tamanoBloque);
        if (posicion != -1) {
            System.out.println("El vlaor " + valorBuscado + "se encuantra en la posicion " + posicion + ".");
        } else {
            System.out.println(" el valor buscado" + valorBuscado + " no se encuantra");
        }

    }

    public int BusquedaPorBloque(String[] arreglos, String valor, int tamaño) {
        int n = arreglos.length;

        for (int i = 0; i < n; i++) {
            int fin = Math.min(i + tamaño, n);
            System.out.println("revisando Bloque Posicion" + i + " a" + (fin - 1));
            for (int j = i; j < fin; j++) {
                System.out.println("Comparando con posicion" + j + ":" + arreglos[j]);
                if (arreglos[j] == valor) {
                    return j;
                }
            }
        }

        return -1;

    }

    public void Ejercicio2() {
        String datos[] = { "Juan", "Johana", "Paul", "Julia", "Pablo", "Roberto", "Cinthia", "Maria", "Meury", "Pamela"

        };

        String valorBuscado = "Maria";
        int posicion = BuscarPorIndice(datos, valorBuscado);
        if (posicion != -1) {
            System.out.println("El vlaor " + valorBuscado + "se encuantra en la posicion " + posicion + ".");
        } else {
            System.out.println(" el valor buscado" + valorBuscado + " no se encuantra");
        }

    }

    public int BuscarPorIndice(String[] arreglo, String valor) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Comparando con indice" + i + ":" + arreglo[i]);
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;

    }

    public void Ejercicio3() {
        /*
         * Ejercicio 3:
         * Utilizando la Búsqueda por Transformación de Claves,
         * implemente en java para buscar el dato “Maria” tomando en
         * cuenta que los datos son los siguientes: “Juan”, “Johana”,
         * Pseudocódigo
         * “Paul”, “Julia”, “Pablo”, “Roberto”, “Cinthia”, “Maria”,
         * “Meury”, “Pamela”, aplicar aritmética modular con tamaño
         * de arreglo 10 y Exploración Lineal. Simular en Excel.
         * Los datos deben ser ingresados por código.
         */
        String datos[] = { "Juan", "Johana", "Paul", "Julia", "Pablo", "Roberto", "Cinthia", "Maria", "Meury", "Pamela"

        };

          String valorBuscado = "Maria";
          
        int posicion=BusquedaPorTransFormacionDeClaves(datos);

         if (posicion != -1) {
            System.out.println("El vlaor " + valorBuscado + "se encuantra en la posicion " + posicion + ".");
        } else {
            System.out.println(" el valor buscado" + valorBuscado + " no se encuantra");
        }

    }

    public int BusquedaPorTransFormacionDeClaves(String[] datos) {
        int tamaño = 10;
        Persona[] tabla = new Persona[tamaño];
        for (int i = 0; i <= datos.length; i++) {
            int clave = (int) Math.random() * 100;
            Persona p = new Persona(clave, datos[i]);
            int hash = aritméticaModular(clave, tamaño);

            while (tabla[hash] != null) {
                hash = (hash + 1) % tamaño;
            }

            tabla[hash] = p;

        }

        return -1;
    }

    public int aritméticaModular(int clave, int tamaño) {
        return clave % tamaño;
    }

    private static class Persona {
        int clave;
        String Nombre;

        Persona(int clave, String Nombre) {
            this.Nombre = Nombre;
            this.clave = clave;
        }
    }

}
