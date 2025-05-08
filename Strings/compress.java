import java.util.ArrayList;

class compress {
    public static int compression(char[] chars) {
        ArrayList<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            Integer count = 1;
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }
            arr.add(chars[i]);

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    arr.add(c);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            chars[i] = arr.get(i);
        }
        return arr.size();
    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        char chars[] = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compression(chars));
        String str = "aabbccc";
        System.out.println(compressString(str));
    }
}
