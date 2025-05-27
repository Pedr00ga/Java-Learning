public class forInJava {
    public static void main(String[] args){

       // for(int i = 0; i <= 10; i++){
       //     System.out.println(i);
       // }

        double [] array = new double[] {10, 20, 30, 50};
        double total = 0;
        for (int i = 0; i < array.length; i++){
            System.out.println(total + i);
            total = total + array[i];
        }
        System.out.println(total);

    }
}
