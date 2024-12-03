import java.util.Scanner;

public class a3_4 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num_picos=sc.nextInt();
        sc.nextLine();
        while (num_picos!=0) {
            int[] valores_picos=new int[num_picos];
            for (int i=0;i<num_picos;i++){
                valores_picos[i]=sc.nextInt();
            }
            sc.nextLine();
            int contador_picos=0;
//            Caso inicial
            if (valores_picos[0]>valores_picos[1]&&valores_picos[0]>valores_picos[valores_picos.length-1]) {
                contador_picos+=1;
            }
//            Casi del medio
            for (int i=1; i<num_picos-1;i++) {
                if (valores_picos[i]>valores_picos[i-1]&&valores_picos[i]>valores_picos[i+1]){
                    contador_picos+=1;
                }
            }
//            Caso final
            if (valores_picos[valores_picos.length-1]>valores_picos[valores_picos.length-2]&&valores_picos[valores_picos.length-1]>valores_picos[0]) {
                contador_picos+=1;
            }

            System.out.println(contador_picos);


            num_picos=sc.nextInt();
            sc.nextLine();
        }
    }
}
