package dominarJava.javaSE.javaBasico.Algoritmos.Ordenamiento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class OrdenamientoExterno {

    /*
     * =========================================================================
     * ORDENAMIENTO POR MEZCLA DIRECTA
     * =========================================================================
     */
    public void OrdenamientoPorMezclaDirecta() {
        List<Integer> Listado = new ArrayList<>();
        for (int i = 0; i < 1000; i++) { // Bajado a 1000 para pruebas rápidas de impresión
            Listado.add((int) (Math.random() * 1000000));
        }

        int tamañoListado = 1;
        // La mezcla directa se detiene cuando el tramo de control es igual o mayor al
        // tamaño total
        while (tamañoListado < Listado.size()) {
            List<List<Integer>> subListas = Dividir(Listado, tamañoListado);
            List<List<Integer>> subListasOrdenadas = Ordenar(subListas);
            Listado = Mezclar(subListasOrdenadas); // Se actualiza el listado base con el resultado fusionado
            tamañoListado *= 2;
        }

        System.out.println("¡Listo! El listado por Mezcla Directa está ordenado.");
        for (int num : Listado) {
            System.out.println(num);
        }
    }

    public List<List<Integer>> Dividir(List<Integer> listaDesordenada, int tamaño_sublista) {
        List<Integer> sublista = new ArrayList<>();
        List<List<Integer>> subListas = new ArrayList<>();
        for (int numero : listaDesordenada) {
            sublista.add(numero);
            if (sublista.size() == tamaño_sublista) {
                subListas.add(sublista);
                sublista = new ArrayList<>();
            }
        }
        if (!sublista.isEmpty()) {
            subListas.add(sublista);
        }
        return subListas;
    }

    public List<Integer> Mezclar(List<List<Integer>> subListasOrdenadas) {
        // Estructura: [valor, índice_de_la_sublista,
        // índice_del_elemento_en_la_sublista]
        PriorityQueue<int[]> colaPrioridad = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        List<Integer> listadoOrdenado = new ArrayList<>();

        // Insertamos el primer elemento de cada sublista usando punteros/índices para
        // no destruir datos
        for (int i = 0; i < subListasOrdenadas.size(); i++) {
            List<Integer> sublista = subListasOrdenadas.get(i);
            if (sublista != null && !sublista.isEmpty()) {
                colaPrioridad.add(new int[] { sublista.get(0), i, 0 });
            }
        }

        while (!colaPrioridad.isEmpty()) {
            int[] elemento = colaPrioridad.poll();
            int valorMasBajo = elemento[0];
            int listaOrigen = elemento[1];
            int elementoIndex = elemento[2];

            listadoOrdenado.add(valorMasBajo);

            List<Integer> sublista = subListasOrdenadas.get(listaOrigen);
            int siguienteIndex = elementoIndex + 1;

            // Si la sublista aún tiene elementos, añadimos el siguiente índice a la cola
            if (siguienteIndex < sublista.size()) {
                colaPrioridad.add(new int[] { sublista.get(siguienteIndex), listaOrigen, siguienteIndex });
            }
        }
        return listadoOrdenado;
    }

    public List<List<Integer>> Ordenar(List<List<Integer>> subListas) {
        List<List<Integer>> subListasOrdenadas = new ArrayList<>();
        for (List<Integer> sublista : subListas) {
            // Hacemos una copia mutable para no alterar ni limpiar la lista original por
            // referencia
            List<Integer> sublistaOrdenada = new ArrayList<>(sublista);
            Collections.sort(sublistaOrdenada);
            subListasOrdenadas.add(sublistaOrdenada);
        }
        return subListasOrdenadas;
    }

    /*
     * =========================================================================
     * ORDENAMIENTO POR FUSION NATURAL
     * =========================================================================
     */
    public void OrdenamientoPorFusionNatural() {
        List<Integer> ListaDesordenada = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            ListaDesordenada.add((int) (Math.random() * 100000));
        }
        List<List<Integer>> secuenciasNaturales = DividirSecuenciasNaturalez(ListaDesordenada);
        List<Integer> listadoOrdenado = MezclarSecuenciasNaturales(secuenciasNaturales);

        System.out.println("¡Listo! El listado por Fusión Natural está ordenado.");
        for (int num : listadoOrdenado) {
            System.out.println(num);
        }
    }

    public List<List<Integer>> DividirSecuenciasNaturalez(List<Integer> listaDesordenada) {
        if (listaDesordenada == null || listaDesordenada.isEmpty())
            return new ArrayList<>();

        List<List<Integer>> secuenciasNaturales = new ArrayList<>();
        List<Integer> secuenciaActual = new ArrayList<>();
        secuenciaActual.add(listaDesordenada.get(0));

        for (int i = 1; i < listaDesordenada.size(); i++) {
            if (listaDesordenada.get(i) >= listaDesordenada.get(i - 1)) {
                secuenciaActual.add(listaDesordenada.get(i));
            } else {
                secuenciasNaturales.add(secuenciaActual);
                secuenciaActual = new ArrayList<>();
                secuenciaActual.add(listaDesordenada.get(i));
            }
        }
        secuenciasNaturales.add(secuenciaActual);
        return secuenciasNaturales;
    }

    public List<Integer> MezclarSecuenciasNaturales(List<List<Integer>> secuenciasNaturales) {
        while (secuenciasNaturales.size() > 1) {
            List<List<Integer>> nuevasSecuencias = new ArrayList<>();
            // Corregido: i < secuenciasNaturales.size() para evaluar también el último
            // elemento impar
            for (int i = 0; i < secuenciasNaturales.size(); i += 2) {
                if (i + 1 < secuenciasNaturales.size()) {
                    nuevasSecuencias.add(Mezclar(List.of(secuenciasNaturales.get(i), secuenciasNaturales.get(i + 1))));
                } else {
                    nuevasSecuencias.add(secuenciasNaturales.get(i));
                }
            }
            secuenciasNaturales = nuevasSecuencias;
        }
        return secuenciasNaturales.get(0);
    }

    /*
     * =========================================================================
     * ORDENAMIENTO POR MEZCLA EQUILIBRADA MÚLTIPLE
     * =========================================================================
     */
    public void OrdenamientoPorMezclaEquilibradaMultiple() {
        List<Integer> ListaDesordenada = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            ListaDesordenada.add((int) (Math.random() * 100000));
        }

        // 1. Fase de preparación: Dividir en tramos iniciales
        List<List<Integer>> partes = dividirEnPartes(ListaDesordenada, 100);

        // REQUISITO CRÍTICO: Los tramos iniciales deben estar ordenados internamente
        for (List<Integer> sublista : partes) {
            Collections.sort(sublista);
        }

        // 2. Primera distribución en las vías de Entrada A y B
        List<List<List<Integer>>> viasActuales = DistribuirPartesMultiples(partes);

        // 3. Bucle de reducción: Se ejecuta hasta que quede 1 solo tramo unificado
        while ((viasActuales.get(0).size() + viasActuales.get(1).size()) > 1) {
            viasActuales = mezclarPartesMultiples(viasActuales);
        }

        // 4. Recuperación del resultado final
        List<Integer> listadoOrdenado = viasActuales.get(0).isEmpty() ? viasActuales.get(1).get(0)
                : viasActuales.get(0).get(0);

        System.out.println("¡Listo! El listado por Mezcla Equilibrada Múltiple está ordenado.");
        for (int num : listadoOrdenado) {
            System.out.println(num);
        }
    }

    public static List<List<Integer>> dividirEnPartes(List<Integer> lista, int tamanoSublista) {
        List<List<Integer>> partes = new ArrayList<>();
        if (lista == null || lista.isEmpty() || tamanoSublista <= 0) {
            return partes;
        }
        for (int i = 0; i < lista.size(); i += tamanoSublista) {
            int fin = Math.min(i + tamanoSublista, lista.size());
            List<Integer> sublista = new ArrayList<>(lista.subList(i, fin));
            partes.add(sublista);
        }
        return partes;
    }

    public List<List<List<Integer>>> DistribuirPartesMultiples(List<List<Integer>> partes) {
        List<List<Integer>> entradaA = new ArrayList<>();
        List<List<Integer>> entradaB = new ArrayList<>();

        for (int i = 0; i < partes.size(); i++) {
            if (i % 2 == 0) {
                entradaA.add(partes.get(i));
            } else {
                entradaB.add(partes.get(i));
            }
        }

        List<List<List<Integer>>> resultadoGlobal = new ArrayList<>();
        resultadoGlobal.add(entradaA);
        resultadoGlobal.add(entradaB);
        return resultadoGlobal;
    }

    public List<List<List<Integer>>> mezclarPartesMultiples(List<List<List<Integer>>> entradaAyB) {
        List<List<Integer>> salidaC = new ArrayList<>();
        List<List<Integer>> salidaD = new ArrayList<>();

        List<List<Integer>> entradaA = entradaAyB.get(0);
        List<List<Integer>> entradaB = entradaAyB.get(1);

        int maxTramos = Math.max(entradaA.size(), entradaB.size());

        for (int i = 0; i < maxTramos; i++) {
            List<Integer> parteA = (i < entradaA.size()) ? entradaA.get(i) : null;
            List<Integer> parteB = (i < entradaB.size()) ? entradaB.get(i) : null;

            List<Integer> resultadoMezcla;

            if (parteA != null && parteB != null) {
                resultadoMezcla = Mezclar(List.of(parteA, parteB));
            } else if (parteA != null) {
                resultadoMezcla = parteA;
            } else {
                resultadoMezcla = parteB;
            }

            if (i % 2 == 0) {
                salidaC.add(resultadoMezcla);
            } else {
                salidaD.add(resultadoMezcla);
            }
        }

        List<List<List<Integer>>> resultadoGlobal = new ArrayList<>();
        resultadoGlobal.add(salidaC);
        resultadoGlobal.add(salidaD);
        return resultadoGlobal;
    }

    /*
     * =========================================================================
     * ORDENAMIENTO POLIFÁSICO (3 VÍAS)
     * =========================================================================
     */
    public void OrdenamientoPorMezclaPolifasica() {
        List<Integer> ListaDesordenada = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            ListaDesordenada.add((int) (Math.random() * 100000));
        }

        // 1. Fase de preparación: Dividimos en 8 tramos (Número de Fibonacci ideal)
        List<List<Integer>> partes = dividirEnPartes(ListaDesordenada, 1250);

        // Los tramos iniciales deben ordenarse antes del procesamiento externo
        for (List<Integer> sublista : partes) {
            Collections.sort(sublista);
        }

        // 2. Distribución asimétrica basada en Fibonacci para 3 vías
        List<List<List<Integer>>> vias = distribuirFibonacci(partes);

        // 3. Bucle de consolidación: Se ejecuta mientras haya datos en más de una vía
        while (ConMasDeUnaViaConDatos(vias)) {
            vias = ejecutarFasePolifasica(vias);
        }

        // 4. Recuperación del único tramo unificado resultante
        List<Integer> listadoOrdenado = new ArrayList<>();
        for (List<List<Integer>> via : vias) {
            if (!via.isEmpty()) {
                listadoOrdenado = via.get(0);
                break;
            }
        }

        System.out.println("¡Listo! El listado por Ordenamiento Polifásico está ordenado.");
        for (int num : listadoOrdenado) {
            System.out.println(num);
        }
    }

    public List<List<List<Integer>>> distribuirFibonacci(List<List<Integer>> partes) {
        List<List<Integer>> viaA = new ArrayList<>();
        List<List<Integer>> viaB = new ArrayList<>();
        List<List<Integer>> viaC = new ArrayList<>(); // Empieza vacía

        // Distribución perfecta de Fibonacci para 8 tramos (5 y 3)
        for (int i = 0; i < 5; i++) {
            viaA.add(partes.get(i));
        }
        for (int i = 5; i < 8; i++) {
            viaB.add(partes.get(i));
        }

        List<List<List<Integer>>> viasGlobales = new ArrayList<>();
        viasGlobales.add(viaA);
        viasGlobales.add(viaB);
        viasGlobales.add(viaC);
        return viasGlobales;
    }

    public List<List<List<Integer>>> ejecutarFasePolifasica(List<List<List<Integer>>> vias) {
        int idxEntrada1 = -1;
        int idxEntrada2 = -1;
        int idxSalida = -1;

        // Identificamos dinámicamente qué vías contienen tramos y cuál está libre
        for (int i = 0; i < 3; i++) {
            if (vias.get(i).isEmpty()) {
                idxSalida = i;
            } else {
                if (idxEntrada1 == -1) {
                    idxEntrada1 = i;
                } else {
                    idxEntrada2 = i;
                }
            }
        }

        List<List<Integer>> entrada1 = vias.get(idxEntrada1);
        List<List<Integer>> entrada2 = vias.get(idxEntrada2);
        List<List<Integer>> salida = vias.get(idxSalida);

        // Se mezclan tantas parejas como tramos tenga la vía de entrada más pequeña
        int tramosAMezclar = Math.min(entrada1.size(), entrada2.size());
        for (int i = 0; i < tramosAMezclar; i++) {
            List<Integer> parte1 = entrada1.remove(0);
            List<Integer> parte2 = entrada2.remove(0);

            // Reutiliza tu método Mezclar de la PriorityQueue
            List<Integer> resultadoMezcla = Mezclar(List.of(parte1, parte2));
            salida.add(resultadoMezcla);
        }

        return vias;
    }

    private boolean ConMasDeUnaViaConDatos(List<List<List<Integer>>> vias) {
        int viasConDatos = 0;
        for (List<List<Integer>> via : vias) {
            if (!via.isEmpty()) {
                viasConDatos++;
            }
        }
        return viasConDatos > 1;
    }

}