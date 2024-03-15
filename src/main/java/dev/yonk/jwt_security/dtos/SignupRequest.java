package dev.yonk.jwt_security.dtos;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    String username;
    String email;
    String password;
}
