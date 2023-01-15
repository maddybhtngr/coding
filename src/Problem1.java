/***
 *
 *  Remove duplicates from a linkedList
 *
 */


public class Problem1 {

    static Node insert(Node list, int val) {

        if (list == null) {
            return new Node(val);
        }

        if (list.val == val) {
            return list;
        }

        Node head = list;

        while (list.next != null) {
            if (list.next.val == val) {
                return head;
            }
            list = list.next;
        }

        list.next = new Node(val);
        return head;
    }



    public static void main(String[] args) {

        int[] arr = {1,1,1,2,2,3,3,4,5};

        Node start = null;

        for(int i : arr) {
            start = Test.insertToList(start, i);
        }

        Node newList = null;

        while (start != null) {
            newList = insert(newList, start.val);
            start = start.next;
        }

        Test.displayList(newList);

    }
}
