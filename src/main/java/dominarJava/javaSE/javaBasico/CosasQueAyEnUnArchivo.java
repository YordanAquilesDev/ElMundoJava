package dominarJava.javaSE.javaBasico;

public class CosasQueAyEnUnArchivo {
    // una clase java
    // tiene atributos y metodos un clasico de  POO
    // los atributos en su mayoria o mayormente son tipo de datos primitivos
    // recordando que el dato String es no primitivo
    // Asuminos que queremos representar a una persona en java
    // sus datos serian
    // primitivos
    int edad;
    double estatura;
    // los primitivos no se somente a metodos
    // int edad1 = edad.NoAyMetodos

    // no primitivos
    // te preguntaras por que String es un tipo de dato no primitivo
    // es porque el dato estring pertenece a un clase String
    // y como recordaras una clase tiene atributos y metodos
    // pues si el string tiene metodos
    String nombre;

    int tamaño = nombre.length(); // --> .length() es un metodo
    String mayuscula = nombre.toLowerCase();// .toLowerCase() es otro metodo

    // una ves visto un poco sobre atributos
    // veamos un poco sobre los metodos

    public int devolverUnRamdon() {
        String descripcion = " un metod es una accion o comportacmiento " +
                " que puede tener una calse en java ";

        return  (int) (Math.random() * 1000);
    }

    public String Describir() {
        return "Recuerda el String es un tipo No primitivo" +
                " por que es una clase y tiene metodos";
    }

    public double NumeroRamdonDouble() {
        return Math.random();
    }


}
