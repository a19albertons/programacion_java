import java.util.Scanner;

public class a4_9 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
//        Tamaño y num reinas
        int tamaño=sc.nextInt();
        int reinas=sc.nextInt();
        sc.nextLine();

        while (tamaño!=0 && reinas!=0){
//            Creacion tablero
            StringBuilder[] tablero=new StringBuilder[tamaño];
            for (int i=0;i<tamaño;i++){
                tablero[i]=new StringBuilder("-".repeat(tamaño));
            }

//            Añadido reinas
            for (int i=0;i<reinas;i++){
                int posicion1=sc.nextInt()-1;
                int posicion2=sc.nextInt()-1;
                tablero[posicion1].setCharAt(posicion2,'*');
            }

//            Procesado tablero
            boolean atacadas=false;
            for (int i=0;i<tamaño;i++){
                for (int j=0;j<tamaño;j++){
                    if (tablero[i].charAt(j)=='*'){
//                        Arriba
                        for (int contador=1;i-contador>=0;contador++){
                            if (tablero[i-contador].charAt(j)=='*'){
                                atacadas=true;
                            }
                        }
//                        abajo
                        for (int contador=1;i+contador<tamaño;contador++){
                            if (tablero[i+contador].charAt(j)=='*'){
                                atacadas=true;
                            }
                        }
//                        izquierda
                        for (int contador=1;j-contador>=0;contador++){
                            if (tablero[i].charAt(j-contador)=='*'){
                                atacadas=true;
                            }
                        }
//                        derecha
                        for (int contador=1;j+contador<tamaño;contador++){
                            if (tablero[i].charAt(j+contador)=='*'){
                                atacadas=true;
                            }
                        }
//                        arriba izquierda
                        for (int contador=1;i-contador>=0 && j-contador>=0;contador++){
                            if (tablero[i-contador].charAt(j-contador)=='*'){
                                atacadas=true;
                            }
                        }
//                        arriba derecha
                        for (int contador=1;i-contador>=0 && j+contador<tamaño;contador++){
                            if (tablero[i-contador].charAt(j+contador)=='*'){
                                atacadas=true;
                            }
                        }
//                        abajo izquierda
                        for (int contador=1;i+contador<tamaño && j-contador>=0;contador++){
                            if (tablero[i+contador].charAt(j-contador)=='*'){
                                atacadas=true;
                            }
                        }
//                        abajo derecha
                        for (int contador=1;i+contador<tamaño && j+contador<tamaño;contador++){
                            if (tablero[i+contador].charAt(j+contador)=='*'){
                                atacadas=true;
                            }
                        }
                    }
                    if (atacadas){
                        break;
                    }
                }
                if (atacadas){
                    break;
                }
            }

//            Salida
            if (atacadas){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }



            tamaño=sc.nextInt();
            reinas=sc.nextInt();
            sc.nextLine();
        }
    }
}
