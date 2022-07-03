public class FindArraysElementAvarage {
    public static void main(String[] args) {
        //This is Practices
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum / numbers.length);
    }
}


