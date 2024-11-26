import java.util.Scanner;

public class a1_2 {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<casos;i++) {
            int insectos=sc.nextInt();

            int aracnidos=sc.nextInt();

            int crustaceos=sc.nextInt();

            int escolopendras=sc.nextInt();
            int anillos=sc.nextInt();

            System.out.println(insectos*6+aracnidos*8+crustaceos*10+escolopendras*anillos*2);
        }
    }
}
