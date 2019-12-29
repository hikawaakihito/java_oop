public class Item{
    public static final String MESSAGE = "頑張ったね！";
    public static int counter = 0; //ItemListのputMaxIdがアクセスする
    private int id; //一意の商品番号
    private String type; //犬か鳥かなど
    private String breed; //柴犬かシェパードなどの種類
    private SimpleDate birthday;
    
    public Item(String type, String breed, SimpleDate birthday, int idJump){
        Item.counter += idJump;
        id = Item.counter;
        this.type = type;
        this.breed = breed;
        this.birthday = new SimpleDate(birthday);
    }

    public SimpleDate getItemDate(){
        return new SimpleDate(birthday);
    }

    public void putSpec(){
        System.out.print("番号：" + id + "\n動物：" + type + "\n種類：" + breed + "\n誕生日：" + this.getItemDate().toString() + "\n");
    }
    
    
}