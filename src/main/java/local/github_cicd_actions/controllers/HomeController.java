package local.github_cicd_actions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/welcome")
  public String welcome() {
    return "Welcome to CI/CD Deployed App";
  }

}
