import java.util.Date;

class Animal{
    static private int counter = 0;
    private int id; //一意の商品番号
    private String type; //犬か鳥かなど
    private String breed; //柴犬かシェパードなどの種類
    private Date birthday;
    
    Animal(String type, String breed, Date birthday){
        Animal.counter++;
        this.id = Animal.counter;
        this.type = type;
        this.breed = breed;
        this.birthday = birthday;
    }

    public void getSpec(){
        System.out.print("番号：" + id + "\n動物：" + type + "\n種類：" + breed + "\n誕生日：" + birthday + "\n");
    }
    
    
}