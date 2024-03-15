package dev.yonk.jwt_security.controllers;

import dev.yonk.jwt_security.dtos.JwtAuthenticationResponse;
import dev.yonk.jwt_security.dtos.SigninRequest;
import dev.yonk.jwt_security.dtos.SignupRequest;
import dev.yonk.jwt_security.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public JwtAuthenticationResponse signup (@RequestBody SignupRequest request) {
        return authService.signup(request);
    }

    @PostMapping("/signin")
    public JwtAuthenticationResponse signin(@RequestBody SigninRequest request) {
        return authService.signin(request);
    }
}
