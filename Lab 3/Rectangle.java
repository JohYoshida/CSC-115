/*
 * Joh Yoshida
 * V00798535
 */

public class Rectangle implements Shape {
  private int length;     //length units along x axis
  private int width;      //width units along y axis
  private Point position; // position is the (x,y) coordinates of lower left corner of the rectangle

  public Rectangle() {
    this.length   = 0;
    this.width    = 0;
    this.position = new Point();
  }

  public Rectangle(int length, int width) {
    this.length   = length;
    this.width    = width;
    this.position = new Point();
  }

  public Rectangle(int length, int width, Point position) {
    this.length   = length;
    this.width    = width;
    this.position = position;
  }

  /*
   * Purpose: calculates the area of this Shape
   * Parameters: none
   * Returns: double - the area of the shape
   */
  public double area() {
    return 0.0;
  }

  /*
   * Purpose: calculates the perimeter of this Shape
   * Parameters: none
   * Returns: double - the perimeter of the shape
   */
  public double perimeter() {
    return 0.0;
  }

  /*
   * Purpose: determines whether p is within this Shape
   * Parameters: none
   * Precondition: p is not null
   * Returns: boolean - true if p is with this Shape,
   *          false otherwise
   */
  public boolean contains(Point p) {
    return false;
  }

  /*
   * Purpose: returns a String reprensentation of this Shape
   * Parameters: none
   * Returns: String - the representation
   */
  public String toString() {
    return "Rectangle of dimensions: " + length + " by " + width + " at Point: " + position;
  }
}
