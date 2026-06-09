package dominarJava.javaSE.javaBasico.Algoritmos.Busqueda;

import java.sql.BatchUpdateException;

import dominarJava.javaSE.javaBasico.BusquedaSecuenlcial;

public class MainBusqueda {

    public static void main(String[] args) {
        BusquedaInterna busquedaInterna = new BusquedaInterna();
        BusquedaSecuenlcial busquedaSecuenlcial = new BusquedaSecuenlcial();
        int[] lista = { -8, 4, 5, 9, 12, 18, 25, 40, 60 };
        int clave = 40;

        int indiceSecuencial = busquedaSecuenlcial.BuscarPorIndice(lista, clave);

        if (indiceSecuencial != -1) {
            System.out.println("Valor  Se encuentra en el indice " + indiceSecuencial);
        } else {
            System.out.println("Valor no encontrado");

        }

        int indiceBinario = busquedaInterna.busquedaBinaria(lista, clave);
        if (indiceBinario != -1) {
            System.out.println("Valor  Se encuentra en el indice " + indiceSecuencial);
        } else {
            System.out.println("Valor no encontrado");

        }
    }

}
