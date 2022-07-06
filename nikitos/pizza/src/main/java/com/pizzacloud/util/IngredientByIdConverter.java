package com.pizzacloud.util;


import com.pizzacloud.pizza.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import com.pizzacloud.pizza.Ingredient.Type;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String,Ingredient>{
   private Map<String,Ingredient> ingredientMap = new HashMap<>();

   public  IngredientByIdConverter(){
       ingredientMap.put("MARP",
               new Ingredient("MARP", "Margherita", Type.VEGGIES));
       ingredientMap.put("MART",
               new Ingredient("MART", "Marinara", Type.TOMATO));
       ingredientMap.put("QUSC",
               new Ingredient("QUSC", "Quattro Stagioni", Type.CHEESE));
       ingredientMap.put("CARE",
               new Ingredient("CARE", "Carbonara", Type.TOMATO));
       ingredientMap.put("CRQW",
               new Ingredient("CRQW", "Crudo", Type.SAUCE));
       ingredientMap.put("MONR",
               new Ingredient("MONR", "Montanara", Type.FUNGUS));
       ingredientMap.put("EMVT",
               new Ingredient("EMVT", "Emiliana", Type.VEGGIES));
       ingredientMap.put("ROFY",
               new Ingredient("ROFY", "Romana", Type.FISH));
       ingredientMap.put("TOFU",
               new Ingredient("TOFU", "Tonno", Type.FISH));
       ingredientMap.put("TOFI",
               new Ingredient("TOFI", "Tonno", Type.ROll));
   }

       @Override
       public Ingredient convert(String id) {
           return ingredientMap.get(id);
   }
}
