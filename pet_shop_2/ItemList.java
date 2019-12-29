public class ItemList{
    private Item[] list;

    public ItemList(int addNum){
        this.list = new Item[addNum];
    }

    public void addItem(int id, String type, String breed, SimpleDate birthday){
        this.list[id] = new Item(type, breed, birthday);
    }

    public void getItem(int id){
        this.list[id].putSpec();
    }
}