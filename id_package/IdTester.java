import jp.sodacs.id.Id;

public class IdTester{
    public static void main(String[] args){
        Id a = new Id();
        Id b = new Id();
        Id c = new Id();

        System.out.println("aの識別番号: " + a.getId());
        System.out.println("bの識別番号: " + b.getId());
        System.out.println("cの識別番号: " + c.getId());
    }
}