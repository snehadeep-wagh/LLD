package DecoratorDesignPattern.Decorator;

import DecoratorDesignPattern.Base.BasePizza;

public class ExtraPaneer extends ToppingDecorator {
    BasePizza pizza;

    public ExtraPaneer(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer cost() {
        return this.pizza.cost() + 20;
    }
}
