package revers;

import java.util.ArrayList;
///---------мое на сайте
//Node reverse(Node head){
//        Node nodeREvers;
//        if(head == null) return null ;
//        if(head != null){
//        nodeREvers = reverse(head.getNext());
//        }
//
//        return head;
//        }


public class rever {
    public static void main(String[] args) {

        Node head = new Node();
        head.setData(0);

        Node one = new Node();
        one.setData(1);
        one.setNext(head);
        head = one;

        Node two = new Node();
        two.setData(2);
        two.setNext(head);
        head = two;

        Node three = new Node();
        three.setData(3);
        three.setNext(head);
        head = three;

        Node four = new Node();
        four.setData(4);
        four.setNext(head);
        head = four;

        Node five = new Node();
        five.setData(5);
        five.setNext(head);
        head = five;

        Node six = new Node();
        six.setData(6);
        six.setNext(head);
        head = six;

        Node seven = new Node();
        seven.setData(7);
        seven.setNext(head);
        head = seven;

        Node eight = new Node();
        eight.setData(8);
        eight.setNext(head);
        head = eight;

        Node nine = new Node();
        nine.setData(9);
        nine.setNext(head);
        head = nine;

        Node ten = new Node();
        ten.setData(10);
        ten.setNext(head);
        head = ten;

        print(head);
        ArrayList<Node> nodeArrayList = new ArrayList<>();
        Node nodeREvers =  new Node() ;
        while(head != null){
           nodeREvers = head;
           nodeArrayList.add(nodeREvers);
           head = head.getNext();
        }
        head = nodeREvers;

        System.out.println(nodeREvers.getData());
        for (Node el:nodeArrayList
             ) {
            System.out.print(el.getData() + " ");
        }
    }
    static void print(Node head){
        Node node = head;
        while(node != null){
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();

    }
}
