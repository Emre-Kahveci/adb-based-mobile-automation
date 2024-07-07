import java.awt.Color;
import java.io.IOException;

public class ExamplesAoemBarbarianEvent {

    private static final Color MY_WHITE = new Color(239, 227, 214);
    private static final Color MY_GRAY = new Color(181, 182, 181);
    private static final int CHECK_COORDINATE_X = 1828;
    private static final int CHECK_COORDINATE_Y = 1012;

    public static boolean startBarbarianEvent() throws InterruptedException {
        try {
            if (checkEvent()) {
                startEvent();
                return checkEventSuccessfullyStarted();
            }
        } catch (IOException e) {
            System.err.println("An error occurred while starting the barbarian event: " + e.getMessage());
        }
        return false;
    }

    private static boolean checkEvent() throws IOException, InterruptedException {
        Color coordinateColor = ScreenController.getColorAtCoordinate(CHECK_COORDINATE_X, CHECK_COORDINATE_Y);
        return coordinateColor.equals(MY_WHITE) || coordinateColor.equals(MY_GRAY);
    }

    private static void startEvent() throws InterruptedException, IOException {
        TouchController.click(210, 30, 1.6);
        TouchController.click(2161, 110, 1.4);
        TouchController.click(284, 566, 1.6);
        TouchController.click(2006, 950, 2.5);
        TouchController.click(1594, 372, 1.5);
        TouchController.click(1845, 955, 2.2);
        TouchController.click(1845, 955, 1.8);
        TouchController.click(1882, 931, 1);
        TouchController.click(1476, 1018, 1.5);
    }

    private static boolean checkEventSuccessfullyStarted() throws IOException, InterruptedException {
        Color coordinateColorNew = ScreenController.getColorAtCoordinate(CHECK_COORDINATE_X, CHECK_COORDINATE_Y);
        return coordinateColorNew.getRed() < 80 && coordinateColorNew.getBlue() > 180;
    }
}
