public class integerToRoman12 {

    public String intToRoman(int num) {

        String[] symbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int input = num;
        String output = "";

        for(int i = 0; i < value.length; i ++){
            while(input >= value[i]){
                output += symbol[i];
                input -= value[i];
            }
        }

        return output;

    }

}
