package pr_28;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashSetToTreeSet {
    public static <T> Set<T> getInstance(Set<T> hashSet){
        Set<T> treeSet = hashSet.stream().collect(Collectors.toCollection(TreeSet::new));
        return treeSet;
    }

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Obj1");
        hashSet.add("Obj2");
        hashSet.add("Obj3");
        hashSet.add("Obj4");

        Set<String> treeSet = getInstance(hashSet);
        System.out.println(treeSet);
    }
}