import java.util.Scanner;

public class a1_6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num_casos = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<num_casos;i++){
            int primer_dia=sc.nextInt();
            int variacion=sc.nextInt();
            sc.nextLine();
            int resultado = primer_dia+variacion;
            if (resultado>0) {
                System.out.println("SI");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
