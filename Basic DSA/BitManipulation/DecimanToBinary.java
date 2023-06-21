package BitManipulation;

public class DecimanToBinary {

    public static void decimalToBinary(int n) {
        int[] binaryNum = new int[n];
        int i=0; 
        while(n>0){
            binaryNum[i] = n%2;
            n=n/2;
            i++;
        }
        for(int j=0; j<binaryNum.length; j++){
            System.out.println(binaryNum[j]);
        }
        
        // For reversing binary number
        // for(int j=i-1; j>=0; j--){
        //     System.out.println(binaryNum[j]);
        // }
        
    }

    public static void binaryToDecimal(int n) {
        int num = n;
        int dec_value =0;
        int base =1; //Initialising base vale to 1 means 2^0=>1
        int temp=num;

        while(temp>0){
            int lastDigit = temp%10;
            temp=temp/10;
            dec_value += lastDigit * base;
            base=base*2;
        }
        System.out.println(dec_value);
    }
    public static void main(String[] args) {
        int n = 4;
        decimalToBinary(n);
        binaryToDecimal(n);
        
    }
}
