import java.util.Scanner;

public class a1_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num_casos=sc.nextInt();
        for (int i=0; i<num_casos; i++){
            String primera=sc.next().toLowerCase();
            sc.next();
            String segunda=sc.next().toLowerCase();
            sc.nextLine();
//            System.out.println(primera);
//            System.out.println(segunda);
            if (primera.equals(segunda)){
                System.out.println("TAUTOLOGIA");
            }
            else {
                System.out.println("NO TAUTOLOGIA");
            }
        }
    }
}
