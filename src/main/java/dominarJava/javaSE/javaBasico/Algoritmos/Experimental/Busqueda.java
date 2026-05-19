package dominarJava.javaSE.javaBasico.Algoritmos.Experimental;

import java.util.Scanner;

public class Busqueda{

 public static void main(String[] args) {
    BusquedaListasInvertidas bq= new BusquedaListasInvertidas();
       String Tabla[][] = {
                { "Persona 1", "Juan", "Matematico", "32" },
                { "Persona 2", "Daniel", "Fisico", "40" },
                { "Persona 3", "Jose", "Matematico", "25" },
                { "Persona 4", "Pascal", "Ingeniero", "38" },
                { "Persona 5", "Mifuel", "Ingeniero", "43" },
                { "Persona 6", "Felipe", "Abogado", "35" }

        };

        String Menu = """
                Hola  Elige una opcion:
                1: Mostrar la tabla completa
                2: Mostrar a los Matematicos
                3: Mostrar a los ingenieros de entre 40 a 50 años
                4: Mostrar  a los matematicos  menores a 50 años
                5: salir
                """;
        Scanner lector = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(Menu);
            opcion = lector.nextInt();
            lector.nextLine();
            switch (opcion) {
                case 1:
                    bq.MostrarTabla(Tabla);
                    break;
                case 2:
                    bq.ListasPorProfesion(Tabla);
                    break;
                case 3:
                    bq.ListarMatematicosFisicos(Tabla);
                    break;
                case 4:
                    bq.ListarIngenierosEdad(Tabla);
                    break;

                case 5:
                    System.out.println("Saliednod ...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion != 5);
        lector.close();

   
    }



}