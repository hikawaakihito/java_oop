public class P1 extends Player{
    public P1(){
        setName();
    }

    public String chooseName(){
        System.out.print("名前入力して下さい：");
        return stdIn.next();
    }  
    
    public int chooseJanken(){
        int choice;
        do{
            System.out.print("1)グー　2)チョキ　3)パー：");
            choice = stdIn.nextInt() - 1;
        }while(choice < 0 || choice > 2);
        return choice;
    }
}