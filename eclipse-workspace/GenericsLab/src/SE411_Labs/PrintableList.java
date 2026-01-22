package SE411_Labs;
import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {

    private List<T> list;

    // Constructor: accepts an array and stores it as a list
    public PrintableList(T[] items) {
        this.list = Arrays.asList(items);
    }

    // Returns the stored list
    public List<T> getList() {
        return list;
    }

    // Prints all elements in the list
    public void printAll() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
