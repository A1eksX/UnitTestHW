**Задание 2.**

Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест,
интеграционный тест, сквозной тест) и объяснить, почему вы так решили.

* Проверка того, что функция addContact корректно добавляет новый контакт в список
  контактов.

Unit-тест - проверяет работу конкретной функции

* Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт
  корректно отображается в списке контактов.

Сквозной тест - в данном случае происходит взаимодействие пользовательского интерфейса с внутренним функционалом

* Проверка полного цикла работы с контактом: создание контакта, его редактирование и
  последующее удаление.

Сквозной тест - Происходит проверка полного цикла работы с контактом, затрагивающее все части приложения