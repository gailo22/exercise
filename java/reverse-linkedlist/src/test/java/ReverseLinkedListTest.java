import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

public class ReverseLinkedListTest {

    Node<Integer> build(Integer... input) {
        Node<Integer> curr = null;
        Node<Integer> prev = null;
        for (int i = input.length - 1; i >=0; i--) {
            curr = new Node<>(input[i]);
            curr.next = prev;
            prev = curr;
        }

        return curr;
    }

    String makeString(Node<Integer> node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.value + " -> ");
            node = node.next;
        }
        return sb.toString();
    }

    @Test
    public void testReverse() {
        Node<Integer> expected = build(1,2,3,4,5);
        Node<Integer> input = build(5,4,3,2,1);
        System.out.println(makeString(input));
        System.out.println(makeString(expected));
        Node<Integer> actual = new ReverseLinkedList().reverse(input);

        assertThat(makeString(actual)).isEqualTo(makeString(expected));
    }
}
