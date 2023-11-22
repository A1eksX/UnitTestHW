## Задание 

Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:  
a. Рассчитывает среднее значение каждого списка.  
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- Первый список имеет большее среднее значение, если среднее значение первого списка больше.
- Второй список имеет большее среднее значение, если среднее значение второго списка больше.
- Средние значения равны, если средние значения списков равны.


Тесты  
Для проверки работоспособности программы было написано 5 тестов.

#### unit-тесты
* testFillingList() в классе DataEntryTest  
>  метод запрашивающий данные от пользователя для ввода чисел в список
* testFinishComplect() в классе ContinueOrFinishTest  
> метод позволяет завершить ввод целых чисел в список
* testGetIntList() в классе CreateListTest  
> метод заполняет список числами введёнными пользователем
* testAverageValue() в классе CalculateAverageTest
> метод расчитывает среднее значение чисел в списке

#### интеграционные тесты
integrationTest в классе IntegrationTest
> проверяет логику взаимодействия классов.

#### сквозные тесты
> К сожалению создать сквозной тест не хватило навыков...

## Метрики
### Отчет о покрытии кода тестами  
![asd](https://github.com/A1eksX/UnitTestHW/blob/master/HWSix/Screenshots/Checkstyle.png?raw=true)
![CoverageTest](https://github.com/A1eksX/UnitTestHW/blob/HW6/Screenshots/CodeCoverage.jpg?raw=true)

![StatusRunnigTest](https://github.com/A1eksX/UnitTestHW/blob/HW6/Screenshots/StatusRunnigTest.jpg?raw=true)

### Отчет Checkstyle
![Checkstyle](https://github.com/A1eksX/UnitTestHW/blob/HW6/Screenshots/Checkstyle.png?raw=true)
