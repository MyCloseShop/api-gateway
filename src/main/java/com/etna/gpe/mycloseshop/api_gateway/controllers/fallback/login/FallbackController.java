package com.etna.gpe.mycloseshop.api_gateway.controllers.fallback.login;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/fallback/login")
    public ResponseEntity<String> loginFallback() {
        return new ResponseEntity<>("Le service de login est indisponible pour le moment. Veuillez réessayer plus tard.", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("/fallback/shop")
    public ResponseEntity<String> shopFallback() {
        return new ResponseEntity<>("Le service de shop est indisponible pour le moment. Veuillez réessayer plus tard.", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("/fallback/quote")
    public ResponseEntity<String> quoteFallback() {
        return new ResponseEntity<>("Le service de quote est indisponible pour le moment. Veuillez réessayer plus tard.", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("/fallback/social")
    public ResponseEntity<String> socialFallback() {
        return new ResponseEntity<>("Le service de social est indisponible pour le moment. Veuillez réessayer plus tard.", HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("fallback/payment")
    public ResponseEntity<String> paymentFallback() {
        return new ResponseEntity<>("Le service de payment est indisponible pour le moment. Veuillez réessayer plus tard.", HttpStatus.SERVICE_UNAVAILABLE);
    }
}
