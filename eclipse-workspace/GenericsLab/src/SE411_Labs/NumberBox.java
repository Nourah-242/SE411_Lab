package SE411_Labs;

public class NumberBox<T extends Number> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public double add(T other) {
        return this.item.doubleValue() + other.doubleValue();
    }
}

