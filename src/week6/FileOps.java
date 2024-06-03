package week6;

import java.io.IOException; // Import IOException for handling file read exceptions
import java.nio.file.Files; // Import Files for reading file content
import java.nio.file.Paths; // Import Paths for handling file paths
import java.util.List; // Import List for storing lines from the file

public class FileOps {
    public static void main(String[] args) {
        String fileName = "week6/patikaFile.txt"; // Specify the file path
        try {
            int sum = calculateSumFromFile(fileName); // Call the method to calculate the sum from file content
            System.out.println("The sum is: " + sum); // Print the sum
        } catch (IOException e) {
            e.printStackTrace(); // Print stack trace if an IOException occurs
        }
    }

    /**
     * This method reads the contents of the specified file,
     * parses each line into an integer, and returns the sum of these integers.
     *
     * @param fileName the name of the file to read
     * @return the sum of the integers in the file
     * @throws IOException if an I/O error occurs reading from the file
     */
    public static int calculateSumFromFile(String fileName) throws IOException {
        int sum = 0; // Initialize sum to 0

        // Read all lines from the specified file and store them in a list
        List<String> lines = Files.readAllLines(Paths.get(fileName));

        // Create an array to store the parsed integers, with the same size as the list of lines
        int[] numbers = new int[lines.size()];

        // Iterate over the list of lines
        for (int i = 0; i < lines.size(); i++) {
            // Parse each line as an integer and store it in the numbers array
            numbers[i] = Integer.parseInt(lines.get(i));
        }

        // Iterate over the numbers array to calculate the sum
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j]; // Add each number to the sum
        }

        return sum; // Return the calculated sum
    }
}
