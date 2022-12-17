package lists;

public class Student {
    private final String name;
    private final int group;

    Student(String name, int group) {
        this.name = name;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}