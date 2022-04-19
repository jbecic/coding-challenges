import java.util.ArrayList;

public class mergeTwoSortedLists {
    public static ArrayList mergeTwoLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        int len = 0;

        if (list1.isEmpty() && list2.isEmpty()) {
            return list3;
        }

        if (list1.isEmpty()) {
            return list2;
        } else if (list2.isEmpty()) {
            return list1;
        }

        if (list1.size() > list2.size()) {
            len = list2.size();
        } else {
            len = list1.size();
        }

        for (int i = 0; i < len; i++) {
            if (list1.get(i) < list2.get(i)) {
                list3.add(list1.get(i));
                list3.add(list2.get(i));
            } else {
                list3.add(list2.get(i));
                list3.add(list1.get(i));
            }
        }

        return list3;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(4);
        list2.add(1);
        list2.add(3);
        list2.add(4);

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();

        ArrayList<Integer> list5 = new ArrayList<Integer>();
        ArrayList<Integer> list6 = new ArrayList<Integer>();

        list6.add(0);

        System.out.println(mergeTwoLists(list1, list2));
        System.out.println(mergeTwoLists(list3, list4));
        System.out.println(mergeTwoLists(list5, list6));
    }
}
