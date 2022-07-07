package inc.ast.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calc")
public class CalculatorController {

    @GetMapping
    public String calc(@RequestParam(name = "valueOne") Integer valueOne,
                       @RequestParam(name = "valueTwo") Integer valueTwo,
                       @RequestParam(name = "action") String action,
                       Model model){

        return "calculator/calc";
    }
}
