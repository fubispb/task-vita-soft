package ru.vitasoft.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.vitasoft.service.MonthService;
import ru.vitasoft.service.StringService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class MyRestController {

    private final StringService stringService;
    private final MonthService monthService;

    @Autowired
    public MyRestController(StringService stringService, MonthService monthService) {
        this.stringService = stringService;
        this.monthService = monthService;
    }

    @GetMapping(produces = "application/text")
    public String restMonths(@RequestBody int id) {
        if(id > 12 || id <= 0) return "INCORRECT INPUT DATA";
        return monthService.getMonths(id);
    }

    @PostMapping(produces = "application/json")
    public Map<Integer, String> restStrings(@RequestBody List<String> message){
        return stringService.sortStrings(message);
    }

}