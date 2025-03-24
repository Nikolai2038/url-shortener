package url_shortener.shortener.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;
import url_shortener.shortener.services.ShortenerService;

@RestController
public class RedirectController {
  @Autowired
  private ShortenerService shortenService;

  @GetMapping("/{shortKey}")
  public void redirect(@PathVariable String shortKey, HttpServletResponse response) {
    response.setHeader("Location", shortenService.resolve(shortKey));

    // Если 301, то браузер запомнит редирект и будет переходить сразу
    response.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
  }
}
