package com.example.aicodereview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aicodereview.model.ReviewRequest;
import com.example.aicodereview.service.AIReviewService;

@RestController
@RequestMapping("/api/review")
@CrossOrigin
public class ReviewController {

    @Autowired
    private AIReviewService service;

    @PostMapping
    public String reviewCode(@RequestBody ReviewRequest request) {
        return service.reviewCode(request.getCode());
    }

    @GetMapping
    public String test() {
        return "AI Code Review Assistant is running!";
    }
}
