import java.util.Scanner;

public class a2_2 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num_casos=sc.nextInt();
        sc.nextLine();
        for (int i=0; i<num_casos; i++) {
            float perimetro= sc.nextFloat();
            float diametro= sc.nextFloat();
            sc.nextLine();

            float relacion=perimetro/diametro-3;
            if (relacion>0.1415 && relacion<0.1417){
                System.out.println("ES CIRCUNFERENCIA");
            }
            else {
                System.out.println("PARECE UN HUEVO");
            }
        }
    }
}
