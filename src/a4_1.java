import java.util.Scanner;

public class a4_1 {
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
            boolean salir=false;
            int contador=0;
            for (int i=0;i<tam_cuadrado;i++){
                if (tablero[i][i]==1 && !salir){
                    contador+=1;
                }
                else {
                    break;
                }
                for (int j=0;j<tam_cuadrado;j++) {
                    if (i!=j && tablero[i][j]!=0){
                        salir= true;
                        break;
                    }

                }
            }

//            Salida
            if (contador==tam_cuadrado){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
//            System.out.println(tablero[0][0]);









            tam_cuadrado= sc.nextInt();
            sc.nextLine();
        }
    }
}
