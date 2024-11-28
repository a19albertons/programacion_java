public class a2_7 {
    public static void main(String [] args) {
        flipChar("En un lugar de la Mancha");
        flipChar("El MOS6502 es un microprocesador de 8 bits de 1975");
        flipChar("\"Veni, vidi, vici\"; Julius Caesar 47 a.C.");
    }

private static String flipChar(String linea) {
    StringBuilder nueva_linea= new StringBuilder();
    for (int i=0;i<linea.length();i++){
        char nuevo_caracter=linea.charAt(i);
        if (linea.charAt(i) >= 'A' && linea.charAt(i) <= 'Z') {
            nuevo_caracter= (char) (linea.charAt(i) | 0b0100000);
        }
        else if (linea.charAt(i) >= 'a' && linea.charAt(i) <= 'z'){
            nuevo_caracter= (char) (linea.charAt(i) & 0b1011111);
        }
        nueva_linea.append(nuevo_caracter);
    }
//        System.out.println(nueva_linea.toString());
    return nueva_linea.toString();
}
}
