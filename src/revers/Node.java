package revers;



public class Node {

        private int data;
        private Node nextNode = null;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return nextNode;
        }

        public void setNext(Node nextNode) {
            this.nextNode = nextNode;
        }
    }

