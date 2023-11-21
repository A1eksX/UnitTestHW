import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationTest {
    @Test
    void integrationTest() {
        // поток для ввода данных
        String input = "10";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        DataEntry dataEntry = new DataEntry(); // ввод данных
        System.setOut(System.out);
//---------------------------
        //поток для определения, продолжать ввод данных или нет
        String input1 = "n";
        InputStream in = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in);

        ContinueOrFinish continueOrFinish = new ContinueOrFinish(); // продолжать или нет?
        System.setOut(System.out); //перенаправляем поток

        CreateList createList = new CreateList(dataEntry, continueOrFinish);
        List<Integer> list = createList.getIntList();

        CalculateAverage calculateAverage = new CalculateAverage();
        assertThat(calculateAverage.averageValue(list)).isEqualTo(10);

    }

}
