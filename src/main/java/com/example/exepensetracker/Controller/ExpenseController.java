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
        return null;
    }

    @GetMapping("/get-by-id/{myId}")
    public Expense getById(@PathVariable Integer myID){
        return new Expense();
    }
    //get by last week, month....????

    @PostMapping("/add-expense")
    public boolean addExpense(@RequestBody Expense expense){
        // add function
        return true;
    }

    @DeleteMapping("delete-by-id/{myId}")
    public boolean deleteById(@PathVariable Integer myId){
        //delete function
        return true;
    }

    @PutMapping("update-by-id/{myId}")
    public boolean updateById(@PathVariable Integer myId ,@RequestBody Expense expense ){
        //update query by id and set using request body
        return true;
    }


}
