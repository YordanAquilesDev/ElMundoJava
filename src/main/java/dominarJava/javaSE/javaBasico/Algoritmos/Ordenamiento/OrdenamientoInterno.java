package dominarJava.javaSE.javaBasico.Algoritmos.Ordenamiento;

public class OrdenamientoInterno {

    public void OrdenamientoBurbuja(){
        int numerosDesodenados[]={342, 12, 489, 21, 156, 401, 88, 12, 333, 4, 276, 490, 115, 67, 222, 19, 444, 312, 8, 99, 
456, 23, 187, 302, 11, 498, 265, 74, 150, 2, 389, 421, 55, 128, 467, 33, 210, 91, 5, 176, 
299, 43, 412, 87, 13, 355, 478, 66, 192, 10, 254, 381, 29, 144, 432, 71, 205, 95, 7, 168, 
321, 48, 441, 82, 15, 366, 485, 61, 218, 14, 243, 377, 31, 139, 425, 77, 230, 89, 9, 181, 
315, 52, 451, 84, 17, 372, 495, 58, 201, 16, 234, 361, 35, 132, 418, 73, 225, 93, 3, 199};
int[] listaOrdenada= OrdenarBurbuja(numerosDesodenados);
for(int num: listaOrdenada){
    System.out.println(num);
}

    }

    public void OrdenamientoSeleccion() {
          int numerosDesodenados[]={342, 12, 489, 21, 156, 401, 88, 12, 333, 4, 276, 490, 115, 67, 222, 19, 444, 312, 8, 99, 
456, 23, 187, 302, 11, 498, 265, 74, 150, 2, 389, 421, 55, 128, 467, 33, 210, 91, 5, 176, 
299, 43, 412, 87, 13, 355, 478, 66, 192, 10, 254, 381, 29, 144, 432, 71, 205, 95, 7, 168, 
321, 48, 441, 82, 15, 366, 485, 61, 218, 14, 243, 377, 31, 139, 425, 77, 230, 89, 9, 181, 
315, 52, 451, 84, 17, 372, 495, 58, 201, 16, 234, 361, 35, 132, 418, 73, 225, 93, 3, 199};
int[] listaOrdenada= OrdenarSeleccion(numerosDesodenados);
for(int num: listaOrdenada){
    System.out.println(num);
}

    }

    public void OrdenamientoInsercion() {
          int numerosDesodenados[]={342, 12, 489, 21, 156, 401, 88, 12, 333, 4, 276, 490, 115, 67, 222, 19, 444, 312, 8, 99, 
456, 23, 187, 302, 11, 498, 265, 74, 150, 2, 389, 421, 55, 128, 467, 33, 210, 91, 5, 176, 
299, 43, 412, 87, 13, 355, 478, 66, 192, 10, 254, 381, 29, 144, 432, 71, 205, 95, 7, 168, 
321, 48, 441, 82, 15, 366, 485, 61, 218, 14, 243, 377, 31, 139, 425, 77, 230, 89, 9, 181, 
315, 52, 451, 84, 17, 372, 495, 58, 201, 16, 234, 361, 35, 132, 418, 73, 225, 93, 3, 199};
int[] listaOrdenada=OrdenarInsercion(numerosDesodenados);
for(int num: listaOrdenada){
    System.out.println(num);
}


    }

    public int[] OrdenarSeleccion(int[] listaDesordenada){
    int dimensionDelaLista = listaDesordenada.length;
    int posicionDelMenor;
    
    for(int i = 0; i < dimensionDelaLista; i++){
        posicionDelMenor = i;
        
        for(int j = i + 1; j < dimensionDelaLista; j++){
            // ¡AQUÍ ESTABA EL ERROR! Comparamos contra el menor actual detectado
            if(listaDesordenada[posicionDelMenor] > listaDesordenada[j]){
                posicionDelMenor = j;
            }
        }
        
        // El intercambio (swap) está perfecto
        int valorTemporalParaLaTransaccion = listaDesordenada[i];
        listaDesordenada[i] = listaDesordenada[posicionDelMenor];
        listaDesordenada[posicionDelMenor] = valorTemporalParaLaTransaccion;
    }
    
    int ListaOrdenada[] = listaDesordenada;
    return ListaOrdenada;
}

    public int[] OrdenarInsercion(int[] listaDesordenada){
  int i,j;
      int dimensionDelaLista=listaDesordenada.length;
      for( i=1;i<dimensionDelaLista;i++){
        int temporalParaLaInsercion= listaDesordenada[i];
        for(j=i; (j>0) &&(temporalParaLaInsercion<listaDesordenada[j-1]);j--){
            listaDesordenada[j]=listaDesordenada[j-1];

        }
        listaDesordenada[j]=temporalParaLaInsercion;
      }
      int ListaOrdenada[] =listaDesordenada;
        return ListaOrdenada;
        
    }

    public int[] OrdenarBurbuja(int[] listaDesordenada) {
    int dimensionVector = listaDesordenada.length;
    
    for (int i = 0; i < dimensionVector; i++) {
        // CORRECCIÓN: j debe ir hasta el final del vector (menos los ya ordenados)
        for (int j = 0; j < dimensionVector - i - 1; j++) {
            
            if (listaDesordenada[j] > listaDesordenada[j + 1]) {
                int temporalIntercambio = listaDesordenada[j];
                listaDesordenada[j] = listaDesordenada[j + 1];
                listaDesordenada[j + 1] = temporalIntercambio;
            }
        }
    }
    return listaDesordenada; // No necesitas crear otra variable, Java devuelve la referencia
}

}