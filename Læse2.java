public class Læse2 {
    static ListNode list;
    public static void main(String[] args) {
    list = new ListNode(0);
    list.data = 3;
    list.next = new ListNode(0);
    list.next.data = 7;
    list.next.next = new ListNode(0);
    list.next.next.data = 12;
    list.next.next.next = null;
    list = list.next; // skipper første element i linked listen
        //list = null; // sætter bare hele listen til null, giver også en nullpointer hvis jeg
        // prøver at tilføje igen, nullpointer sker tit ved linkedlist

        ListNode current = list;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(list);
    }
    // linked list is stored in notes, which is more like a lot of small boxes.
    // arraylist is stored in 1 big box.
}
