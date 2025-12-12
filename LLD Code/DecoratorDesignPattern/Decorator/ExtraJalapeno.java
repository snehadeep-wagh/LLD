package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Base.BasePizza;

public class ExtraJalapeno extends ToppingDecorator {
    BasePizza pizza;

    public ExtraJalapeno(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer cost() {
        return this.pizza.cost() + 15;
    }
}
