public class Pet{
    private String name;
    private String masterName;

    public Pet(String name, String masterName){
        this.name = name;
        this.masterName = masterName;
    }

    public String getName(){
        return name;
    }

    public String getMasterName(){
        return masterName;
    }

    public void introduce(){
        System.out.println("■ 僕の名前は" + getName() + "です。");
        System.out.println("■ ご主人は" + getMasterName() + "です！");        
    }
}
