import java.util.Random;

public class Cp extends Player{
    private Random rand = new Random();
    private String[] cpName = {"CP1","CP2","CP3","BOSS"};

    public Cp(){
        setName();
    }

    public String chooseName(){
        System.out.print("相手を選んで下さい。1)CP1　2)CP2　3)CP3　4)BOSS：");
        return cpName[(stdIn.nextInt() - 1)];
    }

    public int chooseJanken(){
        return rand.nextInt(3);
    }
}