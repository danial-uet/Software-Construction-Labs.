/*
  @author Wholly Solly Store
 */

package Task2;

public class DataBox<T> {
    private T data;

    public DataBox(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}