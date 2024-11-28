public class a2_8 {
    public static void main(String [] args){
        for (int i=0;i<100;i++){
            for (int j=0;j<10;j++){
                String basico="0000"+String.valueOf(i*i);
                System.out.print(basico.substring(basico.length()-4)+ "  ");
                i++;
            }
            i--;
            System.out.println();
        }
    }
}
