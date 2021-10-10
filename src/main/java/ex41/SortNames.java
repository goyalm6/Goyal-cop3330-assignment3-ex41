/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution, Exercise 41
 *  Copyright 2021 Mayank Goyal
 */

package ex41;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.IOException;


public class SortNames {
    public String inputFile;
    public String outputFile;

    public SortNames() {}

    /*public void sortNames()
    {
        List<String> lineList = new ArrayList<String>();
        lineList = readFromFile();
        Collections.sort(lineList);
        writeToFile(lineList);
    }*/

    public List<String> readFromFile() {
        List<String> lineList = new ArrayList<String>();

        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String inputLine;

            while ((inputLine = bufferedReader.readLine()) != null) {
                lineList.add(inputLine);
            }

            fileReader.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        return lineList;
    }

    public void writeToFile(List<String> lineList) {
        try {
            FileWriter fileWriter = new FileWriter(outputFile);
            PrintWriter out = new PrintWriter(fileWriter);
            out.println("Total of " + lineList.size() + " names");
            out.println("-----------------");

            for (String outputLine : lineList) {
                out.println(outputLine);
            }
            out.flush();
            out.close();
            fileWriter.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }

}
