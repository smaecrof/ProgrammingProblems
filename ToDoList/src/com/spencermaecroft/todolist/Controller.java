package com.spencermaecroft.todolist;

import dataModel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    public void initialize(){
        TodoItem item1 = new TodoItem("Exercise", "Lift shoulders and biceps",
                LocalDate.of(2020, Month.AUGUST,16));
        TodoItem item2 = new TodoItem("Program", "Study the Java Programming Language",
                LocalDate.of(2020, Month.AUGUST,16));
        TodoItem item3 = new TodoItem("Make a healthy lunch", "Make some chicken and rice",
                LocalDate.of(2020, Month.AUGUST,16));
        TodoItem item4 = new TodoItem("Program", "Work on some leetcode problems for some alg. practice",
                LocalDate.of(2020, Month.AUGUST,16));
        TodoItem item5 = new TodoItem("Go for a run", "Go for a run in the Portage Running trails",
                LocalDate.of(2020, Month.AUGUST,16));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }
}
