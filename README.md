# ATMBankApplication
ATM bank application for Software Engineering COMP 2663.

## Updates:
- Started project
- Created a few GUI screens (see below for details on progress)
- File Restructure
    - Sent all fxml files to FXML directory for easier management (included css file)
## Preperation and Information:

### JDK Version:
- Java 8 JDK: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html


### IDE
- (Recommened) Intillij IDEA: https://www.jetbrains.com/idea/download/index.html#section=windows
- Other text-editor (vs-code, sublime, atom, etc...)
- (Not Recommened) Other IDE (Eclipse, etc...)

## Installation Process
1. Install JDK first (use link above)
2. Install IDEA (again use link above)

    a. Install IDEA with default settings
    b. During setup, make sure you select JDK 8 as your project SDK.
3. Have Fun!

## Current File Structure and Notes

```
├── ATMBankApplication.iml
├── Gimp Files
│   └── Application Icon.xcf
├── README.md                                    // What your reading now
├── out
│   ├── artifacts
│   │   └── ATMBankApplication_jar
│   │       └── ATMBankApplication.jar          // Runnable Application, will be posted in releases once finished
│   └── production                              // Dont Worry About This
│ 
└── src                                         // All java files
    ├── META-INF
    │   └── MANIFEST.MF
    └── sample
        ├── Confirmation.java
        ├── Controller.java                     // Controls the UI Application (UI ins and outs)
        ├── FXML                                // All FXML files (UI)
        │   ├── Confirmation.fxml               // Confirmation from user (Y/n)
        │   ├── Login.fxml                      // Starting point in UI
        │   ├── SelectionScreen.fxml            // Main Switcher, #2 screen (UI)
        │   ├── TransactionSuccess.fxml         // Simple success (UI)
        │   ├── Withdraw.fxml                   // Withdraw interface, #3 screen (UI)
        │   ├── main.css                        // Style Sheet for the UI
        │   └── sample.fxml                     // Test UI File (disregard)
        ├── Main.java                           // Main java file that creates the entire application
        ├── SceneInterface.java                 
        ├── SceneSwitcher.java                  // Uses above interface to make switching between scenes faster
        ├── SelectionScreen.java                // Main Switcher handlers, #2 screen (Java)             
        ├── TransactionSuccess.java             // Button handlers for success screen (Java)
        ├── Withdraw.java                       // Withdraw handlers, #3 screen (Java)
        └── images
            └── icon.png                        // Icon for the main window


15 directories, 40 files
```
