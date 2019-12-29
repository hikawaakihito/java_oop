import java.util.Scanner;

class RangeError extends RuntimeException{
    RangeError(String s){
        super(s);
    }
}

class ParameterRangeError extends RangeError{
    ParameterRangeError(int n){
        super("加える数が範囲外です。範囲外の値：" + n);
    }
}

class ResultRangeError extends RangeError{
    ResultRangeError(int n){
        super("計算結果が範囲外です。範囲外の値：" + n);
    }
}

public class RangeErrorTest{
    static boolean isValid(int n){
        return n >= 0 && n <= 9;
    }

    static int add(int a, int b) throws ParameterRangeError, ResultRangeError{
        if(!isValid(a)) throw new ParameterRangeError(a);
        if(!isValid(b)) throw new ParameterRangeError(b);
        int result = a + b;
        if(!isValid(result)) throw new ResultRangeError(result);
        return result;
    }

    static int elementCount(int[] array){
        try{
            int count = 0;
            for(int i : array){
                count += i;
            }
            return count;
        }catch(NullPointerException e){
            throw new RuntimeException("ヌル参照です。");
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");
        int a = stdIn.nextInt();
        System.out.print("整数b：");
        int b = stdIn.nextInt();

        try{
            System.out.println("それらの和は" + add(a, b) + "です。");
        }catch(RangeError e){
            System.out.println(e.getMessage());
            //System.exit(1);
        }finally{
            System.out.println("終了します。");
        }

        //ボーナス!!!
        System.out.println("ボーナス!!!");
        int[] array = null;

        try{
            elementCount(array);
        }catch(RuntimeException e){
            System.out.println("ヌル参照です。");
        }finally{
            System.out.println("本気で終了します。");
        }

    }
}