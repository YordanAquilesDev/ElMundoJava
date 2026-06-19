package dominarJava.javaSE.javaBasico.ExperimentosJava;

import com.itextpdf.html2pdf.HtmlConverter; // El motor: Toma el HTML/CSS y lo traduce a formato PDF.
import java.io.File;                        // El mapa: Representa la ruta y el nombre del archivo en tu disco.
import java.io.FileOutputStream;            // La tubería: El canal que transporta y escribe los bytes de datos en el archivo.
import java.io.IOException;                 // El escudo: La clase que maneja fallos de Entrada/Salida 
public class CrearPDF {
    public static void main(String[] args) {
        String nombre = "Hola Mundo"; 
        String codigoHtml = "<html>" +
                "<head>" +
                "  <style>" +
                "    body { font-family: sans-serif; margin: 30px; }" +
                "    h1 { color: #007680; }" +
                "    p { font-size: 14px; color: #333333; }" +
                "  </style>" +
                "</head>" +
                "<body>" +
                "  <h1>¡" + nombre + " desde HTML a PDF!</h1>" +
                "  <p>Este PDF ha sido generado utilizando Java y la extensión pdfHTML.</p>" +
                "</body>" +
                "</html>";
        File archivoPdf = new File("HolaMundo.pdf"); //referenca al archivo
        // El 'try-with-resources' abre la manguera y se encarga de cerrarla automáticamente al terminar
        try (FileOutputStream mangueraSalida = new FileOutputStream(archivoPdf)) {
            // El motor (HtmlConverter) procesa el texto y bombea los datos a través de la manguera (mangueraSalida)
            HtmlConverter.convertToPdf(codigoHtml, mangueraSalida);
            System.out.println("El archivo PDF se ha creado exitosamente en: " + archivoPdf.getAbsolutePath());
        } catch (IOException e) {
            // Si algo se rompe en la tubería o el archivo está bloqueado
            System.err.println("Ocurrió un error al escribir o procesar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}