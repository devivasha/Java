# Мини-проект "Счастливая семья" (продолжение)

Суть проекта: описание структуры семьи с учетом того, что у каждого человека есть кровные родственники, а состав семьи может со временем меняться.

# Геттеры/сеттеры
## Задание

Усовершенствуйте проект: 
- Сделайте все поля приватными.
- Создайте и опишите класс Семья (Family). Будем считать, что семья может создаваться 2-мя людьми, которые не расходятся и могут рождать/усыновлять своих детей. Дети могут взрослеть и уходить из семьи, создавая свою собственную.
- Переопределите методы `equals()` и `hashCode()` во всех классах проекта.
- В классе `Family` добавьте метод `deleteChild(Human child)` c учетом наличия данных методов.

#### Технические требования:
DONE- Объявите все поля существующих классов как приватные. Добавьте геттеры и сеттеры; сделайте рефакторинг существующих методов с учетом изменений.
DONE- Опишите у класса `Family` следующие поля:
  - мама `mother` (тип `Human`)
  - папа `father` (тип `Human`)
  - дети `children` (массив `Human`)
  - домашний любимец `pet5` (тип `Pet`)
DONE- Добавьте геттеры, сеттеры; переопределите `toString` так чтобы он показывал всю информацию о всех членах семьи.
DONE- В классе `Family` создайте конструктор:
DONE - единственным условием создания новой семьи является наличие 2-х родителей, при этом у родителей должна устанавливаться ссылка на текущую новую семью, а семья создается с пустым массивом детей.
- Сделайте рефакторинг класса `Human` с учетом структуры `Family`:
  DONE- удалите из Human всю информацию, дублирующуюся в классе Family (Human должен хранить только информацию описывающую себя)
  DONE- добавьте поле `family` (тип `Family`) (теперь оно хранит всю информацию о семейных данных человека)
  DONE - добавьте необходимые геттеры, сеттеры, конструкторы; удалите неактуальные конструкторы и методы; сделайте рефакторинг методов `поприветствовать своего любимца`, `описать своего любимца`, `накормить`
  DONE- сделайте рефакторинг метода `toString()`. Он должен выводить информацию в следующем формате: `Human{name='Name', surname='Surname', year=1, iq=1, schedule=[[day, task], [day_2, task_2]]}`
- В `Family` опишите методы: 
  DONE- добавить ребенка `addChild` (принимает тип `Human` и добавляет его в массив детей; добавляет ребенку ссылку на текущую семью)
  DONE- удалить ребенка `deleteChild` (принимает индекс массива и удаляет данный элемент; возвращает логическое значение - был ли удален элемент)
  DONE- получить количество человек в семье `countFamily` (родители в семье никогда не изменяются; если происходит изменение родительского состава - это уже другая семья)
  DONE- переопределите метод `toString()`
- Решите какие поля стоит использовать для сравнения в методе `equals()` (к примеру, привычки животного могут меняться).
- Решите какие поля стоит использовать для сравнения в методе `equals()` (к примеру, привычки животного могут меняться).
  
Методы должны не просто добавлять/удалять элементы в массив `Human` но и производить необходимые модификации (добавленному/удаленном элементу установить/удалить ссылку на текущую семью). При удалении элемента, в массиве не должно оставаться пустых мест - необходимо создать новый массив.  

#### Не обязательное задание продвинутой сложности:
- В `Family` опишите метод `удалить ребенка`(`deleteChild`) (принимает тип Human и удаляет соответствующий элемент). Метод должен быть написан с учетом наличия методов `equals()` и `hashCode()`.

   **Подсказка**: для того, чтобы удалить верный элемент из массива Human'ов вам необходимо делать сравнения по полям идентифицирующим именно данного человека (подумайте, какие поля для этого подходят).
   
- Добавьте в каждый класс статический и нестатический блоки инициализации.
  - Статический блок должен выводить на экран информацию, что загружается новый класс (указать имя класса).
  - Нестатический блок должен выводить информацию на экран, что создается новый объект (указать тип объекта).


#### Литература:
- [Инкапсуляция. Геттеры/сеттеры](https://proselyte.net/tutorials/java-core/incapsulation/)
- [Перегрузка методов](http://www.linkex.ru/java/overloading-methods.php)
- [Переопределение equals и hashCode](http://javateaching.blogspot.com/2011/12/equals-hashcode.html)
- [Comparing Java objects with equals() and hashcode()](https://www.javaworld.com/article/3305792/learn-java/java-challengers-4-comparing-java-objects-with-equals-and-hashcode.html)
- [Java Best Practices: equals() and hashCode()](https://www.intigua.com/blog/good-and-bad-equals-and-hashcode)
- [Java/Статический конструктор](http://codewiki.imagetube.xyz/code/Java/Статический_конструктор)
- [Нестатические блоки инициализации](https://habr.com/post/133237/)