package com.github.clucle.docker_spring_mysql;

import com.github.clucle.docker_spring_mysql.model.User;
import com.github.clucle.docker_spring_mysql.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerSpringMysqlApplication {

    @Autowired
    private UserRepository repository;

    @RequestMapping("/")
    public String home() {
        User u = this.repository.findAll().iterator().next();
        return "Hello " + u.getName() + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerSpringMysqlApplication.class, args);
    }
}
