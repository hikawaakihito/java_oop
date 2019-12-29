import java.util.Scanner;

public class MinMaxTest{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数（０）か実数（１）：");
        int type = stdIn.nextInt();

        int numVal = 0;
        do{
            System.out.print("最大値と最小値を取り出したい数値の数を入力してください(2 - 9)：");
            numVal = stdIn.nextInt();
        }while(numVal < 2 || numVal > 9);

        if(type == 0){
            switch(numVal){
                case 2:
                {
                    System.out.print("値１：");
                    int a = stdIn.nextInt();
                    System.out.print("値２：");
                    int b = stdIn.nextInt();

                    System.out.println("最大値は： " + MinMax.max(a, b));
                    System.out.println("最小値は： " + MinMax.min(a, b));

                    break;
                }
                case 3:
                {
                    System.out.print("値１：");
                    int a = stdIn.nextInt();
                    System.out.print("値２：");
                    int b = stdIn.nextInt();
                    System.out.print("値３：");
                    int c = stdIn.nextInt();


                    System.out.println("最大値は： " + MinMax.max(a, b, c));
                    System.out.println("最小値は： " + MinMax.min(a, b, c));

                    break;
                }
                default:
                {
                    int[] array = new int[numVal];
                    for(int i = 0;i < numVal;i++){
                        System.out.print("値" + (i + 1) + "：");
                        array[i] = stdIn.nextInt();
                    }

                    System.out.println("最大値は： " + MinMax.max(array));
                    System.out.println("最大値の要素番号は： " + MinMax.maxIndex(array));
                    System.out.println("最小値は： " + MinMax.min(array));
                    System.out.println("最小値の要素番号は： " + MinMax.minIndex(array));

                    break;
                }
            }
        }else{
            switch(numVal){
                case 2:
                {
                    System.out.print("値１：");
                    double a = stdIn.nextDouble();
                    System.out.print("値２：");
                    double b = stdIn.nextDouble();

                    System.out.println("最大値は： " + MinMax.max(a, b));
                    System.out.println("最小値は： " + MinMax.min(a, b));

                    break;
                }
                case 3:
                {
                    System.out.print("値１：");
                    double a = stdIn.nextDouble();
                    System.out.print("値２：");
                    double b = stdIn.nextDouble();
                    System.out.print("値３：");
                    double c = stdIn.nextDouble();


                    System.out.println("最大値は： " + MinMax.max(a, b, c));
                    System.out.println("最小値は： " + MinMax.min(a, b, c));

                    break;
                }
                default:
                {
                    double[] array = new double[numVal];
                    for(int i = 0;i < numVal;i++){
                        System.out.print("値" + (i + 1) + "：");
                        array[i] = stdIn.nextDouble();
                    }

                    System.out.println("最大値は： " + MinMax.max(array));
                    System.out.println("最大値の要素番号は： " + MinMax.maxIndex(array));
                    System.out.println("最小値は： " + MinMax.min(array));
                    System.out.println("最小値の要素番号は： " + MinMax.minIndex(array));

                    break;
                }
            }
        }
    }
}