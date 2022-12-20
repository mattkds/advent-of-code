package fr.mattkts;

import fr.mattkts.day1.Day1;
import fr.mattkts.day2.Day2;

import java.io.IOException;

public class Aoc2015Launcher {

    public static void main(String[] args){
        System.out.println("AOC - 2015 EDITION");
        Day1 day1 = new Day1();
        Day2 day2 = new Day2();
        try{
            day1.getFloorInstruction();
            day2.launchDay2();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
