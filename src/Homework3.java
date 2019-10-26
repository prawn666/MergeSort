import edu.princeton.cs.algs4.StdRandom;

public class Homework3 {
    private static class Node {
        Object item;
        Node next;
    }

    public static void shuffle(Node node) {
      Node slow = node;
      Node fast = node;

      while (fast != null) {
          fast = fast.next.next;
          slow = slow.next;
      }

      Node mid = slow;
      shuffle(node, mid);
    }

    private static void shuffle(Node bead, Node mid) {
        //while ()
    }

    private static void merge(Node head, Node rightHead) {
        Node left = head;
        Node right = rightHead;


    }
}
