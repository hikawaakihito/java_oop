public class MinMax{
    //二つの値の最大値または最小値
    public static int max(int a, int b){
        if(a > b) return a;
        else return b;
    }
    public static int min(int a, int b){
        if(a < b) return a;
        else return b;
    }
    public static double max(double a, double b){
        if(a > b) return a;
        else return b;
    }
    public static double min(double a, double b){
        if(a < b) return a;
        else return b;
    }

    //三つの値の最大値または最小値
    public static int max(int a, int b, int c){
        if(a >= b && a >= c) return a;
        else if(b >= a && b >= c) return b;
        else return c;
    }
    public static int min(int a, int b, int c){
        if(a <= b && a <= c) return a;
        else if(b <= a && b <= c) return b;
        else return c;
    }
    public static double max(double a, double b, double c){
        if(a >= b && a >= c) return a;
        else if(b >= a && b >= c) return b;
        else return c;
    }
    public static double min(double a, double b, double c){
        if(a <= b && a <= c) return a;
        else if(b <= a && b <= c) return b;
        else return c;
    }

    //配列に格納された最大値または最小値最
    public static int max(int[] array){
        int max = array[0];
        for(int i = 1;i < array.length;i++){
            if(array[i] > max) max = array[i];
        }
        return max;
    }
    public static int min(int[] array){
        int min = array[0];
        for(int i = 1;i < array.length;i++){
            if(array[i] < min) min = array[i];
        }
        return min;
    }
    public static double max(double[] array){
        double max = array[0];
        for(int i = 1;i < array.length;i++){
            if(array[i] > max) max = array[i];
        }
        return max;
    }
    public static double min(double[] array){
        double min = array[0];
        for(int i = 1;i < array.length;i++){
            if(array[i] < min) min = array[i];
        }
        return min;
    }

    //配列に格納された最大値または最小値最の最小の要素番号
    public static int maxIndex(int[] array){
        int index = 0;
        for(int i = 1;i < array.length;i++){
            if(array[i] > array[index]) index = i;
        }
        return index;
    }
    public static int minIndex(int[] array){
        int index = 0;
        for(int i = 1;i < array.length;i++){
            if(array[i] < array[index]) index = i;
        }
        return index;
    }
    public static int maxIndex(double[] array){
        int index = 0;
        for(int i = 1;i < array.length;i++){
            if(array[i] > array[index]) index = i;
        }
        return index;
    }
    public static int minIndex(double[] array){
        int index = 0;
        for(int i = 1;i < array.length;i++){
            if(array[i] < array[index]) index = i;
        }
        return index;
    }
}