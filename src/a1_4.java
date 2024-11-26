import java.util.Scanner;

public class a1_4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int numero=sc.nextInt();
        sc.nextLine();
        while (numero!=0){
            for (int i=0;i<numero;i++){
                System.out.print(1);
            }
            System.out.println();


            numero=sc.nextInt();
            sc.nextLine();
        }
    }
}
