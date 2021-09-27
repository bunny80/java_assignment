import java.util.*;

public class ListTrim {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> list = strings.listIterator(); list.hasNext(); ) {
            list.set(list.next().trim());
        }
    }
    public static void main(String[] args) {
        List<String> li = Arrays.asList(" one ", " two ", " three ");
        System.out.println("Before Trimming");
        for (String s : li) {
            System.out.format("\"%s\"%n", s);
        }
        listTrim(li);
        System.out.println("After Trimming");
        for (String s : li) {
            System.out.format("\"%s\"%n", s);
        }
    }
}