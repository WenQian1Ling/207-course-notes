/**
 * A rectangle with width and height.
 */
public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a new rectangle with width {@code w} and height {@code height}.
   *
   * @param w the width of this rectangle
   * @param h the height of this rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the area of this rectangle
   */

  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle.
   *
   * @param factor the number of the scale
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle is larger than the {@code other} rectangle, false otherwise.
   *
   * @param other other rectangle
   * @return true is this rectangle is larger, false otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}