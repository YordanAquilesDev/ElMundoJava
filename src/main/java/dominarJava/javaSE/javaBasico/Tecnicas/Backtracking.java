 
 public class Backtracking{
 / Si quieres probar que tu lógica funciona rápido, cambia N a 5.
    // Para N = 8, el backtracking puro puede tardar mucho según la posición inicial.
    static final int N = 6; 
    static final int n = (N + 1);
    private int[][] tablero = new int[n][n];
    private boolean exito;
    private int[][] SALTO = {
        {2, 1},
        {1, 2},
        {-1, 2},
        {-2, 1},
        {-2, -1},
        {-1, -2},
        {1, -2},
        {2, -1}
    };
    private int x0, y0;
    
    public CaballoSaltador(int x, int y) throws Exception {
        if ((x < 1) || (x > N) || (y < 1) || (y > N)) {
            throw new Exception("Coordenadas no válidas");
        }
        x0 = x;
        y0 = y;
        for (int i = 1; i <= N; i++) {   
            for (int j = 1; j <= N; j++) {       
                tablero[i][j] = 0;
            }
        }
        tablero[x0][y0] = 1;
        exito = false;
    }
    
    public boolean resolverProblema() {
        saltoCaballo(x0, y0, 2);
        return exito;
    }
    
    private void saltoCaballo(int x, int y, int i) {
        int nx, ny;
        int k = 0;
        
        do {
            nx = x + SALTO[k][0];
            ny = y + SALTO[k][1];
            k++; // Incrementamos para avanzar en las 8 opciones
            
            if ((nx >= 1) && (nx <= N) && (ny >= 1) && (ny <= N) && (tablero[nx][ny] == 0)) {
                tablero[nx][ny] = i;
                
                if (i < N * N) {
                    saltoCaballo(nx, ny, i + 1);
                    if (!exito) {
                        tablero[nx][ny] = 0; // Backtracking: deshacer movimiento
                    }
                } else {
                    exito = true; // Se completaron las N*N casillas
                }
            }
            // Eliminamos el System.out.println de K porque ralentiza aún más el proceso masivo de recursión.
        } while ((k < 8) && !exito);
    }
    
    // CORREGIDO: i <= N y j <= N para mostrar el tablero completo
    public void escribirTablero() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println();
        }
    }
    

 }