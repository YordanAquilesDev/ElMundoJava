package dominarJava.javaSE.javaBasico.Algoritmos.Ordenamiento;

public class OrdenamientoRapido {

    public void OrdenamientoShell() {
        int[] listaDesordenada = { 1, 4, 4, 1, 8, 4, 9, 3, 15, 6, 3, 9, 0, 1 };
        System.out.println("LISTA INICIAL");
        for (int i : listaDesordenada) {
            System.out.print(i + " ");
        }
        System.out.println();
        int[] listaOrdenada = ordenamientoRapidoShell(listaDesordenada);

        System.out.println("LISTA FINAL");
        for (int i : listaOrdenada) {
            System.out.print(i);
        }

    }

    public int[] ordenamientoRapidoShell(int[] vector) {
        int longitud = vector.length;
        System.out.println("longitud del arreglo " + longitud);
        System.out.println("se agrupan en grupos de " + longitud + "/2");

        int intervalo = longitud / 2;

        while (intervalo > 0) {
            System.out.println("Intervalo o Saltos  :" + intervalo);
            for (int i = intervalo; i < longitud; i++) {
                System.out.println("Valor de i en el for  " + i);
                int j = i - intervalo;
                System.out.println("Valor de j " + j);
                while (j >= 0) {
                    int k = j + intervalo;
                    if (vector[j] <= vector[k]) {
                        System.out.println(" si " + vector[j] + "<= " + vector[k]);
                        System.out.println("Termina el While interno");
                        break;

                    } else {
                        System.out.println(" si no ");
                        int temp = vector[j];
                        System.out.println("intercambio de" + vector[j] + "con " + vector[k]);
                        vector[j] = vector[k];
                        vector[k] = temp;
                        System.out.println("Valor del ambion" + vector[j] + "  " + vector[k]);
                        j = j - intervalo;
                    }
                }

            }
            intervalo = intervalo / 2;
        }
        return vector;
    }

    public void OrdenamientoRapidoQuickShort() {
        int[] listaDesordenada = { 5, 2, 1, 9, 3, 8, 7 };

        ordenamientoRapidoQuickShort(listaDesordenada, 0, listaDesordenada.length - 1);
        for (int i : listaDesordenada) {
            System.out.println(i);
        }

    }

    public int[] ordenamientoRapidoQuickShort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int pivote = particionar(arr, inicio, fin);
            ordenamientoRapidoQuickShort(arr, inicio, pivote - 1);
            ordenamientoRapidoQuickShort(arr, pivote + 1, fin);
            return arr;

        } else {
            return arr;

        }

    }

    public int particionar(int[] arr, int inicio, int fin) {
        int pivote = arr[inicio];
        int i = inicio + 1;
        int j = fin;
        while (i <= j) {
            while (i <= j && arr[i] <= pivote) {
                i++;
            }
            while (i <= j && arr[j] >= pivote) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[inicio];
        arr[inicio] = arr[j];
        arr[j] = temp;

        return j;
    }
}
