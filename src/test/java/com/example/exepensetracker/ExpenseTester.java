package com.example.exepensetracker;

import com.example.exepensetracker.Entity.Expense;
import com.example.exepensetracker.Repository.ExpenseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ExpenseTester {

    @Autowired
    public  ExpenseRepository expenseRepository;

    @Test
    public void getExpense(){
        List<Expense> list =  expenseRepository.findAll();
        System.out.println(list);
    }
}
