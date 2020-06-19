/*
 * Joh Yoshida
 * V00798535
 */
public class MazeRunner {
  Maze mazeToSolve;
  A4Stack <MazeLocation> path;

  public MazeRunner(Maze aMaze) {
    mazeToSolve = aMaze;
    int size = mazeToSolve.getSize();
    path = new A4Stack <MazeLocation>(size);
  }

  /*
   * Purpose: Determines whether there is a path from start to finish in this maze
   * Parameters: MazeLocation start - starting coordinates of this maze
   *			   MazeLocation finish - finish coordinates of this maze
   * Returns: true if there is a path from start to finish
   */
  public boolean solve(MazeLocation start, MazeLocation finish) {
    System.out.println("Searching maze from start: " + start + " to finish: " + finish);
    path.push(start);
    return findPath(start, finish);
  }

  /*
   * Purpose: Recursively determines if there is a path from cur to finish
   * Parameters: MazeLocation cur - current cordinates in this maze
   *			   MazeLocation finish - goal coordinates of this maze
   * Returns: true if there is a path from cur to finish
   *
   * NOTE: This method updates the Maze's mazeData array when locations
   *       are visited to an 'o', and further updates locations to an 'x'
   *       if it is determined they lead to dead ends. If the finish
   *       location is found, the Stack named path should contain all of
   *       loations visited from the start location to the finish.
   */
  private boolean findPath(MazeLocation cur, MazeLocation finish) {
    int row = cur.row;
    int col = cur.col;

    mazeToSolve.setChar(row, col, 'o');
    System.out.println("\n" + mazeToSolve.toString());

    // Check victory condition
    if (path.top().equals(finish)) {
      System.out.println("Victory!");
      return true;
    }
    // Check above
    if (row != 0) {
      if (mazeToSolve.getChar(row - 1, col) == ' ') {
        System.out.println("Found a path UP, pushing position (" + (row - 1)
                           + ", " + col + ") onto stack");
        MazeLocation next = new MazeLocation(row - 1, col);
        path.push(next);
        return findPath(next, finish);
      }
    }
    // Check left
    if (col != 0) {
      if (mazeToSolve.getChar(row, col - 1) == ' ') {
        System.out.println("Found a path LEFT, pushing position (" + row
                           + ", " + (col - 1) + ") onto stack");
        MazeLocation next = new MazeLocation(row, col - 1);
        path.push(next);
        return findPath(next, finish);
      }
    }
    // Check below
    if (row + 1 != mazeToSolve.getRows()) {
      if (mazeToSolve.getChar(row + 1, col) == ' ') {
        System.out.println("Found a path DOWN, pushing position (" + (row + 1)
                           + ", " + col + ") onto stack");
        MazeLocation next = new MazeLocation(row + 1, col);
        path.push(next);
        return findPath(next, finish);
      }
    }
    // Check right
    if (col + 1 != mazeToSolve.getCols()) {
      if (mazeToSolve.getChar(row, col + 1) == ' ') {
        System.out.println("Found a path RIGHT, pushing position (" + row
                           + ", " + (col + 1) + ") onto stack");
        MazeLocation next = new MazeLocation(row, col + 1);
        path.push(next);
        return findPath(next, finish);
      }
    }

    // Backtrack
    System.out.println("No path found, need to backtrack. Popping: "
                       + path.top());
    mazeToSolve.setChar(row, col, 'x');
    path.pop();
    // Check failure condition
    if (path.isEmpty()) {
      System.out.println("Impossible!");
      return false;
    }
    return findPath(path.top(), finish);
  }

  /*
   * Purpose: Creates a string of maze locations found in the stack
   * Parameters: None
   * Returns: A String representation of maze locations
   */
  public String getPathToSolution() {
    String details = "";

    while (!path.isEmpty()) {
      details = path.pop() + details;
    }
    return details;
  }
}
