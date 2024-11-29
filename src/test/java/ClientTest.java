import driver.AutoPilotDriver;
import driver.client.Models.Text;
import java.util.List;
import org.junit.Test;

public class ClientTest {



  @Test()
  public void test1()
  {
    AutoPilotDriver driver = new AutoPilotDriver()
        .withHost("http://localhost:8080")
        .build();
   List<Text> t=  driver.getText("You have pushed the button this many times:");
    System.err.println(t);
  }
}
