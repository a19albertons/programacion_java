import java.util.Scanner;

public class a1_5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num_casos= sc.nextInt();
        sc.nextLine();
        for (int i=0;i<num_casos;i++){
            int dia= sc.nextInt();
            int mes= sc.nextInt();
            sc.nextLine();
            if (dia==25 && mes==12) {
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
