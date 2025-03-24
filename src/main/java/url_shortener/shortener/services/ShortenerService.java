package url_shortener.shortener.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import url_shortener.shortener.entities.Redirection;
import url_shortener.shortener.repositories.RedirectRepository;

@Service
public class ShortenerService {
  @Autowired
  RedirectRepository redirectRepository;

  public String shorten(String longUrl) {
    if (longUrl == null) {
      return "http://localhost:8080";
    }

    String shortUrl = Integer.toHexString(longUrl.hashCode());
    redirectRepository.save(new Redirection(shortUrl, longUrl));
    return String.format("http://localhost:8080/%s", shortUrl);
  }

  public Redirection resolve(String shortUrl) {
    Optional<Redirection> redirection = redirectRepository.findById(shortUrl);
    return redirection.orElse(null);
  }
}
