public class longestCommonPrefix14 {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }

        String first = strs[0];
        int index = 0;
        String output = "";

        while(index < first.length()){
            for(int i = 1; i < strs.length; i++){
                if(strs[i].length() <= index){
                    return output;
                }
                if(strs[i].charAt(index) != first.charAt(index)){
                    return output;
                }
            }
            output += first.charAt(index);
            index++;
        }

        return output;

    }

}
