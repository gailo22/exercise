import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        int[] input = new int[] {2,3,1,5,4};
        int[] expected = new int[] {1,2,3,4,5};
        int[] actual = new MergeSort().mergeSort(input);

        assertThat(Arrays.asList(actual)).hasSameElementsAs(Arrays.asList(expected));
    }
}
