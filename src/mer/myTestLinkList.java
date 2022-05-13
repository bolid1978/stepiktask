package mer;

import java.util.LinkedList;

public class myTestLinkList {
     Node head = null; // заголовок списка

     void add(int data){
         Node myNode = new Node();
         myNode.setData(data);

         if(head == null) {
             head = myNode; // голове присваиваем ноду
         }
         else
         {
             myNode.setNext(head);// ставим ссылку в новой ноде на голову говоря ,
             // что следущуя у ние будет head которая скоро станет "бывшей" head
             // то есть как бы эта новая нода не проталкиваеться а как бы наращиваеться на старую голову
             head = myNode; // голове присваиваем ноду


         }
     }



     void print(){
         Node node = head;
         while(node != null){
             System.out.println(node.getData());
             node = node.getNext();
         }
     }

     public Node getNodeHead(){
         return head;
     }




}
