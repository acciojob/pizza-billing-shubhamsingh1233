package com.driver;

public class DeluxePizza extends Pizza {
    public DeluxePizza(Boolean isVeg)
    {
        super(isVeg);

        if(isVeg)
        {
            addExtraCheese();
            addExtraToppings();
        }
        else {
            addExtraToppings();
            addExtraCheese();
        }
    }
}
