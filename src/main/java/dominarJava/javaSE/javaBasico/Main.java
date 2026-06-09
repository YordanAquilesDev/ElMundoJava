package dominarJava.javaSE.javaBasico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // creamos un objeto para poner a prueva la logica
        // basica adquirida a lo largo de inicio de mi carrera
        /*
         * LogicaAdquiridaFundamentosSolidosDeJava d = new
         * LogicaAdquiridaFundamentosSolidosDeJava();
         * 
         * CosasQueAyEnUnArchivo co = new CosasQueAyEnUnArchivo();
         * 
         * MasFundamentosDeUnArchivo mf = new MasFundamentosDeUnArchivo();
    */
   BusquedaSecuenlcial busqueda= new BusquedaSecuenlcial();
   //busqueda.BusquedaSecuencialorBloque();
   busqueda.BusquedaSecuencialPorIndice();

    }
}