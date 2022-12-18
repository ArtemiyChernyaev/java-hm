package pr_27;

public class HashtabTester {
    public static void main(String[] args){
        Hashtab<Integer> tab = new Hashtab<Integer>();
        tab.add(20, "A");
        tab.add(21, "B");
        tab.add(22, "C");
        tab.print();
        System.out.println(tab.getElement(2));
    }
}
