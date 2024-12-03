import java.util.Scanner;

public class a3_1 {
    public static void main(String [] args) {
        int[] dias_mes={31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc =new Scanner(System.in);
        int num_casos= sc.nextInt();
        sc.nextLine();
        for (int i=0;i<num_casos;i++) {
            int dia=sc.nextInt();
            int mes=sc.nextInt();
            sc.nextLine();
            int resultado=0;
            for (int j=mes;j<=12;j++){
                if (j==mes){
                    resultado+=dias_mes[j-1]-dia;
                }
                else {
                    resultado+=dias_mes[j-1];
                }
            }
            System.out.println(resultado);
        }
    }
}