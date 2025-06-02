import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RandomSentenceGenerator {
    public static void main(String[] args) {
        // Define arrays for articles, nouns, verbs, and prepositions
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};
        
        Random random = new Random();
        
        // Generate and display 20 sentences
        for (int i = 0; i < 20; i++) {
            String article1 = articles[random.nextInt(articles.length)];
            String noun1 = nouns[random.nextInt(nouns.length)];
            String verb = verbs[random.nextInt(verbs.length)];
            String preposition = prepositions[random.nextInt(prepositions.length)];
            String article2 = articles[random.nextInt(articles.length)];
            String noun2 = nouns[random.nextInt(nouns.length)];
            
            // Construct sentence: capitalize first letter, add period
            String sentence = article1 + " " + noun1 + " " + verb + " " + 
                            preposition + " " + article2 + " " + noun2;
            sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1) + ".";
            
            // print
            System.out.println(sentence);
        }
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MM-dd-yyyy , (HH:mm:ss a)");
        String Date_and_time = now.format(formatter);
       
        System.out.println("\n\n>> Thank you for using Eric's Random Sentence Generator");
        System.out.print("Time of Calculation is: " + Date_and_time+"\n");
        System.exit(0);
    }
}