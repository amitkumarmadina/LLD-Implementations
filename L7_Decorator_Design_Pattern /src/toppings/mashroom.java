package toppings;

import pizza.BasePizza;

public class mashroom extends ToppingDecorator{
    BasePizza basePizza;
    public mashroom(BasePizza pizza){
        this.basePizza = pizza;
    }
    public int cost(){
        return this.basePizza.cost() + 10;
    }
}
