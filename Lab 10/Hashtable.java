public class Hashtable {
  private static final int TABLE_SZ = 7;   // a prime number

  Student[] table;
  int count;    // number of Students in the table

  public Hashtable() {
    table = new Student[TABLE_SZ];
    count = 0;
  }

  /* MethodName: insertCollisions
   * Purpose: insert s into this Hashtable with no collision handling strategy
   * Parameters: Student - s
   * Throws:  TableFullException - if inserting into a full table
   *          CollisionException - if inserting a new key into table at index that is full
   * Returns: nothing
   */
  public void insertCollisions(Student s) throws TableFullException, CollisionException {
    if (count == 7) {
      throw new TableFullException();
    }
    int hash  = s.hashCode();
    int index = hash % TABLE_SZ;
    if (table[index] == null) {
      table[index] = s;
      count++;
    }
    else {
      if (table[index].getSID() == s.getSID()) {
        table[index] = s;
      }
      else {
        throw new CollisionException();
      }
    }
  }

  /* MethodName: getCollisions
   * Purpose: find Student with sid in this Hashtable with no collision handling and returns their grade
   * Parameters: String - sid
   * Throws:  KeyNotFoundException  - if Student with sid is not found in table
   * Returns: int - the grade of Student with sid
   */
  public int getCollisions(String sID) throws KeyNotFoundException {
    int index = sID.hashCode() % TABLE_SZ;

    if (table[index] != null) {
      if (table[index].getSID() == sID) {
        return table[index].getGrade();
      }
    }
    throw new KeyNotFoundException();
  }

  /* MethodName: insertLinearProbing
   * Purpose: insert s into this Hashtable with Linear Probing to handle collisions
   * Parameters: Student - s
   * Throws: TableFullException  - if inserting into a full table
   * Returns: nothing
   */
  // TODO: complete this function

  /* getLinearProbing
   * Purpose: find Student with sid in this Hashtable that uses Linear Probing and returns their grade
   * Parameters: String - sid
   * Throws:  KeyNotFoundException  - if Student with sid is not found in table
   * Returns: int - the grade of Student with sid
   */
  // TODO: complete this function



  /*
   * Purpose: returns the number of elements in this Hashtable
   * Parameters: none
   * Returns: int - the number of elements
   */
  public int size() {
    return count;
  }

  /*
   * Purpose: returns a String reprensentation of elements
   *      in this Hashtable separated by newlines
   * Parameters: none
   * Returns: String - the representation
   */
  public String toString() {
    String s = "";

    for (int i = 0; i < TABLE_SZ; i++) {
      if (table[i] != null) {
        s += table[i] + "\n";
      }
    }

    return s;
  }
}
