import java.util.LinkedList;

public class MyLinkedList<T> {
Node<T> head;
Node<T> tail;
private int size;


    class Node<T>{
        Node<T> prev;
        Node<T> next;

        T data;
        public Node(Node<T> prev,Node<T> next,T data){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }
    }
    public void addLast(T data){
        Node<T> last = tail;
        Node<T> newNode =new Node<>(last,null,data);
        tail=newNode;
        last.next=newNode;
if (last==null){
last =newNode;
}
size++;
    }

    public boolean isEmpty(){
        return true;
    }

}
