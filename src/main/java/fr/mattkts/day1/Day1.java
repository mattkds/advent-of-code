package fr.mattkts.day1;

import java.io.*;
import java.util.concurrent.atomic.AtomicReference;

public class Day1 {

    /**
     * For this exerice :
     * An opening parenthesis, (, means he should go up one floor
     * A closing parenthesis, ), means he should go down one floor
     */

    public Integer getFloorInstruction() throws IOException {
        AtomicReference<Integer> floor = new AtomicReference<>(0);

        char goUp = '(';
        char goDown = ')';

        String fileName = "/Users/matthieukydts/Documents/projects/advent-of-code/src/main/input/input_day1";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            //process the line
            line.chars().mapToObj(i -> (char)i).forEach(i-> {
                if(i.equals(goDown)) {
                    floor.set(floor.get() - 1);
                } else if (i.equals(goUp)) {
                    floor.set(floor.get() + 1);
                }
            });
        }
        System.out.println(floor);
        return floor.get();
    }

}
