
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author jordan
 *Lab 3 - my code
 */
public class Whale_Den{
/**
 * Declaring Whale_den
 * @param args
 */
    public static void main(final String[] args) {
        long numberOfWords1;
        long timeAppears;
        String urlText;
        urlText = urlToString("http://erdani.com/tdpl/hamlet.txt");
        //urlText = oneline(urlText);
        urlText = urlText.replaceAll("\\s+", " ");
        numberOfWords1 = numberOfWords2(urlText);
        timeAppears = timesAppears(urlText, "Prince");
        //System.out.println(numberOfWords1);
        System.out.println(timeAppears);
        }

        //System.out.print(urlText);
        // TODO Auto-generated method stub
/**
 * Whale_den bruh.
 */
    public static long timesAppears(String search, String key) {
        long timesAppears1;
        timesAppears1 = 0;
        String [] word = search.split(" ");
        for (int i = 0; i < word.length; i++) {
         for(String words: word) {
             if ((words).toLowerCase().equals((key).toLowerCase())) {
                 timesAppears1++;
             }
         }

        }
          return timesAppears1;


    }
    public static long numberOfWords2(String s) {
        long numberOfWords;
        numberOfWords = 0;
        for (int i = 0; i < s.length(); i++) {
            //System.out.println(Character.toString(s.charAt(i)));
            if ((Character.toString(s.charAt(i))).equals(" ")) {
                numberOfWords++;

            }
        }
        return numberOfWords;
    }
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    public static String oneline(String multiline) {
        String[] lines = multiline.split(System.getProperty("line.separator"));
        StringBuilder builder = new StringBuilder();
        builder.ensureCapacity(multiline.length()); // prevent resizing
        for(String line : lines) builder.append(line);
        return builder.toString();
    }
}
