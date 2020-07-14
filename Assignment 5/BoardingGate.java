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
    passengers = new HeapPriorityQueue();
  }

  /*
   * constructor that initializes passengers to a priority queue of given size
   */
  public BoardingGate(int size) {
    passengers = new HeapPriorityQueue(size);
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
    try {
      passengers.insert(p);
    } catch (HeapFullException e) {
      // System.out.println("The line is full!");
    }
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
