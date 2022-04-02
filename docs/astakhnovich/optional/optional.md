# OPTIONAL

---

Optional избавляет от проверки на null,является контейнером (оберткой) для значений которая также может
  безопасно содержать null

### Для создания Optional используются методы:

- **Optional.of()** -  нельзя передавать null


- **Optional.ofNullable()** - передавать null можно безопасно


- **Optional.empty()** - для создания пустого Optional


- **Optional.get()** - Для получения значения из Optional


- **Optional.isPresent()** - возвращает true, если значение в нем присутствует, иначе возвращает false


- **Optional.ifPresent()** - выполняет переданное действие, если значение в Optional присутствует, иначе игнорирует его.


- **Optional.orElse()** - возвращает переданное значение, если Optional пустой


- **Optional.orElseGet()** - если объект не найден, Optional оставляет пространство для «Варианта Б» —
  можно выполнить другой метод


- **Optional.orElseThrow()** - бросает переданное исключение , если Optional пустой


- **Optional.map()** - служит для преобразования значения внутри Optional. Если Optional пустой преобразование не
  будет происходить


- **Optional.flatMap** - преобразовывает значение внутри Optional, но при этом не оборачивает их


- [habr](https://habr.com/ru/post/346782/)
- [vertex-academy](https://vertex-academy.com/tutorials/ru/java-8-optional/)
- [habr](https://habr.com/ru/post/225641/)
- [habr](https://habr.com/ru/post/540080/)

