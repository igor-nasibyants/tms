package com.tms.homework.han.task10;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, \n")
                .append("последнего вхождения сивола(B).\n").append("2) Заменить все вхождения символа стоящего в \n")
                .append("3)В исходном файле находятся слова, каждое слово на новой стороке. После \n")
                .append("запуска программы должен создать файл, который будет содержать в себе \n")
                .append("только полиндромы\n");
        System.out.println("Обработанный текст: " + sb.substring(sb.indexOf("в"), sb.lastIndexOf("л")));
    }
}
