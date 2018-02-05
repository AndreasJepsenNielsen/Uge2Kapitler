import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Læse {
   static LinkedList<String> jesper = new LinkedList();
int[] as;
    public static void main(String[] args) throws FileNotFoundException {
        jesper.add(0, "2");
        jesper.add("1");
        jesper.add("2");
        jesper.add("2");
        jesper.add("2");
        jesper.add("2");
        jesper.add("2");
        jesper.add("3");

    

        Collections.reverse(jesper);
        // iterator kan bruges hvis du vil fjerne mange elementer hurtigt, da en linked list.
        // skal gå tilbage til starten hver gang den har fjernet noget, dog med en iterator.
        // husker den pladsen. som det står i bogen en liste med 1 million elementer ville
        // tage flere minutter at køre igennem, med en iterator tager det en 10ende del af et sekund.

        Iterator<String> itr = jesper.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            if (element.length() % 2 == 0) {
                itr.remove();
            }
        }


        System.out.println(jesper.toString());

        List<Integer> primes = new LinkedList<Integer>();
        List<Integer> numbers = new LinkedList<Integer>();


        // Kode kan bruges til at finde unikke ord i en tekst meget handy
        // Hashset er hurtigere til at gå igennem objekterne, men placerer dem ikke i rigtig
        // reækkefølge dertil kan man dog bruge en linkedHashset som placerer dem rigtigt.
        //
        Set<String> words = new HashSet<String>();
        Scanner in = new Scanner(new File("mobydick.txt"));
        while (in.hasNext()) {
            String word = in.next();
            word = word.toLowerCase();
            words.add(word);
        }
        System.out.println("Unique Words = " + words.size());
// printer alle ord der starter med a i moby dick
        Set<String> words1 = new TreeSet<String>();
        Scanner in1 = new Scanner(new File("mobydick.txt"));
        while (in1.hasNext()) {
            String word = in1.next();
            word = word.toLowerCase();
            if (word.startsWith("a") && word.length() == 3) {
                words1.add(word);
            }
        }

        //System.out.println("Three-letter 'a' words = " + words1);
        // nedenstående hashmap associerer personens navn med personens løn.
        // udskriver kaspers løn
        Map<String, Double> salaryMap = new HashMap<String, Double>();

        salaryMap.put("Andreas Nielsen",2600.0);
        salaryMap.put("Kasper Lovin", 12000.0);

        double kaspLøn = salaryMap.get("Kasper Lovin");

        //System.out.printf("Kaspers salary is dkk %.2f\n", kaspLøn);

        // hvis personen findes bliver salary udskrevet, hvis ikke fortæller den at personen ikke findes
       // Scanner console = new Scanner(System.in);
      //  System.out.print("Type a person's name: ");
       // String name = console.nextLine();
// search the map for the given name
      /*  if (salaryMap.containsKey(name)) {
            double salary = salaryMap.get(name);
            System.out.printf("%s's salary is DKK%.2f\n", name, salary);
        } else {
            System.out.println("I don't have a record for " + name);
        } */
       // System.out.println(salaryMap.toString());

       Map<String, Integer> wordCountMap = new TreeMap<String,Integer>();
       while(in.hasNext()){
           String word = in.next().toLowerCase();
           if(wordCountMap.containsKey(word)){
               int count = wordCountMap.get(word);
               wordCountMap.put(word,count + 1);
           }else {
               wordCountMap.put(word,1);
           }
       }
       for (String word : wordCountMap.keySet()) {
           int count = wordCountMap.get(word);
           if(count > 2000) {
               System.out.println(word + " occurs " + count + " times.");
           }
       }


    }

// nedenstående kode kan modtage både arraylist og linkedlist
    // dette kan den fordi det den modtager er en List og ikke en "ArrayList eller LInkedList"
    public static String longest(List<String> list) {
        Iterator<String> i = list.iterator();
        String result = i.next();
        while (i.hasNext()) {
            String next = i.next();
            if (next.length() > result.length()) {
                result = next;
            }
        }
        return result;
    }

    public static void removeEvenLength(LinkedList<String> jesper){
        int i = 0;
        while(i < jesper.size()){
            String element = jesper.get(i);
            if(element.length() % 2 == 0){
                jesper.remove(i);
            }else{
                i++;
            }
        }
    }
}
