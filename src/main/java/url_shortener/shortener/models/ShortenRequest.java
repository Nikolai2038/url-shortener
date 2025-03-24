package url_shortener.shortener.models;

public class ShortenRequest {
  private String longUrl;

  // Add no-argument constructor for JSON deserialization
  public ShortenRequest() {
  }

  public String getLongUrl() {
    return longUrl;
  }
}
