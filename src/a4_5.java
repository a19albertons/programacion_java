import java.util.Scanner;

public class a4_5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int columna=sc.nextInt();
        int filas=sc.nextInt();
        int arboles=sc.nextInt();
        sc.nextLine();
        while (columna!=0 && filas!=0){
//            - nada
//            * arbol
//            + sombra

//Creacion tablero
            StringBuilder[] tablero=new StringBuilder[columna];
            for (int i=0;i<columna;i++){
                tablero[i]=new StringBuilder("-".repeat(filas));
            }
//            Procesado arboles
            if (arboles!=0){
                int contador=0;
                while (contador<arboles) {
                    int posicion1=sc.nextInt()-1;
                    int posicion2=sc.nextInt()-1;
                    tablero[posicion1].setCharAt(posicion2,'*');
                    contador++;
                }
            }

//Procesado sombra
            for (int i =0;i<columna;i++){
                for (int j=0;j<filas;j++){
                    if (tablero[i].charAt(j)=='*'){
                        if (i-1>=0 && j-1>=0 && tablero[i-1].charAt(j-1)!='*'){
                            tablero[i-1].setCharAt(j-1,'+');
                        }
                        if (i-1>=0 && tablero[i-1].charAt(j)!='*'){
                            tablero[i-1].setCharAt(j,'+');
                        }
                        if (i-1>=0 && j+1<tablero[i-1].length() && tablero[i-1].charAt(j+1)!='*'){
                            tablero[i-1].setCharAt(j+1,'+');
                        }
                        if (i>=0 && j-1>=0 && tablero[i].charAt(j-1)!='*'){
                            tablero[i].setCharAt(j-1,'+');
                        }
                        if (i>=0 && j+1<tablero[i].length() && tablero[i].charAt(j+1)!='*'){
                            tablero[i].setCharAt(j+1,'+');
                        }
                        if (i+1<tablero.length && j-1>=0 && tablero[i+1].charAt(j-1)!='*'){
                            tablero[i+1].setCharAt(j-1,'+');
                        }
                        if (i+1<tablero.length && tablero[i+1].charAt(j)!='*'){
                            tablero[i+1].setCharAt(j,'+');
                        }
                        if (i+1<tablero.length && j+1<tablero[i+1].length() && tablero[i+1].charAt(j+1)!='*'){
                            tablero[i+1].setCharAt(j+1,'+');
                        }

                    }
                }
            }

//            salida
            int contador=0;
            for (int i =0;i<tablero.length;i++){
                for (int j=0;j<tablero[i].length();j++){
                    if (tablero[i].charAt(j)=='+'){
                        contador++;
                    }
                }
            }
            System.out.println(contador);

////            Debugger
//            for (int i=0;i<tablero.length;i++) {
//                System.out.println(tablero[i]);
//            }

            columna=sc.nextInt();
            filas=sc.nextInt();
            arboles=sc.nextInt();
            sc.nextLine();
        }
    }
}
