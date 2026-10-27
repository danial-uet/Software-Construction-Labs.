/*
  @author Wholly Solly Store
 */

package Task3;

public class Rectangle {
    protected int width;
    protected int height;

    public void setDimensions(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int getArea() {
        return width * height;
    }
}