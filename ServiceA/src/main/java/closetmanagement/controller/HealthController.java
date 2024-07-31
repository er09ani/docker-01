package closetmanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    public static final String HEALTH_RESOURCE = "health";

    @GetMapping(HEALTH_RESOURCE)
    public ResponseEntity<Object> health() {
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }
}
