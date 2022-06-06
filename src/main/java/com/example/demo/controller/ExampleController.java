package com.example.demo.controller;

import com.example.demo.response.Magic;
import com.example.demo.response.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("example")
public class ExampleController {
    @GetMapping("food")
    public String getFood(){
        return "Pizza";
    }

    @GetMapping("student")
    public Student getStudent(){
        return Student.builder()
                .food("Spaghetti")
                .money(500)
                .name("Someone")
                .friend(new ArrayList<>(Arrays.asList("draco","tinos")))
                .build();
    }

    @GetMapping("magic")
    public ResponseEntity<Magic> getMagic(){
        Magic m = Magic.builder()
                .first("first")
                .last("last")
                .build();
        return new ResponseEntity<>(m, HttpStatus.OK);
    }
}
