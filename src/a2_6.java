import java.util.Scanner;

public class a2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador=0;
        while (sc.hasNext()){
            sc.next();
            contador+=1;
        }
        System.out.println(contador);
    }
}
