package dictionary;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {

    private HashMap<String, String> keyToValue;
    private HashMap<String, String> valueToKey;
    private String file;

    public SaveableDictionary() {
        this.keyToValue = new HashMap<>();
        this.valueToKey = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String word, String translation) {
        this.keyToValue.putIfAbsent(word, translation);
        this.valueToKey.putIfAbsent(translation, word);
    }

    public String translate(String word) {
        // Check if the word is a key
        if (this.keyToValue.containsKey(word)) {
            return this.keyToValue.get(word);
        }

        // Check if the word is a value
        if (this.valueToKey.containsKey(word)) {
            return this.valueToKey.get(word);
        }

        // If the word is not found, return null
        return null;
    }

    public void delete(String word) {
        // Check if the word is a key
        if (this.keyToValue.containsKey(word)) {
            this.valueToKey.remove(this.keyToValue.get(word));
            this.keyToValue.remove(word);
        }

        // Check if the word is a value
        if (this.valueToKey.containsKey(word)) {
            this.keyToValue.remove(this.valueToKey.get(word));
            this.valueToKey.remove(word);

        }
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(new File(this.file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try (PrintWriter writer = new PrintWriter(new File(this.file))) {
            for (String key : this.keyToValue.keySet()) {
                String translation = this.keyToValue.get(key);
                // Write the word and translation in the format "word:translation"
                writer.println(key + ":" + translation);
            }
            return true;

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
