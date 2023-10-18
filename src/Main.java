import java.util.ArrayList;
import java.util.Comparator;

/*
  @author 1ommy
  @version 18.10.2023
 */
public class Main {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        var lst = new ListNode(1);
        lst.next = new ListNode(2);
        lst.next.next = new ListNode(4);

        var lst2 = new ListNode(1);
        lst2.next = new ListNode(3);
        lst2.next.next = new ListNode(4);

        mergeTwoLists(lst, lst2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) return new ListNode();

        var ar1 = new ArrayList<Integer>();
        var ar2 = new ArrayList<Integer>();

        while (list1 != null) {
            ar1.add(list1.val);
            list1 = list1.next;
        }

        while (list2 != null) {
            ar2.add(list2.val);
            list2 = list2.next;
        }

        ar1.addAll(ar2);
        ar1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(ar1);


        ListNode n = new ListNode(ar1.get(0));
        var t = n;
        for (int i = 1; i < ar1.size(); i++) {
            if (i == 1) {
                t.val = ar1.get(i);
                t = t.next;
                n.next = t;
            } else {
                t.val = ar1.get(i);
                t = t.next;
            }
        }
        return n;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        var list = new ArrayList<Integer>();
        while (x != 0) {
            list.add(x % 10);
            x /= 10;
        }

        int mid = list.size() / 2;
        for (int i = 0; i < mid; i++) {
            if (list.get(i) != list.get(list.size() - i - 1)) {
                return false;
            }
        }

        return true;

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
