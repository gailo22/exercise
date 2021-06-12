import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] input = {2,3,1,5,4};
        int[] expected = {1,2,3,4,5};
        int[] actual = new QuickSort().quickSort(input);

        assertThat(Arrays.asList(actual)).hasSameElementsAs(Arrays.asList(expected));
    }
}
