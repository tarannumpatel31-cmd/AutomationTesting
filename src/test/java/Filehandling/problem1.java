package Filehandling;

import java.io.File;
import java.io.IOException;

public class problem1 {

	public static void main(String[] args) throws IOException {
		// Step 1: Define file path using project directory (Best Practice)
        String filePath = System.getProperty("user.dir")
                + "/src/test/resources/TestData.txt";

        // Step 2: Create File object
        File file = new File(filePath);

        // Step 3: Check whether file already exists
        if (file.exists()) {
            System.out.println("File already exists");
        } else {
            // Step 4: Create new file
            file.createNewFile();
            System.out.println("File created successfully");
        }
    }

	}


