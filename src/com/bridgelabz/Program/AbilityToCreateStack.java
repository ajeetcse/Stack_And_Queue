package com.bridgelabz.Program;

public class AbilityToCreateStack {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public AbilityToCreateStack() {
        top = null;
        length = 0;
    }
    public int getLength() {
        return length;
    }
    public void push(int data) {
        ListNode tem = new ListNode(data);
        tem.next = top;
        top = tem;
        length++;
    }
    public static void main(String[] args) {
        AbilityToCreateStack stack = new AbilityToCreateStack();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println("Stack"+ stack.peek());
        System.out.println(stack);
    }
    private int peek() {
        return top.data;
    }
    @Override
    public String toString() {
        return "Stack [top=" + top + ", length=" + length + "]";
    }
}
