package com.tms.homework.liudzmilasobaleva.task2;

public class Task2 {
    public static void main(String[] args) {
        int a = 10; // 1010
        int b = 2;  // 0010
        System.out.println("unary NOT : " + ~a);
        System.out.println("unary NOT : " + Integer.toBinaryString(~a));
        System.out.println("\n ");
        // bitwise AND
        int c = a & b;
        System.out.println("bitwise AND : " + c);
        System.out.println("bitwise AND : " + Integer.toBinaryString(c));
        System.out.println("\n ");
        // bitwise OR
        int d = a | b;
        System.out.println("bitwise OR : " + d);
        System.out.println("bitwise OR : " + Integer.toBinaryString(d));
        System.out.println("\n ");
        // bitwise XOR
        int e = a ^ b;
        System.out.println("bitwise XOR : " + e);
        System.out.println("bitwise XOR: " + Integer.toBinaryString(e));
        System.out.println("\n ");
        // right shift >>
        int f = a >> b;
        System.out.println("right shift >> : " + f);
        System.out.println("right shift >> : " + Integer.toBinaryString(f));
        System.out.println("\n ");
        // zero fill right shift >>> сдвиг вправо с заполнением нулями / без учета знака
        int g = a >>> b;
        System.out.println("zero fill right shift >>> : " + g);
        System.out.println("zero fill right shift >>> : " + Integer.toBinaryString(g));
        System.out.println("\n ");
        // left shift <<
        int h = a << b;
        System.out.println("left shift << : " + h);
        System.out.println("left shift << : " + Integer.toBinaryString(h));
        System.out.println("\n ");
        // bitwise AND assignment &=
        int i = a;
        i &= b;
        System.out.println("bitwise AND assignment &= : " + (i));
        System.out.println("bitwise AND assignment &= : " + Integer.toBinaryString(i));
        System.out.println("\n ");
        // bitwise OR assignment |=
        int j = a;
        j |= b;
        System.out.println("bitwise OR assignment |= : " + (j));
        System.out.println("bitwise OR assignment |= : " + Integer.toBinaryString(j));
        System.out.println("\n ");
        // bitwise XOR assignment ^=
        int k = a;
        k ^= b;
        System.out.println("bitwise XOR assignment ^= : " + k);
        System.out.println("bitwise XOR assignment ^= : " + Integer.toBinaryString(k));
        System.out.println("\n ");
        // right shift assignment >>=
        int l = a;
        l >>= b;
        System.out.println("right shift assignment >>= : " + l);
        System.out.println("right shift assignment >>= : " + Integer.toBinaryString(l));
        System.out.println("\n ");
        // bitwise unsigned right shift assignment / shift right zero fill assignment >>>= сдвиг вправо с заполнением нулями с присваиванием
        int m = a;
        m >>>= b;
        System.out.println("unsigned right shift assignment >>>= : " + m);
        System.out.println("unsigned right shift assignment >>>= : " + Integer.toBinaryString(m));
        System.out.println("\n ");
        // left shift assignment <<=
        int n = a;
        n <<= b;
        System.out.println("left shift assignment <<= : " + n);
        System.out.println("left shift assignment <<= : " + Integer.toBinaryString(n));
        System.out.println("\n ");

        int ans = 42;
        System.out.println("to binary : " + Integer.toBinaryString(ans));
        System.out.println("\n ");

        int x = 0b101010; //42
        int y = 0b000010; //2
        int add = x + y;
        System.out.println("Addition : " + add);
        System.out.println("Addition : " + Integer.toBinaryString(add));
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