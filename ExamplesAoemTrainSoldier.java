// This code trains 300 soldiers from each barracks in Age of Empires Mobile.
// Screen size 1080x2400

import java.io.IOException;

public class ExamplesAoemTrainSoldier {
    public static void trainSoldier() throws InterruptedException{
        try {
			for (int i = 0; i < 4; i++) {
                TouchController.click(2191, 657, 1);
                TouchController.click(1930, 602, 0.4);
                TouchController.click(1797, 685, 0.4);
                TouchController.click(1900, 732, 0.3);
                TouchController.click(1942, 984, 0.7);
                TouchController.click(1100, 960, 1.2);
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
