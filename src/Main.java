import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer, String>();

        int number = 0;
        int numberUpdate = 0;
        String wordNumberUpdate = "";


        map.put( 1, "one");
        map.put( 2, "two");
        map.put( 3, "three");
        map.put( 4, "four");
        map.put( 5, "five");
        map.put( 6, "six");
        map.put( 7, "seven");
        map.put( 8, "eight");
        map.put( 9, "nine");
        map.put( 10, "ten");
        map.put( 11, "eleven");


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number between 1-11: ");
        number = input.nextInt();

        if (!map.containsKey(number)){
            System.out.println("The number is not in our system. To update, please enter the number: ");
            numberUpdate = input.nextInt();
            System.out.println();
            System.out.println("Please enter the corresponding word for the number: ");
            wordNumberUpdate = input.next();
            map.put( numberUpdate, wordNumberUpdate);

            System.out.println("You entered the number " + numberUpdate + " " +  map.get(numberUpdate));

        }

        else

            System.out.println("You entered " + map.get(number));
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println();


        HashMap<Integer,String> map2 = new HashMap<Integer, String>();

        int number2 = 0;
        String wordNumber2 = "";

        File file = new File("C:/Users/GBTC440009ur/IdeaProjects/UsingHashMaps/src/numbersFile.txt");

        System.out.println();
        System.out.println();
        System.out.println();



        try {
            Scanner input2 = new Scanner(file);

            while (input2.hasNextLine()) {

//                if (!input2.hasNextLine()){
//                    break;
//                }

                number2 = input2.nextInt();

                wordNumber2 = input2.next();

                map2.put(number2, wordNumber2);
                System.out.println("The number " + number2 + " corresponds to the word " + wordNumber2);


            }
            input2.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }

        int number3 = 0;

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Please enter a number between 1-11: ");
        number3 = input.nextInt();
        System.out.println();
        System.out.println();
        System.out.println("You entered " + map2.get(number3));


//        for (int i = 1; i <= 11; i++) {
//            System.out.println( map2.keySet(i)  + " " + map2.get(i));
//
//        }



    }
}
