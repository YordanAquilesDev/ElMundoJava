package dominarJava.javaSE.javaBasico;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class LogicaAdquiridaFundamentosSolidosDeJava {

    Scanner leer = new Scanner(System.in);

    public void ejercicio1Parte1() {
        System.out.println("ESTE ES UN PROGRAMA QUE CONVIERTE");
        System.out.println("CENTIGRADOS EN GRADOS FAHRENHEIT");
        System.out.print("Ingrese los grados Centígrados: ");
        double Grados = leer.nextDouble();
        double Fahrenheit = (Grados * 9 / 5) + 32;
        System.out.println("Los grados farenhiet es : " + Fahrenheit + " °F");

    }

    public void ejercicio1Parte2() {
        System.out.println("ESTE ES UN PROGRMA QUE ASE UN TIPO DE CMABIO DE SOLES");
        System.out.println("A DOLARES");
        System.out.println("ingrese la cantidad de soles que desea cambiar");
        double Soles = leer.nextDouble();
        double Dolares = Soles * 3.72;
        System.out.println(" La cantidad de dolares es: " + Dolares + "$");
    }

    public void ejercicio2Parte1() {
        boolean ejecutando = true;
        System.out.println("ESTE ES UN PROGRAMA QUE CALCULA ");
        System.out.println("EL AREA DE CUALQUIER FIGURA");
        while (ejecutando) {
            String Menu = """
                    1.cuadrado
                    2.triangulo
                    3.circulo
                    4.rombo
                    5.piramide
                    6.cubo
                    7.esfera
                    8.trapecio
                    9.pentagono
                    10.hexagono
                    11.ovalo
                    12.cono
                    13.salir
                    """;
            System.out.println(Menu);
            System.out.println("ingrese la figura que desea calcular");
            int figura = leer.nextInt();
            switch (figura) {
                case 1: // CUADRADO
                    System.out.println("ingrese el lado del cuadrado");
                    double lado1 = leer.nextDouble();
                    System.out.println("ingrese el otro lado del cuadrado");
                    double lado2 = leer.nextDouble();
                    double areaCuadrado = lado1 * lado2;
                    System.out.println("el area del cuadrado es: " + areaCuadrado);
                    break;

                case 2: // TRIANGULO
                    String tipoDeTriangulo = """
                            1. equilatero
                            2. isosceles,escaleno,rectangulo.
                            3. salir
                            """;
                    System.out.println(tipoDeTriangulo);
                    int tipo = leer.nextInt();
                    switch (tipo) {
                        case 1 -> {
                            System.out.println("ingrese el lado del triangulo");
                            double lado = leer.nextDouble();
                            double areaTrianguloEquilatero = (lado * lado * Math.sqrt(3) / 4);
                            System.out.println("el area del triangulo es: " + areaTrianguloEquilatero);
                        }
                        case 2 -> {
                            System.out.println("ingresa la base del triangulo (lado menor en triangulo rectangulo) ");
                            double base = leer.nextDouble();
                            System.out.println("ingresa la altura del triangulo(lado medio en triangulo rectangulo) ");
                            double altura = leer.nextDouble();
                            double areaTriangulo = (base * altura) / 2;
                            System.out.println("el area del triangulo  es: " + areaTriangulo);
                        }
                        default -> {
                            ejecutando = false;
                        }
                    }
                    break;

                case 3:// CIRCULO
                    final double pi = 3.1416;
                    System.out.println("ingrese el radio del circulo");
                    double radio = leer.nextDouble();
                    double areaCirculo = pi * (radio * radio);
                    System.out.println("el area del circulo es: " + areaCirculo);
                    break;

                case 4:// ROMBO
                    System.out.println("ingrese la diagonal mayor del rombo");
                    double diagonalMayor = leer.nextDouble();
                    System.out.println("ingrese la diagonal menor del rombo");
                    double diagonalMenor = leer.nextDouble();
                    double areaRombo = (diagonalMayor * diagonalMenor) / 2;
                    System.out.println("el area del rombo es: " + areaRombo);
                    break;

                case 5:// PIRAMIDE
                    System.out.println("ingrese cuantos lados tiene la base de la piramide ");
                    int ladosBase = leer.nextInt();
                    System.out.println("ingrese la longitud del lado (todos los lados son iguales) ");
                    double longitudLado = leer.nextDouble();
                    System.out.println("ingrese la apotema de la piramide ");
                    double apotemaPiramide = leer.nextDouble();

                    double perimetroBase = ladosBase * longitudLado;
                    double areaLaterales = (perimetroBase * apotemaPiramide) / 2;

                    double areaDeBase = ladosBase * (longitudLado * longitudLado) / (4 * Math.tan(Math.PI / ladosBase));
                    double areaTotal = areaDeBase + areaLaterales;
                    System.out.println("el area de total es: " + areaTotal);
                    System.out.println("DESEA CONTINUAR");
                    leer.nextLine();
                    break;

                case 6:// CUBO
                    System.out.println("ingrese la longitud del lado del cubo");
                    double ladoCubo = leer.nextDouble();
                    double areaCubo = 6 * (ladoCubo * ladoCubo);
                    System.out.println("el area del cubo es: " + areaCubo);
                    break;

                case 7:// ESFERA
                    System.out.println("ingrese el radio de la esfera");
                    double radioEsfera = leer.nextDouble();
                    double areaEsfera = 4 * Math.PI * (radioEsfera * radioEsfera);
                    System.out.println("el area de la esfera es: " + areaEsfera);
                    break;

                case 8:// TRAPECIO
                    System.out.println("ingrese la base mayor deltrapecio");
                    double baseMayor = leer.nextDouble();
                    System.out.println("ingrese la base menor del trapecio");
                    double baseMenor = leer.nextDouble();
                    System.out.println("ingrese la altura del trapecio");
                    double alturaTrapecio = leer.nextDouble();
                    double areaTrapecio = ((baseMayor * baseMenor) * alturaTrapecio) / 2;
                    System.out.println("el area del trapecio es: " + areaTrapecio);
                    break;

                case 9:// PENTAGONO
                    System.out.println("ingrese la longitud del lado del pentagono");
                    double ladoPentagono = leer.nextDouble();
                    System.out.println("ingrese el apotema del pentagono");
                    double apotemaPentagono = leer.nextDouble();
                    double areaPentagono = (5 * ladoPentagono * apotemaPentagono) / 2;
                    System.out.println("el area del pentagono es: " + areaPentagono);
                    break;

                case 10:// HEXAGONO
                    System.out.println("ingrese la longitud del lado del hexagono");
                    double ladoHexagono = leer.nextDouble();
                    double areaHexagono = (3 * Math.sqrt(3) * (ladoHexagono * ladoHexagono)) / 2;
                    System.out.println("el area del hexagono es: " + areaHexagono);
                    break;

                case 11:// OVALO
                    System.out.println("ingrese el radio mayor del ovalo");
                    double radioMayor = leer.nextDouble();
                    System.out.println("ingrese el radio menor del ovalo");
                    double radioMenor = leer.nextDouble();
                    double areaOvalo = Math.PI * radioMayor * radioMenor;
                    System.out.println("el area del ovalo es: " + areaOvalo);
                    break;

                case 12:// CONO
                    System.out.println("ingrese el radio del cono");
                    double radioCono = leer.nextDouble();
                    System.out.println("ingrese la generatriz del cono");
                    double generatrizCono = leer.nextDouble();
                    double areaCono = Math.PI * radioCono * (radioCono + generatrizCono);
                    System.out.println("el area del cono es: " + areaCono);
                    break;

                case 13:
                    ejecutando = false;
                    break;

            }
        }
    }

    public void ejercicio2Parte2() {
        String formula = "A=P(1+r)n ";
        System.out.println("Ingrese el capital que se presto del banco");
        double prestamo = leer.nextDouble();
        System.out.println("ingrese la tasa de interes anual ejemplo 5% (0.05)");
        double interes = leer.nextDouble();
        System.out.println("ingrese el periodo en años");
        int periodo = leer.nextInt();
        double monto = prestamo * Math.pow((1 + interes), periodo);
        System.out.println("el monto a pagar es " + monto);

    }

    public void ejercicio2Parte3() {
        System.out.print("ingrese el monto total: ");
        double total = leer.nextDouble();
        double igv = total * 0.18;
        double pagar = total + igv;
        System.out.printf("el monto es %.2f , el igv es %.2f  y a pagar es %.2f ", total, igv, pagar);

    }

    public String centrarTexto(String str, int espacio) {
        int espacioLibre = espacio - str.length();
        int izquierda = espacioLibre / 2;
        int derecha = espacioLibre - izquierda;
        String centrar = " ".repeat(izquierda) + str + " ".repeat(derecha);

        return centrar;

    }

    public void ejercicio3() {
        while (true) {
            System.out.println("ingrese su nombre");
            String cliente = leer.nextLine();
            System.out.println("ingrese una opcion");
            String menu = """
                    1: mouse
                    2: teclado
                    3: silla gamer
                    4: auriculares gamer
                    SELECCIONA UN PRODUCTO
                    """;
            System.out.println(menu);
            int selec = leer.nextInt();
            String objetos[] = { "mouse", "teclado", "silla gamer", "auriculares gamer" };
            double precios[] = { 20, 45.70, 499.90, 39.90 };
            boolean descuento = true;
            double total = 0;
            if (cliente.equals("ana") || cliente.equals("juan")) {
                if (objetos[selec - 1].contains("gamer")) {
                    total = precios[selec - 1] - precios[selec - 1] * 0.05;
                    total = total - total * 0.02;
                    System.out.println(total);

                } else {
                    total = precios[selec - 1] - precios[selec - 1] * 0.05;
                    System.out.println(total);
                }
                System.out.println(total);
            } else {
                descuento = false;
            }

            Date today = new Date();

            // 27 * 20
            // Construir la salida completa en un StringBuilder para evitar múltiples
            // System.out
            StringBuilder sb = new StringBuilder();
            sb.append("#".repeat(34)).append("\n");
            sb.append(centrarTexto("tienda ABC", 34)).append("\n");
            sb.append("#".repeat(34)).append("\n");
            sb.append("ID : 00001\n\n");
            sb.append(centrarTexto("COMPRAS", 34)).append("\n");
            sb.append(centrarTexto("Av. SAENS PEÑA 364", 34)).append("\n");
            sb.append(centrarTexto("LIMA", 34)).append("\n");
            sb.append(centrarTexto("LOTE: B   TERM:5268", 34)).append("\n");
            sb.append("#".repeat(34)).append("\n");
            sb.append(String.format("FECHA: %tD     HORA: %tT%n", today, today));
            sb.append(String.format("VEN: JUAN         CLIEN:%s%n", cliente));
            sb.append("#".repeat(34)).append("\n");
            sb.append(String.format("%s          %.2f%n", objetos[selec - 1], precios[selec - 1])); // Corregido:
                                                                                                    // formato para
                                                                                                    // decimal
            sb.append("\n");
            sb.append("DESCUENTO: ").append(descuento ? "APLICADO" : "NO APLICADO").append("\n");
            sb.append(String.format("PAGO TOTAL: %.2f%n", total));
            sb.append("#".repeat(34)).append("\n");
            sb.append("VUELTA GRACIAS POR SU COMPRA\n");
            sb.append("#".repeat(34)).append("\n");
            sb.append("DESEA SEGuir COMPRANDO? S/N\n");
            // Imprimir todo de una vez
            System.out.print(sb.toString());
            if ("n".equalsIgnoreCase(leer.next())) {
                break;
            }
        }
    }

    public void progresionAritmetica(int num1, int num2, int num3) {
        int ordenado[] = new int[3];
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                ordenado[0] = num1;
                ordenado[1] = num2;
                ordenado[2] = num3;
            } else {
                ordenado[0] = num1;
                ordenado[1] = num3;
                ordenado[2] = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                // num2 num1 num3
                ordenado[0] = num2;
                ordenado[1] = num1;
                ordenado[2] = num3;
            } else {
                // num2 num3 num1
                ordenado[0] = num2;
                ordenado[1] = num3;
                ordenado[2] = num1;
            }
        } else if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                // num3 num1 num2
                ordenado[0] = num3;
                ordenado[1] = num1;
                ordenado[2] = num2;
            } else {
                // num3 num2 num1
                ordenado[0] = num3;
                ordenado[1] = num2;
                ordenado[2] = num1;
            }
        }
        if (Math.abs(ordenado[0] - ordenado[1]) == Math.abs(ordenado[1] - ordenado[2])) {
            System.out.println("los numeros forman una progresion aritmetica");
        } else {
            System.out.println("los numeros no forman una progresion aritmetica");

        }
    }

    public void secion5ejercicio1() {
        while (true) {
            System.out.println("ingrese tres numeros  ");
            System.out.println("numeoro 1");
            int num1 = leer.nextInt();
            System.out.println("numero 2");
            int num2 = leer.nextInt();
            System.out.println("numero 3");
            int num3 = leer.nextInt();
            progresionAritmetica(num1, num2, num3);
            System.out.println("DESEA CONTINUAR? S/N");
            if ("n".equalsIgnoreCase(leer.next())) {
                break;
            }
        }
    }

    public void secion6ejercicio1() {
        System.out.println("ingrese su genero M/F");
        String genero = leer.nextLine();
        String sectorT[] = { "salud", "educacion", "transporte" };
        double sueldoBase[] = { 15000, 12000, 18000 };
        String sector = """
                INGRESE SU SECTOR
                        1. salud
                        2. educacion
                        3. transporte
                        """;
        System.out.println(sector);
        int selec = leer.nextInt();
        double sueldoFinal = 0;
        if (genero.equalsIgnoreCase("M")) {
            if (selec == 1) {
                sueldoFinal = sueldoBase[selec - 1] + sueldoBase[selec - 1] * 0.25;
            } else if (selec == 2) {
                sueldoFinal = sueldoBase[selec - 1] + sueldoBase[selec - 1] * 0.12;
            } else if (selec == 3) {
                sueldoFinal = sueldoBase[selec - 1] + sueldoBase[selec - 1] * 0.20;
            }

        } else if (genero.equalsIgnoreCase("F")) {
            if (selec == 1) {
                sueldoFinal = sueldoBase[selec - 1] + sueldoBase[selec - 1] * 0.20;
            } else if (selec == 2) {
                sueldoFinal = sueldoBase[selec - 1] + sueldoBase[selec - 1] * 0.11;
            } else if (selec == 3) {
                sueldoFinal = sueldoBase[selec - 1] + sueldoBase[selec - 1] * 0.15;
            }
        }
        System.out.println("su sueldo final es: " + sueldoFinal);

    }

    public void secion6ejercicio2() {
        int hora = 0, minuto = 0, segundo = 0;
        while (true) {
            System.out.println("la hora es: " + hora + ":" + minuto + ":" + segundo);
            String aumentarTiempo = """
                    ingrese que desea aumentar
                    1. horas
                    2. minutos
                    3. segundos
                            """;
            System.out.println(aumentarTiempo);
            int selec = leer.nextInt();
            if (selec == 1) {
                hora++;
            } else if (selec == 2) {
                minuto++;
            } else if (selec == 3) {
                segundo++;
            }
            if (segundo == 60) {
                minuto++;
                segundo = 0;
            }
            if (minuto == 60) {
                hora++;
                minuto = 0;
            }
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    public void sesion7ejercicio1() {
        System.out.println("ingrese la puntuacion de trabajo");
        int puntuacion = leer.nextInt();
        switch (puntuacion) {
            case 0, 1, 2, 3, 4:
                System.out.println("descartado");
                break;
            case 5:
                System.out.println("en suspenso");
                break;
            case 6:
                System.out.println("aceptable");
                break;
            case 7, 8:
                System.out.println("notable");
                break;
            case 9, 10:
                System.out.println("sobresaliente");
                break;
            default:
                System.out.println("puntuacion no valida");
        }

    }

    public void sesion7ejercicio2() {
        String menu = """
                ingrese el origen del dinero
                1 dolar = 3.82 soles
                1 euro =4.17 soles

                    """;
        System.out.println(menu);
        System.out.println("el dinero de erigen (euro/dolar/soles)");
        String selec = leer.nextLine();
        System.out.println("ingrese la canyidad de dinero");
        double cantidad = leer.nextDouble();
        leer.nextLine(); // consume newline

        System.out.println("ingrese el dinero de destino");
        String destino = leer.nextLine();
        // origen
        switch (selec.toLowerCase()) {
            case "dolar":
                if ("euro".equals(destino)) {
                    System.out.println("el dinero convertido es: " + ((1 / 3.82 * 4.17)) * cantidad);
                    System.out.println("el dinero convertido es: " + 4.17 / 3.82 * cantidad);

                } else if ("soles".equals(destino)) {
                    double soles = cantidad * 3.82;
                    System.out.println("el dinero convertido es: " + soles);

                } else {
                    System.out.println("moneda no valida");
                }
                break;
            case "euro":
                if ("dolar".equals(destino)) {
                    double dolares = (1 / 4.17 * 3.82) * cantidad;
                    System.out.println("el dinero convertido es: " + dolares);
                } else if ("soles".equals(destino)) {
                    double soles = cantidad * 4.17;
                    System.out.println("el dinero convertido es: " + soles);
                }
                break;
            case "soles":
                if ("dolar".equals(destino)) {
                    double dolares = cantidad / 3.82;
                    System.out.println("el dinero convertido es: " + dolares);
                } else if ("euro".equals(destino)) {
                    double euros = cantidad / 4.17;
                    System.out.println("el dinero convertido es: " + euros);
                }

                break;
            default:

        }

    }

    public enum Calificacion {
        exelente,
        bueno,
        regular,
        deficiente
    }

    public void sesion8ejercicio1() {
        Calificacion calif = Calificacion.deficiente;
        System.out.println("ingrese la calificacion del alumno");
        Integer nota = leer.nextInt();
        calif = switch (nota) {
            case Integer n when (n > 18 && n <= 20) ->
                Calificacion.exelente;
            case Integer n when (n > 14 && n <= 18) ->
                Calificacion.bueno;
            case Integer n when (n > 10 && n <= 14) ->
                Calificacion.regular;
            default ->
                Calificacion.deficiente;
        };
        String calificacion = String.valueOf(calif);
        System.out.println("la calificacion es: " + calificacion);
    }

    // enumeracion de los numeros romanos del 1 al 50
    public enum NumerosRomanos {
        // name(value), name(value), ...
        I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9), X(10),
        XI(11), XII(12), XIII(13), XIV(14), XV(15), XVI(16), XVII(17), XVIII(18), XIX(19), XX(20),
        XXI(21), XXII(22), XXIII(23), XXIV(24), XXV(25), XXVI(26), XXVII(27), XXVIII(28), XXIX(29), XXX(30),
        XXXI(31), XXXII(32), XXXIII(33), XXXIV(34), XXXV(35), XXXVI(36), XXXVII(37), XXXVIII(38), XXXIX(39), XL(40),
        XLI(41), XLII(42), XLIII(43), XLIV(44), XLV(45), XLVI(46), XLVII(47), XLVIII(48), XLIX(49), L(50);

        private final int valor;

        NumerosRomanos(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }

    // codigo que pida al usuario que ingrese un numero y que el codigo le devuelva
    // en valor romano
    public void sesion8ejercicio2() {
        System.out.println("ingrese un numero del 1 al 50");
        int numero = leer.nextInt();
        String romano = "";
        // for each para recorrer la enumeracion
        for (NumerosRomanos nr : NumerosRomanos.values()) {
            if (nr.getValor() == numero) {
                romano = nr.name();
                break;
            }
        }
        if (!romano.isEmpty()) {
            System.out.println("el numero romano es: " + romano);
        } else {
            System.out.println("numero fuera de rango");
        }
    }

    public enum DefinicionCalificacion {
        Excelente, MuyBien, Satisfactorio, Suficiente, Insatisfactorio, Error
    }

    public void PC1() {
        System.out.println("Ingrese la calificacion");
        int nota = leer.nextInt();
        DefinicionCalificacion resultado = null;

        String agrupacion = (nota >= 101 && nota <= 120) ? "A"
                : (nota >= 71 && nota <= 100) ? "B"
                        : (nota >= 51 && nota <= 70) ? "C"
                                : (nota >= 41 && nota <= 50) ? "D"
                                        : (nota >= 0 && nota <= 40) ? "E" : "NO encontrado";

        resultado = switch (agrupacion) {
            case "A" ->
                DefinicionCalificacion.Excelente;

            case "B" ->
                DefinicionCalificacion.MuyBien;

            case "C" ->
                DefinicionCalificacion.Satisfactorio;

            case "D" ->
                DefinicionCalificacion.Suficiente;

            case "E" ->
                DefinicionCalificacion.Insatisfactorio;

            default ->
                DefinicionCalificacion.Error;

        };
        System.out.println("La calificacion es: " + resultado);
    }

    public void PC1parte2() {
        int estadoAtencion = 5;
        String descripcion = switch (estadoAtencion) {
            case 0 ->
                "solicitado";

            case 1 ->
                "en proceso";
            case 2 ->
                "asignacion de consultorio";
            case 3 ->
                "asignacion de hora y fecha";
            case 4 ->
                "Cancelado";
            case 5 ->
                "Suspendido";
            default ->
                "atendido";

        };
        System.out.println("La descripcion es: " + descripcion);
    }

    public void PC1parte3() {
        int numero;
        System.out.print("Ingrese un número entero: ");
        numero = leer.nextInt();
        String valor = (numero < 0) ? "Negativo" : (numero > 0) ? "positivo" : "cero";
        switch (valor) {
            case "Negativo":
                System.out.print("el número es negativo");
                break;
            case "Positivo":
                System.out.print("el número es positivo");
                break;
            case "Cero":
                System.out.print("el número es cero");
                break;

        }
    }

    public void PC1parte4() {
        int a = 40, b = 0;
        if (b != 0) {
            if ((a % b) == 0) {
                System.out.println(b + " es un factor de " + a);
            } else {
                System.out.println(b + " no es un factor de " + a);

            }
        } else {
            System.out.println("No se puede dividir entre cero");
        }
    }

    public void PC1parte5() {
        double precioProducto = 5427.5;
        int unidadesCompradas = 15;
        boolean aplicaDescuento = (unidadesCompradas < 12)
                || (precioProducto * unidadesCompradas < 12000.0);

        if (aplicaDescuento) {
            double total = (unidadesCompradas * precioProducto);
            total = total - (total * 0.25);
            System.out.println("Enhorabuena! Tiene 25% de descuento Total pagar:  " + total);

        }
    }

    public void PC1parte6() {
        int nota = 100;
        if (nota >= 90) {
            System.out.println("Felicitaciones");
        } else if (nota > 70) {
            if (nota >= 50) {
                System.out.println("Aprobado");
            }
            System.out.println("¡Muy bien hecho!");
        }
    }

    public void sesion11ejercicio1() {
        Pattern CodigoU = Pattern.compile("^U\\d{8}$");
        System.err.println("Ingrese su codigo universitario:");
        String codigo = leer.nextLine();
        while (!CodigoU.matcher(codigo).matches()) {
            System.err.println("Codigo invalido. Ingrese nuevamente:");
            codigo = leer.nextLine();
            leer.nextLine();
        }
    }

    public void sesion12ejercicio1() {
        Pattern DeseaContinuar = Pattern.compile("no|No|NO|nO");
        Pattern DeseaContinuar2 = Pattern.compile("si|Si|SI|sI");

        while (true) {
            System.out.println("ingrese un numero del 1 al 100");
            int numero = leer.nextInt();
            if (numero < 1 || numero > 100) {
                System.out.println("numero fuera de rango");
                break;
            } else {
                System.out.println("numero valido");
            }

            System.out.println("desea continuar? (si/no)");
            String respuesta = leer.next();
            if (DeseaContinuar.matcher(respuesta).matches()) {
                break;
            } else if (DeseaContinuar2.matcher(respuesta).matches()) {

            } else {
                System.out.println("respuesta no valida");
                break;
            }
        }

    }

    public void sesion12ejercicio2() {
        System.out.println("ingrese la nota de sus alumnos");
        int reprovados = 0, aprobados = 0;
        int nota = leer.nextInt();
        while (nota > 0) {
            if (nota >= 0 && nota <= 12) {
                reprovados++;
            } else if (nota > 12 && nota <= 20) {
                aprobados++;
            } else {
                System.out.println("nota no valida");
            }
            System.out.println();
            nota = leer.nextInt();
            leer.nextLine();
        }
        System.out.println("alumnos reprovados: " + reprovados);
        System.out.println("alumnos aprobados: " + aprobados);
    }

    public void sesion12ejercicio3() {
        Pattern correoValido = Pattern.compile("^[a-zA-Z0-9._%+-]+@gmail\\.com$");
        int intentos = 0;
        while (true) {
            System.out.println("ingrese su correo electronico");
            String correo = leer.nextLine();
            if (correoValido.matcher(correo).matches()) {
                while (true) {
                    System.out.println("ingrese la contraseña (P@55w0rd)");
                    if ("P@55w0rd".equals(leer.nextLine())) {
                        System.out.println("inicio de sesion exitoso");
                        break;
                    } else {
                        intentos++;
                        System.out.println("contraseña incorrecta");
                        if (intentos == 5) {
                            System.out.println("ha excedido el numero de intentos");
                            break;
                        }
                    }
                } // bucle contraseña
                break;
            } else {
                System.out.println("correo no valido");
                intentos++;
                if (intentos == 5) {
                    System.out.println("ha excedido el numero de intentos");
                    break;
                }

            }
        }
    }

    public void sesion13ejercicio1() {
        Pattern primo = Pattern.compile("^P\\d+$");
        do {
            System.out.println("Ingrese un numero para saber si es primo");
            System.out.println("Ejemplo  del formato (P23)");
            String numeroFormato = leer.nextLine();
            if (primo.matcher(numeroFormato).matches()) {
                int numero = Integer.parseInt(numeroFormato.substring(1));
                for (int i = 1; i <= numero; i++) {
                    if (i != 1 && i != numero) {
                        if (numero % i == 0) {
                            System.out.println("El numero no es primo");
                            break;
                        } else {
                            System.out.println("El numero es primo");
                            break;
                        }
                    }
                }
            }
        } while (true);
    }

    public void sesion13ejercicio2() {
        Pattern factorial = Pattern.compile("\\d!");
        do {
            System.out.println("Ingrese un numero para calcular su factorial");
            System.out.println("Ejemplo del formato (5!)");
            String numeroFormato = leer.nextLine();
            if (factorial.matcher(numeroFormato).matches()) {
                int numero = Integer.parseInt(numeroFormato.substring(0, numeroFormato.length() - 1));
                int resultado = 1;
                for (int i = 1; i <= numero; i++) {
                    resultado *= i;
                }
                System.out.println("El factorial de " + numero + " es: " + resultado);
                break;
            }

        } while (true);
    }

    public void sesion14ejercicio1() {
        Pattern empleado = Pattern.compile("^[a-zA-Z]+$");
        String Home = """
                1. Ingresar empleado
                2. Ingresar salario mensual
                3. Emitir boleta
                4. salir
                """;
        do {
            leer.nextLine();
            System.out.println(Home);
            int select = leer.nextInt();
            if (select == 1) {
                System.out.println("ingrese el nombre del empleado");
                leer.nextLine();
                String nombreEmpleado = leer.nextLine();
                System.out.println("ingrese el apellido del empleado");
                String apellidoEmpleado = leer.nextLine();
                if (empleado.matcher(nombreEmpleado).matches() && empleado.matcher(apellidoEmpleado).matches()) {
                    String Salario = """
                            2. Ingresar salario mensual
                            3. Emitir boleta
                            4. salir
                            """;
                    System.out.println(Salario);
                    if (2 != leer.nextInt()) {
                        System.out.println("PRIMERO INGRESE EL SALARIO MENSUAL");
                    }
                    System.out.println("ingrese el salario mensual del empleado");
                    double salarioMensual = leer.nextDouble();
                    String Final = """
                            3. Emitir boleta
                            4. salir
                            """;
                    System.out.println(Final);
                    if (3 == leer.nextInt()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("#".repeat(34)).append("\n");
                        sb.append("RESUMEN DE BOLETA DE PAGO\n");
                        sb.append("#".repeat(34)).append("\n");
                        sb.append("Nombre del empleado: ").append(nombreEmpleado).append("\n");
                        sb.append("Apellido del empleado: ").append(apellidoEmpleado).append("\n");
                        sb.append("Salario Ene: $").append(salarioMensual).append("   ").append("Salario Feb: $")
                                .append(salarioMensual).append("\n");
                        sb.append("Salario Mar: $").append(salarioMensual).append("   ").append("Salario Abr: $")
                                .append(salarioMensual).append("\n");
                        sb.append("Salario May: $").append(salarioMensual).append("   ").append("Salario Jun: $")
                                .append(salarioMensual).append("\n");
                        sb.append("Salario Jul: $").append(salarioMensual).append("   ").append("Salario Ago: $")
                                .append(salarioMensual).append("\n");
                        sb.append("Salario Sep: $").append(salarioMensual).append("   ").append("Salario Oct: $")
                                .append(salarioMensual).append("\n");
                        sb.append("Salario Nov: $").append(salarioMensual).append("   ").append("Salario Dic: $")
                                .append(salarioMensual).append("\n");
                        sb.append("#".repeat(34)).append("\n");
                        sb.append("Total Anual: $").append(salarioMensual * 12).append("\n");
                        sb.append("Descuento: $").append(600).append("\n");
                        sb.append("#".repeat(34)).append("\n");
                        System.out.println(sb.toString());

                    } else {
                        System.out.println("nombre o apellido no valido");
                    }

                }

            } else if (select == 2 || select == 3) {
                System.out.println("PRIMERO INGRESE EL EMPLEADO y salario mensual");

            } else if (select == 4) {
                break;
            }
        } while (true);

    }

    public void sesion14ejercicio2() {
        StringBuilder binario = new StringBuilder();
        System.out.println("ingrese un numero para transformarlo en binario");
        int numero = leer.nextInt();
        int residuo = 0;
        do {
            residuo = numero % 2;
            binario.append(residuo);
            numero = numero / 2;

        } while (numero > 0);
        System.out.println("el numero en binario es: " + binario.reverse().toString());

    }

    public void sesion14ejercicio3() {
        Pattern patron = Pattern.compile("^[A-Za-z]{2}=\\d+");
        System.out.println("ingrese una cadena con el formato wy=numero");
        String cadena = leer.nextLine();
        if (patron.matcher(cadena).matches()) {
            int numero = Integer.parseInt(cadena.split("=")[1].trim());
            String palabrade2letras = cadena.split("=")[0].trim();
            char letra1 = palabrade2letras.charAt(0);
            char letra2 = palabrade2letras.charAt(1);
            String transaccion = "";
            int contador = 0;
            int i = 1;
            do {
                // Si la fila es impar agrega 'a', si es par agrega 'b' al inicio
                if (i % 2 != 0) {
                    transaccion = letra1 + transaccion;
                } else {
                    transaccion = letra2 + transaccion;
                }
                System.out.println(transaccion);
                i++;
            } while (i <= numero);
        }
    }

    public void sesion15ejercicio1() {
        String progresiones = """
                1. Progresion Aritmetica +
                2. Progresion Aritmetica -
                3. Progresion Geometrica *
                4. Progresion Geometrica /
                5. Salir
                """;
        String progresion = "";
        boolean salir = false;
        while (!salir) {
            System.out.println(progresiones);
            System.out.println("ingrese el tipo de progresion que desea");
            int selec = leer.nextInt();

            switch (selec) {
                case 1:
                    System.out.println("ingrese el numero de inicio para la progresion aritmetica+");
                    int numeroInicio = leer.nextInt();
                    System.out.println("ingrese la razon de la progresion aritmetica");
                    int razon = leer.nextInt();
                    System.out.println("ingrese la cantidad de terminos de la progresion aritmetica");
                    int terminos = leer.nextInt();

                    for (int i = 0; i <= terminos; i++) {
                        progresion += String.format("%d ", numeroInicio);
                        numeroInicio += razon;
                    }
                    System.out.println(progresion);
                    progresion = "";

                    break;
                case 2:
                    System.out.println("ingrese el numero de inicio para la progresion aritmetica-");
                    int numero = leer.nextInt();
                    System.out.println("ingrese la razon de la progresion aritmetica");
                    int raz = leer.nextInt();
                    System.out.println("ingrese la cantidad de terminos de la progresion aritmetica");
                    int termino = leer.nextInt();
                    for (int i = 0; i <= termino; i++) {
                        progresion += String.format("%d ", numero);
                        numero -= raz;
                    }
                    System.out.println(progresion);
                    progresion = "";

                    break;
                case 3:
                    System.out.println("ingrese el numero de inicio para la progresion geometrica*");
                    int numeroIni = leer.nextInt();
                    System.out.println("ingrese la razon de la progresion geometrica");
                    int razo = leer.nextInt();
                    System.out.println("ingrese la cantidad de terminos de la progresion geometrica");
                    int termi = leer.nextInt();
                    for (int i = 0; i <= termi; i++) {
                        progresion += String.format("%d ", numeroIni);
                        numeroIni *= razo;
                    }
                    System.out.println(progresion);
                    progresion = "";

                    break;
                case 4:
                    System.out.println("ingrese el numero de inicio para la progresion geometrica/");
                    int numeroIn = leer.nextInt();
                    System.out.println("ingrese la razon de la progresion geometrica");
                    int ra = leer.nextInt();
                    System.out.println("ingrese la cantidad de terminos de la progresion geometrica");
                    int termin = leer.nextInt();
                    for (int i = 0; i <= termin; i++) {
                        progresion += String.format("%d ", numeroIn);
                        numeroIn /= ra;
                    }
                    System.out.println(progresion);
                    progresion = "";
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        }
    }

    public void prueva() {

        final int _NUMERO_LINEAS_ = 8;
        int valor = 1;
        for (int i = 1; i <= _NUMERO_LINEAS_; i++) {
            System.out.printf("%" + _NUMERO_LINEAS_ + "d\n", valor);
            valor = valor * 10 + 1;
        }
    }

    public void sesion16ejercicio1() {
        System.out.println("ingrese su nombre completo");
        String nombreCompleto = leer.nextLine();
        System.out.println("ingrese el tipo (contratado/nombrado)");
        String tipo = leer.nextLine();
        System.out.println("ingrese su salario mensual");
        double salarioMensual = leer.nextDouble();
        System.out.println("ingrese el numeor de boletas emitidas");
        int boletasEmitidas = leer.nextInt();
        System.out.println("ingrese los meses de trabajo");
        int mesesTrabajo = leer.nextInt();
        StringBuilder informeBuilder = new StringBuilder();

        informeBuilder.append(String.format("#".repeat(40) + "\n"
                + "# RESUMEN  DE BOLETA DE PAGO" + " ".repeat(20) + "#\n"
                + "#".repeat(40) + "\n"
                + "EMPLEADO: %s\n", nombreCompleto + "\n"));

        // Informe += String.format("# RESUMEN DE BOLETA DE PAGO" + " ".repeat(20) +
        // "#\n");
        // Informe += String.format("#".repeat(40) + "\n");
        // Informe += String.format("EMPLEADO: %s\n", nombreCompleto);
        if (tipo.equalsIgnoreCase("contratado")) {
            tipo = "CONTRATADO";
            informeBuilder.append(String.format("TIPO: [x]%s   [ ]NOMBRADO \n", tipo));
        } else {
            tipo = "NOMBRADO";
            informeBuilder.append(String.format("TIPO: [ ]CONTRATADO   [x]%s\n", tipo));
        }
        informeBuilder.append(String.format("#".repeat(40) + "\n"
                + "DATOS DEL SALARIO                  BOLETA\n"));
        // Informe = String.format("DATOS DEL SALARIO BOLETA\n");

        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };
        for (int i = 0; i < mesesTrabajo; i++) {
            if (i < boletasEmitidas) {
                informeBuilder.append(String.format("SALARIO %s: %.2f        SI  \n", meses[i], salarioMensual));
            } else {
                informeBuilder.append(String.format("SALARIO %s: %.2f          NO \n", meses[i], salarioMensual));
            }
        }
        informeBuilder.append(String.format("#".repeat(40) + "\n"));
        informeBuilder.append(String.format(" BOLETAS EMITIDAS:%d     BOLETAS RESTANTES:%d\n", boletasEmitidas,
                mesesTrabajo - boletasEmitidas));
        informeBuilder.append(String.format("TOTAL  ANUAL: %.2f\n", salarioMensual * mesesTrabajo));
        System.out.println(informeBuilder.toString());
    }

    public void sesion16ejercicio2() {
        System.out.println("ESTE ES UN PROGRAMA QUE MUESTRA LA SERIE FIGONACI");
        System.out.println("INGRESE CUANTOS NUEROS QUERES VER  Y ADEMAS SE LE ARA UNA SUMA");
        int n = leer.nextInt();
        String serieFigonachi = "";
        int variableControl = 1;
        int variableRescate = 0;
        int transaccion;
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            // serie figonachi
            transaccion = variableControl + variableRescate;
            variableControl = variableRescate;
            variableRescate = transaccion;
            suma += transaccion;

            serieFigonachi += String.format("%d%s", transaccion, ",");
        }
        System.out.println("la suma es : " + suma);
        System.out.println(serieFigonachi);
    }

    public void sesion16ejercicio3() {
        String menuColores = """
                1. rojo
                2. celeste
                3. morado
                """;
        int rojo = 0, celeste = 0, morado = 0;
        double porcentajerojo = 0, porcentajeCleste = 0, porcentajeMorado = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("vota por tu color favorito");
            System.out.println(menuColores);
            int eleccion = leer.nextInt();
            switch (eleccion) {
                case 1 ->
                    rojo++;
                case 2 ->
                    celeste++;
                case 3 ->
                    morado++;

                default ->
                    throw new AssertionError();
            }
        }
        porcentajerojo = ((double) rojo / 10) * 100;
        porcentajeCleste = ((double) celeste / 10) * 100;
        porcentajeMorado = ((double) morado / 10) * 100;
        String reporte = String.format("ROJO: %d %.2f%%   \n", rojo, porcentajerojo);
        reporte += String.format("CELESTE: %d %.2f%%   \n ", celeste, porcentajeCleste);
        reporte += String.format("MORADO: %d %.2f%%    \n", morado, porcentajeMorado);
        System.out.println(reporte);
    }

    public void sesion17ejercicio1() {
        StringBuilder cadenaFor = new StringBuilder();
        StringBuilder cadenaDo = new StringBuilder();
        StringBuilder cadenaWhile = new StringBuilder();
        int[] numerosEnteros = new int[6];

        System.out.println(numerosEnteros.length);
        // rellenamos el arreglo con datos randon
        for (int i = 0; i < numerosEnteros.length; i++) {
            numerosEnteros[i] = (int) (Math.random() * 100) + 1;
        }
        int suma = 0;
        // for
        for (int i = 0; i < numerosEnteros.length; i++) {
            cadenaFor.append(numerosEnteros[i]).append(", ");
        }
        // do while
        int i = 0;
        do {
            cadenaDo.append(numerosEnteros[i]).append(", ");
            suma += numerosEnteros[i];
            i++;
        } while (i < numerosEnteros.length);
        // while
        i = 0;
        while (i < numerosEnteros.length) {
            cadenaWhile.append(numerosEnteros[i]).append(", ");
            i++;
        }
        System.out.println(cadenaFor);
        System.out.println(cadenaDo);
        System.out.println(cadenaWhile);
        System.out.println("la suma es : " + suma);

    }

    public void sesion18ejercicio1() {
        StringBuilder sb = new StringBuilder();
        String[] nombres = { "Juan Carlos Garcia Rodrig",
                "Ana Mariela Torres Montes", "Rosa Inoñan Farro",
                "Carlos Alberto Rojas Chan", " Gabriela Lucia Alvides Ch" };
        int[] edades = { 19, 25, 22, 24, 25 };
        int[] grados = { 5, 5, 4, 5, 5 };
        int[] PC1 = { 20, 20, 20, 16, 20 };
        int[] PC2 = { 19, 17, 18, 18, 20 };
        int[] PC3 = { 15, 18, 12, 15, 14 };
        int[] EF = { 17, 16, 13, 12, 15 };
        double[] PROM = new double[5];
        String nombreMaximo = "";
        for (String nombre : nombres) {
            if (nombre.length() > nombreMaximo.length()) {
                nombreMaximo = nombre;
            }
        }
        sb.append(centrarFormato(" REPORTE DE NOTAS ", 70)).append("\n");
        /*
         * sb.append("NOMBRE").append(" ".repeat(nombreMaximo.length() -
         * 4)).append("EDAD  ");
         * sb.append("GRADO  ").append("PC1 ").append("PC2 ").append("PC3 ").
         * append("EF ").append("PROM  \n");
         * sb.append(repetir(50)).append("\n");
         */
        sb.append(String.format("%-" + nombreMaximo.length() + "s %5s %5s %4s %4s %4s %3s %6s\n",
                "NOMBRE", "EDAD", "GRADO", "PC1", "PC2", "PC3", "EF", "PROM"));

        for (int i = 0; i < nombres.length; i++) {
            PROM[i] = (PC1[i] + PC2[i] + PC3[i] + EF[i]) / 4;
            sb.append(String.format("%-" + nombreMaximo.length() + "s %5d %5d %4d %4d %4d %3d %6.2f\n",
                    nombres[i].trim(), edades[i], grados[i], PC1[i], PC2[i], PC3[i], EF[i], PROM[i]));

            // sb.append(String.format("%s %d %d %d %d %d %d %.2f", nombres[i], edades[i],
            // grados[i], PC1[i], PC2[i], PC3[i], EF[i], PROM[i])).append("\n");
        }
        sb.append(repetir(50));
        System.out.println(sb);
    }

    public String repetir(int i) {
        return ("#".repeat(i));
    }

    public String centrarFormato(String str, int espacio) {
        int espacioLibre = espacio - str.length();
        int izquierda = espacioLibre / 2;
        int derecha = espacioLibre - izquierda;
        return ("#".repeat(derecha) + str + "#".repeat(izquierda));
    }

    public void sesion18ejercicio2() {
        StringBuilder sb = new StringBuilder();
        String codigo[] = { "QWER", "ASDF", "ZXCV" };
        String Nombre[] = { "DETERGENTE", "PIZZA", "LECHE EN CAJA" };
        double precios[] = { 3.25, 12.9, 30.5 };
        int variables[] = { 6, 2, 12 };
        double semiTotal = 0;
        sb.append(centrarTexto("TIENDA ABC", 40)).append("\n");
        sb.append(centrarTexto("RUC: 2146909", 40)).append("\n");
        sb.append(centrarTexto("CHICLAYO-PERU", 40)).append("\n");
        sb.append("CAJERO: ROSA").append("\n");
        for (int i = 0; i < codigo.length; i++) {
            sb.append(String.format("%s  %s", codigo[i], Nombre[i])).append("\n");
            sb.append(" ".repeat(15))
                    .append(String.format("%d  X  %.2f  %.2f", variables[i], precios[i], variables[i] * precios[i]))
                    .append("\n");
            semiTotal = semiTotal + (variables[i] * precios[i]);
        }
        sb.append("OP. GRAVADA: ").append(semiTotal).append("\n");
        sb.append("I. G. V: ").append(semiTotal * 0.18).append("\n");
        sb.append("TOTAL: ").append(semiTotal + (semiTotal * 0.18)).append("\n");
        sb.append("CLIENTE: CARLOS").append("\n");
        System.out.println(sb.toString());

    }

    public void sesion19ejercicio1() {
        int[] numerosA = { 1, 3, 5, 7, 0, 8, 3, 7, 1, 0 };
        int[] numerosB = { 0, 4, 6, 7, 0, 11, 5, 0, 9, 0 };
        String encontrados = "";
        for (int i = 0; i < numerosA.length; i++) {

            for (int j = 0; j < numerosB.length; j++) {
                if (numerosA[i] == numerosB[j]) {
                    String valor = String.valueOf(numerosA[i]);
                    if (!encontrados.contains("[" + valor + "]")) {
                        System.out.println("nuemro encontrado en los dos : " + numerosA[i]);
                        encontrados += "[" + valor + "]";
                    }
                }
            }
        }
    }

    public void sesion19ejercicio2() {
        int edades[] = new int[6];
        String nombres[] = new String[6];
        nombres[0] = "a";
        nombres[1] = "b";
        nombres[2] = "c";
        nombres[3] = "d";
        nombres[4] = "f";
        nombres[5] = "g";
        /*
         * for (int i = 0; i <= 5; i++) {
         * System.out.println("ingrese su nombre");
         * nombres[i] = leer.nextLine();
         * System.out.println("ingrese su edad");
         * edades[i] = leer.nextInt();
         * leer.nextLine();
         * }
         */
        int edadvase = 0;
        edades[0] = 1;
        edades[1] = 3;
        edades[2] = 6;
        edades[3] = 2;
        edades[4] = 4;
        edades[5] = 2;

        for (int i = 0; i < edades.length - 1; i++) {
            for (int j = 0; j < edades.length - 1 - i; j++) {
                if (edades[j] > edades[j + 1]) {

                    int inter = edades[j];
                    edades[j] = edades[j + 1];
                    edades[j + 1] = inter;

                    String interc = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = interc;

                }
            }

        }
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i] + "  " + nombres[i]);
        }

    }

    public void sesion21ejercicio1() {
        int[] suma = new int[3];
        int[][] numeros = new int[3][3];
        double[] promedio = new double[3];

        for (int f = 0; f < numeros.length; f++) {

            for (int c = 0; c < numeros[0].length; c++) {
                System.out.println("Ingrese numeros para la matris de 3x3" + f + "-" + c);
                numeros[f][c] = leer.nextInt();
                suma[f] += numeros[f][c];
            }
            promedio[f] = suma[f] / (double) numeros[f].length;
        }

        for (int f = 0; f < numeros.length; f++) {
            for (int c = 0; c < numeros[0].length; c++) {
                System.out.print(numeros[f][c] + " ");
            }
            System.out.println("suma: " + suma[f] + " promedio: " + promedio[f]);
        }
    }

    public void sesion22ejercicio1() {
        StringBuilder sb = new StringBuilder();
        String[] nombres = { "Juan Carlos Garcia Rodrig",
                "Ana Mariela Torres Montes", "Rosa Inoñan Farro",
                "Carlos Alberto Rojas Chan", " Gabriela Lucia Alvides Ch" };
        int[] edades = { 19, 25, 22, 24, 25 };
        int[] grados = { 5, 5, 4, 5, 5 };
        int[][] Matriz = { { 20, 19, 15, 17 },
                { 20, 17, 18, 16 },
                { 20, 18, 12, 13 },
                { 16, 18, 15, 12 },
                { 20, 20, 14, 15 } };
        /*
         * {20, 20, 20, 16, 20},
         * {19, 17, 18, 18, 20},
         * {15, 18, 12, 15, 14},
         * {17, 16, 13, 12, 15}};
         */
        double[] PROM = new double[5];

        String nombreMaximo = "";
        for (String nombre : nombres) {
            if (nombre.length() > nombreMaximo.length()) {
                nombreMaximo = nombre;
            }
        }

        sb.append(centrarFormato(" REPORTE DE NOTAS ", 70)).append("\n");
        sb.append(String.format("%-" + nombreMaximo.length() + "s %5s %5s %4s %4s %4s %3s %6s\n",
                "NOMBRE", "EDAD", "GRADO", "PC1", "PC2", "PC3", "EF", "PROM"));

        for (int i = 0; i < nombres.length; i++) {

            sb.append(String.format("%-" + nombreMaximo.length() + "s %5d %5d ",
                    nombres[i].trim(), edades[i], grados[i]));
            for (int f = 0; f < Matriz[0].length; f++) {
                sb.append(String.format("%4s ", Matriz[i][f]));
                PROM[i] += (double) Matriz[i][f] / 4;
            }
            sb.append(String.format("%6.2f\n", PROM[i]));

        }
        System.out.println(sb.toString());

    }

}
