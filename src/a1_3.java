import java.util.Scanner;

public class a1_3 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int num_huevos= sc.nextInt();
        int capacidad= sc.nextInt();
        sc.nextLine();

        while (num_huevos!=0 && capacidad!=0) {
            int tiempo=0;
            while (num_huevos>0) {
                num_huevos= num_huevos - capacidad;
                tiempo+=10;
            }
            System.out.println(tiempo);
            num_huevos=sc.nextInt();
            capacidad= sc.nextInt();
            sc.nextLine();
        }
    }
}
