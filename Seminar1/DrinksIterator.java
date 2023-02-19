package Seminar1;

import java.util.Iterator;
import java.util.List;

public class DrinksIterator implements Iterator<Drink> {
    private List<Drink> drinks;
    private int cursor;

    public DrinksIterator(List<Drink> drinks) {
        this.drinks = drinks;
    }
    @Override
    public boolean hasNext() {
        return cursor + 1 <= drinks.size();
    }

    @Override
    public Drink next() {
        return drinks.get(cursor++);
    }
    
}
