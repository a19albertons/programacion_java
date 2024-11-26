import java.util.Scanner;

public class a1_11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String frase=sc.nextLine();
        while (!frase.equals("XXX")){
            frase = frase.replace(" ","").toLowerCase();

            String nueva_frase="";
            for (int i=frase.length()-1;i>=0;i--){
                nueva_frase=nueva_frase+frase.charAt(i);
            }
            if (frase.equals(nueva_frase)){
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
            frase= sc.nextLine();
        }


    }
}
