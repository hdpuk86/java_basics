import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before(){
    bus = new Bus(44);
    person = new Person("Hayley");
  }

  @Test
  public void hasNumber(){
    assertEquals(44, bus.getNumber());
  }

  @Test
  public void busStartsEmpty(){
    assertEquals(0, bus.countPassengers());
  }

  @Test
  public void canAddPassenger(){
    bus.addPassenger(person);
    assertEquals(1, bus.countPassengers());
  }

  @Test
  public void busIsFull(){
    for(int i = 0; i < 5; i++){
      bus.addPassenger(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void cannotAddPassengerIfFull(){
    for(int i = 0; i < 10; i++){
      bus.addPassenger(person);
    }
    assertEquals(5, bus.countPassengers());
  }

  @Test
  public void emptiesAtLastStop(){
    bus.addPassenger(person);
    bus.lastStop();
    assertEquals(0, bus.countPassengers());
  }

}
