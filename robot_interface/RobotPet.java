public class RobotPet extends Pet implements Skinnable{
    private String mySkin = Skinnable.skins[0];//Skinnableと関連
    
    public RobotPet(String name, String masterName){
        super(name, masterName);
    }

    @Override
    public void introduce(){
        System.out.println("◇ 私はロボット。名前は" + getName() + "。");
        System.out.println("◇ ご主人様は" + getMasterName() + "。");
    }

    public void work(int sw){
        switch(sw){
            case 0:
                System.out.println("◇ 掃除します。");
                break;
            case 1:
                System.out.println("◇ 洗濯します。");
                break;
            case 2:
                System.out.println("◇ 炊事します。");
                break;
        }
    }

    public void changeSkin(int newSkin){
        mySkin = Skinnable.skins[newSkin];
    }

    public String getSkin(){
        return mySkin;
    }
}