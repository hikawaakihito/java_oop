import java.util.Scanner;

class DogWalker{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("犬のデータを入力せよ。");
        System.out.print("名前は：");
        String name = stdIn.next();
        System.out.print("犬種は：");
        String breed = stdIn.next();
        System.out.print("体重は：");
        int weight = stdIn.nextInt();
        System.out.print("（実数）体力は：");
        double stamina = stdIn.nextDouble();
        System.out.println("--------------------------------");

        Dog pochi = new DogTotals(name, breed, weight, stamina);

        while(true){
            //キャストしてもちゃんと動く...
            System.out.println("総走行距離：" + ((DogTotals)pochi).getTotalDist());
            System.out.println("現在地：（" + pochi.getX() + "," + pochi.getY() + "）\n残りの体力：　" + pochi.getStamina());
            System.out.println("--------------------------------");
            System.out.print("移動しますか[0 … No / 1 … Yes]:");
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