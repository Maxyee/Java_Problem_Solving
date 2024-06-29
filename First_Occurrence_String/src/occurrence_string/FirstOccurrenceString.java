package occurrence_string;

public class FirstOccurrenceString {
    public static int strStr(String haystack, String needle) {
        int hayStackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= hayStackLength - needleLength; i++){
            boolean found = true;
            for (int j = 0; j < needleLength; j++){
                if (haystack.charAt(i+j) != needle.charAt(j)){
                    found = false;
                    break;
                }
            }
            if (found){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String haystack = "sadbutsad";
        String needle = "but";

        int k = strStr(haystack, needle);
        System.out.println(k);
    }
}
