public class a2_5 {
    public static void main(String [] args){
        System.out.println(piNilakantha(0));
        System.out.println(piNilakantha(1));
        System.out.println(piNilakantha(4));
        System.out.println(piNilakantha(50));
    }

private static double piNilakantha(int i) {
    double resultado = 3.0;
    double sumar=0.0F;
    for (int j=1;j<=i;j++) {
        double variacion = (double) 4 /((j*2)*(j*2+1)*(j*2+2));
        if (j%2==1){
            sumar+=variacion;
        }
        else {
            sumar-=variacion;
        }
//            System.out.println(sumar);
    }
    resultado+=sumar;
    return resultado;
}
}
