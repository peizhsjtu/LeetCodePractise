package practise2;


/**
 * 2.两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * ==================================
 * 解题思路: 本题考察以下几个点:
 * 1) 不同链表怎么判断(如果为null,利用三目运算符,补0或者null)
 * 2) 判断进位(carry判断)
 * 3) 设置dummy变量作为head
 */
//Definition for singly-linked list.
class ListNode {
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

class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode();
        ListNode cur = pre;
        int x, y, carry = 0, sum;

        while (l1 != null || l2 != null || carry != 0) {
            x = l1 == null ? 0 : l1.val;
            y = l2 == null ? 0 : l2.val;

            sum = (x + y + carry) % 10;
            carry = (x + y + carry) / 10;

            cur.next = new ListNode(sum);

            cur = cur.next;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        return pre.next;
    }
}