package ma.monavocat.Controllers;

import ma.monavocat.Dtos.JwtRequest;
import ma.monavocat.Dtos.JwtResponse;
import ma.monavocat.MonAvocatApplication;
import ma.monavocat.Utils.JwtToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final static Logger LOGGER= LoggerFactory.getLogger(MonAvocatApplication.class);

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtToken jwtToken;
    @Autowired
    private UserDetailsService userDetailsService;

@PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody JwtRequest request) {
        LOGGER.debug("Jwt Request {}", request);
        try {
            authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUserName(),request.getPwd()));
        }catch (BadCredentialsException e){
            throw e;
        }
        catch (AuthenticationException e) {
            throw e;
        }
        UserDetails userDetails = userDetailsService.loadUserByUsername(request.getUserName());
        String token= jwtToken.generateToken(userDetails);

    return new JwtResponse(token);
    }
}
