import java.util.Scanner;

abstract class Player{
    protected Scanner stdIn = new Scanner(System.in);
    private final String[] janken = {"グー","チョキ","パー",};
    private String name;
    private int currentJanken;

    abstract String chooseName(); 

    public void setName(){
        name = chooseName();
    }

    public String getName(){
        return name;
    }

    abstract int chooseJanken();

    public void setJankenChoice(){
        currentJanken = chooseJanken();
    }

    public String toString(){
        return getName() + "：" + janken[currentJanken];
    }

    public void print(){
        System.out.println(toString());
    }
}