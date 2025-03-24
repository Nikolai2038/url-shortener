package url_shortener.shortener.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
  @GetMapping("/health_check")
  public String ping() {
    return new java.util.Date().toString();
  }
}