package com.example.exepensetracker.Service;

import com.example.exepensetracker.Entity.Expense;
import com.example.exepensetracker.Repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }

    public Expense getExpenseById(Integer myID) {
        return expenseRepository.getById(myID);
    }

    public void addExpense(Expense expense) {
        expenseRepository.save(expense);
    }

    public void deleteExpenseById(Integer myId) {
        expenseRepository.deleteById(myId);
    }

    public void updateById(Integer myId, Expense expense) {

    }


    //business logic
}
