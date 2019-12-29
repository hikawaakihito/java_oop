public class SimpleDateTester{
    public static void main(String[] args){
        SimpleDate d1 = new SimpleDate();
        SimpleDate d2 = new SimpleDate();

        System.out.println("こんにちは");

        System.out.println(SimpleDate.isLeap(d1.getYear()));

        d1.set(2019, 13, 78);

        System.out.println(d1.toString());

        System.out.println(d2.isBefore(d1));

        return;
    }
}