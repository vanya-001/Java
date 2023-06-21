public class SimplePrograms {
    // Number 1
    public static void printNumInReverseOrder(int n)
    {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumInReverseOrder(n-1);
    }
    // Number 2
    public static void printNumberInSerialOrder(int n) {
        if(n==7){
        System.out.println(n);
            return;
        }
        System.out.println(n);
        printNumberInSerialOrder(n+1);        
    }
    public static void sumOf1stNaturalNumbers(int i, int n, int sum) {
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        sumOf1stNaturalNumbers(i+1, n, sum);
    }
    public static int Factorial(int n) {
        if(n==1){
            return 1;
        }
        int fact_nm1 = Factorial(n-1);
        int fact_n = n*fact_nm1;      
        return fact_n;
    }
    public static void printFibonacci(int a, int b, int n) {
        if(n==0)
        return;

        int c = a+b;
        System.out.println(c);
        printFibonacci(b, c, n-1);
    }

    public static int printPower(int x, int n) {
        if(n==0){
            return 1;
        }        
        if(x==0){
            return 0;
        }
        int xPow1 = printPower(x, n-1);
        int xPown = x*xPow1;
        return xPown;
    }

    // Printing power with stack height = logn
    public static int printPower2(int x, int n) {
        if(x==0)
        return 0;
        if(n==0)
        return 1;

        if(n%2==0){
            return printPower2(x, n/2) * printPower2(x, n/2);
        }
        else{
            return printPower2(x, n/2) * printPower2(x, n/2) * x;
        }
    }

    public static void main(String args[]) {
        // printNumInReverseOrder(7);
        
        // printNumberInSerialOrder(0);

        // sumOf1stNaturalNumbers(0, 5, 0);

        // int a = Factorial(5);
        // System.out.println(a);  
        
        // int a =0;
        // int b=1;
        // int n=10;
        // printFibonacci(a, b, n-2);

        // int x=2;
        // int n=5;
        // int power = printPower(x, n);
        // System.out.println(power);

        // For stack height = logn
        // int x=2;
        // int n=5;
        // int power = printPower2(x, n);
        // System.out.println(power);
    }
}
