# INPUT OUTPUT STREAM

---

### FileOutputStream реализация абстрактного класса OutoutStream.
- можно перезаписывать файл, можно дописывать в файл с помощью true в конструкторе.
- запись происходит по байтам с помощью метода .write()
- требует try catch, либо проброса выше
- при окончании записи нужно закрыть поток.


### FileInputStream реализация абстрактного класса InputStream.
- метод .read() читает из файла по одному байту, преобразует в символы.
- требует try catch, либо проброса выше
- при окончании записи нужно закрыть поток.


### BufferedInputStream расширяет FilterInputStream и принимает на вход объект InputStream или любого его наследника
- читает не по одному файлу,а блоками, сохраняя из в буфер
- в качестве дополнительного параметра принимает размер буфера в байтах.

 1. [статья javarush](https://javarush.ru/quests/lectures/questcore.level08.lecture04)
 2. [статья javarush](https://javarush.ru/groups/posts/2020-vvod-vihvod-v-java-klassih-fileinputstream-fileoutputstream-bufferedinputstream)