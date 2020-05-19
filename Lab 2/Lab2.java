/*
 * Joh Yoshida
 * V00798535
 */

/*
 * Lab2.java
 *
 * A class of static methods that operate on Students
 *
 */
public class Lab2 {
  /*
   *
   * Purpose: determines which of Students s1 and s2
   *  have the higher grade
   *
   * Parameters: Student - s1, Student - s2
   *
   * Precondition: s1 and s2 are not null
   *
   * Returns: Student - the Student with the higher grade,
   *  s1 if they have the same grade
   *
   */
  public static Student getHigherGradeStudent(Student s1, Student s2) {
    if (s1.getGrade() >= s2.getGrade()) {
      return s1;
    }
    else {
      return s2;
    }
  }

  /*
   *
   * Purpose: determines whether the grade of Student s
   *  is above the threshold
   *
   * Parameters: Student - s, int - threshold
   *
   * Returns: boolean - true if grade is above threshold,
   *          false otherwise
   *
   */
  public static boolean isGradeAbove(Student s, int threshold) {
    if (s.getGrade() > threshold) {
      return true;
    }
    return false;
  }

  /*
   *
   * Purpose: creates an array sIDs of all Students in students
   *
   * Parameters: Student[] - students
   *
   * Returns: String[] - array of sIDs
   *
   */
  public static String[] getClasslist(Student[] students) {
    String[] classlist = new String[students.length];

    for (int i = 0; i < students.length; i++) {
      classlist[i] = students[i].getSID();
    }
    return classlist;
  }

  /*
   *
   * Purpose: counts the number of Students in students
   *  with grade above threshold
   *
   * Parameters: Student[] - students, int threshold
   *
   * Returns: int - the count
   *
   */
  public static int countAbove(Student[] students, int threshold) {
    int count = 0;

    for (int i = 0; i < students.length; i++) {
      if (isGradeAbove(students[i], threshold)) {
        count++;
      }
    }
    return count;
  }

  /*
   *
   * Purpose: calculates the average grade of Students in students,
   *  does NOT include students with 0 grade in calculation
   *  average is 0.0 if students is empty or all students have 0 grade
   *
   * Parameters: Student[] - students
   *
   * Returns: double - the average grade
   *
   */
  public static double getClassAverage(Student[] students) {
    double average = 0.0;
    int zeroes     = 0;

    for (int i = 0; i < students.length; i++) {
      if (isGradeAbove(students[i], 0)) {
        average += students[i].getGrade();
      }
      else {
        zeroes++;
      }
    }
    average /= (students.length - zeroes);

    return average;
  }

  /*
   *
   * Purpose: creates a new array 1 longer than students
   *  and adds all students and s to the new array
   *
   * Parameters: Student[] - students, Student s
   *
   * Returns: Student[] - the new array
   *
   */
  public static Student[] registerStudent(Student[] students, Student s) {
    Student[] updatedStudents = new Student[students.length + 1];
    for (int i = 0; i < students.length; i++) {
      updatedStudents[i] = students[i];
    }
    updatedStudents[students.length] = s;

    return updatedStudents;
  }
}
