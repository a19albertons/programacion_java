import java.util.Arrays;
import java.util.Scanner;

public class a3_5 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num_numeros= sc.nextInt();
        sc.nextLine();
        while (num_numeros!=0){
            int[] conjunto_numeros=new int[num_numeros];
            for (int i=0;i<num_numeros;i++){
                conjunto_numeros[i]=sc.nextInt();
            }
            sc.nextLine();
            Arrays.sort(conjunto_numeros);
            int contador=0;
            int contador_mas_alto=0;
            int numero=0;
            int numero_moda=0;
            for (int i=0;i<num_numeros;i++) {
                if (conjunto_numeros[i]==numero){
                    contador++;
                    if (contador>contador_mas_alto) {
                        contador_mas_alto=contador;
                        numero_moda=conjunto_numeros[i];
                    }
                }
                else {
                    contador=1;
                    numero=conjunto_numeros[i];
                    if (contador_mas_alto==0) {
                        contador_mas_alto++;
                        numero_moda=conjunto_numeros[i];
                    }
                }
            }
            System.out.println(numero_moda);


            num_numeros= sc.nextInt();
            sc.nextLine();
        }
    }
}
