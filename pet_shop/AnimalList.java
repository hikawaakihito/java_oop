import java.util.Date;

class AnimalList{
    private Animal[] list;

    AnimalList(int addNum){
        this.list = new Animal[addNum];
    }

    public void addAnimal(int id, String type, String breed, Date birthday){
        this.list[id] = new Animal(type, breed, birthday);
    }

    public void getAnimal(int id){
        this.list[id].getSpec();
    }
}