package url_shortener.shortener.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Redirection {
  @Id
  private String shortKey;
  private String longUrl;

  // Add no-argument constructor for JPA
  public Redirection() {
  }

  public Redirection(String shortKey, String longUrl) {
    this.shortKey = shortKey;
    this.longUrl = longUrl;
  }

  public String getShortKey() {
    return shortKey;
  }

  public void setShortKey(String shortKey) {
    this.shortKey = shortKey;
  }

  public String getLongUrl() {
    return longUrl;
  }

  public void setLongUrl(String longUrl) {
    this.longUrl = longUrl;
  }
}
