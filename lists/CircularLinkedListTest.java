package lists;

public class CircularLinkedListTest {
    public static void main(String[] args) {

        CircularLinkedList<Student> list = new CircularLinkedList<>();

        System.out.println("Is list empty: " + list.isEmpty());
        list.print();
        list.push(new Student("A",1));
        list.print();
        list.push(new Student("B",2));
        list.print();
        list.push(new Student("C", 3));
        list.print();
        list.add(0,new Student("D",4));
        list.print();
        list.add(list.getLength(),new Student("E",5));
        list.print();
        list.add(2,new Student("F",6));
        list.print();
        list.remove(0);
        list.print();
        list.remove(list.getLength()-1);
        list.print();
        list.remove(2);
        list.print();
    }
}