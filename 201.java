class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int l = 0;
        while(left != right){
            left>>=1;
            right>>=1;
            l++;
        }
        return right<<l;    
    }
}

//Right bits are changing with frequency half of their left bit.
//if they are same, all right bits are ought to be the same,
//if not same, one is zero and hence AND must be zero.
//if both number are equal, we have our answer.
