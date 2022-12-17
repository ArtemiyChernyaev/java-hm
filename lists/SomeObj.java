package lists;

public class SomeObj {
    private final String param;

    SomeObj(String  param) {
        this.param =  param;
    }

    @Override
    public String toString() {
        return "SomeObj{" +
                " param='" + param + '\'' +
                '}';
    }
}