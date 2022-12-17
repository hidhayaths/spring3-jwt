package com.hid.spring3jwt.controller;

import com.hid.spring3jwt.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SuppressWarnings({"unused"})
@RequiredArgsConstructor
@RestController
@RequestMapping("/auth")
public class AuthController {
    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;

    @PostMapping("/token")
    public ResponseEntity<String> token(Authentication authentication){
        LOG.debug("token requested for user '{}'",authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("token granted '{}'",token);
        return ResponseEntity.ok(token);
    }

}
