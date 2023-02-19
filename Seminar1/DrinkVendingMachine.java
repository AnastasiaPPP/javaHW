package Seminar1;
import java.util.List;

public class DrinkVendingMachine {

    private List<Drink> drinkList;

    public DrinkVendingMachine(List<Drink> drinks) {
        this.drinkList = drinks;
    }
    public void addDrink(Drink dr) {
        drinkList.add(dr);
    }
    public Drink getProduct (String name, int volume) {
        for(Drink d : drinkList)
        {
            if (d.getName().equals(name) && d.getVolume() == volume) {
                return d;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return String.format("Count of drinks = %d", drinkList.size());
    }
}

