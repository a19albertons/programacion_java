import java.util.Scanner;

public class a2_1 {
    public static void main(String [] args) {
        Scanner sc =new Scanner(System.in);
        int num_pizzas= sc.nextInt();
        sc.nextLine();
        while (num_pizzas!=0) {
            int num_amigos=sc.nextInt();
            sc.nextLine();
            if (num_amigos%num_pizzas==0){
                System.out.println(num_amigos/num_pizzas);
            }
            else {
                System.out.println("PELEA");
            }
            num_pizzas= sc.nextInt();
            sc.nextLine();
        }

    }

}
