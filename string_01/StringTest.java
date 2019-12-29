import java.util.Scanner;

public class StringTest{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列 α ：");
        String alpha = stdIn.nextLine();

        System.out.print(" α の逆順：");
        for(int i = alpha.length() - 1;i >= 0;i--){
            System.out.print(alpha.charAt(i));
        }
        System.out.println();

        System.out.print("α のユニコード：");
        for(int i = 0;i < alpha.length();i++){
            System.out.printf("%04X", alpha.codePointAt(i));
        }
        System.out.println();

        System.out.print("α で探したい文字列(β)：");
        String beta = stdIn.nextLine();

        System.out.println(" α ：" + alpha);
        if(alpha.indexOf(beta) != -1){
            System.out.print(" β ：");
            int i1 = alpha.indexOf(beta);
            for(int i = 0;i < i1;i++){
                System.out.print(" ");
            }
            System.out.println(beta);
        }else{
            System.out.println("見つかりませんでした。");
        }

        System.out.print("実数：");
        Double d = stdIn.nextDouble();

        System.out.print("それは：");
        printDouble(d, 3, 8);
    
    }
    static void printDouble(double x, int p, int w){
        String f = String.format("%%%d.%df\n",w,p);
        System.out.printf(f,x);
    }
}