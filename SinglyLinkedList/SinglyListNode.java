package SinglyLinkedList;

public class SinglyListNode {
    private Integer value;
    private SinglyListNode next;

    public SinglyListNode(Integer value, SinglyListNode next){
        this.next=next;
        this.value=value;
    }

    public Integer getValue(){
        return value;
    }

    public Integer setValue(Integer value){
        return this.value = value;
    }

    public SinglyListNode getNext(){
        return next;
    }

    public SinglyListNode setNext(SinglyListNode next){
        return this.next = next;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinglyListNode other = (SinglyListNode) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

}

