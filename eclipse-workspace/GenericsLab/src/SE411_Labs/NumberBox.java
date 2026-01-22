package SE411_Labs;

public class NumberBox<T extends Number> {

    private T item;

    // Store a number
    public void setItem(T item) {
        this.item = item;
    }

    // Retrieve the number
    public T getItem() {
        return item;
    }

    // Add another number and return the sum
    public double add(T other) {
        return this.item.doubleValue() + other.doubleValue();
    }
}

