

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        read();
    }

    static String read() {
        String c = null;
        String textsuivant = "";
        String regex = "";
        ArrayList<String> occ = new ArrayList<>();
        try {
            //Path path = Paths.get("C:\Users\hp\Desktop\work place\2.6\src\\texte1.txt");
            Path path = Paths.get("C:\\Users\\hp\\Desktop\\work place\\2.6\\src\\texte1.txt");
            Scanner source = new Scanner(path);
            String[] compteurmot = new String[0];
            FileWriter myWriter;
            while (source.hasNextLine()) {
                try {
                    Pattern pattern = Pattern.compile(".*[eéèênEN].*");
                    myWriter = new FileWriter("regex.txt");
                    for (int i = 0; i < compteurmot.length; i++) {
                        Matcher matcher = pattern.matcher(compteurmot[i]);
                        if (matcher.matches()) {
                            regex += compteurmot[i] + " ";
                        }
                    }
                    myWriter.write(regex);
                    myWriter.close();
                    c = source.nextLine();
                    if (!c.equalsIgnoreCase("")) {
                        String replaceAll = c.replaceAll("\\s+", " ").replaceAll("\\p{Punct}", "");
                        compteurmot = replaceAll.split(" ");
                        for (int i = 0; i < compteurmot.length; i++) {
                            occ.add(compteurmot[i]);
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                for (int i = 0; i < compteurmot.length; i += 2) {
                    textsuivant += compteurmot[i] + " ";
                }
            }
            myWriter = new FileWriter("newText.txt");
            myWriter.write(textsuivant);
            myWriter.close();
            occurence(occ);
            capitalize(occ);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return c;
    }

    public static void occurence(ArrayList<String> tab) {
        try {
            Map<String, Integer> map = new HashMap<>();
            BufferedWriter outputWriter = new BufferedWriter(new FileWriter("occurences.txt"));
            for (String word : tab) {
                Integer count = map.get(word.toLowerCase());
                if (count == null) {
                    map.put(word.toLowerCase(), 1);

                } else {
                    map.put(word.toLowerCase(), ++count);
                }
            }
            Stream<Map.Entry<String, Integer>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
            sorted.forEach(element -> {
                try {
                    System.out.println(element);
                    outputWriter.write(String.valueOf(element.getKey()));
                    if (element.getKey().length() > 5)
                        outputWriter.write("\t" + "\t" + element.getValue());
                    else outputWriter.write("\t" + "\t" + "\t" + element.getValue());
                    outputWriter.newLine();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });
            File file = new File("C:\\Users\\hp\\Desktop\\work place\\2.6\\occurences.txt");
            outputWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void capitalize(ArrayList<String> tab) {
        try {
            BufferedWriter outputWriter = new BufferedWriter(new FileWriter("pluriels.txt"));
            for (String word : tab) {
                if (word.endsWith("s") && !word.equalsIgnoreCase("dans")) {
                    outputWriter.write(word.substring(0, 1).toUpperCase() + word.substring(1) +" ");
                }
            }
            outputWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}