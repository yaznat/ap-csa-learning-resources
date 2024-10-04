public class Week7 {
    public static void main(String[] args){
        String word = "hello world";
        System.out.println(word.substring(0, word.length()/2)); //first half of the word
        System.out.println(word.substring(word.length()/2)); // second half of the word

        System.out.println(word.substring(word.length() - 1)); // last letter of the word
        System.out.println(word.substring(word.length() - 2)); // last two letters of the word
        System.out.println(word.substring(word.length() - 3)); // last three letters of the word

        System.out.println(word.substring(0, 1)); // first letter of the word

        System.out.println(word.substring(word.length()/3)); // the first third of the word


        System.out.println(word.indexOf("x")); // returns -1
    }
}

//tips and tricks

// in a two parameter substring, the difference between the parameters is equal to the number of characters you get from the string

// as soon as you figure out what a function does in abstract language, write yourself a note

// replace all complex numbers like (length / number) with the actual number that they stand for, remember no decimals

// StringIndexOutOfBoundsException occurs if you go 2 items over the last index OR try to access any negative indexes

// S.I.O.O.B.E. does not occur with indexOf! If the item is not found, it returns -1

// indexOf always returns the first occurence of the item!



