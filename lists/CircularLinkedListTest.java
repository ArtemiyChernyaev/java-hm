package lists;

public class CircularLinkedListTest {
    public static void main(String[] args) {

        CircularLinkedList<SomeObj> list = new CircularLinkedList<>();

        System.out.println("Is list empty: " + list.isEmpty());
        list.print();
        list.push(new SomeObj("A"));
        list.print();
        list.push(new SomeObj("B"));
        list.print();
        list.push(new SomeObj("C"));
        list.print();
        list.add(0,new SomeObj("D"));
        list.print();
        list.add(list.getLength(),new SomeObj("E"));
        list.print();
        list.add(2,new SomeObj("F"));
        list.print();
        list.remove(0);
        list.print();
        list.remove(list.getLength()-1);
        list.print();
        list.remove(2);
        list.print();
    }
}