import java.util.Scanner;

public class a4_3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int filas= sc.nextInt();
        int columnas=sc.nextInt();
        sc.nextLine();
        while (filas!= 0 && columnas!=0){
//        Creacion tablero
            String[] tablero= new String[filas];
            for (int i=0;i<filas;i++){
                tablero[i]=sc.nextLine();
            }

//        Gestion daltonicos
            int num_daltonicos=sc.nextInt();
            sc.nextLine();
            for (int i=0;i<num_daltonicos;i++){
                char viejo=sc.next().charAt(0);
                char nuevo=sc.next().charAt(0);
                for (int j=0;j<filas;j++){
                    tablero[j]=tablero[j].replace(viejo,nuevo);
                }
            }

//        Salida
            for (int i=0;i<filas;i++){
                System.out.println(tablero[i]);
            }
            filas= sc.nextInt();
            columnas=sc.nextInt();
            sc.nextLine();
        }
    }

}
