import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class CreateListTest {
    @Test
    void testGetIntList() {
        // РАБОТАЕТ
        DataEntry dataEntry = mock(DataEntry.class); // ввод данных
        ContinueOrFinish continOrFinish = mock(ContinueOrFinish.class); // продолжать или нет?
        CreateList createList = new CreateList(dataEntry, continOrFinish);

        when(dataEntry.fillingList()).thenReturn(10, 20, 30); // ввод данных
        when(continOrFinish.finishComplect()).thenReturn(false); // продолжать или нет?

        assertThat(createList.getIntList().size()).isEqualTo(1);
    }
}