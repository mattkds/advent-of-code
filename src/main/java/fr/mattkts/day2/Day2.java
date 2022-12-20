package fr.mattkts.day2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day2 {

    /**
     * Method to retrieve each line as a String
     * @param inputPath
     * @return the list of lines in a file, each element of the list is the representation of the line as a String
     */
    public List<String> readFile(String inputPath) throws IOException {
        List<String> linesOfFile = new ArrayList<>();

        File file = new File(inputPath);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            linesOfFile.add(line);
            }

        return linesOfFile;
    }

    /**
     * Method to calculated the SquareOfFeet for each box needed for christmas
     * @param lines
     * @return
     */
    public Integer retrieveSquareOfFeetOfWrappingPaper(List<String> lines) {
        List<Integer> listOfSquareFeetByBox = lines.stream().map(line -> {
            int finalAreaBox = 0;

            String[] splitedLines = line.split("x");
            int length = Integer.parseInt(splitedLines[0]);
            int width = Integer.parseInt(splitedLines[1]);
            int height = Integer.parseInt(splitedLines[2]);

            System.out.println("l: " + length + " -- w: " + width + " -- h: " + height + "\n");

            Integer calculatedSurfaceBox = 2 * length * width + 2 * width * height + 2 * height * length;
            Integer extraPaperValue = Math.min(Math.min(length * width, width * height), height * length);

            finalAreaBox = calculatedSurfaceBox + extraPaperValue;
            return finalAreaBox;
        }).toList();

        return listOfSquareFeetByBox.stream().mapToInt(Integer::intValue).sum();
    }

    /**
     * Launch the day2 resolution
     * @throws IOException
     */
    public void launchDay2() throws IOException {
        Integer result = this.retrieveSquareOfFeetOfWrappingPaper(this.readFile("/Users/matthieukydts/Documents/projects/advent-of-code/src/main/input/input_day2"));
        System.out.println("SquareofFeet needed : " + result);
    }

}
