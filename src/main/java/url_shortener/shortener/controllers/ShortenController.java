package url_shortener.shortener.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import url_shortener.shortener.models.ShortenRequest;
import url_shortener.shortener.models.ShortenResponse;
import url_shortener.shortener.services.ShortenerService;

@RestController
public class ShortenController {
  @Autowired
  private ShortenerService shortenService;

  @PostMapping("/shortUrl")
  public ShortenResponse shorten(@RequestBody ShortenRequest request) {
    return new ShortenResponse(shortenService.shorten(request.getLongUrl()));
  }
}
