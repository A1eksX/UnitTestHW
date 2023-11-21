import org.junit.jupiter.api.Test;

import java.io.*;
import static org.assertj.core.api.Assertions.assertThat;

class DataEntryTest {
    /**
     * Проверяем, возвращает ли метод переданное в него значение для заполнения списка
     */
    @Test
    void testFillingList() {
        String input = "10";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        DataEntry dataEntry = new DataEntry();
        System.setOut(System.out); //перенаправляем поток

        assertThat(dataEntry.fillingList()).isEqualTo(10);
    }
}