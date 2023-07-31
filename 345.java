class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        String vowel = "aeiouAEIOU";
        int a = 0;
        int b = s.length() - 1;
        while (a < b) {
            if (vowel.contains(String.valueOf(s.charAt(a))) && vowel.contains(String.valueOf(s.charAt(b)))) {
                char temp = ch[a];
                ch[a] = ch[b];
                ch[b] = temp;
                a++;
                b--;
            } else if (vowel.contains(String.valueOf(s.charAt(a)))) {
                b--;
            } else if (vowel.contains(String.valueOf(s.charAt(b)))) {
                a++;
            } else {
                a++;
                b--;
            }
        }
        return String.valueOf(ch);
    }
}
