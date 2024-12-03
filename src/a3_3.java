import java.util.Scanner;

public class a3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_casos= sc.nextInt();
        sc.nextLine();
        for (int i=0;i<num_casos;i++){
            int[] dientes_arriba = new int[6];
            int contador=0;

            while (contador<6){
                dientes_arriba[contador] = sc.nextInt();
                contador++;
            }
            int[] dientes_abajo = new int[6];
            contador=0;
            while (contador<6){
                dientes_abajo[contador] = sc.nextInt();
                contador++;
            }
            contador=1;
            int base= dientes_arriba[0]+dientes_abajo[0];
            for (int j = 1 ; j<dientes_arriba.length; j++) {
                if (base == dientes_arriba[j]+dientes_abajo[j]){
                    contador++;
                }
                else {
                    break;
                }
            }
//            System.out.println(contador);
            if (contador==6) {
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
