class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    static int AddTwoNumbers(ListNode l){
        int num =0;
        ListNode ptr = l;
        int unit = 1;
        int digit = 0;

        while(ptr!=null){
            digit = ptr.val*unit;
            num = num + digit;
            unit = unit * 10;
            ptr = ptr.next;
        }

        return num;
    }

    public static void main(String[] args) {

        // Creating first linked list: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Creating second linked list: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // System.out.println(AddTwoNumbers(l1));
        int sum = AddTwoNumbers(l1) + AddTwoNumbers(l2);
       // System.out.println(sum);

        ListNode head = null;
        ListNode temp = null;

        while(sum > 0){
            int digit = sum % 10;   // take last digit
            sum = sum / 10;         // remove last digit

            ListNode newNode = new ListNode(digit);

            if(head == null){
                head = newNode;
                temp = newNode;
            }else{
                temp.next = newNode;
                temp = newNode;
            }
        }


        ListNode p = head;
        while(p!=null){
            System.out.print(p.val + "->");
            p=p.next;
        }
    }
}