package security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import security.UserPrincipal;

import java.util.stream.Collectors;


@Component
public class JwtProvider implements IjwtProvider{

    @Value("${app.jwt.secret}")
    private String JWT_SECRET;


    @Value("${app.jwt.expiration-in-ms}")
    private String JWT_EXPIRATION_IN_MS;

    public String generateToken(UserPrincipal auth) {

        String authorities = auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining());

        return null;
    }
}
