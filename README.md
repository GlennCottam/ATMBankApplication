# ATMBankApplication
ATM bank application for Software Engineering COMP 2663.

## Updates:
- Started project

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
├── README.md                   // What your reading now
├── out                         // Dont Worry About This
└── src                         // Main Package
    └── sample
        ├── Controller.java     // Controls the UI Application (UI ins and outs)
        ├── Login.fxml          // Starting point in UI
        ├── Main.java           // Main java file that creates the UI
        ├── SceneSwitcher.java  // Adds ability to switch to a different scene faster
        ├── SelectionScreen.fxml   // Main Switcher, #2 screen (UI)
        ├── SelectionScreen.java   // Main Switcher, #2 screen (Java) 
        ├── Withdraw.fxml       // Withdraw interface, #3 screen (UI)
        ├── Withdraw.java       // Withdraw interface, #3 screen (Java)
        ├── main.css            // Style Sheet for the UI
        └── sample.fxml         // Test UI File (disregard)

6 directories, 22 files
```
