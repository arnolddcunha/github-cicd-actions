package local.github_cicd_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubCicdActionsApplication {

  public static void main(String[] args) {
    SpringApplication.run(GithubCicdActionsApplication.class, args);
  }

  // echo "# github-cicd-actions" >> README.md
  // git init
  // git add README.md
  // git commit -m "first commit"
  // git branch -M main
  // git remote add origin https://github.com/arnolddcunha/github-cicd-actions.git
  // git push -u origin main

}
