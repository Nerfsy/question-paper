/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ugandawordcounter;

/**
 *
 * @author ubcarchives
 */
import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the librarian for input
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();

        // Normalize to lowercase for case-insensitive matching
        String lowerDesc = description.toLowerCase();

        // Split into words
        String[] words = lowerDesc.split("\\W+"); // Splits on non-word characters

        int count = 0;

        // Count occurrences of "uganda"
        for (String word : words) {
            if (word.equals("uganda")) {
                count++;
            }
        }

        // Output the result
        System.out.println("The word 'Uganda' appears " + count + " time(s) in the description.");

        scanner.close();
    }
}
