// This code automatically clicks the help button in the Age of Empires Mobile game.
// Screen size 1080x2400

import java.io.IOException;

public class ExamplesAoemClickHelp {
    public static void clickHelp(int iteration) throws InterruptedException{
        try {
			TouchController.click(1840, 950, 3, iteration);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}