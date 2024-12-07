package org.psantos.demo.user_service.web;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @PostMapping("login")
    public String login(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    @PutMapping("logout")
    public String logout(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

}
