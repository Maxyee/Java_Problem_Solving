package common_prefix;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0 || strs == null) return "";

        String prefix = strs[0];
        int i = 1;
        while(i < strs.length){
            int j = 0;
            while(j < prefix.length() &&
                    j < strs[i].length() &&
                    prefix.charAt(j) == strs[i].charAt(j)){
                j++;
            }
            prefix = prefix.substring(0,j);
            if (prefix.isEmpty()){
                return "";
            }
            i++;
        }
        return prefix;
    }


    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        String K = longestCommonPrefix(strs);
        System.out.print(K);
    }


//    public static String longestCommonPrefix(String[] strs){
//        if(strs.length == 0 || strs == null) return "";
//
//        String prefix = strs[0];
//        int i = 1;
//        while(i < strs.length){
//            while(i < strs.length && !strs[i].startsWith(prefix)){
//                prefix = prefix.substring(0, prefix.length() - 1);
//                if (prefix.isEmpty()){
//                    return "";
//                }
//            }
//            i++;
//        }
//        return prefix;
//    }
}
