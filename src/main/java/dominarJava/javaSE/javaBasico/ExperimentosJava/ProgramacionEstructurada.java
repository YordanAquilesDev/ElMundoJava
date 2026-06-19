package dominarJava.javaSE.javaBasico.ExperimentosJava;
 import java.util.Scanner;
public class ProgramacionEstructura{


    public void calculadoraEnConsola(){
        Scanner lector= new Scanner(System.in);
        //ejemplos
        // 3+4
        // 3 x  54
        // 5-1
        String  formato;
        while(true){
            System.out.println("Ingrese su operacion matematica")
          String operacion= lector.nextLine();
          //ejemplos 3 + 2 + 6  x 7
          String[] valores = operacion.trim().split("\\s+");
          String valoresSegundariosDivicion[];
          String valoresTercearios[];
          for(int i=0; i<valores.length;i++){
            if(valores[i].equals("x")){
                int valorIzquierdo= Integer.parseInt(valores[i-1]);
                int valorDerecho= Integer.parseInt(valores[i+1]);
                double multiplicacion=
            }
            for(int j=0; valoresSegundariosDivicion.length;j++){
                
            }
          }
        
        
        }
    }
}