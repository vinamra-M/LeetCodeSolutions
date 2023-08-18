class Solution {
    public String addBinary(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        char[] ans = new char[Math.max(a1.length,b1.length)+1];
        int x = a1.length-1;
        int y = b1.length-1;
        int carry = 0;
        int index = Math.max(a1.length,b1.length);
        while(x >= 0 || y >= 0 || carry == 1){
            int sum = 0;
            if(x >= 0) sum += a1[x]-'0';
            if(y >= 0) sum += b1[y]-'0';
            sum += carry;
            if(sum == 0){
                carry = 0;
                ans[index] = '0';
            } else if(sum == 1){
                carry = 0;
                ans[index] = '1';  
            } else if(sum == 2){
                carry = 1;
                ans[index] = '0';
            } else{
                carry = 1;
                ans[index] = '1';
            }
            index--;
            x--;
            y--;
        }
        StringBuilder sb = new StringBuilder();
        if(ans[0] == '1') sb.append('1');
        for(int i = 1; i < ans.length; i++){
            sb.append(ans[i]);
        }
        return sb.toString();
        
    }
}
