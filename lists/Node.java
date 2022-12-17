package lists;

public class Node<T> {
    public T data; /** данные узла списка */

    public Node<T> next; /** ссылка на следующий узел */

    public Node(T data) {
        next = null;
        this.data = data;
    }

    /**
     * Вывод данных которые хранятся в этом узл
     */
    public void displayNodeData() {
        System.out.print("-> " + data);
    }
}