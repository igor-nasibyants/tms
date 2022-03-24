#CТРОКИ

---

### String
- Класс String в Java предназначен для работы со строками в Java. Все строковые литералы, определенные в Java программе
(например, "abc") — это экземпляры класса String.
- Класс реализует интерфейсы Serializable и CharSequence
- final класс, который не может иметь потомков
- immutable класс, то есть его объекты не могут быть изменены после создания. Любые операции над объектом String,
результатом которых должен быть объект класса String, приведут к созданию нового объекта.
-потокобезопасный

- Строки можно сложить(конкатенация), сравнить (equals(), equalsIgnoreCase()), перевести в приметив (valueOf()),
перевести в ссылочное число (parseInt()), разбить в массив (split(String regex)), извлечь подстроку
(substring(int beginIndex)),перевести в другой регистр (toLowerCase(),toUpperCase())


### StringBuilder
- При работе со строками, которые часто будут модифицироваться, в однопоточной среде. для добавления в конец
строки используется метод .append(value);
- delete(int start, int end) — удаляет подстроку символов начиная с позиции start, заканчивая end
- deleteCharAt(int index) — удаляет символ в позиции index
- insert(int offset, String str) — вставляет строку str в позицию offset. Метод insert также перегружен и может
принимать различные аргументы
- replace(int start, int end, String str) — заменит все символы начиная с позиции start до позиции end на str
- reverse() — меняет порядок всех символов на противоположный
- substring(int start) — вернет подстроку, начиная с позиции start
- substring(int start, int end) — вернет подстроку, начиная с позиции start до позиции end
- не потокобезопасный

### StringBuffer
***Тоже самое,что и StringBuffer, только потокобесопасный.***

1. [Cтатья javarush](https://javarush.ru/groups/posts/759-java-string-voprosih-k-sobesedovaniju-i-otvetih-na-nikh-ch1)
2. [Cтатья javarush](https://javarush.ru/groups/posts/2351-znakomstvo-so-string-stringbuffer-i-stringbuilder-v-java)