package DecoratorDesignPattern;

import DecoratorDesignPattern.Base.BasePizza;
import DecoratorDesignPattern.Base.MargheritaPizza;
import DecoratorDesignPattern.Decorator.ExtraCheese;
import DecoratorDesignPattern.Decorator.ExtraJalapeno;

public class main {
    public static void main(String args[]){
        // Margherita pizza with extra cheese.
        BasePizza pizza = new ExtraCheese(new MargheritaPizza());
        System.out.println("Margherita pizza with extra cheese: " + pizza.cost());

        // Extra Jalapeno
        pizza = new ExtraJalapeno(pizza);
        System.out.println("Margherita pizza with extra cheese and jalapeno: " + pizza.cost());

    }
}
