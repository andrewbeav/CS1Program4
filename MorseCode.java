// =========================================================================
// CS 1113 Program 4 : Morse Code
// Semester : Fall 2016
//
// Andrew Bevelhymer
// 61049
//
// Description: Encodes or decodes morse code
// =========================================================================

// Import Scanner class
import java.util.Scanner;

public class MorseCode
{
  // Creating Scanner object
  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args)
  {
    // Printing info about program
    System.out.println("Morse code program by Andrew Bevelhymer");

    // if no argument, print usage statement
    if (args.length < 1)
    {
      usage();
    }
    else
    {
      // run encode method if -e is used as the argument
      if (args[0].equals("-e"))
      {
        encode();
      }

      // run decode method if -d is the argument
      else if (args[0].equals("-d"))
      {
        decode();
      }

      // if anything else is used as an argument, print the usage statement
      else
      {
        usage();
      }
    }
  }

  // Prints out a usage statement
  public static void usage()
  {
    System.out.println("usage: java MorseCode [-e, -d] < input file > output file");
  }

  // Encodes (English to Morse)
  public static void encode()
  {
    // Creating line
    String line = scan.nextLine();

    // Creating array of strings using a space as the delimiter
    String[] character = line.split("");

    // Creating array of english characters
    String[] english = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
              "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
              "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
              "9", "0"};

    // Creating array of morse characters
    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
              "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
              "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
              "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
              "-....", "--...", "---..", "----.", "-----"};

    // Loop through array
    for (int i = 0; i < character.length; i++)
    {
      // getting letter
      String letter = character[i];
      letter = letter.toLowerCase();

      // Searching through english array to see if letter matches any of them
      for (int j = 0; j < english.length; j++)
      {
        // if the index equals the letter print its morse equivalent
        if (letter == english[j])
        {
          System.out.print(morse[j] + " ");
          break;
        }
        else
        {
          continue;
        }
      }
    }
    // Print blank line
    System.out.println();
  }

  // Decodes (Morse to English)
  public static void decode()
  {
    // Getting Line
    String line = scan.nextLine();

    // Creating string array splitting line using space as a delimiter
    String[] wordArr = line.split("  ");

    // Using nested loop to go through each letter in each word
    for(int i = 0; i < wordArr.length; i++)
    {

      // Getting word
      String word = wordArr[i];

      // Getting each character from word and storing it in an array
      String[] character = word.split(" ");

      // Printing space after every word (not before first word though)
      if (i > 0) System.out.print(" ");

      // Loop through character array
      for(int j = 0; j < character.length; j++)
      {
        // Defining letter variable
        String letter = character[j];

        // Using switch statemtent with letter as the condition
        switch(letter)
        {
          case ".-":
            System.out.print("a");
            break;
          case "-...":
            System.out.print("b");
            break;
          case "-.-.":
            System.out.print("c");
            break;
          case "-..":
            System.out.print("d");
            break;
          case ".":
            System.out.print("e");
            break;
          case "..-.":
            System.out.print("f");
            break;
          case "--.":
            System.out.print("g");
            break;
          case "....":
            System.out.print("h");
            break;
          case "..":
            System.out.print("i");
            break;
          case ".---":
            System.out.print("j");
            break;
          case "-.-":
            System.out.print("k");
            break;
          case ".-..":
            System.out.print("l");
            break;
          case "--":
            System.out.print("m");
            break;
          case "-.":
            System.out.print("n");
            break;
          case "---":
            System.out.print("o");
            break;
          case ".--.":
            System.out.print("p");
            break;
          case "--.-":
            System.out.print("q");
            break;
          case ".-.":
            System.out.print("r");
            break;
          case "...":
            System.out.print("s");
            break;
          case "-":
            System.out.print("t");
            break;
          case "..-":
            System.out.print("u");
            break;
          case "...-":
            System.out.print("v");
            break;
          case ".--":
            System.out.print("w");
            break;
          case "-..-":
            System.out.print("x");
            break;
          case "-.--":
            System.out.print("y");
            break;
          case "--..":
            System.out.print("z");
            break;
          case ".----":
            System.out.print("1");
            break;
          case "..---":
            System.out.print("2");
            break;
          case "...--":
            System.out.print("3");
            break;
          case "....-":
            System.out.print("4");
            break;
          case ".....":
            System.out.print("5");
            break;
          case "-....":
            System.out.print("6");
            break;
          case "--...":
            System.out.print("7");
            break;
          case "---..":
            System.out.print("8");
            break;
          case "----.":
            System.out.print("9");
            break;
          case "-----":
            System.out.print("0");
            break;
          case " ":
            System.out.print(" ");
            break;
        }
      }
    }
    // Print blank line
    System.out.println();
  }
}
