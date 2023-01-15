/**
 *
 * Merge two sorted linkedLists in sorted LinkedList
 *
 * */


public class Problem2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {2,2,3,4};


        Node list1 = null;
        Node list2 = null;

        for (int i : arr1) {
            list1 = Test.insertToList(list1, i);
        }

        for (int i : arr2) {
            list2 = Test.insertToList(list2, i);
        }

        Node list3 = null;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                list3 = Test.insertToList(list3, list1.val);
                list1 = list1.next;
            } else {
                list3 = Test.insertToList(list3, list2.val);
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            list3 = Test.insertToList(list3, list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            list3 = Test.insertToList(list3, list2.val);
            list2 = list2.next;
        }

        Test.displayList(list3);
    }


}
