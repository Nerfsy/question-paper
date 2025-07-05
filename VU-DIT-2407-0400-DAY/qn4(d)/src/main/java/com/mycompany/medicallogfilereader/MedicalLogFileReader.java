/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.medicallogfilereader;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MedicalLogFileReader {
    public static void main(String[] args) {
        // Specify the file path
        File medicalLogFile = new File("medical_log_file.txt");

        try {
            // Create a Scanner object to read the file
            Scanner logFileScanner = new Scanner(medicalLogFile);

            // Read and display the file content
            System.out.println("Medical Log File Content:");
            while (logFileScanner.hasNextLine()) {
                System.out.println(logFileScanner.nextLine());
            }

            // Close the Scanner object
            logFileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred - " + e.getMessage());
        }
    }
}
