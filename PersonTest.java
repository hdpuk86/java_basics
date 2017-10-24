import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PersonTest{
  Person person;

  @Before
  public void before(){
    person = new Person("Hayley");
  }

  @Test
  public void hasName(){
    assertEquals("Hayley", person.getName());
  }

}
