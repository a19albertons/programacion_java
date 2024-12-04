import java.util.Scanner;

public class a4_6 {
//    Se determina tambien de backtracking no se continua
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int fila=sc.nextInt();
            int columna=sc.nextInt();
            sc.nextLine();
//            Creacion tablero
            String[] tablero=new String[fila];
            for (int i=0;i<tablero.length;i++){
                tablero[i]=sc.nextLine();
            }

//          Procesado tablero
            boolean es_posible_S=false;
            for (int i=0;i<tablero.length;i++){
                for (int j=0;j<tablero.length;j++){
                    if (tablero[i].charAt(j)=='S') {
                        //                    arriba
                        if (i-1>=0 && (tablero[i-1].charAt(j)=='.'||tablero[i-1].charAt(j)=='F')){
                            es_posible_S=true;
                        }
//                    izquierda
                        if (i>=0 && j-1>=0 && (tablero[i].charAt(j-1)=='.'||tablero[i].charAt(j-1)=='F')){
                            es_posible_S=true;
                        }
//                    derecha
                        if (i>=0 && j+1<tablero[i].length() && (tablero[i].charAt(j+1)=='.'||tablero[i].charAt(j+1)=='F')){
                            es_posible_S=true;
                        }
                        if (i+1<tablero.length && (tablero[i+1].charAt(j)=='.'||tablero[i+1].charAt(j)=='F')){
                            es_posible_S=true;
                        }
                        break;
                    }
                }
            }
            boolean es_posible_F=false;
            for (int i=0;i<tablero.length;i++){
                for (int j=0;j<tablero.length;j++){
                    if (tablero[i].charAt(j)=='F'){
                        //                    arriba
                        if (i-1>=0 && (tablero[i-1].charAt(j)=='.'||tablero[i-1].charAt(j)=='S')){
                            es_posible_F=true;
                        }
//                    izquierda
                        if (i>=0 && j-1>=0 && (tablero[i].charAt(j-1)=='.'||tablero[i].charAt(j-1)=='S')){
                            es_posible_F=true;
                        }
//                    derecha
                        if (i>=0 && j+1<tablero[i].length() && (tablero[i].charAt(j+1)=='.'||tablero[i].charAt(j+1)=='S')){
                            es_posible_F=true;
                        }
                        if (i+1<tablero.length && (tablero[i+1].charAt(j)=='.'||tablero[i+1].charAt(j)=='S')){
                            es_posible_F=true;
                        }
                        break;
                    }
                }
            }

//            Salida

            if (es_posible_S && es_posible_F){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }


//            fila=sc.nextInt();
//            columna=sc.nextInt();
//            sc.nextLine();
        }
    }
}
