import java.util.Scanner;

public class ContinueOrFinish {
    Scanner scan = new Scanner(System.in);
    /**
     * Метод позволяет завершить ввод целых чисел в список
     * @return возвращает false, если введён любой символ кроме "y"
     */
    public boolean finishComplect(){
        System.out.println("Хотите продолжить? y/n");
        String nextValue = scan.nextLine();
        if (nextValue.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }
}
