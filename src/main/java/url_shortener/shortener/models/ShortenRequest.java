package url_shortener.shortener.models;

public class ShortenRequest {
  private String url;

  public ShortenRequest(String url) {
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
