# Регулярные выражения

---

Регурярные выражения представлены в java в классах Pattern и Matcher

### Создание регулярных выражений

Чтобы создать RegEx нужно:
1. написать его в виде строки с учётом синтаксиса регулярных выражений.
2. скомпилировать эту строку в регулярное выражение.

После чего нужно создать объект класса **Pattern** и вызвать один из двух методов compile 

```java
public static Pattern compile (String literal);
```

```java
public static Pattern compile (String literal, int flags);
```

```java
Pattern pattern = Pattern.compile("text", Pattern.CASE_INSENSITIVE);
```
Поиск совпадений с шаблоном **(text)** будет производиться без учета регистра символов.

### Pattern

Класс Pattern — это конструктор регулярных выражений. Под «капотом» метод compile вызывает закрытый конструктор
класса Pattern для создания скомпилированного представления. Такой способ создания экземпляра шаблона реализован с целью
создания его в виде неизменяемого объекта. При создании производится синтаксическая проверка регулярного выражения. При 
наличии ошибок в строке – генерируется исключение PatternSyntaxException.

##### Cуществует три режима квантификатора

- Жадный
- Сверхжадный
- Ленивый

Сверхжадный режим включается добавлением символа «+» после квантификатора, а ленивый – символа «?». 

По умолчанию квантификатор работает в жадном режиме. Это означает, что он ищет максимально длинное совпадение в строке.

В сверхжадном режиме работа матчера аналогична механизму жадного режима. Отличие состоит в том, что при захватывании 
текста до конца строки поиск в обратном направлении не происходит.

### Matcher 

Matcher представляет собой класс, из которого создается объект для поиска совпадений по шаблону. Matcher – это 
«поисковик», «движок» регулярных выражений. Для поиска ему надо дать две вещи: шаблон поиска и «адрес», по которому 
искать.


