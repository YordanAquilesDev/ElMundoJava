
package dominarJava.javaSE.javaBasico.ExperimentosJava;
public class GeneradorNumerosRomanos{



    public String numeroRomano(String numeroTexto){
        //467
      String romano;
        try{
            int digitos[]= new int[numeroTexto.length];
            for(int i= 0; i<digitos.length;i++){
                digitos[i]= Character.getNumericValue(numeroTexto.charAt(i));
            }

             for(int i= 0; i<digitos.length;i++){
               if(digitos.length=i+1){
                //asemos uso de el caso 1
               }

               
            }

            for(int i: digitos){
                switch(i){

                }
            }
     
        
           
        }   
    }

}
enum numerosRomanosBase{
    I,
    V,
    X,
    L,
    C,
    D,
    M

}