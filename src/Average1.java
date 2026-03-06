public class Average1 {

    public static double FindAvg(double [] arr) {

        double sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum / arr.length;
    }

    public static void main(String[] args) {

        double [] grades = {90.99, 96.80, 88.50,65.76, 56.50, 77.70};
        double result = FindAvg(grades);

        System.out.printf("%.2f\n", result);
    }
}
