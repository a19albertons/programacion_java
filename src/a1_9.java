import java.util.Scanner;

public class a1_9 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int hora=sc.nextInt();
        sc.skip(":");
        sc.useDelimiter("\n");
        int minuto=sc.nextInt();
        sc.nextLine();
        while (hora!=0 || minuto!=0){
            int calculo_hora=23-hora;
            int calculo_minuto=60-minuto;
            int tiempo = calculo_hora*60 +calculo_minuto;


            System.out.println(tiempo);
            sc.useDelimiter(":");
            hora= sc.nextInt();
            sc.skip(":");
            sc.useDelimiter("\n");
            minuto= sc.nextInt();
            sc.nextLine();
        }
    }
}
