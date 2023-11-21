import java.util.ArrayList;
import java.util.List;

/**
 * Класс содержит метод заполняющий список целых чисел
 */
public class CreateList implements IList {
//    Scanner scanner;
    private final List<Integer> intList = new ArrayList<>();
    private DataEntry dataEntry;
    private ContinueOrFinish contin;

    public CreateList(DataEntry dataEntry, ContinueOrFinish contin) {
        this.dataEntry = dataEntry;
        this.contin = contin;
    }

    /**
     * Метод заполняет список целыми числами
     * @return Возвращает список целых чисел
     */
    public List<Integer> getIntList(){
        boolean next = true;
        while (next){
            try {
                int number = dataEntry.fillingList(); // ввод данных
                intList.add(number);
                next = contin.finishComplect(); // продолжать или нет ввод данных?
            }catch (NumberFormatException e){
                System.out.println("Введите целое число");
            }
        }
        return intList;
    }
}