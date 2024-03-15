package dev.yonk.jwt_security.dtos;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SigninRequest {
    String username;
    String password;
}
