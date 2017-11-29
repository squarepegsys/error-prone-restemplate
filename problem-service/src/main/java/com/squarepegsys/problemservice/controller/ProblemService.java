package com.squarepegsys.problemservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/someService")
public class ProblemService  {


    private Integer numberCalls = 0;

    @RequestMapping(method= RequestMethod.GET, value="{value}/double")
    public Map<String,Object> vinStatus(@PathVariable Integer value,
                                        HttpServletResponse  response
        ) {

        numberCalls++;
        Map<String, Object> result = new HashMap<>();

        if (numberCalls%3==0) {
            response.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
            Map<String, Object> desc = new HashMap<>();
            desc.put("description","Leeroy Jenkins!");
            result.put("error", desc);
            
        } else {
            result.put("result", value*2);
        }


        

        return result;

        

    }
}
