package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        countWords("i love automation engineering");
        reverseWords("lock");
        String[] names = {"ANTHONY","NNAMDI", "JOHN","JOSIAH"};
        TextProcessor reverse = new TextProcessor();
        reverse.reverseWords(names);


    }
    public static void countWords(String text){

        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words: ", numberOfWords);
        System.out.println(message);
        for(String word:words){
            System.out.println(word);
        }
    }
    public static void reverseWords(String text){
        for(int i= text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
    public void reverseWords(String[] list){
        for(int i = list.length-1;i>=0; i--){
           System.out.println(list[i]);
        }
    }
}



