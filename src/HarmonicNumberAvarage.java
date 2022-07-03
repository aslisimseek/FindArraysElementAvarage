public class HarmonicNumberAvarage {
    public static void main(String[] args) {
        //This is Homework.
        double[] hormanicNumber = {1, 4, 20, 46, 5};
        double sum = 0;
        for (int i = 0; i < hormanicNumber.length; i++) {
            sum += 1/hormanicNumber[i];
        }
        System.out.println(hormanicNumber.length /sum);
    }
}