package com.tms.homework.nikitaelenski.task10;

import static com.tms.homework.nikitaelenski.task10.WorkingWithStrings.CutASubstringFromAString;
import static com.tms.homework.nikitaelenski.task10.WorkingWithStrings.ReplacingOccurrencesOfCharacters;

public class Main {
    public static void main(String[] args) {
        String text = ("Текстовый файл содержит текст. После запуска программы в другой файл\n" +
                "должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в\n" +
                "предложении присутствует слово-палиндром, то не имеет значения какое кол-во\n" +
                "слов в предложении, оно попадает в новый файл.\n" +
                "Пишем все в ООП стиле. Создаём класс TextFormater\n" +
                "в котором два статических метода:\n" +
                "1. Метод принимает строку и возвращает кол-во слов в строке.\n" +
                "2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если\n" +
                "есть возвращает true, если нет false");
        String text2 = "Meet my family. There are five of us – my parents, my elder brother, my baby sister and me." +
                " First, meet";
        CutASubstringFromAString(text);
        ReplacingOccurrencesOfCharacters(text2);
    }
}
