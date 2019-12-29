import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class PetShop{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("ペットショップの在庫に追加する動物の数を入力せよ：");
        int addNum = stdIn.nextInt();
        AnimalList stock = new AnimalList(addNum);


        for(int i = 0;i < addNum;i++){
            System.out.print("動物は：");
            String type = stdIn.next();
            System.out.print("種類は：");
            String breed = stdIn.next();
            System.out.print("(yyyy-mm-dd)誕生日は:");
            String date = stdIn.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("y-M-d");
            Date birthday = null;
            try {
                birthday = dateFormat.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            stock.addAnimal(i, type, breed, birthday);
        }

        System.out.println("追加した在庫は：");

        for(int i = 0;i < addNum;i++){
            stock.getAnimal(i);
        }
    }
}