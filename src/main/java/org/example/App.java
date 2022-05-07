package org.example;

/*
Разработать простую программу, использующую все примитивные типы данных Java и ссылочный тип String.
Продемонстрировать основные особенности работы с ними.
 */

public class App {
    public static void main( String[] args ) {

        boolean boolVar = true;

        char ch1 = 'J',
                ch2 = '\u0041',
                ch3 = 'A' + 21,
                ch4 = 65,
                ch5 = '\n';

        String str1 = String.valueOf(new char[]{ch1, ch2, ch3, ch4, ch5}),
                str2 = "Hello " + str1,
                str3 = "JAVA\n";
        System.out.print(str2);
        System.out.print(str2.length());
        System.out.print(str2.substring(6));
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);

        byte b1 = 100,
                b2 = (byte)300, // = 44
                b3 = (byte)-b1;
        String strF = String.format("b1=%d, b2=%d, b3=%d", b1, b2, b3);
        System.out.println(strF);

        short sh1 = 2;
        int int1 = 100_000,
                int2 = 'h';
        long l1 = 1_000_000_000_000L;
        float f1 = 12.34f;
        double d1 = 100.0,
                d2 = (double)20 / 3,
                d3 = 10e+12;
        System.out.printf("d=%.2f, l=%d", d2, l1);

        int hexVar = 0xFF,
                octalVar = 077,
                binaryVar = 0b101;
        System.out.println(Integer.toHexString(hexVar) + "=" + hexVar + "\n"
                + Integer.toOctalString(octalVar) + "=" + octalVar + "\n"
                + Integer.toBinaryString(binaryVar) + "=" + binaryVar + "\n");

        int accessMask = 0b011_111_001;
        boolean isHaveAccess = (accessMask >>> 6 & 0b010) == 0b010;
        System.out.println(isHaveAccess);
    }
}