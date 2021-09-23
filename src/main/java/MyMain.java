public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] newarray = new int[arr.length];
        for (int x = 0; x < arr.length; x++) {
            newarray[x] = arr[arr.length - x-1];
        }
        // REPLACE WITH YOUR CODE HERE
        return newarray;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int largest = -999999;
        int slargest = -999999;
        int[] newarray = new int[arr.length];
        for (int x: arr) {
            int index = 0;
            for (int y: arr) {
                if (x>y) {
                    index++;
                }
            }
            newarray[index] = x;
        }
        for (int x: newarray) {
            if (x > largest) {
                slargest = largest;
                largest = x;
            }
        }
        return slargest;
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};
        boolean found = false;
        for (String x:dictionary) {
            if (x == word) {
                found = true;
            }
        }
        // REPLACE WITH YOUR CODE HERE
        return found;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        System.out.println(reverse(new int[] {1,9,2,6})); // 6,2,9,1
        System.out.println(secondLargest(new int[] {1,9,6,2})); // 6
        System.out.println(spellCheck("and"));//true
        System.out.println(spellCheck("ands"));//false
    }
}
