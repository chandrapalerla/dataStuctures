package com.testing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxVowelWordsJava8 {

    public static List<String> findWordsWithMaxVowels(String str) {
        String[] words = str.toLowerCase().split("\\s+");

        // Calculate vowel counts for each word using streams
        int[] vowelCounts = Arrays.stream(words)
                .mapToInt(word -> (int) word.chars().filter(c -> "aeiou".indexOf(c) != -1).count())
                .toArray();

        // Find the maximum vowel count
        int maxVowelCount = Arrays.stream(vowelCounts).max().orElse(0); // Handle empty string case

        // Filter words with the maximum vowel count
        List<String> result = Arrays.stream(words)
                .filter(word -> (int) word.chars().filter(c -> "aeiou".indexOf(c) != -1).count() == maxVowelCount)
                .collect(Collectors.toList());

        return result;
    }

    public static void main(String[] args) {
        String str = "The quick brown fox jumps right over the little lazy dog.";
        List<String> words = findWordsWithMaxVowels(str);

        int maxVowels = 0;
        if (!words.isEmpty()) { // Check if the list is not empty
            maxVowels = (int) words.get(0).chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        }

        System.out.println("Maximum Number of Vowels: " + maxVowels);
        System.out.print("Output Words: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i));
            if (i < words.size() - 1)
                System.out.print(", ");
        }
        System.out.println();

    }
}