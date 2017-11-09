class Solution {
    public int[] plusOne(int[] digits) {
        boolean carryBit = true;
        for(int i=digits.length-1;i>=0;i--){
            if(carryBit){
                digits[i] = digits[i]+1;
                if(digits[i]>=10){
                    digits[i] = digits[i]%10;
                    carryBit = true;
                }else{
                    carryBit = false;
                }
            }
        }
        if(carryBit){
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            for(int i=0;i<digits.length;i++){
                newDigits[i+1] = digits[i];
            }
            return newDigits;
        }
        return digits;
    }
}
