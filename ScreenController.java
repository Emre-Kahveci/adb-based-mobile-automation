import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;

public class ScreenController {

    // Method to take a screenshot and save it as a PNG file
    private static void takeScreenshot(File screenshotFile) throws IOException, InterruptedException {
        List<String> command = new ArrayList<>(Arrays.asList("adb", "exec-out", "screencap", "-p"));
        AdbUtils.runCommand(command, 0, screenshotFile);
    }

    // Method to get the color at a specific coordinate
    public static Color getColorAtCoordinate(int x, int y) throws IOException, InterruptedException {
        File targetFile = new File(System.getProperty("user.home") + "\\AppData\\Local\\Temp", "screenshot.png");
        takeScreenshot(targetFile);

        if (!targetFile.exists()) {
            throw new IOException("Screenshot file was not created.");
        }

        BufferedImage image = ImageIO.read(targetFile);
        int rgb = image.getRGB(x, y);
        Color color = new Color(rgb);

        System.out.println("RGB at (" + x + ", " + y + "): " +
                "R=" + color.getRed() + ", " +
                "G=" + color.getGreen() + ", " +
                "B=" + color.getBlue());

        return new Color(rgb);
    }

    // brightness up
    public static void brightnessUp(double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("keyevent", sleepTime, 221);
    }

    // brightness up with iteration
    public static void brightnessUp(double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("keyevent", iteration, sleepTime, 221);
    }

    // brightness down
    public static void brightnessDown(double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("keyevent", sleepTime, 220);
    }

    // brightness down with iteration
    public static void brightnessDown(double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("keyevent", iteration, sleepTime, 220);
    }
}
