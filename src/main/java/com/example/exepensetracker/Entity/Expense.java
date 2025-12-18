package com.example.exepensetracker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.yaml.snakeyaml.tokens.FlowEntryToken;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Objects;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer exp_id;
    private Float amount;
    private String category;
    private String description;
    private Integer user_id;
    private Date created;

    public Expense() {
    }

    public Expense(Integer exp_id, Float amount, String category, String description, Integer user_id, Date created) {
        this.exp_id = exp_id;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.user_id = user_id;
        this.created = created;
    }

    public Integer getExp_id() {
        return exp_id;
    }

    public void setExp_id(Integer exp_id) {
        this.exp_id = exp_id;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return Objects.equals(exp_id, expense.exp_id) && Objects.equals(amount, expense.amount) && Objects.equals(category, expense.category) && Objects.equals(description, expense.description) && Objects.equals(user_id, expense.user_id) && Objects.equals(created, expense.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exp_id, amount, category, description, user_id, created);
    }
}
