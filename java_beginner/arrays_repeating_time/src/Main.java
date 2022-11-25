public class Main {
    static boolean isCheck(int[] arr, int value) {
        for(int i: arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arrayN = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[arrayN.length];
        System.out.println("Repeating times");
        int startIndex = 0;
        for (int i = 0; i < arrayN.length; i++) {
            int repeatingNumber = 0;
            for(int j = 0; j < arrayN.length; j++) {
                if(arrayN[i] == arrayN[j]) {
                    repeatingNumber++;
                }
            }
            if (isCheck(duplicate, arrayN[i]))
                continue;
            else
                System.out.println(arrayN[i] + " Repeated " + repeatingNumber + " times");
            duplicate[startIndex++] = arrayN[i];
        }
    }
}