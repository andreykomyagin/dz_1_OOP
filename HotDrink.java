public class HotDrink extends BottleWater {
    private int temperature;
    public HotDrink(String name, double cost, double volume, int temperature){
        super(name, cost, volume);
        this.temperature = temperature;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public double getTemperature(){
        return temperature;
    }
    @Override
    public String toString() {
        return "HotDrink{" + "name = " + super.getName() + ", cost = " + super.getCost() + ", volume = " + super.getVolume() + ", temperature = " + temperature + "}";
    }
}
