public class InitArray{
    public static void main(String[] args){
        int size = 10; // default
        if (args.length > 0)
            size = Integer.parseInt(args[0]);

        int[] array = new int[size];
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int i = 0; i < array.length; i++)
            System.out.printf("%5d%8d%n", i, array[i]);
    }
}