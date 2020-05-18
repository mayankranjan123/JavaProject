import java.util.ArrayList;
import java.util.List;

public class GenericsList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Mayank");
        l.add(2);
        System.out.println((String) l.get(0));
        System.out.println(l.get(1));
    }
}
