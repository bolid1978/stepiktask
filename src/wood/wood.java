package wood;

import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

//Глубина дерева
//        Необходимо реализовать функцию:
//        на вход функция получает root бинарного дерева;
//        внутри функции нужно вычислить максимальную глубину дерева;
//        функция должна вернуть значение глубины дерева.
//        Дерево состоящее всего из одного элемента имеет глубину равной единице.
//        На вход теста передаются параметры, необходимые для генерации рандомизированного дерева.

//   int getMaxDepth(Stree node){
// if((node == null) return 0;
// return max(getMaxDepth(getMaxDepth->lefr),getMaxDepth(getMaxDepth->Right))) + 1;



public class wood {



    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        ThreadLocalRandom  cifra = ThreadLocalRandom.current();

        for (int i = 0; i < 20; i++) {
            treeSet.add(cifra.nextInt(0,1000));
        }
        System.out.println(treeSet);






    }
    static int treeDepth(Node root) {
        if(root == null) return 0;
        treeDepth(root.getLeft());
        System.out.print(root + " ");
        treeDepth(root.getRight());
        return 0;

    }
    //--------тут нуна слепить дерево для теста
    class BinarWoodNode {
        Node node;
        void insert(Node node){

        }

    }

    class Node {
        private Node left;
        private Node right;

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
