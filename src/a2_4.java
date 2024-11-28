public class a2_4 {
    public static void main(String [] args) {
        System.out.println(mulRusa(105,1));
        System.out.println(mulRusa(1,105));
        System.out.println(mulRusa(1999,33));
    }

private static Integer mulRusa(int i, int j) {
    int devolver=0;
    for (int k=j; k>=1;k/=2){
        if (k%2==1) {
            devolver+=i;
        }



        i*=2;
    }
    return devolver;
}
}
