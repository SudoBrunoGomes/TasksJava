package JavaTasks.Introduction;

public class PrimitiveType {
    public static void main(String[] args) {
        //int, double, float, char,byte,short,long,boolean
        int exempleInt = 10;
        long exempleLong = 100000;
        double exempleDouble = 3123.05210052;
        float exempleFloat = 12.0213F;
        byte exempleByte = 127;
        short exempleShort = 50;
        boolean exempleBoolean = true;
        //no caso do char o Java vai somar o número 10 ao número da posição do M na tabela ASCII, retornando a letra da Posição 109(M) + 10 (numero informado) = 119 = W
        char exempleChar = 'm' + 10 ;

        System.out.println("out int =" + exempleInt);
        System.out.println("out long =" + exempleLong);
        System.out.println("out double =" + exempleDouble);
        System.out.println("out float =" + exempleFloat);
        System.out.println("out byte =" + exempleByte);
        System.out.println("out short =" + exempleShort);
        System.out.println("out boolean =" + exempleBoolean);
        System.out.println("out char =" + exempleChar);





    }
}
