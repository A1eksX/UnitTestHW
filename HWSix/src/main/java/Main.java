/**
 * Задание 1. Создайте программу на Python или Java, которая принимает два списка чисел и выполняет следующие действия:
 * a. Рассчитывает среднее значение каждого списка.
 * b. Сравнивает эти средние значения и выводит соответствующее сообщение:
 * - ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
 * - ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
 * - ""Средние значения равны"", если средние значения списков равны.
 */
public class Main {
    public static void main(String[] args) {
        ContinueOrFinish continOrFinish = new ContinueOrFinish();
        DataEntry dataEntry = new DataEntry();

        IList lst1 = new CreateList(dataEntry, continOrFinish);
        IList lst2 = new CreateList(dataEntry, continOrFinish);

        CalculateAverage average = new CalculateAverage();

        System.out.println("Заполните первый список");
        double result1 = average.averageValue(lst1.getIntList());

        System.out.println("Заполните второй список");
        double result2 = average.averageValue(lst2.getIntList());

        if (result1 > result2) {
            System.out.println("Первый список имеет большее среднее значение");

        } else if (result1 < result2) {
            System.out.println("Второй список имеет большее среднее значение");
        } else {
            System.out.println("Средние значения обоих списков равны равны");
        }
    }
}
