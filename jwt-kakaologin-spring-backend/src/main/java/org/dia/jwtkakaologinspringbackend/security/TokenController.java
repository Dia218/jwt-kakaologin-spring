package org.dia.jwtkakaologinspringbackend.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {
    @GetMapping("/test")
    public Map<String, Object> test(@CookieValue(name = "accessToken") String accessToken,
                                    @CookieValue(name = "refreshToken") String refreshToken) {
        Map<String, Object> results = new HashMap<>();
        results.put("accessToken", accessToken);
        results.put("refreshToken", refreshToken);
        return results;
    }
}
