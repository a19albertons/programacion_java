
import java.util.Scanner;

public class a4_8 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
//        Numero de casos
        int num_casos=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<num_casos;i++) {

            //        Creacion tablero
            String[] tablero = new String[9];
            for (int j = 0; j < 9; j++) {
                tablero[j] = sc.nextLine().replace(" ","");
            }

//            Procesado tablero
//            Procesado linea
            int linea=0;
            boolean ilegal=false;
            for (int j=0;j<9;j++) {
                int sub_linea=0;
                for (int k=1;k<10;k++){
                    if (tablero[j].contains(String.valueOf(k))){
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
                StringBuilder nueva_linea=new StringBuilder();
                for (int k=0;k<9;k++){
                    nueva_linea.append(tablero[k].charAt(j));
                }
                String otra_linea=nueva_linea.toString();
                for (int k=1;k<10;k++){
                    if (otra_linea.contains(String.valueOf(k))){
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
                    StringBuilder subcuadro= new StringBuilder();
                    subcuadro.append(tablero[j].charAt(k));
                    subcuadro.append(tablero[j].charAt(k+1));
                    subcuadro.append(tablero[j].charAt(k+2));

                    subcuadro.append(tablero[j+1].charAt(k));
                    subcuadro.append(tablero[j+1].charAt(k+1));
                    subcuadro.append(tablero[j+1].charAt(k+2));

                    subcuadro.append(tablero[j+2].charAt(k));
                    subcuadro.append(tablero[j+2].charAt(k+1));
                    subcuadro.append(tablero[j+2].charAt(k+2));
                    String subcuadro_string=subcuadro.toString();
//                    System.out.println(subcuadro_string);
                    for (int p=1;p<10;p++){
                        if (subcuadro_string.contains(String.valueOf(p))){
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
