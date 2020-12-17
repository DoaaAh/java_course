package chapter8;

public class TextProcessor {
    public static void main(String[] arg){
        countWords("I love BTS");
        reverseString("BTS is the best");
        addSpaces("JinYoongiHopeNamjoonJiminTaeKook");
    }
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for(int i = 0;i<numberOfWords; i++){
            System.out.println(words[i]);
        }
    }
    public static void reverseString(String text){
        for(int i = text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
        System.out.print("\n");

    }
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i<modifiedText.length(); i++){
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++; // to skip the added space
            }
        }
        System.out.print(modifiedText);
    }
}

