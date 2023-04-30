package com.docker.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.ok;

@SpringBootApplication
@RestController
@RequestMapping(path = "/api/welcome")
public class SpringCicdPracticeApplication {
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> welcome() {
        return ok("Welcome to CI/CD");
    }
    @GetMapping(path = "/say",produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<?> show(){
        return ok("Hello Manikandan R welcome to CI/CD");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCicdPracticeApplication.class, args);
    }
//    echo "# spring-cicd-action" >> README.md
//    git init
//    git add README.md
//    git commit -m "first commit"
//    git branch -M main
//    git remote add origin https://github.com/brucemani/spring-cicd-action.git
//    git push -u origin main
}
