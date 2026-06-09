package dominarJava.javaSE.javaBasico.Algoritmos.Busqueda;

public class BusquedaInterna {

    public void BusquedaBinaria() {
        int[] lista={-8,4,5,9,12,18,25,40,60};
        int clave=40;
        int resultado= busquedaBinaria(lista, clave);
        if(resultado!=-1){
            System.out.println("CLAVE SE ENCUENTRA EN LA POSICION "+ resultado);
        }else{
            System.out.println("CLAVE NO ENCONTRADA");
        }

    }

    public int busquedaBinaria(int[] lista, int clave) {
        
        int bajo = 0;
        int alto = lista.length - 1;
        while (bajo <= alto) {
            System.out.print("Bajo : " + bajo);
            System.out.print("    Alto "+ alto);

            int central = (bajo + alto) / 2;
            System.out.println("    Central  "+ central);

            int valorCentral = lista[central];
            System.out.println("Indice " + central);
            System.out.println("Valor Central ["+valorCentral+"] ");

            if (clave == valorCentral) {
                System.out.println("Clave "+clave +" == "+ valorCentral);
                System.out.println("Exito valor encontrado en el indice "+ central);
                return central;
            } else if (clave < valorCentral) {
                System.out.println("Clave "+clave+"<" +valorCentral);
                System.out.println("Alto = "+central+"-"+1);
                alto = central - 1;
                System.out.println("Alto ="+alto);

            } else {
                System.out.println("clave "+clave+">"+ valorCentral);
                System.out.println("Bajo="+central+"+"+1);
                bajo = central + 1;
            }

        }
        return -1;
    }
}
