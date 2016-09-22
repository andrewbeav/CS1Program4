// =========================================================================
// CS 1113 Program 4 : Morse Code
// Semester : Fall 2016
//
// Andrew Bevelhymer
// 61049
//
// Description: Encodes or decoded morse code
// =========================================================================

import java.util.*;

public class MorseCode
{
  public static Scanner scan = new Scanner(System.in);

  public static void main(String[] args)
  {
    System.out.println("Morse code program by Andrew Bevelhymer");
    if (args.length < 1)
    {
      usage();
    }
    if (args[0].equals("-e"))
    {
      encode();
    }
    else if (args[0].equals("-d"))
    {
      decode();
    }
    else
    {
      usage();
    }
  }

  public static void usage()
  {
    System.out.println("usage: java MorseCode [-e, -d] < input file > output file");
  }

  public static void encode()
  {
    String line = scan.nextLine();
    String[] character = line.split("");
    for(int i = 0; i < character.length; i++)
    {
      String letter = character[i];
      letter = letter.toLowerCase();

      switch(letter)
      {
        case "a":
          System.out.print(".- ");
          break;
        case "b":
          System.out.print("-... ");
          break;
        case "c":
          System.out.print("-.-. ");
          break;
        case "d":
          System.out.print("-.. ");
          break;
        case "e":
          System.out.print(". ");
          break;
        case "f":
          System.out.print("..-. ");
          break;
        case "g":
          System.out.print("--. ");
          break;
        case "h":
          System.out.print(".... ");
          break;
        case "i":
          System.out.print(".. ");
          break;
        case "j":
          System.out.print(".--- ");
          break;
        case "k":
          System.out.print("-.- ");
          break;
        case "l":
          System.out.print(".-.. ");
          break;
        case "m":
          System.out.print("-- ");
          break;
        case "n":
          System.out.print("-. ");
          break;
        case "o":
          System.out.print("--- ");
          break;
        case "p":
          System.out.print(".--. ");
          break;
        case "q":
          System.out.print("--.- ");
          break;
        case "r":
          System.out.print(".-. ");
          break;
        case "s":
          System.out.print("... ");
          break;
        case "t":
          System.out.print("- ");
          break;
        case "u":
          System.out.print("..- ");
          break;
        case "v":
          System.out.print("...- ");
          break;
        case "w":
          System.out.print(".-- ");
          break;
        case "x":
          System.out.print("-..- ");
          break;
        case "y":
          System.out.print(".-- ");
          break;
        case "z":
          System.out.print("--.. ");
          break;
        case "1":
          System.out.print(".---- ");
          break;
        case "2":
          System.out.print("..--- ");
          break;
        case "3":
          System.out.print("...-- ");
          break;
        case "4":
          System.out.print("....- ");
          break;
        case "5":
          System.out.print("..... ");
          break;
        case "6":
          System.out.print("-.... ");
          break;
        case "7":
          System.out.print("--... ");
          break;
        case "8":
          System.out.print("---.. ");
          break;
        case "9":
          System.out.print("----. ");
          break;
        case "0":
          System.out.print("----- ");
          break;
        case " ":
          System.out.print(" ");
          break;
      }
    }
  }

  public static void decode()
  {
    String line = scan.nextLine();
    String[] character = line.split(" ");
    for(int i = 0; i < character.length; i++)
    {
      String letter = character[i];
      letter = letter.toLowerCase();
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
}
