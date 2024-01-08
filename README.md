# Домашняя работа/ 1 лекция/ сборщик Maven:
Задание:
1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
3. Создайте класс Person с полями firstName, lastName и age.
4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.

Решение:
Реализован класс Person, где реализованы/переопределены и сгенерированны следующие методы, благодаря библиотеке apache.commons: 
- toString
- equals
- hashCode

### Путь к Main.java: mavenInWork/src/main/java/ru/homework/
Реализован класс Main где, благодаря библиотеке google.code.gson, реализована:
- сериализация объекта Person
- десериализация объекта Person
