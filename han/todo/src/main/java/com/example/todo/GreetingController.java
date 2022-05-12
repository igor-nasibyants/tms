package com.example.todo;

import com.example.todo.domain.Task;
import com.example.todo.repos.TaskRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    private final TaskRepo taskRepo;

    public GreetingController(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @GetMapping
    public String main(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        Iterable<Task> allTask = taskRepo.findAll();
        model.addAttribute("tasks", allTask);
        return "main";
    }
    @PostMapping
    public String add(@RequestParam (name = "name", required = false, defaultValue = "World") String name, Model model) {
        Task task = new Task();
        task.setNameTask(name);
        task.setStatus(false);
        taskRepo.save(task);

        Iterable<Task> allTask = taskRepo.findAll();
        model.addAttribute("tasks", allTask);

        return "main";
    }
}
