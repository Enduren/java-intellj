import java.util.Scanner;



//    psvm   public static void main(String[] args) {}
//sout System.out.println();

public class Main {
    public static void main(String[] args) {
        // --- 1. USER INPUT & CONSOLE ---
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Test Environment (QA/Dev): ");
        String env = scanner.nextLine(); // Reads String

        // --- 2. DATA TYPES & VARIABLES ---
        int testCount = 5;                  // Whole numbers
        double version = 1.2;               // Decimals
        boolean isPass = true;              // Logic (Crucial for assertions)
        char grade = 'A';                   // Single character

        // --- 3. CONDITIONALS (The "Validation" Layer) ---
        if (env.equalsIgnoreCase("QA")) {
            System.out.println("Executing on QA Server...");
        } else if (env.equalsIgnoreCase("Dev")) {
            System.out.println("Executing on Dev Server...");
        } else {
            System.out.println("Unknown Environment!");
        }

        // --- 4. ARRAYS (Fixed Size) ---
        int[] errorCode = {404, 500, 200};
        System.out.println("First error: " + errorCode[0]);

        // --- 5. LOOPS (The "Repeater" Layer) ---
        // Classic for-loop (best for indexing)
        for (int i = 0; i < errorCode.length; i++) {
            System.out.println("Status Code: " + errorCode[i]);
        }

        // Enhanced for-loop (best for reading all values)
        for (int code : errorCode) {
            System.out.println("Audit Log: " + code);
        }



        // --- 7. EXCEPTION HANDLING (Wait/Failure Handling) ---
        try {
            int result = 10 / 0; // Simulate an error
        } catch (Exception e) {
            System.out.println("Error caught: " + e.getMessage());
        } finally {
            System.out.println("Closing Browser/Connection...");
        }

        // --- 2. SWITCH STATEMENTS (The "Environment/Browser Selector") ---
        System.out.println("Select Browser (1-Chrome, 2-Firefox, 3-Edge):");
        int browserChoice = scanner.nextInt();

        switch (browserChoice) {
            case 1:
                System.out.println("Launching Chrome...");
                break; // 'break' is vital or it will run the next case too!
            case 2:
                System.out.println("Launching Firefox...");
                break;
            case 3:
                System.out.println("Launching Edge...");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Headless mode.");
        }

        // --- 3. WHILE LOOP (The "Wait for Condition" Loop) ---
        // Use this when you don't know how long something will take (e.g. Loading bar)
        int retryCount = 0;
        while (retryCount < 3) {
            System.out.println("Attempting to connect... Try #" + (retryCount + 1));
            retryCount++;
        }

        // --- 4. DO-WHILE LOOP (The "Run at Least Once" Loop) ---
        int pageNumber = 1;
        do {
            System.out.println("Scraping data from page: " + pageNumber);
            pageNumber++;
        } while (pageNumber <= 2);

        // --- 5. USING OUR METHOD ---
        System.out.println("Enter age for verification:");
        int userAge = scanner.nextInt();
        checkAccess(userAge); // Calling the method we built above

        DayChecker.checkDayType("Monday");

    }



    // This is a reusable block of code.
    public static void checkAccess(int age) {
        System.out.println("--- Method Execution Start ---");
        if (age <= 20) {
            System.out.println("Result: You are not legal to drink.");
        } else {
            System.out.println("Result: You are legal to drink.");
        }
        System.out.println("--- Method Execution End ---\n");
    }}