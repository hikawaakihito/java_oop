public class DogTotals extends Dog{
    private double totalDist = 0;

    public DogTotals(String name, String breed, int weight, double stamina){
        super(name, breed, weight, stamina);
    }

    @Override public boolean move(double dx, double dy){
        totalDist +=  Math.sqrt(dx * dx + dy * dy);
        return super.move(dx, dy);
    }

    public double getTotalDist(){
        return totalDist;
    }
}