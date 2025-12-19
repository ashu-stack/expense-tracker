package com.example.exepensetracker.Controller;

import com.example.exepensetracker.Entity.Expense;
import com.example.exepensetracker.Service.ExpenseService;
import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (path="api/v1/expense")
public class ExpenseController {
    private ExpenseService expenseService;

    @GetMapping("/get-expenses")
    public List<Expense> getAll(){
        return expenseService.getAllExpenses();
    }

    @GetMapping("/get-by-id/{myId}")
    public Expense getById(@PathVariable Integer myID){
        return expenseService.getExpenseById(myID);
    }
    //get by last week, month....????

    @PostMapping("/add-expense")
    public boolean addExpense(@RequestBody Expense expense){
        // add function
        expenseService.addExpense(expense);

        return true;
    }

    @DeleteMapping("delete-by-id/{myId}")
    public boolean deleteById(@PathVariable Integer myId){
        //delete function
        expenseService.deleteExpenseById(myId);
        return true;
    }

    @PutMapping("update-by-id/{myId}")
    public boolean updateById(@PathVariable Integer myId ,@RequestBody Expense expense ){
        //update query by id and set using request body
        expenseService.updateById(myId,expense);
        return true;
    }


}
