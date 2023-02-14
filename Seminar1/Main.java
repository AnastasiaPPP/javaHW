package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrink latte = new HotDrink("latte", 100, 70);
        HotDrink espresso = new HotDrink("espresso", 50, 80);
        HotDrink cappuccino = new HotDrink("capuccino", 200, 80);

        List<Drink> drinkList = new ArrayList<>();
        HotDrinkVendingMachine machine = new HotDrinkVendingMachine(drinkList);
        machine.addHotDrink(latte);
        machine.addHotDrink(espresso);
        machine.addHotDrink(cappuccino);

        System.out.println(machine.getProduct("latte", 100, 70));

    }
}

