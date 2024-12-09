import java.util.Scanner;

public class a4_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int filas= sc.nextInt();
        int columnas=sc.nextInt();
        sc.nextLine();
        while (filas!= 0 && columnas!=0){
//        Creacion tablero
            char[][] tablero= new char[filas][columnas];
            for (int i=0;i<filas;i++){
                tablero[i]=sc.nextLine().toCharArray();
            }


//        Gestion daltonicos mejorada para aceptar el reto profesor
            char[] correspondenciaDaltonica =new char[127];
            for (char c='A'; c<='Z';c++){
                correspondenciaDaltonica[c]=c;
            }
//            procesar copistas
            int numCopista=sc.nextInt();
            for (int i=0;i<numCopista;i++){
                char colorOrig=sc.next().charAt(0);
                char colorNuevo=sc.next().charAt(0);
                for (char c='A'; c<='Z';c++){
                    if (correspondenciaDaltonica[c]==colorOrig){
                        correspondenciaDaltonica[c]=colorNuevo;
                    }
                }
            }

//        Salida
            for (int i=0;i<filas;i++){
                for (int j = 0; j < columnas; j++) {
                    System.out.print(correspondenciaDaltonica[tablero[i][j]]);
                }
                System.out.println();
            }
            filas= sc.nextInt();
            columnas=sc.nextInt();
            sc.nextLine();
        }
    }

}