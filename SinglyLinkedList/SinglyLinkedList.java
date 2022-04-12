package SinglyLinkedList;


public class SinglyLinkedList {

    private SinglyListNode head;

    public Boolean isEmpty() {
        
        return head==null;
    }

    public void addFirst(Integer value) {

        SinglyListNode newHead = new SinglyListNode(value, getHead());
        setHead(newHead);
    }

    public int size() {
        if(isEmpty()){
            return 0;
        }
        int size=0;
        SinglyListNode countNode = head;
        while(countNode!=null){
            countNode = countNode.getNext();
            size++;
        }
        return size;
        
    }

    public SinglyListNode search(Integer valueSearched) {
        
        SinglyListNode valueTest = head;

        while(valueTest!=null){

            if(valueSearched == valueTest.getValue()){
                return valueTest;
            }
            valueTest = valueTest.getNext();
        }
        return null;
    }

    public boolean isOrdered(boolean ascending){
        
        SinglyListNode test = head;
        Integer previousValue=null;
        Integer nextValue=null;

       // if(ascending){
            while(test!=null){
                previousValue = test.getValue();
                test = test.getNext();
                if(test!=null){
                    nextValue = test.getValue();
                    if(previousValue > nextValue && ascending){
                        return false;
                    }
                    if(previousValue < nextValue && !ascending){
                        return false;
                    }
                
                }
            }

      //  }
        
        // if(!ascending){
        //     while(test!=null){
        //         valueTest = test.getValue();
        //         test = test.getNext();
        //         if(test!=null){
        //             valueNext = test.getValue();
        //             if(valueTest < valueNext){
        //                 return false;
        //             }
                
        //         }
        //     }

        // }

        return true;
    }

    public void addLast(Integer value){
        if(isEmpty()){

            addFirst(value);
        }else{

            SinglyListNode newTail = new SinglyListNode(value, null);
            SinglyListNode currentTail = head;
           //boolean isNodeTail = currentTail.getNext()==null;
            while(currentTail.getNext()!=null){
                currentTail = currentTail.getNext();
            }
            currentTail.setNext(newTail);
        }

    }

    public void reverse(){
        int listSize = size();
        Integer valueToAdd [] = new Integer[listSize];
        for(int i = 0; i!=listSize; i++){
            valueToAdd [i] = head.getValue();
            head = head.getNext();
        }
        for(int i = 0; i!=listSize; i++){
            addFirst(valueToAdd[i]);
        }

    }

    public void delete(SinglyListNode nodeToBeDeleted){
        SinglyListNode previousNode=head;
        
        if(previousNode == nodeToBeDeleted){
             head = head.getNext();
             return;
        }
        while(previousNode != nodeToBeDeleted){
           if(previousNode.getNext() == nodeToBeDeleted) {
               previousNode.setNext(nodeToBeDeleted.getNext());
               return;
           }
           previousNode = previousNode.getNext();
        }

    }

    public SinglyListNode getHead() {
        return head;
    }

    public SinglyListNode setHead(SinglyListNode newHead){
        return head=newHead;
    }


    
    
}
