package driver;

import driver.client.Models.Text;
import java.util.List;

public interface IDriver {


  public List<Text> getTexts();

  public List<Text> getText(String text) ;
}
