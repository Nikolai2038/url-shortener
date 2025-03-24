package url_shortener.shortener.services;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

@Service
public class ShortenerService {
  // Разные потоки будут видеть одну и ту же коллекцию
  private Map<String, String> shortToLongUrl = new ConcurrentHashMap<>();

  public String shorten(String longUrl) {
    if (longUrl == null) {
      return "http://localhost:8080";
    }

    String shortUrl = Integer.toHexString(longUrl.hashCode());
    shortToLongUrl.put(shortUrl, longUrl);
    return String.format("http://localhost:8080/%s", shortUrl);
  }

  public String resolve(String shortUrl) {
    return shortToLongUrl.get(shortUrl);
  }
}
