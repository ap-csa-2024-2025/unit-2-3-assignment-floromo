public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("apple", 1));
    System.out.println(delEnd("apple", 3));
    System.out.println(compareLower("BAgels", "candLes"));
    System.out.println(lengthFirst("Everything in its right place"));

  }

  public static String firstLastN(String word, int n){
    String end = word.substring(word.length() - n, word.length());
    String begin = word.substring(0, n);
    return begin.concat(end);
  }

  public static String delEnd(String word, int n){
    String newWord = word.substring(0, word.length() - n);
    return newWord;
  }

  public static int compareLower(String word1, String word2){
    word1 = word1.toLowerCase();
    word2 = word2.toLowerCase();
    return word1.compareTo(word2);
  }

  public static int lengthFirst(String sentence){
    int n = sentence.indexOf(" ");
    String first = sentence.substring(0, n);
    return first.length();
  }
}
