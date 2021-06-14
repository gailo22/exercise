import java.util.Arrays;

class ReverseLinkedList {

    Node<Integer> reverse(Node<Integer> head) {
        Node<Integer> curr = head;
        Node<Integer> prev = null, next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
  
}
