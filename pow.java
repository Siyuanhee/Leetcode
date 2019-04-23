
public class pow {

    public static void main(String[] args) {

        System.out.println(myPow(-2,3));

    }

    public static double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }

        if(x == -1 && n % 2 == 0){
            return 1;
        }

        if(n < 0){
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
            }else{
                n = -n;
            }

            x = 1/x;

        }

        if(n % 2 == 0){
            return myPow(x * x,n / 2);
        }else {
            return x * myPow(x * x, (n - 1) / 2);
        }
    }

}
