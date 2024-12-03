import java.util.Arrays;
import java.util.Scanner;

public class a3_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num_numeros = sc.nextInt();
        sc.nextLine();
        while (num_numeros!=0) {
            int[] conjunto_numeros=new int[num_numeros];
            for (int i=0;i<num_numeros;i++){
                conjunto_numeros[i] = sc.nextInt();
            }
            sc.nextLine();
            Arrays.sort(conjunto_numeros);
            int centro=num_numeros/2;
            int resultado=0;
            if (num_numeros%2==1){
                resultado=conjunto_numeros[centro]*2;
            }
            else {
                resultado=conjunto_numeros[centro]+conjunto_numeros[centro-1];
            }
            System.out.println(resultado);
            num_numeros=sc.nextInt();
            sc.nextLine();
        }



    }
}
