import java.util.Scanner;

public class Janken{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("ジャンケンゲームをスタートします。");
        
        Player[] players = {new P1(), new Cp()};
        
        int quit = 1;
        do{
            for(Player p : players){
                p.setJankenChoice();
            }
            //---上記で全てのプレイヤーの選択をゲットしてから、全ての結果を表示します。
            for(Player p : players){
                p.print();
            }
            do{
            System.out.print("もう一回ジャンケンしますか？1)はい　0)やめる：");
            quit = stdIn.nextInt();
            }while(quit < 0 || quit > 1);
        }while(quit != 0);

        return;
    }
}