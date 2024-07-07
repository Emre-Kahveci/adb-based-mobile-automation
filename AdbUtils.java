import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdbUtils {

    // Helper method to execute adb commands with sleep time
    public static void executeCommand(String action, double sleepTime, Object... args) throws IOException, InterruptedException {
        List<String> command = createAdbCommand(action, args);
        runCommand(command, sleepTime * 1000, null);
    }

    // Helper method to execute adb commands with sleep time
    public static void executeCommandIteration(String action, int iteration, double sleepTime, Object... args) throws IOException, InterruptedException {
        List<String> command = createAdbCommand(action, args);
        for (int i = 0; i < iteration; i++) {
            runCommand(command, sleepTime * 1000, null);
        }
    }

    // Helper method to run adb commands
    public static void runCommand(List<String> command, double sleepTime, File redirectOutput) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder(command);
        if (redirectOutput != null) {
            pb.redirectOutput(redirectOutput);
        }
        Process process = pb.start();

        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new IOException("Error executing adb command. Exit code: " + exitCode);
        }

        try {
            process.getInputStream().close();
            process.getErrorStream().close();
            process.getOutputStream().close();
        } finally {
            Thread.sleep((long) sleepTime);
        }
    }

    // Helper method to create adb commands
    public static List<String> createAdbCommand(String action, Object... args) {
        List<String> command = new ArrayList<>(Arrays.asList("adb", "shell", "input"));
        command.add(action);

        for (Object arg : args) {
            if (arg instanceof Integer) {
                command.add(String.valueOf(arg));
            } else if (arg instanceof String string) {
                command.add(string);
            } else if (arg instanceof Double) {
                // Do nothing, this is sleep time
            } else {
                throw new IllegalArgumentException("Unsupported argument type:");
            }
        }
        return command;
    }
}
