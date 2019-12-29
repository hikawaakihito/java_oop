public class ComParam{
    public static void main(String[] args){
        System.out.print("円周は：");
        for(String s : args){
            double d = Double.parseDouble(s);
            System.out.printf("%7.2f, ", (2 * d * Math.PI));
        }
        System.out.println();
    }
}