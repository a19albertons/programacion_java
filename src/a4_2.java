import java.util.Scanner;

public class a4_2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int tam_cuadrado= sc.nextInt();
        sc.nextLine();
        while (tam_cuadrado!=0){
//            Creamos tablero
            int[][] tablero = new int[tam_cuadrado][tam_cuadrado];

            for (int i=0;i<tam_cuadrado;i++){
                for (int j=0;j<tam_cuadrado;j++){
                    tablero[i][j]= sc.nextInt();
                }
            }

//            Procesamos tablero
//            Enfoque basado en una solución vista como valida para acpeta el reto
            boolean superior=true;
            boolean inferior=true;

            for (int i=0;i<tam_cuadrado;i++){
                for (int j=0;j<tam_cuadrado;j++){
//                    superior
                    if (i!=j && j>i && tablero[i][j]!=0){
                        superior=false;
                    }
                    //inferior
                    if (i!=j && i>j && tablero[i][j]!=0){
                        inferior=false;
                    }
                }

            }

//            salida
            if (superior || inferior){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }







            tam_cuadrado= sc.nextInt();
            sc.nextLine();
        }
    }
}
