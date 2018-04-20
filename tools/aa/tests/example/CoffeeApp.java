package coffee;

import dagger.Component;
import javax.inject.Singleton;

public class CoffeeApp {
  public static void main(String[] args) {
    CoffeeComponent coffee = DaggerCoffeeComponent.builder().build();
    coffee.maker().brew();
  }
}
