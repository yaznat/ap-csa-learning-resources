public class Week8{
    //hit run to see the results
    public static void main(String[] args) {
        System.out.println(createUsername("bavreet", "sting"));
        System.out.println(replace("happy", "y", "eeee"));
    }


   // the week 7 quiz problem

   //example: first = "gloria" , last = "smithsel", it would return "gl.$mi1h$el"
   //replace both s's with a $
   //replace the t with a 1
   //however, it can be any word with two s's and one t
   //only include the first two letters of first
   //add a "." between first and last
    public static String createUsername(String first, String last){
        int index = last.indexOf("s");
        last = last.substring(0, index) + "$" + last.substring(index + 1);
        index = last.indexOf("s");
        last = last.substring(0, index) + "$" + last.substring(index + 1);
        index = last.indexOf("t");
        last = last.substring(0, index) + "1" + last.substring(index + 1);
        return first.substring(0, 2) + "." + last;
    }

    // let's make a custom function that replaces any letter of any word with anything!
    public static String replace(String word, String target, String replacement){ // takes in the word, what to replace, 
                                                                                  // and what to replace it with
        
        int index = word.indexOf(target); // finds the target in the String and stores where it is
        
        return word.substring(0, index) + replacement + word.substring(index + 1); // add together the String before the
                                                                                   // target, plus the replacement, plus
                                                                                   // the String after the target
    }
    
}
