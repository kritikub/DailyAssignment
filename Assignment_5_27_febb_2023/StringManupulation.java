class StringManupulation{
    public static void main(String[] args){
        // removeAllOccurrences("helloh" , "h");
        countWords("hello bello cello" );
    }

    //How to remove all occurrences of a given character from input String?
    static void removeAllOccurrences(String str , String s){
        System.out.println(str.replaceAll(s , ""));
    }


    //Write a program to count number of words in a String?
    static void countWords(String str){
        String[] ans = str.split("\\s");
        System.out.println(ans.length);
    }

}