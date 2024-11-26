import java.util.Scanner;

public class a1_1 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);

        int numero=sc.nextInt();
        while (numero != 0) {
            if (numero % 2 == 1) {
                System.out.println("IZQUIERDA");
            }
            else {
                System.out.println("DERECHA");
            }




            sc.nextLine();
            numero=sc.nextInt();
        }
    }
}
