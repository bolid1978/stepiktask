package mer;
//    Sample Input 1:
//        1 2 5 7 10
//        1 1 4 8
//        Sample Output 1:
//        1 1 1 2 4 5 7 8 10
//        Sample Input 2:
//        1 2 4 5 6
//        7 8 9 10
//        Sample Output 2:
//        1 2 4 5 6 7 8 9 10
//---------------самое популярное
//Node merge(Node head1, Node head2){
//        if(head1 == null) {
//        return head2;
//        }
//        if(head2 == null) {
//        return head1;
//        }
//        Node node = new Node();
//        if(head1.getData() < head2.getData()) {
//        node.setData(head1.getData());
//        node.setNext(merge(head1.getNext(), head2));
//        } else {
//        node.setData(head2.getData());
//        node.setNext(merge(head1, head2.getNext()));
//        }
//        return node;
//        }

import java.util.LinkedList;

public class merge {
    public static void main(String[] args) {

        myTestLinkList one = new myTestLinkList();
//        one.add(1);
//        one.add(2);
//        one.add(4);
//        one.add(5);
//        one.add(6);

        one.add(10);
        one.add(7);
        one.add(5);
        one.add(2);
        one.add(1);
        myTestLinkList two = new myTestLinkList();
//        two.add(7);
//        two.add(8);
//        two.add(9);
//        two.add(10);

        two.add(8);
        two.add(4);
        two.add(1);
        two.add(1);

        merge(one.getNodeHead(), two.getNodeHead());





    }
       static public  Node merge(Node head1, Node head2){
        LinkedList<Integer> result = new LinkedList<>();
        myTestLinkList resulMy = new myTestLinkList();
        Node NodeOne = head1;
        Node NodeTwo = head2;
        while(true){
            if(NodeOne == null) {
                while (NodeTwo != null)
                {
                    result.add(NodeTwo.getData());
                    resulMy.add(NodeTwo.getData());

                    NodeTwo = NodeTwo.getNext();
                }
                break;
            }
            if(NodeTwo == null) {
                while (NodeOne != null)
                {
                    result.add(NodeOne.getData());
                    resulMy.add(NodeOne.getData());
                    NodeOne = NodeOne.getNext();
                }
                break;
            }

            if(NodeOne.getData() <= NodeTwo.getData()) {
                result.add(NodeOne.getData());
                resulMy.add(NodeOne.getData());
                NodeOne = NodeOne.getNext();

            }
            else{
                result.add(NodeTwo.getData());
                resulMy.add(NodeTwo.getData());
                NodeTwo = NodeTwo.getNext();

            }

        }
           resulMy.print();
         //  System.out.println(result.getLast());
           myTestLinkList revers = new myTestLinkList();
           Node nodeIn = resulMy.getNodeHead();
           while(nodeIn != null){

               revers.add(nodeIn.getData());
               nodeIn = nodeIn.getNext();


           }
           revers.print();
           return revers.getNodeHead();

       }



}
