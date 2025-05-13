class BitOperations {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }
        int no = clearIthBit(n, i);
        int bitMask = newBit << i;
        return no | bitMask;
    }

    public static int clearIBits(int n, int i) {
        int bitMask = ~(0) << i;
        return (n & bitMask);
    }

    public static int clearRangeinBits(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    // Fast exponentiation is a concept where we find the a^n solution is best
    // optiomal time using bit operators in the O(log n) time complexity.
    // similar to this there is another concept called modular exponentation where
    // (a^n % x) is find in best optimal solution

    public static int fastExponentaion(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static int fastExponentaionDiff(int a, int n) {
        int x2 = fastExponentaionDiff(a, n / 2);
        return x2 * x2;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(clearIBits(10, 2));
        System.out.println(clearRangeinBits(10, 2, 7));
        System.out.println(isPowerOfTwo(32));
        System.out.println(countSetBits(10));
        System.out.println(fastExponentaion(3, 5));
        System.out.println(fastExponentaionDiff(5, 3));
    }
}
