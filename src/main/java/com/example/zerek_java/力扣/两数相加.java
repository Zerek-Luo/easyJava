package com.example.zerek_java.力扣;

public class 两数相加 {
    /*
    示例 1：
    输入：l1 = [2,4,3], l2 = [5,6,4]
    输出：[7,0,8]
    解释：342 + 465 = 807.
    示例 2：
    输入：l1 = [0], l2 = [0]
    输出：[0]
    示例 3：
    输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    输出：[8,9,9,9,0,0,0,1]*/

    public static void main(String[] args) {
        两数相加 ls = new 两数相加();
        ls.addTwoNumbers();
    }

    public ListNode addTwoNumbers() {
        ListNode l1 = new ListNode(9999999);
        ListNode l2 = new ListNode(9999);
        ListNode root = new ListNode(0);
        int carry = 0; //进数
        while(l1 != null || l2 != null || carry != 0) {
            int l1var = l1 != null ? l1.val : 0;
            int l2var = l2 != null ? l2.val : 0;
            // 数组1 加数组 2 加进位数
            int sumVar = l1var + l2var +carry;
            //获取进位数
            carry = sumVar/10;
            //把相加的位数存到对象里去
            ListNode listNode = new ListNode(sumVar % 10);

            root.next = listNode;
            root = listNode;

            System.out.print(root.val);

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return root.next;
    }

     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
  }

}
