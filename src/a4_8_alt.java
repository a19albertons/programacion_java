
import java.util.Arrays;
import java.util.Scanner;

public class a4_8_alt {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
//        Numero de casos
        int num_casos=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<num_casos;i++) {

            //        Creacion tablero
            int[][] tablero = new int[9][9];
            for (int j = 0; j < 9; j++) {
                for (int k=0; k<9; k++){
                    tablero[j][k] = sc.nextInt();
                }
            }

//            Procesado tablero
//            Procesado linea
            int linea=0;
            boolean ilegal=false;
            for (int j=0;j<9;j++) {
                int sub_linea=0;
                for (int k=1;k<10;k++){
                    int finalK = k;
                    if (Arrays.stream(tablero[j]).anyMatch(n -> n == finalK)){
                        sub_linea+=1;
                    }
                    else {
                        ilegal=true;
                        break;
                    }
                }
                if (sub_linea==9){
                    linea+=1;
                }

                if (ilegal) {
                    break;
                }
            }

            if (ilegal) {
                System.out.println("NO");
                continue;
            }



//            System.out.println(linea);

//            Procesado arriba abajo
            int arriba_abajo=0;
            for (int j=0;j<9;j++) {
                int sub_arriba_abajo=0;
                int [] nueva_linea=new int[9];
                for (int k=0;k<9;k++){
                    nueva_linea[k]=tablero[k][j];
                }
                for (int k=1;k<10;k++){
                    int finalK = k;
                    if (Arrays.stream(nueva_linea).anyMatch(n -> n == finalK)){
                        sub_arriba_abajo++;
                    }
                    else {
                        ilegal=true;
                        break;
                    }
                }
                if (sub_arriba_abajo==9){
                    arriba_abajo+=1;
                }
                if (ilegal){
                    break;
                }
            }
            if (ilegal){
                System.out.println("NO");
                continue;
            }
//            System.out.println(arriba_abajo);
            //            Procesado cuadrado
            int cuadrado=0;
            for (int j=0;j<9;j+=3) {

                for (int k=0;k<9;k+=3){
                    int sub_cuadrado=0;
                    int[] subcuadro= new int[9];
                    subcuadro[0] = tablero[j][k];
                    subcuadro[1] = tablero[j][k+1];
                    subcuadro[2] = tablero[j][k+2];

                    subcuadro[3] = tablero[j+1][k];
                    subcuadro[4] = tablero[j+1][k+1];
                    subcuadro[5] = tablero[j+1][k+2];

                    subcuadro[6] = tablero[j+2][k];
                    subcuadro[7] = tablero[j+2][k+1];
                    subcuadro[8] = tablero[j+2][k+2];

//                    System.out.println(subcuadro_string);
                    for (int p=1;p<10;p++){
                        int finalP = p;
                        if (Arrays.stream(subcuadro).anyMatch(n -> n == finalP)){
                            sub_cuadrado++;
                        }
                        else {
                            ilegal=true;
                            break;
                        }
                    }
                    if (sub_cuadrado==9){
                        cuadrado+=1;
                    }
                    if (ilegal){
                        break;
                    }
                }
                if (ilegal){
                    break;
                }
            }

            if (ilegal){
                System.out.println("NO");
                break;
            }
//            System.out.println(cuadrado);



//            Salida
            System.out.println("SI");





        }
    }
}
