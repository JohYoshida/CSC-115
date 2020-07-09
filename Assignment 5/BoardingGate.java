/*
 * Joh Yoshida
 * V00798535
 */

/*
 * represents a transit boarding gate (train, airplane, etc.)
 */

public class BoardingGate {
  private PriorityQueue passengers;

  /*
   * constructor that initializes passengers to a default-sized priority queue
   */
  public BoardingGate() {
    // TODO: implement this
  }

  /*
   * constructor that initializes passengers to a priority queue of given size
   */
  public BoardingGate(int size) {
    // TODO: implement this
  }

  /* addPassenger
   * PURPOSE:
   *  add given Passenger p to passengers and
   *  prints a notification message if passengers is full
   *
   * PARAMETERS:
   *  Passenger p - Passenger to be added
   *
   * RETURNS:
   *  None.
   */
  public void addPassenger(Passenger p) {
    // TODO: implement this
  }

  /* numPassengersWaiting
   * PURPOSE:
   *  returns the number of Passengers in passengers waiting to board
   *
   * PARAMETERS:
   *  None.
   *
   * RETURNS:
   *  int - number of passengers waiting to board
   */
  public int numPassengersWaiting() {
    // TODO: implement this
    return -1;             // so it compiles
  }

  /* nextPassenger
   *
   * PURPOSE:
   *  removes and returns the next Passenger from passengers
   *
   * PARAMETERS:
   *  None.
   *
   * RETURNS:
   *  Passenger - the next Passenger, null if there is no more Passengers.
   */
  public Passenger nextPassenger() {
    // TODO: implement this
    return null;             // so it compiles
  }
}