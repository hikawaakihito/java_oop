public class ItemList{
    private Item[] list;

    public static void putMaxId(){
        System.out.println("最後のペットIDは：" + Item.counter);
    }

    public ItemList(int addNum){
        this.list = new Item[addNum];
    }

    public void addItem(int id, String type, String breed, SimpleDate birthday, int idJump){
        this.list[id] = new Item(type, breed, birthday, idJump);
    }

    public void putItem(int id){
        this.list[id].putSpec();
    }
}