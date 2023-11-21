import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CalculateAverageTest {

    @Test
    void testAverageValue() {
        CalculateAverage calculateAverage = new CalculateAverage();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }
        assertThat(calculateAverage.averageValue(list)).isEqualTo(2.0);
    }
}