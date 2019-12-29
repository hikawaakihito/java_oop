import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class PetShop{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("ペットショップの在庫に追加する動物の数を入力せよ：");
        int addNum = stdIn.nextInt();
        ItemList stock = new ItemList(addNum);


        for(int i = 0;i < addNum;i++){
            System.out.print("動物は：");
            String type = stdIn.next();
            System.out.print("種類は：");
            String breed = stdIn.next();
            System.out.print("(yyyy-mm-dd)誕生日は:");
            String date = stdIn.next();
            String delims = "-";
            String[] strArray = date.split(delims);
            int parseNum = 3;
            int[] dateArray = new int[parseNum];
            for(int j = 0;j < parseNum;j++){
                dateArray[j] = Integer.parseInt(strArray[j]);
            }

            stock.addItem(i, type, breed, new SimpleDate(dateArray[0], dateArray[1], dateArray[2]));
        }

        System.out.println("追加した在庫は：");

        for(int i = 0;i < addNum;i++){
            stock.getItem(i);
        }
    }
}