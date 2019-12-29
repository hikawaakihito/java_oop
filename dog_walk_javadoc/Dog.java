/**
 * クラスDogは犬を表すクラスです。
 * 生成された犬は体力が十分あれば、入力によって移動できます。
 * @author スローンシャーン
 * @see DogWalker
 * 
 */
public class Dog{
    /**
     * 名前
     */
    private String name;
    /**
     * 犬種
     */
    private String breed; //犬種
    /**
     * 体重
     */
    private int weight;
    /**
     * 位置
     */
    private double x; //位置
    /**
     * 位置
     */
    private double y; //位置
    /**
     * 体力
     */
    private double stamina; //犬の残りの体力

    /**
     * 犬は入力によって定義されます。
     * @param breed 犬種
     * @param stamina 体力
     */
    Dog(String name, String breed, int weight, double stamina){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.stamina = stamina;
    }

    /**
     * @param x 位置
     */
    double getX(){
        return x;
    }

    /**
     * @param y 位置
     */
    double getY(){
        return y;
    }

    double getStamina(){
        return stamina;
    }
    /**
     * 犬の情報を表示します。
     */
    void putSpec(){
        System.out.println("名前：" + name);
        System.out.println("犬種：" + breed);
        System.out.println("体重：" + weight);    
    }

    /**
     * X方向にdx、Y方向にdyだけ、体力が十分あれば移動させます。
     * @param dx X方向に移動したい距離
     * @param dy Y方向に移動したい距離
     */
    boolean move(double dx, double dy){
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