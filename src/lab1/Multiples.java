package lab1;

class Multiples {
    public static void main() {
        int count = Multiples.multiples();

        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int multipleCount = 0;

        for (int i = 1; i < n; i++) {
            if (i % a == 0 || i % b == 0) {
                multipleCount++;
            }
        }

        return multipleCount;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
