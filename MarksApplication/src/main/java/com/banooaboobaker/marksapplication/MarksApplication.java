/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.banooaboobaker.marksapplication;

/**
 *
 * @author Aboobaker
 */

// MarksApplication Class
public class MarksApplication {
    // Decalre variables
    private String courseName;
    private int[][] marks;

    // MarksApplication Constructor
    public MarksApplication(String courseName, int[][] marks) {
        // Initialize variables
        this.courseName = courseName;
        this.marks = marks;
    }

    // Get method for courseName
    public String getCourseName() {
        return courseName;
    }

    // Set method for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // Get method for marks
    public int[][] getMarks() {
        return marks;
    }

    // Set method for marks
    public void setMarks(int[][] marks) {
        this.marks = marks;
    }

    // Display marksReport method 
    public void marksReport() {
        System.out.println("Welcome to CTU Marks for\n" + courseName + "\n");
        System.out.println("The marks are:\n");

        // use of format printer 'printf'
        System.out.printf("%-10s", "");
        System.out.printf("%15s", "Formative 1");
        System.out.printf("%15s", "Formative 2");
        System.out.printf("%15s", "Formative 3");
        System.out.printf("%12s", "Average");
        System.out.println();

        // display all the marks with the format printer 'printf'
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10s", String.format("Student %2d", (i + 1)));
            System.out.printf("%15s", String.valueOf(marks[i][0]));
            System.out.printf("%15s", String.valueOf(marks[i][1]));
            System.out.printf("%15s", String.valueOf(marks[i][2]));
            System.out.printf("%11.2f", calculateAverage(marks[i]));
            System.out.println();
        }
        System.out.println();

        System.out.println("Lowest mark in the mark application is " + lowestMark());
        System.out.println("Highest mark in the mark application is " + highestMark());
        
        System.out.println("\nMark distribution:");
        markDistribution(); // Call the markDistribution method
    }

    // calculateAverage method
    private double calculateAverage(int[] studentMarks) {
        int sum = 0;
        for (int mark : studentMarks) {
            sum += mark;
        }
        return (double) sum / studentMarks.length;
    }

    // lowestMark method
    private int lowestMark() {
        int lowestMark = marks[0][0];
        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                if (mark < lowestMark) {
                    lowestMark = mark;
                }
            }
        }
        return lowestMark;
    }

    // highestMark method
    private int highestMark() {
        int highestMark = marks[0][0];
        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                if (mark > highestMark) {
                    highestMark = mark;
                }
            }
        }
        return highestMark;
    }

    // markDistribution method (bar graph)
    private void markDistribution() {
        int[] distribution = new int[11];
        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                distribution[mark / 10]++;
            }
        }

        // Display the numbers from 0 to 100 by increments of 10
        for (int i = 0; i < distribution.length; i++) {
            int lowerBound = i * 10;
            int upperBound = (i * 10) + 9;
            if (upperBound > 99) {
                upperBound = 100;
            }
            String rangeLabel = (lowerBound == 100) ? String.format("%5d", lowerBound) : String.format("%-1d-%-2d", lowerBound, upperBound);
            System.out.printf("%-5s: ", rangeLabel);
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("[*]");
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args) {
        // Two-dimentional array storing the student marks
        int[][] studentMarks = {
            {87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 25, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 40},
            {87, 93, 73}
        };

        // initialize the marksApplication
        MarksApplication marksApp = new MarksApplication("Beginner Java [JD521]", studentMarks);
        // call the marksReport method
        marksApp.marksReport();
    }
}
