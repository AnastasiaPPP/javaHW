package Seminar1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink latte = new HotDrink("latte", 100, 70);
        HotDrink espresso = new HotDrink("espresso", 50, 80);
        HotDrink cappuccino = new HotDrink("capuccino", 200, 80);
        List<Drink> hotDrinks = new ArrayList<>();
        hotDrinks.add(espresso);
        hotDrinks.add(latte);
        hotDrinks.add(cappuccino);

        Iterator<Drink> iterator = new DrinksIterator(hotDrinks);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

