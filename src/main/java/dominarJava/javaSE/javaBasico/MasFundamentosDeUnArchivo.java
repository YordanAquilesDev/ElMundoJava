package dominarJava.javaSE.javaBasico;

public class MasFundamentosDeUnArchivo {

    // si muy bien se sabe que este es una clase java
    // veremos un poco sobre las estructuras
    // la condicional if simple tomo una decicion
    // muy usada para tomar deciciones en un programa
    String pasword = "123456789";
    String usuario = "user";
    int edad;         //operaciones logicas
    boolean esmayor = (edad > 18);
    boolean Autenticadoo=(pasword=="123456789" && usuario=="user");

    public void estructuraIF(){

        if(Autenticadoo){
            System.out.println("Pude acceder a su cuenta");
        };

        if(esmayor) {
            System.out.println("Pude solicitar su dni de mayor");// la variable si es mayor a 18
        };

        if(edad>18) {
            // la variable si es mayor a 18
            System.out.println("Pude solicitar su dni de mayor");
        };

        if(true) {
            System.out.println("");// esta condicion siempre se cumplira

        };

        if(false) {
            System.out.println(""); // esta condicion nunca se cumplira
        }
        if(usuario==null) {
            System.out.println("Usuario no puede estar vacio");
        }

        // para estas condiciones if es donde se usan las operadores logicos en su
        // maxima expresion
        // lo veremos mas luego


    }

    public void estructuraIFanidado(){
        boolean v= true;
        boolean f=false;
        boolean d=false;

        if(f){
            System.out.println("la variavle f es true");
        }else{
            System.out.println("la variavle f es false");
        };

        if(f){
            System.out.println("la variavle f es true");
        }else if(d){
            System.out.println("la variavle d es true");
        }else if(v){
            System.out.println("la variavle v es true");
        }else{
            System.out.println("la variavle v es false");
        }

    }
    public void estrcuturaFor(){
        int i=0;
        //crea un bucle   asta que la condifion  no se cumpla
        //
        for(i=0;i<5;i++){
            System.out.println(i);
        }
        int j=0;
        for(j=0;j<5;j++){
            System.out.println(j);
        }
        //es como crer un choche
         // el i incrementa
        // el j decrementa
        for(i=0,j=10;i<j;i++,j--){
            System.out.println(i);
            System.out.println(j);
        }
        // con los bucles se puede craer arte
        // aser cosas que sean impresionantes
        // el bucle for ademas declarar una variable escribir, una condicion
        //y incremetar el indice

        //tenemos el forEch
         String[] nombres = {"yoi","alberto","ricardo","juan","lucas"};
        //esto dice  recorre el nombre que esta dentro del arreglo nombres
        // comienza desde el primero al ultimo ( indice 0)
        for(String nombre:nombres){
            System.out.println(nombre);
        }
        // su estructura es declarar un variable del mismo tipo del arreglo
        // ponerle un nombre el que mas se adecue a la situacion
        //luego pones  a que arreglo quieres recorrer
        for(String nombreAdecuadoAlaSituacion:nombres){
            System.out.println(nombreAdecuadoAlaSituacion);
        }

    }

    public void estructuraWhile(){
        String[] nombre = new String[5];
        boolean seTermino=true;
        // tambien otro bucle
        // muy usado para la recoleccion de datos  de una db
        // como es de saber todos los bucles nesecitan de una condicion para  funcionar
        while (seTermino) {
            System.out.println("este bucle se ejecuta infinitamente");// ya que no ay una cndicion que lo detenga
        }

      int contador=0;
        while(seTermino){
            //recorremos el arreglo
            System.out.println(nombre[contador]);
            if(contador<=nombre.length){
                seTermino=false;
            }
            contador++;
        }
    }

    public void estructuraDoWhile(){
        //este bucle funciona  o es muy util ya que primero deve ejecutarse  una ves este bucle
        //luego recien evalua
        //ejemplo o casos de uso:
        //intentar crear una contraseña y el sistema te diga que si es segura  o no

        String password;
        do {
            password = "123";
            if (!esSegura(password)) {
                System.out.println("Password muy débil, intenta de nuevo.");
            }
        } while (!esSegura(password));
    }
    public boolean esSegura(String password) {
        //la famosa operacion regex validacion de contenido de una variable
        // String
        return password.matches("^[a-zA-Z0-9]*$");
    }




}
