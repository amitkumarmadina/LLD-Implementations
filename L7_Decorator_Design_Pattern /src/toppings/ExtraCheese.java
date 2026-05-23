package toppings;

import pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    public int cost(){
        return this.basePizza.cost() + 10;
    }
}
