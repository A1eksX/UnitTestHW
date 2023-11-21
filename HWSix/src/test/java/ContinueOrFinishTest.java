import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ContinueOrFinishTest {
    /**
     * Проверяем, что метод возвращает true, только при вводе "y"
     */
    @Test
    void testFinishComplect() {
        String input = "y";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);

        ContinueOrFinish continueOrFinish = new ContinueOrFinish();
        System.setOut(System.out); //закрываем поток

        assertTrue(continueOrFinish.finishComplect());
    }
}