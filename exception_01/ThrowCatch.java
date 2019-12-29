import java.util.Scanner;

public class ThrowCatch{
    static void check(int n) throws Exception{
        switch(n){
            case 1: throw new Exception("検査例外がありました。");
            case 2: throw new RuntimeException("非検査例外がありました。");
        }
    }

    static void test(int n) throws Exception{
        check(n);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("n：");
        int n = stdIn.nextInt();

        try{
            test(n);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("終了します。");
        }
    }
}