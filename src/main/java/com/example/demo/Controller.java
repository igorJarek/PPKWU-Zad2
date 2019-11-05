package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stringAnalyzer")
public class Controller {

    @GetMapping("hasUpperCaseCharacter")
    SimpleResponse hasUpperCaseCharacter(@RequestParam String input)
    {
        SimpleResponse response = new SimpleResponse();

        if(input.isEmpty())
            return response;

        for (int index = 0; index < input.length(); index++) {
            if(Character.isUpperCase(input.charAt(index))) {
                response.error = false;
                response.amount++;
                response.positions.add(index);
            }
        }

        return response;
    }

    @GetMapping("hasLowerCaseCharacter")
    SimpleResponse hasLowerCaseCharacter(@RequestParam String input)
    {
        SimpleResponse response = new SimpleResponse();

        if(input.isEmpty())
            return response;

        for (int index = 0; index < input.length(); index++) {
            if(Character.isLowerCase(input.charAt(index))) {
                response.error = false;
                response.amount++;
                response.positions.add(index);
            }
        }

        return response;
    }

    @GetMapping("hasDigitCharacter")
    SimpleResponse hasDigitCharacter(@RequestParam String input)
    {
        SimpleResponse response = new SimpleResponse();

        if(input.isEmpty())
            return response;

        for (int index = 0; index < input.length(); index++) {
            if(Character.isDigit(input.charAt(index))) {
                response.error = false;
                response.amount++;
                response.positions.add(index);
            }
        }

        return response;
    }

    @GetMapping("hasSpecialCharacter")
    SimpleResponse hasSpecialCharacter(@RequestParam String input)
    {
        SimpleResponse response = new SimpleResponse();

        if(input.isEmpty())
            return response;

        for (int index = 0; index < input.length(); index++) {
            if(!Character.isJavaLetterOrDigit(input.charAt(index))) {
                response.error = false;
                response.amount++;
                response.positions.add(index);
            }
        }

        return response;
    }

    @GetMapping("hasMixedCharacter")
    ComplexResponse hasMixedCharacter(@RequestParam String input)
    {
        ComplexResponse response = new ComplexResponse();
        // TODO
    }
}
