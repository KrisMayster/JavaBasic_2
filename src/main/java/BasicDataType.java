import java.util.Date;

public class BasicDataType {

    public static void main(String[] args){

        boolean bool = true;
        boolean bool2 = false;

        byte byte1 = 126; // -128...128
        byte byte2 = 3;
        //byte byteError = byte1 + byte2; //over byte

        short short1 = 32767; // -32,768 .. 32,767
        int int1 = 2147483647; // -2147483648 .. 2147483647
        //int intError = Int1 + 10000000000; // error
        long long1 = 9223372036854775807L; // -9223372036854775808L .. 9223372036854775807L

        float float1 = 0.1F;
        double double1 = 0.2;

        System.out.println(int1 + long1 - float1);
        System.out.println(short1 + int1 - long1 + double1);

        int[] mass = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(mass[3]);

        boolean vrbl1 = 5 < 3;
        System.out.println(vrbl1);
        boolean vrbl2 = ((1 < 3) || (23 <= 25));
        System.out.println(vrbl2);
        boolean vrbl3 = ((1 < 3) && (23 <= 25));
        System.out.println(vrbl3);
        boolean vrbl4 = ((1 < 3) && (23 <= 21));
        System.out.println(vrbl4);


        String str1 = "Hello, it's me";
        System.out.println(str1);

        int a = 10 + 20;
        int b = 100 - 50;
        int c = 10 / 3;
        int d = 10 % 3;
        int e = 100 * 2;


        int f = a + b - c * d % e;
        System.out.println(f);

        String str2 = "How are you?";
        System.out.println(str1 + "." + " " + str2);

        String positive = "Казнить нельзя, помиловать.";
        String negative = "Казнить, нельзя помиловать.";

        int time = 12;
        //int time = 19;


        if (time >= 10 && time < 18) {
            System.out.println(positive);}
        else {
            System.out.println(negative);
        };


    }
}
