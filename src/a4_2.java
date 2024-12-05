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
//            Comprobamos si los 0 empiezan en primera linea o no
            boolean arriba_abajo=false;
            for (int i=0;i<tam_cuadrado;i++) {
                if (tablero[0][i]==0){
                    arriba_abajo=true;
                    break;
                }
            }

//          Controla que sean 0
            boolean devolver = true;
            if (arriba_abajo) {
                int contador=1;
                for (int i=0;i<tam_cuadrado;i++){
                    for (int j=contador;j<tam_cuadrado;j++){
                        if (tablero[i][j] != 0) {
//                            System.out.println("Soy ilegal");
                            devolver = false;
                            break;
                        }
                    }
                    contador++;
                }
            }
            else {
                int contador=0;
                for (int i=0;i<tam_cuadrado;i++){
                    for (int j=0;j<contador;j++) {
                        if (tablero[i][j] != 0) {
//                            System.out.println("Soy ilegal");
                            devolver = false;
                            break;
                        }
                    }
                    contador++;
                }
            }

//            Controla que diagonal sea distinto de 0
            boolean diagonal_legal=true;
            for (int i=0;i<tam_cuadrado;i++){
                if (tablero[i][i]==0){
                    diagonal_legal=false;
                }
            }




//            Controla la parte del triangulo que debería ser distina de 0
            boolean devolver_inverso = false;
            if (!arriba_abajo) {
                int contador=1;
                for (int i=0;i<tam_cuadrado;i++){
                    for (int j=contador;j<tam_cuadrado;j++){
                        if (tablero[i][j] == 0) {
//                            System.out.println("Soy ilegal");
                            devolver_inverso = true;
                            break;
                        }
                    }
                    contador++;
                }
            }
            else {
                int contador=0;
                for (int i=0;i<tam_cuadrado;i++){
                    for (int j=0;j<contador;j++) {
                        if (tablero[i][j] == 0) {
//                            System.out.println("Soy ilegal");
                            devolver_inverso = true;
                            break;
                        }
                    }
                    contador++;
                }
            }

//            salida
            if (devolver && diagonal_legal && !devolver_inverso){
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
