 package projetoedd;

//import EmptyStructureException;
//import SimpleNode;

public class SimpleLinkedList<T>{
    private SimpleNode<T> head;
    private int size;

    public SimpleLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }

        return false;
    }

    public T valueInPosition(int position) throws EmptyStructureException{
        if (!checkValidPosition(position)){
            throw new IllegalArgumentException();
        }
        else if (isEmpty()){
            throw new EmptyStructureException();
        }

        SimpleNode<T> temp = head;
        int count = 1;

        while(count < position){
            temp = temp.getNext();
            count++;
        }

        return temp.getValue();
    }

    public SimpleLinkedList<Integer> positionsOfValue(T value) throws EmptyStructureException{
        if (isEmpty()){
            throw new EmptyStructureException();
        }

        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>();

        int list_count = 1;
        SimpleNode<T> temp = head;

        while(temp != null){
            if (temp.getValue().equals(value)){
                list.insertEnd(list_count);
            }

            temp = temp.getNext();
            list_count++;
        }

        return list;
    }

    public boolean insertBeggining(T value){
        SimpleNode<T> newHead = new SimpleNode<T>();
        newHead.setValue(value);
        newHead.setNext(head);

        this.head = newHead;
        sizePlus(1);

        return true;
    }

    public boolean insertEnd(T value){

        SimpleNode<T> newTail = new SimpleNode<T>();
        newTail.setValue(value);

        if (head == null){
            this.head = newTail;
            return true;
        }

        SimpleNode<T> temp = this.head;

        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        newTail.setNext(null);

        temp.setNext(newTail);

        sizePlus(1);

        return true;
    }

    private boolean insertMiddle(T value, int position){
        SimpleNode<T> temp = this.head;
        int cont = 1;

        while(cont < position - 1 && temp != null){ //Revisar pq precisa do temp != null
            temp = temp.getNext();
            cont++;
        }

        if (temp == null){
            return false;
        }

        SimpleNode<T> newMiddle = new SimpleNode<T>();
        newMiddle.setValue(value);

        newMiddle.setNext(temp.getNext());
        temp.setNext(newMiddle);

        sizePlus(1);

        return true;
    }

    public boolean insert(T value, int position){

        if (position < 1 || position > getSize() + 1){
            return false;
        }

        if (position == 1){
            return insertBeggining(value);
        }
        else if (position == getSize() + 1){
            return insertEnd(value);
        }
        else{
            return insertMiddle(value, position);
        }
    }

    public boolean remove(int position) throws EmptyStructureException{
        if (!checkValidPosition(position)){
            return false;
        }

        if (isEmpty()){
            throw new EmptyStructureException();
        }

        if (position == 1){
            return removeBeggining();
        }
        else if (position == size){
            return removeEnd();
        }
        else{
            return removeMiddle(position);
        }
    }

    private boolean removeBeggining(){

        SimpleNode<T> temp = this.head.getNext();
        head.setNext(null);

        this.head = temp;
        sizePlus(-1);

        return true;

    }

    private boolean removeEnd(){
        SimpleNode<T> temp = this.head;
        for (int i = 1; i < size - 1; i++){
            temp = temp.getNext();
        }

        if (temp == null){
            return false;
        }

        temp.setNext(null);

        sizePlus(-1);

        return true;

    }

    private boolean removeMiddle(int position){
        SimpleNode<T> beforePosition;
        SimpleNode<T> afterPosition;

        SimpleNode<T> temp = this.head;
        for (int i = 1; i < position - 1; i++){
            temp = temp.getNext();
        }

        if (temp == null){
            return false;
        }

        beforePosition = temp;
        temp = temp.getNext();
        afterPosition = temp.getNext();

        temp.setNext(null);
        beforePosition.setNext(afterPosition);

        sizePlus(-1);

        return true;
    }

    public void clearList(){
        head = null;
    }

    public SimpleNode<T> getHead() {
        return this.head;
    }

    public void setHead(SimpleNode<T> head) {
        this.head = head;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void sizePlus(int update){
        size += update;
    }

    public boolean checkValidPosition(int position){
        return position > 0 && position <= size;
    }

    public String printList(){
        String ret = "[";
        SimpleNode<T> temp = this.head;

        while(temp != null){
            ret += temp.getValue();
            if (temp.getNext() != null){
                ret += ", ";
            }
            temp = temp.getNext();
        }

        ret += "]";

        return ret;
    }

}