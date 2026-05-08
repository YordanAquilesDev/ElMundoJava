import java.math.BigDecimal;

public class TiposDeDatosJava {
    public static void main(String[] args) {
        /*
         * ============================================================
         * TIPOS ENTEROS
         * ============================================================
         */
        byte intensidadPixel = 127;    /* BYTE

         * USO: Optimización de memoria, Procesamiento de archivos binarios
         * Manipulación de datos de red, Estados pequeños (0,1,2),etc
         * CASO:
         * Un sistema que procesa imágenes puede almacenar
         * intensidad de color en bytes.
         * Riesgo:
         * Desbordamiento (overflow)
         */
        byte overflow = (byte) 300; //overflow =44 genera perdida de informacion

        /*
         * INT  Tamaño: 32 bits
         * USO: IDs internos, Contadores, Índices, Cantidades
         * CASO: Número de productos vendidos.
         */
        int productosVendidos = 15420;
        /*
         * LONG
         * Para valores enteros muy grandes.
         * Tamaño: 64 bits
         * USO: Timestamps, IDs globales, Registros masivos
         * Sistemas financieros grandes,etc
         * CASO:
         * el id de un usuario registrado en una base de datos
         */
        long id = 200000;
        /*
         * ============================================================
         * TIPOS DECIMALES
         * ============================================================
         */
        /*
         * FLOAT
         * Precisión simple.
         * USO: Videojuegos, Coordenadas gráficas, Animaciones,etc
         * ¿Por qué?
         * Consume menos memoria.
         */
        float posicionJugador = 245.75f;
        /*
         * DOUBLE
         * Mayor precisión decimal.
         * USO: Cálculos científicos, Geolocalización
         * Fórmulas matemáticas
         * CASO: Coordenadas GPS
         */
        double latitud = -12.046374;
        double longitud = -77.042793;
        /*
         * IMPORTANTE
         *
         * Para dinero NO se recomienda float ni double
         * por errores de precisión.
         * En producción se usa BigDecimal.
         * es una clase java que perimte trabajar con numeros decimales exactos
         */
        BigDecimal dinero = new BigDecimal("0.1"); // forma correcta
        BigDecimal dinero2 = new BigDecimal("0.1");
        // sumar dinero
        BigDecimal resultado = dinero.add(dinero2);
        // restar dinero
        resultado = dinero.subtract(dinero2);
        // multiplicar
        resultado = resultado.multiply(dinero);
        /*
         * ============================================================
         * BOOLEAN
         * ============================================================
         */
        /* BOOLEAN
         * Solo true o false
         * USO: Autenticación, Validaciones
         * Estados del sistema
         * CASO:
         * validacion de informacion si se cumplo o no se cumple
         * en base a esa validacion se toman deciciones
         */
        boolean usuarioAutenticado = true;
        boolean pagoCompletado = false;
        /*
         * ============================================================
         * CHAR
         * ============================================================
         */
        /* CHAR
         * Un único carácter Unicode.
         * USO: Procesamiento léxico, Parsers
         * Validaciones de caracteres
         * CASO:
         * Validar tipo de documento
         */
        char tipoDocumento = 'D';
        
        /*
         * ============================================================
         * STRING :
         * el string es un tipo de dato no primitivo(referencia)
         * tiene metodos por ejmplo: .length() , .toLowerCase(), etc;
         *
         * ============================================================
         */
        /* STRNG
         * Cadena de caracteres.
         * Es uno de los tipos más usados.
         * USO: URLs, Consultas SQL, JSON, Tokens, Emails
         * Configuración,etc;
         */
        String urlApi = "https://api.openai.com/v1/chat";
        String consultaSQL = "SELECT * FROM usuarios WHERE activo = true";
        String tokenJWT = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9";
        String jsonResponse = "{\"nombre\":\"Yordan\",\"edad\":20}";

        /*
         * ============================================================
         * OBJETOS (Nivel profesional)
         * ============================================================
         */

        /*
         * En proyectos reales casi nunca trabajas
         * solo con tipos primitivos.
         * Se encapsulan en objetos.
         */

        Usuario usuario = new Usuario(
                1,
                "Yordan",
                true);

    }
}

class Usuario {
    int id;
    String nombre;
    boolean activo;

    public Usuario(int id, String nombre, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }
}