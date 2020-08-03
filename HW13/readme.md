# Мини-проект "Счастливая семья" (продолжение)

Суть проекта: описание структуры семьи с учетом того, что у каждого человека есть кровные родственники, а состав семьи может со временем меняться.

# Работа с потоками ввода/вывода. Чтение и запись в файлы
## Задание

Усовершенствуйте проект: добавьте возможность работы с файловой системой.

#### Технические требования:
- Добавьте в приложение возможность сохранять данные локально на компьютер.
- Добавьте возможность загружать ранее сохраненные данные (новый пункт в главном меню, вместо генерации тестовых данных).
- Для загрузки данных в классах `FamilyService` и `FamilyDao` добавьте метод `loadData` который принимает `List<Family> families` и загружет их в нашу базу данных.
- Для каждого действия добавьте пункт в главном меню.

Сохраняться/загружаться должен список семей со всеми данными.

#### Не обязательное задание продвинутой сложности:
- Создайте отдельный сервис (класс) для логирования, у которого будет 2 метода: `info()` (логировать информационное сообщение) и `error()` (логировать ошибку). Оба метода принимают сообщение для логирования, но выдают разный формат: 01/01/2019 15:35 [DEBUG]/[ERROR] `message`. 
- Добавьте вызов метода `logger.info()` во всех методах `CollectionFamilyDao` с вызовом информационного сообщения типа `получение списка семей`, `добавление новой семьи`, `удаление семьи` и т.д. 
- При обработке исключений логируйте их с помощью метода `logger.error()`.
- Все логи должны записываться в файл по имени `application.log`.
- Следите, чтобы запись всегда велась в конец файла с новой строчки.  

#### Литература:
- [Java работа с файлами](https://devcolibri.com/java-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%D1%81-%D1%84%D0%B0%D0%B9%D0%BB%D0%B0%D0%BC%D0%B8/)
- [Чтения строк из файла](https://habr.com/post/269667/)
- [Добавить текст в конец файла](https://ru.stackoverflow.com/questions/463771/Как-добавить-текст-в-конец-файла-в-java)
