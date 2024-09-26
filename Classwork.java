public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("apple", 1));
    System.out.println(delEnd("apple", 3));

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

  public static int compareLower(String )
}
