import java.util.Scanner;

public class a2_3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        System.out.println(myIndexOf("hola a todos",'s'));
    }

private static Integer myIndexOf(String holaATodos, char s) {
    for (int i=0;i< holaATodos.length();i++) {
        if (holaATodos.charAt(i) == s) {
            return i;
        }
    }
    return -1;
}
}