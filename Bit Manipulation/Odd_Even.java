class Odd_Even {
    public static void checkEvenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }

    public static void main(String[] args) {
        checkEvenOrOdd(3);
        checkEvenOrOdd(10);
        checkEvenOrOdd(11);
    }
}
