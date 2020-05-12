/*
 * Joh Yoshida
 * V00798535
 */

public class Student {
  private String sID = "";
  private int grade  = -1;

  public Student() {
  }

  public Student(String newSID, int newGrade) {
    sID   = newSID;
    grade = newGrade;
  }

  public String getSID() {
    return sID;
  }

  public void setSID(String newSID) {
    sID = newSID;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int newGrade) {
    grade = newGrade;
  }

  public String toString() {
    return "Student ID: " + sID + "\nGrade: " + 100;
  }

  public boolean equals(Student otherStudent) {
    String otherSID = otherStudent.getSID();

    if (sID.equals(otherSID)) {
      return true;
    }
    else {
      return false;
    }
  }
}
