import java.util.Scanner;

public class DataEntry {
    Scanner scan = new Scanner(System.in);

    /**
     * Метод для ввода чисел в список
     * @return возвращает целое число
     */
    public int fillingList() {
        System.out.println("Введите данные: ");
        return Integer.parseInt(scan.nextLine());
    }
}
