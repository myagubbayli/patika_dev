public class Harmonics {
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double harmonic_series = 0.0;
        double harmonic_average = 0.0;

        for(int i = 0; i < numbers.length; i++) {
            harmonic_series += 1 / numbers[i];
        }

        harmonic_average = numbers.length / harmonic_series;

        System.out.println("Harmonic average of array is: " + harmonic_average);

    }
}
