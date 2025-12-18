package com.example.exepensetracker.Controller;

import com.example.exepensetracker.Service.ExpenseService;
import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path="api/v1/expense")
public class ExpenseController {
    private ExpenseService expenseService;


}
