package com.pizzacloud.pizza;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class PizzaOrder {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Date placedAt;

    @NotBlank(message = "Delivery name is required")
    private String deliveryName;
    @NotBlank (message = "Street is required")
    private String deliveryStreet;
    @NotBlank (message = "City is required")
    private String deliveryCity;
    @NotBlank (message = "State is required")
    private String deliveryState;
    @NotBlank (message = "Zip code is required")
    private String deliveryZip;
    @NotBlank (message = "Not a valid credit card number")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
            message="Must be formatted MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;

    private List<Pizza> pizzas = new ArrayList<>();

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }

}
