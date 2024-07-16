// This code automatically clicks the help button in the Age of Empires Mobile game.
// Screen size 1080x2400

import java.io.IOException;

public class ExamplesAoemMarket {

    public static void buyItem() throws InterruptedException{
        try {
			TouchController.click(1396, 770, 1.6);
            TouchController.click(1193, 920, 0.5, 5);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
    public static void selectItem(int x, int y) throws InterruptedException{
        try {
			TouchController.click(x, y, 1);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
    public static void swipeMarket() throws InterruptedException{
        try {
			TouchController.swipe(1620, 820, 1620, 320, 1, 1);
            TouchController.swipe(1620, 820, 1620, 320, 1, 1.5);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
    public static void buyAllItem() throws InterruptedException{
        int[] columns = {375, 700};
        int[] rows = {1600, 1840, 2080};
        for (int column : columns) {
            for (int row : rows) {
                selectItem(row, column);
                buyItem();
            }
        }
        
        swipeMarket();
        
        for (int column : columns) {
            for (int row : rows) {
                selectItem(row, column);
                buyItem();
            }
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        buyAllItem();
        TouchController.click(2200, 140, 2); // refresh market
        buyAllItem();
    }
}