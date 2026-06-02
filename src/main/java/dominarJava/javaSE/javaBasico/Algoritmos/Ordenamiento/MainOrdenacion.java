package dominarJava.javaSE.javaBasico.Algoritmos.Ordenamiento;

public class MainOrdenacion {

    public static void main(String[] args) {
        OrdenamientoInterno ordenamientoInterno = new OrdenamientoInterno();
        // ordenamientoInterno.OrdenamientoBurbuja();
        // ordenamientoInterno.OrdenamientoSeleccion();
        // ordenamientoInterno.OrdenamientoInsercion();
        //OrdenamientoExterno ordenamientoExterno = new OrdenamientoExterno();
        // ordenamientoExterno.OrdenamientoPorMezclaDirecta();
        // ordenamientoExterno.OrdenamientoPorFusionNatural();
        // ordenamientoExterno.OrdenamientoPorMezclaEquilibradaMultiple();
        //ordenamientoExterno.OrdenamientoPorMezclaPolifasica();
        OrdenamientoRapido ordenamineRapido= new OrdenamientoRapido();
        ordenamineRapido.OrdenamientoRapidoQuickShort();

    }
}