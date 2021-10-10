/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution, Exercise 41
 *  Copyright 2021 Mayank Goyal
 */

package ex41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameSorter {
    private static String inputFile = "src/main/resources/exercise41_input.txt";
    private static String outputFile = "src/main/resources/exercise41_output.txt";

    public static void main(String[] args) throws Exception {
        SortNames sorter = new SortNames();
        sorter.inputFile  = inputFile;
        sorter.outputFile = outputFile;

        List<String> names = new ArrayList<String>();
        names = sorter.readFromFile();
        Collections.sort(names);
        sorter.writeToFile(names);

        //sorter.sortNames();
    }
}
