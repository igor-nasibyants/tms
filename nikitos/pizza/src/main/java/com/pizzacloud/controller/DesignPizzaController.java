package com.pizzacloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import com.pizzacloud.pizza.Ingredient;
import com.pizzacloud.pizza.Ingredient.Type;
import com.pizzacloud.pizza.Pizza;
import com.pizzacloud.pizza.PizzaOrder;


import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignPizzaController {
    @ModelAttribute
    public  void addIngredientsModel(Model model) {
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("MARP", "Margherita", Type.VEGGIES),
                new Ingredient("MART", "Marinara", Type.TOMATO),
                new Ingredient("QUSC", "Quattro Stagioni", Type.CHEESE),
                new Ingredient("CAR", "Carbonara", Type.TOMATO),
                new Ingredient("CR", "Crudo", Type.SAUCE),
                new Ingredient("MON", "Montanara", Type.FUNGUS),
                new Ingredient("EMV", "Emiliana", Type.VEGGIES),
                new Ingredient("ROF", "Romana", Type.FISH),
                new Ingredient("TOF", "Tonno", Type.FISH),
        new Ingredient("TOF", "Tonno", Type.ROll)
        );

        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }
    }
        @ModelAttribute(name="pizzaOrder")
                public PizzaOrder order(){
                return new PizzaOrder();
        }


        @ModelAttribute(name="pizza")
                public Pizza pizza(){
            return new Pizza();
        }


        @GetMapping
                public String showDesignForm() {
        return "design";
    }

        private Iterable<Ingredient> filterByType(
                List<Ingredient>ingredients ,Type type){
                     return ingredients
                    .stream()
                    .filter(x -> x.getType().equals(type))
                    .collect(Collectors.toList());

    }
}

