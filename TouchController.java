import java.io.IOException;

public class TouchController {

    // home button
    public static void homeButton(double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("keyevent", sleepTime, 3);
    }

    // home button with iteration
    public static void homeButton(double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("keyevent", iteration, sleepTime, 3);
    }

    // back button
    public static void backButton(double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("keyevent", sleepTime, 4);
    }

    // back button with iteration
    public static void backButton(double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("keyevent", iteration, sleepTime, 4);
    }

    // enter button
    public static void enterButton(double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("keyevent", sleepTime, 66);
    }

    // enter button with iteration
    public static void enterButton(double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("keyevent", iteration, sleepTime, 66);
    }

    // turn screen on/off
    public static void onOff(double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("keyevent", sleepTime, 26);
    }

    // turn screen on/off with iteration
    public static void onOff(double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("keyevent", iteration, sleepTime, 26);
    }

    // write method
    public static void write(String text, double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("text", sleepTime, text);
    }

    // write method with iteration
    public static void write(String text, double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("text", iteration, sleepTime, text);
    }

    // click x, y coordinate
    public static void click(int x, int y, double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("tap", sleepTime, x, y);
    }

    // click x, y coordinate with iteration
    public static void click(int x, int y, double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("tap", iteration, sleepTime, x, y);
    }

    // hold x, y coordinate
    public static void hold(int x, int y, double interval, double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("swipe", sleepTime, x, y, x, y, (int) interval);
    }

    // hold x, y coordinate with iteration
    public static void hold(int x, int y, double interval, double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("swipe", iteration, sleepTime, x, y, x, y, (int) interval);
    }

    // swipe x, y to x2 y2
    public static void swipe(int x, int y, int x2, int y2, double interval, double sleepTime) throws IOException, InterruptedException {
        AdbUtils.executeCommand("swipe", sleepTime, x, y, x2, y2, (int) interval);
    }

    // swipe x, y to x2 y2 with iteration
    public static void swipe(int x, int y, int x2, int y2, double interval, double sleepTime, int iteration) throws IOException, InterruptedException {
        AdbUtils.executeCommandIteration("swipe", iteration, sleepTime, x, y, x2, y2, (int) interval);
    }
}
