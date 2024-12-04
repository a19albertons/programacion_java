import java.util.Scanner;

public class a4_4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int filas=sc.nextInt();
        int columnas=sc.nextInt();
        sc.nextLine();

        while (filas!=0 && columnas!=0) {
//            Creacion de tablero
            String[] tablero=new String[columnas];
            for (int i=0;i<columnas;i++) {
                tablero[i]=sc.nextLine();
            }

//            Procesado tablero
            int num_minas=0;
            for (int i=0;i<columnas;i++){
                for (int j=0;j<filas;j++){
                    int minas_alrededor=0;
                    if (tablero[i].charAt(j)=='-'){
                        if (i-1>=0 && j-1>=0 && tablero[i-1].charAt(j-1)=='*'){
                            minas_alrededor++;
                        }
                        if (i-1>=0 && tablero[i-1].charAt(j)=='*'){
                            minas_alrededor++;
                        }
                        if (i-1>=0 && j+1<tablero[i-1].length() && tablero[i-1].charAt(j+1)=='*'){
                            minas_alrededor++;
                        }
                        if (i>=0 && j-1>=0 && tablero[i].charAt(j-1)=='*'){
                            minas_alrededor++;
                        }
                        if (i>=0 && j+1<tablero[i].length() && tablero[i].charAt(j+1)=='*'){
                            minas_alrededor++;
                        }
                        if (i+1<tablero.length && j-1>=0 && tablero[i+1].charAt(j-1)=='*'){
                            minas_alrededor++;
                        }
                        if (i+1<tablero.length && tablero[i+1].charAt(j)=='*'){
                            minas_alrededor++;
                        }
                        if (i+1<tablero.length && j+1<tablero[i+1].length() && tablero[i+1].charAt(j+1)=='*'){
                            minas_alrededor++;
                        }

                    }
                    if (minas_alrededor>=6){
                        num_minas++;
                    }
                }
            }



//            salida
            System.out.println(num_minas);
//            for (int i=0;i<tablero.length;i++){
//                System.out.println(tablero[i]);
//            }





            filas=sc.nextInt();
            columnas=sc.nextInt();
            sc.nextLine();
        }


    }
}
