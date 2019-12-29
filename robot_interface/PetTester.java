import java.util.Scanner;

public class PetTester{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        Pet[] p = {new Pet("pochi","長谷川"), new RobotPet("C3P0","五十嵐"),new Pet("ムム","Mathew"),};

        for(Pet i : p){
            i.introduce();
            if(i instanceof RobotPet){
                ((RobotPet)i).work(0);
            }
        }

        for(Pet i : p){
            if(i instanceof RobotPet){
                System.out.print(i.getName() + "はロボットです。着せ替えしますか？ 1) はい　0) いえ：");
                if(stdIn.nextInt() == 1){
                    System.out.print("どれにしますか？ 1) 黒　2) 赤　3) 緑　4) 青　5) ヒョウ柄：");
                    int skin = stdIn.nextInt() - 1;
                    ((RobotPet)i).changeSkin(skin);
                    System.out.println(i.getName() + "は" + ((RobotPet)i).getSkin() + "になりました！");
                }
            }
        }
    }
}