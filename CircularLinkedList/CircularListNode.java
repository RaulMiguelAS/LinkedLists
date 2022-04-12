package CircularLinkedList;

public class CircularListNode {
    CircularListNode previuos;
    CircularListNode next;
    
    public CircularListNode getPreviuos() {
        return previuos;
    }

    public void setPreviuos(CircularListNode previuos) {
        this.previuos = previuos;
    }

    public CircularListNode getNext() {
        return next;
    }

    public void setNext(CircularListNode next) {
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }
    
    public void setValue(Integer value) {
        this.value = value;
    }
    Integer value;
}
