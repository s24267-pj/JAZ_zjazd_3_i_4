package com.example.zjazd3.controller;

import com.example.zjazd3.model.Car;
import com.example.zjazd3.service.HelloService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cw1")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping("/exception")
    public ResponseEntity<String> ex() {
        String responseText = helloService.throwException(true);
        return ResponseEntity.ok(responseText);
    }

    @PostMapping("/car")
    public ResponseEntity<Car> postBody(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getModel() {
        return ResponseEntity.ok(new Car("VW", 2003));
    }

    @GetMapping("hello/{value}")
    public ResponseEntity<String> getValue(@PathVariable String value) {
        return ResponseEntity.ok("Value :" + value);
    }

    @GetMapping("/parameter")
    public ResponseEntity<String> paramater(@RequestParam("param") String param) {
        return ResponseEntity.ok(param);
    }


}
