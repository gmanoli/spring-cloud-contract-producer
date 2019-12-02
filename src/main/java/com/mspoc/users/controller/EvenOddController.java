package com.mspoc.users.controller;

import com.mspoc.users.exception.NotEvenNumberException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {

    @GetMapping("/validate/prime-number")
    public String isNumberPrime(@RequestParam("number") Integer number) {
        return Integer.parseInt(String.valueOf(number)) % 2 == 0 ? "Even" : "Odd";
    }

    @GetMapping("/validate/even")
    public String isEven(@RequestParam("number") Integer number) throws NotEvenNumberException {
        if (Integer.parseInt(String.valueOf(number)) % 2 == 0) {
            return "Even";
        }
        throw new NotEvenNumberException("not even number");
    }
}
