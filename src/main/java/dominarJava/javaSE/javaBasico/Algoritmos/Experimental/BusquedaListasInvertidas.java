package dominarJava.javaSE.javaBasico.Algoritmos.Experimental;

import java.util.Scanner;

public class BusquedaListasInvertidas {
    public void BusquedaListasInvertidas() {

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
                    MostrarTabla(Tabla);
                    break;
                case 2:
                    ListasPorProfesion(Tabla);
                    break;
                case 3:
                    ListarMatematicosFisicos(Tabla);
                    break;
                case 4:
                    ListarIngenierosEdad(Tabla);
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

   public void ListasPorProfesion(String[][] tabla) {
    String profesiones[] = { "Matematico", "Fisico", "Ingeniero", "Abogado" };

    // Encabezado de la tabla
    System.out.println("==================================================");
    System.out.printf("%-15s | %s%n", "PROFESIÓN", "MIEMBROS");
    System.out.println("==================================================");

    for (String profesion : profesiones) {
        // %-15s define una columna de 15 caracteres alineada a la izquierda
        System.out.printf("%-15s | ", profesion);
        
        boolean primerMiembro = true;

        for (String[] persona : tabla) {
            if (persona[2].equalsIgnoreCase(profesion)) {
                // Si no es el primero, añadimos una coma para separarlos en la misma fila
                if (!primerMiembro) {
                    System.out.print(", ");
                }
                System.out.print(persona[1]);
                primerMiembro = false;
            }
        }
        
        // Si no se encontró a nadie, podemos dejar constancia o dejarlo vacío
        if (primerMiembro) {
            System.out.print("(Ninguno)");
        }
        
        // Salto de línea al terminar de procesar todos los nombres de esta profesión
        System.out.println(); 
    }
    System.out.println("==================================4================");
}

    public void ListarIngenierosEdad(String[][] tabla) {
        for (String[] persona : tabla) {
            int edad = Integer.parseInt(persona[3]);
            if ((persona[2].equalsIgnoreCase("Ingeniero")) && edad < 50 && edad > 40) {
                System.out.println(persona[0] + " \t" + persona[1] + " \t" + persona[2] + " \t" + persona[3]);
            }
        }

    }

    public void ListarMatematicosFisicos(String[][] tabla) {
        System.out.println(" Listas de matematico o fisicos mayores a 25 años");
        for (String[] persona : tabla) {
            int edad = Integer.parseInt(persona[3]);
            if ((persona[2].equalsIgnoreCase("Matematico"))
                    || (persona[2].equalsIgnoreCase("Matematico")) && (edad > 25)) {
                System.out.println(persona[1] + "\t" + persona[2] + "\t" + "Edad " + edad);

            }
        }
    }

    public void MostrarTabla(String[][] tabla) {
        System.out.println("NUMERO\t NOMBRE\t PROFESION\t EDAD");
        for (String[] persona : tabla) {
            System.out.println(persona[0] + " \t" + persona[1] + " \t" + persona[2] + " \t" + persona[3]);
        }

    }

}
