class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int a = num1.length();
        int b = num2.length();
        int[] arr = new int[a+b-1];
        for(int i = 0; i < arr.length;i++) arr[i] = 0;

        for(int i = 0; i < num1.length(); i++){
            for(int j = 0; j < num2.length(); j++){
                arr[i+j] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
            }
        }
        for(int i = arr.length-1; i > 0; i--){
            int temp = arr[i];
            arr[i] = arr[i]%10;
            arr[i-1] += temp/10;
        }
        StringBuilder result = new StringBuilder();
        for (int digit : arr) {
            result.append(digit);
        }
        return result.charAt(0) == '0' ? result.substring(1) : result.toString();
    }
}
