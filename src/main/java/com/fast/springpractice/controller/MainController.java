package com.fast.springpractice.controller;

import com.fast.springpractice.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService){
        this.sortService = sortService;
    }

// http://localhost:8080/?list=3,2,1
    @GetMapping("/")
    public String hello(@RequestParam List<String> list){
        return sortService.doSort(list).toString();
    }
}
