package Seminar1;

public class HotDrink extends Drink {
    protected int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
