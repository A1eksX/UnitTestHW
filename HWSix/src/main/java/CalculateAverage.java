import java.util.List;

/**
 * Класс содержит метод, расчитывающий среднее значение чисел в списке
 */
public class CalculateAverage {
    /**
     * Метод расчитывает среднее значение чисел в списке
     * @param list на вход принимает список
     * @return возвращает среднее значение чисел в списке
     */
    public double averageValue(List<Integer> list){
        int sum = 0;
        int size = list.size();
        for (Integer integer : list) {
            sum += integer;
        }
        return (double) sum / size;
    }
}