package coffee;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = { DripCoffeeModule.class })
public interface CoffeeComponent {
CoffeeMaker maker();
}
