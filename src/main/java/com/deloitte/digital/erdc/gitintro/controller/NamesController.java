package com.deloitte.digital.erdc.gitintro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/name")
public class NamesController {

    @RequestMapping
    public List<String> getNames(){
        List<String> names = new ArrayList<>();
        names.add("Andrei");
        return names;
    }


}
