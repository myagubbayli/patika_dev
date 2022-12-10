public class NullableGeneric <T>{
    private final T value;

    public NullableGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull() {
        return this.getValue() == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("No value is assigned to this variable. (null)");
        } else {
            System.out.println(this.getValue());
        }
    }
}
