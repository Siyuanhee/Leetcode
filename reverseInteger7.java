public class reverseInteger7 {

    public int reverse(int x) {

        int input = x;
        int asw = 0;
        while(input != 0){
            int cur = input % 10;
            input = input / 10;
            if (asw > Integer.MAX_VALUE/10 || (asw == Integer.MAX_VALUE / 10 && cur > 7)) return 0;
            if (asw < Integer.MIN_VALUE/10 || (asw == Integer.MIN_VALUE / 10 && cur < -8)) return 0;
            asw = asw * 10 + cur;

        }

        return asw;

    }

}
