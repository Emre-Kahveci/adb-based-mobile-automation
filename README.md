# ADB-Based Mobile Automation

A lightweight Java library for Android device automation using ADB (Android Debug Bridge). This framework enables programmatic control of Android devices for tasks like touch events, screen analysis, and automated workflows.

## ✨ Features

- 📱 **Touch Control** - Tap, swipe, hold, and gesture simulation
- 🖥️ **Screen Analysis** - Screenshot capture and pixel color detection
- ⌨️ **Input Simulation** - Text input and hardware key events
- 🎮 **Device Control** - Screen brightness, power button, navigation buttons
- 🔄 **Iteration Support** - Repeat actions with configurable delays

## 📋 Prerequisites

- **Java 17+**
- **Android SDK** with ADB installed and added to PATH
- **Android device** with USB Debugging enabled

## 🛠️ Core Components

### AdbUtils
Low-level utility class for executing ADB shell commands with configurable sleep times and iteration support.

### TouchController
High-level touch interaction methods:
```java
TouchController.click(x, y, sleepTime);           // Tap at coordinates
TouchController.swipe(x1, y1, x2, y2, duration, sleepTime); // Swipe gesture
TouchController.hold(x, y, duration, sleepTime);  // Long press
TouchController.write("text", sleepTime);         // Input text
TouchController.homeButton(sleepTime);            // Press home
TouchController.backButton(sleepTime);            // Press back
```

### ScreenController
Screen capture and analysis methods:
```java
Color color = ScreenController.getColorAtCoordinate(x, y); // Get pixel color
ScreenController.brightnessUp(sleepTime);    // Increase brightness
ScreenController.brightnessDown(sleepTime);  // Decrease brightness
ScreenController.onOff(sleepTime);           // Toggle screen
```

## 🚀 Quick Start

1. **Connect your Android device** via USB with debugging enabled
2. **Verify connection**: `adb devices`
3. **Run your automation script**:
```java
public class MyAutomation {
    public static void main(String[] args) throws Exception {
        // Click at coordinates (500, 800)
        TouchController.click(500, 800, 1.0);
        
        // Swipe from (500,1500) to (500,500)
        TouchController.swipe(500, 1500, 500, 500, 0.5, 1.0);
        
        // Check color at specific location
        Color c = ScreenController.getColorAtCoordinate(100, 100);
    }
}
```

## 📁 Examples

The repository includes practical examples for **Age of Empires Mobile**:

| File | Description |
|------|-------------|
| `ExamplesAoemBarbarianEvent.java` | Automates barbarian event participation |
| `ExamplesAoemMarket.java` | Automates market item purchasing |
| `ExamplesAoemTrainSoldier.java` | Automates soldier training from barracks |
| `ExamplesAoemClickHelp.java` | Automates help button clicking |

> **Note:** Examples are calibrated for **2400x1080** screen resolution.

## ⚙️ Configuration

- **Sleep times** are in seconds (e.g., `1.5` = 1500ms)
- **Coordinates** are screen-relative pixel values
- **Iterations** allow repeating actions multiple times

## 📝 License

This project is open source and available for personal and educational use.

## 🤝 Contributing

Contributions are welcome! Feel free to submit issues and pull requests.
