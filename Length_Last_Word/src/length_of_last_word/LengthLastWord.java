package length_of_last_word;

public class LengthLastWord {

    public static int lengthOfLastWord(String s){
        String[] splitString = s.split(" ");
        int lengthOfSplitString = splitString.length;
        String lastWord = splitString[lengthOfSplitString - 1];
        int lenthOfLastWord = lastWord.length();
        return lenthOfLastWord;
    }

    public static void main(String[] args){
        String s = "What a beautiful moon";
        int K = lengthOfLastWord(s);
        System.out.print(K);
    }
}
