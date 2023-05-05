class Solution {
    public int maxVowels(String s, int k) {
        // int max = s.length() - k + 1;
        // for(int i = 0, i < max, i++){
        //     String st = s.substring(i,i+3);

        // }
        int cV = 0;
        int mV = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(int i = 0; i < k; i++){
            if (new String(vowels).indexOf(s.charAt(i)) != -1) {
                cV++;
            }
        }
        mV = cV;
        for(int i = k; i < s.length(); i++){
            if (new String(vowels).indexOf(s.charAt(i-k)) != -1) {
                cV--;
            }
            if (new String(vowels).indexOf(s.charAt(i)) != -1) {
                cV++;
            }
            mV = Math.max(mV, cV);
        }
        return mV;
        
    }
}
