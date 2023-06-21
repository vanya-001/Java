import java.util.HashSet;

public class StringPrograms {
    // Print a string in reverse
    public static void printRev(String str, int index) {
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }

        System.out.println(str.charAt(index));
        printRev(str, index-1);
    }

    public static int first = -1;
    public static int last = -1; 
    // Print the 1st and last occurence of an element in a string
    public static void findOccurence(String str, int index, char element) {
        
        if(index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1)
                first= index;
            else
                last = index;
        }
        findOccurence(str, index+1, element);
    }

    // Move all the x's to the end of the string
    public static void moveAllx(String str, int index, int count, String newString) {
        
        if(index == str.length()){
            for(int i =0; i<count; i++){
                newString += "x";
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(currChar == 'x'){
            count++;
            moveAllx(str, index+1, count, newString);
        }
        else{
            newString += currChar;
            moveAllx(str, index+1, count, newString);
        }
    }

    // Remove duplicates from the string
    public static boolean[] map = new boolean[26];
    public static void removeDupli(String str, int index, String newString) {
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar-'a'] == true){
            removeDupli(str, index+1, newString);
        }
        else{
            newString += currChar;
            map[currChar - 'a']=true;
            removeDupli(str, index+1, newString);
        }
    }

    // Print all the subsequences of the string
    public static void subSequences(String str, int index, String newString) {
        if(index==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);
        // choose to be
        subSequences(str, index+1, newString+currChar);
        // choose not to be
        subSequences(str, index+1, newString);
    }

    // Unique subsequences of a String - "aaa" (HINT - Use HashSet)
    // Import hashset above
    public static void uniqueSubSequences(String str, int index, String newString, HashSet<String>set) {
        if(index == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(index);
        // Choose to be 
        uniqueSubSequences(str, index+1, newString+currChar, set);
        // choose not to be
        uniqueSubSequences(str, index+1, newString, set);
    }
    public static void main(String[] args) {

        // printRev("null", 3);

        // String str = "abaacdaefaah";
        // findOccurence(str, 0 , 'a');

        // String str = "xxabhxsbhx";
        // moveAllx(str, 0, 0, "");

        // String str = "abaacdaefaah";
        // removeDupli(str, 0, "");

        // String str = "abc";
        // subSequences(str, 0, "");

        String str = "aaa";
        HashSet <String> set = new HashSet<>();
        uniqueSubSequences(str, 0, "", set);
    }
}
