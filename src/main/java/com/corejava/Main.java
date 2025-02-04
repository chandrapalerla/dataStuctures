package com.corejava;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
  /**
   * Iterate through each line of input.
   * I want to buy a onesie… :o) but know >;-( it won’t suit me :'{
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String fileName = "regularExp.txt";
    String line;
    String line2 = "I want to buy a onesie… :o) but know >;-( it won’t suit me :'{";
    Pattern pattern = Pattern.compile("[^>||:||;||8][$(||{]"); 
    java.util.regex.Matcher matcher = pattern.matcher(line2);
   // long matches = matcher.results().count();
    int matches=0;
    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

		long count = stream.map(s->s.trim()).filter(s -> !s.matches("[^>||:||;||8][$(||{]")).count();
		System.out.println(count);	
	} catch (IOException e) {
		e.printStackTrace();
	}
    Predicate<String> regex = Pattern
            .compile("[^>||:||;||8][$(||{||<||{||@]")
            .asPredicate();
    
    boolean count1 = Files.lines(new File(fileName).toPath()).map(s -> s.trim()).filter(s -> !s.matches("[^>||:||;||8][$(||{||<||{||@]")).allMatch(regex);
	System.out.println(count1);	
    while(matcher.find()) {
    	matches++;
    }
    System.out.println(matches);
   
    while ((line = in.readLine()) != null) {
      System.out.println(line);
   }
    
  }
}