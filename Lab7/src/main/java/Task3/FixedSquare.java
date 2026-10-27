/*
  @author Wholly Solly Store
 */

package Task3;

public class FixedSquare implements Shape {
    private int side;

    public FixedSquare(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}