package driver.client;

import driver.client.Models.Text;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

  @GET("/texts")
  public Call<List<Text>> getTexts();

  @GET("/texts")
  public Call<List<Text>> getText(@Query("text") String text);
}
