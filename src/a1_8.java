import java.util.Scanner;

public class a1_8 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num_casos=sc.nextInt();
        sc.nextLine();
        for (int i=0; i<num_casos;i++){
            sc.next();
            String nombre=sc.next();

            System.out.println("Hola, "+nombre+".");
        }
    }
}
