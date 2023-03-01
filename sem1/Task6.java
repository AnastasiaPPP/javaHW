package sem1;

public class Task6 {
    public static void main(String[] args) {
        String[] words = { "flower", "flow", "flight" };
        String pref = commonPrefix(words);
        System.out.println(pref);

    }

    private static String commonPrefix(String[] words) {
        int len = words[0].length();
        String prefix = "";
        boolean flag = false;
        for (int letter = 0; letter < len; letter++) {
            prefix += Character.toString(words[0].charAt(letter));
            for (int i = 0; i < words.length; i++) {
                String temp = words[i];
                if (temp.startsWith(prefix)) {
                    continue;
                } else {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    flag = true;
                    break;
                }
            }
            if (flag)
                break;
        }
        return prefix;
    }

}
