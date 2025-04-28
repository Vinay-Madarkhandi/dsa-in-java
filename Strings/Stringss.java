import java.util.ArrayList;
import java.util.Scanner;

class Stringss {

    public static void subStrNo(int n[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // for (int i = 0; i < n.length; i++) {
        //     for (int j = i; j < n.length; j++) {
        //         String conc = "";
        //         for (int k = i; k <= j; k++) {
        //             conc += n[k];
        //         }
        //         int num = Integer.parseInt(conc);
        //         list.add(num);
        //     }
        // }

        // Optmised way using maths where no String is used

        for (int i = 0; i < n.length; i++) {
            int num = 0;
            for (int j = i; j < n.length; j++) {
                num = num * 10 + n[j];
                list.add(num);
            }
        }

        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] += list.get(i);
        }
        System.out.println(validMapping(arr));
    }

    public static int validMapping(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 26) {
                sum += 1;
            }
        }
        return sum;
    }

    public static int[] converIntToArray(int number) {
        String numberString = String.valueOf(number);
        int[] digitArray = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            digitArray[i] = Character.getNumericValue(numberString.charAt(i));
        }

        return digitArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int digitArray[] = converIntToArray(n);

        subStrNo(digitArray);

        String str = "mam";
        

    }
}