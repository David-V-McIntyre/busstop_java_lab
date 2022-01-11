import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;
    private Person person1;
    private Person person2;

    @Before
    public void before() {
        bus = new Bus("Giffnock", 3);
        person1 = new Person("James");
        person2 = new Person("Steve");

    }

    @Test
    public void busHasDestination() {
        assertEquals("Giffnock", bus.getDestination());
    }

    @Test
    public void busHasCapacity() {
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.getNumberOfPassengers());
    }
    @Test
    public void canAddPassenger() {
        bus.addPassengerIfSpace(person1);
        bus.addPassengerIfSpace(person2);
        assertEquals(2, bus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassengerIfSpace(person1);
        bus.addPassengerIfSpace(person2);
        bus.removePassenger(person1);
        assertEquals(1, bus.getNumberOfPassengers());

    }

    @Test
    public void cannotAddPassengerCapacity() {
        bus.addPassengerIfSpace(person1);
        bus.addPassengerIfSpace(person1);
        bus.addPassengerIfSpace(person1);
        bus.addPassengerIfSpace(person2);
        assertEquals(3, bus.getNumberOfPassengers());
    }
}