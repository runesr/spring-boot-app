package no.romundstad.springbootapp.controller;

import no.romundstad.springbootapp.model.Hello;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

    @GetMapping("/")
    public ResponseEntity<String> getHello() {
        return new ResponseEntity(new Hello("HELLO!"), HttpStatus.OK);
    }
}
