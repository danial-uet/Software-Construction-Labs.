/*
  @author Wholly Solly Store
 */

package Task3;

public class Square extends Rectangle {
    @Override
    public void setDimensions(int w, int h) {
        if (w != h) {
            throw new IllegalArgumentException("LSP Violation: Square requires width == height!");
        }
        this.width = w;
        this.height = h;
    }
}
