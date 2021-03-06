public class Dog{
    private String name;
    private String breed; //犬種
    private int weight;
    private double x; //位置
    private double y; //位置
    private double stamina; //犬の残りの体力

    public Dog(String name, String breed, int weight, double stamina){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.stamina = stamina;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getStamina(){
        return stamina;
    }

    public void putSpec(){
        System.out.println("名前：" + name);
        System.out.println("犬種：" + breed);
        System.out.println("体重：" + weight);    
    }

    //---- X方向にdx、Y方向にdyだけ、体力が十分あれば移動
    public boolean move(double dx, double dy){
        double dist = Math.sqrt(dx * dx + dy * dy);

        if(dist > stamina){
            return false;
        }else{
            stamina -= dist;
            x += dx;
            y += dy;
            return true;
        }
    }
}