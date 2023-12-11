public class BottleWater extends Product {
    private double volume;
    public BottleWater(String name, double cost, double volume){
        super(name, cost);
        this.volume = volume;
    }
    public void setVolume(double volume){
        this.volume = volume;
    }
    public double getVolume(){
        return volume;
    }
    @Override
    public String toString() {
        return "BottleWatter{" + "name = " + super.getName() + ", cost = " + super.getCost() + ", volume = " + volume + "}";
    }

}
