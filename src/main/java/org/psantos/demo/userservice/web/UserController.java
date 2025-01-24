package org.psantos.demo.userservice.web;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.oidc.StandardClaimNames;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping(value = "/me", produces = MediaType.APPLICATION_JSON_VALUE)
    public UserInfoDto getGretting(JwtAuthenticationToken auth) {
        return new UserInfoDto(
                auth.getToken().getClaimAsString(StandardClaimNames.PREFERRED_USERNAME),
                auth.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList());
    }

    public static record UserInfoDto(String name, List<String> roles) {
    }

}
