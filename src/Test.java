class Node {

    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

}


public class Test {

    static Node insertToList(Node list, int val) {

        if (list == null) {
            return new Node(val);
        }

        Node head = list;

        while (list.next != null) {
            list = list.next;
        }

        list.next = new Node(val);
        return head;
    }


    static void displayList(Node list) {

        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }

    }
    static Node deleteFromList(Node list, int val) {

        if (list == null) {
            return null;
        }

        if (list.val == val) {
            return list.next;
        }

        Node head = list;

        Node present_value = list;
        Node next_value = list.next;

        while (next_value != null) {
            if (next_value.val == val) {
                present_value.next = next_value.next;
                return head;
            } else {
                present_value = next_value;
                next_value = next_value.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {

        Node start = null;

        int[] arr = {10,22,31,43,52};

        for(int i : arr) {
            start = insertToList(start, i);
        }

        displayList(start);
        System.out.println();

        int toDelete = 31;

        start = deleteFromList(start, toDelete);

        displayList(start);
    }

}
