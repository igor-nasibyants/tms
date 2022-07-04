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
       ingredientMap.put("CAR",
               new Ingredient("CAR", "Carbonara", Type.TOMATO));
       ingredientMap.put("CR",
               new Ingredient("CR", "Crudo", Type.SAUCE));
       ingredientMap.put("MON",
               new Ingredient("MON", "Montanara", Type.FUNGUS));
       ingredientMap.put("EMV",
               new Ingredient("EMV", "Emiliana", Type.VEGGIES));
       ingredientMap.put("ROF",
               new Ingredient("ROF", "Romana", Type.FISH));
       ingredientMap.put("TOF",
               new Ingredient("TOF", "Tonno", Type.FISH));
       ingredientMap.put("TOF",
               new Ingredient("TOF", "Tonno", Type.ROll));
   }

       @Override
       public Ingredient convert(String id) {
           return ingredientMap.get(id);
   }
}
