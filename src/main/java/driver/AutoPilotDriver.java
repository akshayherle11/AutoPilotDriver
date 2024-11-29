package driver;

import driver.client.Client;
import driver.client.Models.Text;
import java.util.List;

public class AutoPilotDriver implements IDriver {


  private String host =  "";

  private Client client;

  public AutoPilotDriver withHost(String host) {
    if(host!=null && !host.isEmpty())
    {
      this.host = host.trim();
    }
    else
    {
      //todo error
    }
    return this;
  }


  public AutoPilotDriver build()
  {

    client = new Client(host).
        build();
    return  this;
  }


  @Override
  public List<Text> getTexts() {
    return client.getTexts();
  }

  @Override
  public List<Text> getText(String text) {
    return client.getText(text);
  }
}
