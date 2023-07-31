class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] w1 = new int[26];
        int[] w2 = new int[26];
        int[] f1 = new int[word1.length() + 1];
        int[] f2 = new int[word2.length() + 1];

        for (char ch : word1.toCharArray()) {
            w1[ch - 'a']++;
        }
        for (char ch : word2.toCharArray()) {
            w2[ch - 'a']++;
        }

        for (int freq : w1) {
            if (freq > 0) {
                f1[freq]++;
            }
        }
        for (int freq : w2) {
            if (freq > 0) {
                f2[freq]++;
            }
        }

        for (int i = 1; i <= word1.length(); i++) {
            if (f1[i] != f2[i])
                return false;
        }

        for (int i = 0; i < 26; i++) {
            if ((w1[i] == 0 && w2[i] != 0) || (w1[i] != 0 && w2[i] == 0))
                return false;
        }

        return true;
    }
}
