package driver.client;

import driver.client.Models.Text;
import java.io.IOException;
import java.util.List;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class Client {


  private  Service service;

  private String baseUrl= "";

  public Client(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public Client build()
  {
    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(JacksonConverterFactory.create())
        .client(httpClient.build())
        .build();
    service = retrofit.create(Service.class);
    return  this;
  }



  public List<Text> getTexts()
  {
    Call<List<Text>> request = service.getTexts();
    try {
      Response<List<Text>> response = request.execute();
      return response.body();
    } catch (IOException e) {
     return null;
    }
  }

  public List<Text> getText(String text)
  {
    Call<List<Text>> request = service.getText(text);
    try {
      Response<List<Text>> response = request.execute();
      return response.body();
    } catch (IOException e) {
      System.err.println(e);
      return null;
    }

  }
}
