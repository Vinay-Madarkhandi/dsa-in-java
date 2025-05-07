public class Substring {
    public static String subStr(String str, int si, int ei) {
        String string = "";
        for (int i = si; i < ei; i++) {
            string += str.charAt(i);
        }
        return string;
    }

    public static void getAllSubString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String string = subStr(str, i, j + 1);
                // String string = str.substring(i, j+1);
                System.out.println(string);

            }
        }
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subStr(str, 0, 5));
        int length = (str.length() * (str.length() - 1)) / 2;
        getAllSubString(str);
        System.out.println("The no of substring can be formed is : " + length);
    }
}
