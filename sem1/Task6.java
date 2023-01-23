package sem1;

public class Task6 {
    public static void main(String[] args) {
        String[] words = { "flow", "flight", "flower" };
        String word = findLongestWord(words);
        String pref = commonPrefix(words, word);
        System.out.println(pref);

    }

    public static String findLongestWord(String[] wrds) {
        int size = wrds.length;
        String longestName = wrds[0];
        for (int i = 0; i < size; i++) {
            if (wrds[i].length() > longestName.length()) {
                longestName = wrds[i];
            }
        }
        return longestName;
    }

    private static String commonPrefix(String[] words, String longestWord) {
        int len = longestWord.length();
        String prefix = "";
        boolean flag = false;
        for (int letter = 0; letter < len; letter++) {
            prefix += Character.toString(longestWord.charAt(letter));
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
