import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus (String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public void addPassengerIfSpace(Person newPassenger) {
        if (passengers.size() < capacity) {
            passengers.add(newPassenger);
            System.out.println(String.format("%s has gotten on the bus", newPassenger.getName()));
        }
        else {
            System.out.println(String.format("%s could not fit on the bus as it was at capacity", newPassenger.getName()));
        }
    }

    public void removePassenger(Person leavingPassenger) {
        int index = passengers.indexOf(leavingPassenger);
        passengers.remove(index);
    }

}
