public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            int number = 0;
            for(int j = 2; j < 101; j++){
                if (i % j == 0) {
                    number++;
                }
            }
            if(number == 1) {
                System.out.print(i + " ");
            }
        }
    }
}