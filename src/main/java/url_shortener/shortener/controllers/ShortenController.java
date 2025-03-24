package url_shortener.shortener.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import url_shortener.shortener.models.ShortenRequest;
import url_shortener.shortener.models.ShortenResponse;

@RestController
public class ShortenController {
  @PostMapping("/shortUrl")
  public String shorten(@RequestBody ShortenRequest request) {
    return new ShortenResponse("http://localhost:8080/some_link").getShortUrl();
  }
}
