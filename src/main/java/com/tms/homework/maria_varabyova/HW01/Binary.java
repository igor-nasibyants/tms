package com.tms.homework.maria_varabyova.HW01;

public class Binary {
    public static void main(String[] args) {

        int a = 10; // 1010
        int b = 2;  // 0010
        System.out.println("unary NOT : " + ~a);
        System.out.println("unary NOT : " + Integer.toBinaryString(~a));
        System.out.println("\n ");
        int c = a & b; // bitwise AND
        System.out.println("bitwise AND : " + c);
        System.out.println("bitwise AND : " + Integer.toBinaryString(c));
        System.out.println("\n ");
        int d = a | b; // bitwise OR
        System.out.println("bitwise OR : " + d);
        System.out.println("bitwise OR : " + Integer.toBinaryString(d));
        System.out.println("\n ");
        int e = a ^ b; // bitwise XOR
        System.out.println("bitwise XOR : " + e);
        System.out.println("bitwise XOR: " + Integer.toBinaryString(e));
        System.out.println("\n ");
        int f = a >> b; // right shift >>
        System.out.println("right shift >> : " + f);
        System.out.println("right shift >> : " + Integer.toBinaryString(f));
        System.out.println("\n ");
        int g = a >>> b; // zero fill right shift >>> сдвиг вправо с заполнением нулями / без учета знака
        System.out.println("zero fill right shift >>> : " + g);
        System.out.println("zero fill right shift >>> : " + Integer.toBinaryString(g));
        System.out.println("\n ");
        int h = a << b; // left shift <<
        System.out.println("left shift << : " + h);
        System.out.println("left shift << : " + Integer.toBinaryString(h));
        System.out.println("\n ");
        int i = a;
        i &= b; // bitwise AND assignment &=
        System.out.println("bitwise AND assignment &= : " + (i));
        System.out.println("bitwise AND assignment &= : " + Integer.toBinaryString(i));
        System.out.println("\n ");
        int j = a;
        j |= b; // bitwise OR assignment |=
        System.out.println("bitwise OR assignment |= : " + (j));
        System.out.println("bitwise OR assignment |= : " + Integer.toBinaryString(j));
        System.out.println("\n ");
        int k = a;
        k ^= b; // bitwise XOR assignment ^=
        System.out.println("bitwise XOR assignment ^= : " + k);
        System.out.println("bitwise XOR assignment ^= : " + Integer.toBinaryString(k));
        System.out.println("\n ");
        int l = a;
        l >>= b; // right shift assignment >>=
        System.out.println("right shift assignment >>= : " + l);
        System.out.println("right shift assignment >>= : " + Integer.toBinaryString(l));
        System.out.println("\n ");
        int m = a;
        m >>>= b; // bitwise unsigned right shift assignment / shift right zero fill assignment >>>= сдвиг вправо с заполнением нулями с присваиванием
        System.out.println("unsigned right shift assignment >>>= : " + m);
        System.out.println("unsigned right shift assignment >>>= : " + Integer.toBinaryString(m));
        System.out.println("\n ");
        int n = a;
        n <<= b; // left shift assignment <<=
        System.out.println("left shift assignment <<= : " + n);
        System.out.println("left shift assignment <<= : " + Integer.toBinaryString(n));
        System.out.println("\n ");

        int ans = 42;
        System.out.println("to binary : " + Integer.toBinaryString(ans));
        System.out.println("\n ");

        int x = 0b101010; //42
        int y = 0b000010; //2
        int add = x + y;
        System.out.println("Addition : "+ add);
        System.out.println("Addition : "+ Integer.toBinaryString(add));
        System.out.println("\n ");
        int sub = x - y;
        System.out.println("Subtraction : " + sub);
        System.out.println("Subtraction : " + Integer.toBinaryString(sub));
        System.out.println("\n ");
        int mult = x * y;
        System.out.println("Multiplication : " + mult);
        System.out.println("Multiplication : " + Integer.toBinaryString(mult));
        System.out.println("\n ");
        int div = x / y;
        System.out.println("Division : " + div);
        System.out.println("Division : " + Integer.toBinaryString(div));
        System.out.println("\n ");


    }
}
