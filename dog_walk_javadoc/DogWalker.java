import java.util.Scanner;
/**
 * このクラスはメインです。
 */
public class DogWalker{
    /**
     * 入力によってDog(犬)を生成して、散歩を行います。
     * 
     */
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        /**
         * 犬の情報をセットします。
         */
        System.out.println("犬のデータを入力せよ。");
        System.out.print("名前は：");
        String name = stdIn.next();
        System.out.print("犬種は：");
        String breed = stdIn.next();
        System.out.print("体重は：");
        int weight = stdIn.nextInt();
        System.out.print("（実数）体力は：");
        double stamina = stdIn.nextDouble();

        Dog pochi = new Dog(name, breed, weight, stamina);

        /**
         * 散歩させます。
         */
        while(true){
            System.out.println("現在地：（" + pochi.getX() + "," + pochi.getY() + "）\n残りの体力：　" + pochi.getStamina());
            System.out.println("移動しますか[0 … No / 1 … Yes]:");
            if(stdIn.nextInt() == 0){
                break;
            }

            System.out.print("X方向の移動距離：");
            double dx = stdIn.nextDouble();
            System.out.print("Y方向の移動距離：");
            double dy = stdIn.nextDouble();

            if(!pochi.move(dx, dy)){
                System.out.println("体力が足りません！");
            }
        }     
    }
}