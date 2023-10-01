package com.jenkins.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.learning.service.Calculator;

@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @GetMapping("/sum")
    String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
	return String.valueOf(calculator.sum(a, b));
    }
}
