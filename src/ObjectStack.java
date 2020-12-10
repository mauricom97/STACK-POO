public class ObjectStack<T> implements Stack<T> {
	
    private Node<T> top; //O que vai ser tranformado em generico


    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public ObjectStack() {
        top = null;
    }


    public void push(T data) {

        Node<T> aux = new Node<>(data);


        if (isEmpty()) {
            top = aux;
        } else {
            aux.next = top;
            top = aux;
        }
    }


    public T pop() {
        Node<T> aux; 
        T data;



//Perguntar para o professor



        if (isEmpty()) { 
            throw new IndexOutOfBoundsException("empty_stack!");
        }

        aux = top;
        top = top.next;
        aux.next = null; 
        data = aux.data; 
       


        return data;
    }


    public boolean isEmpty() {
        return (top == null);
    }
}
