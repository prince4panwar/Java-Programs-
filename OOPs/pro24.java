//Create a class showing the area of circle and rectangle by method overloading.
class pro24 {
    public static void main(String[] args) {
        // Check if any arguments were provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments:");
            // Display all command-line arguments provided by the user
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
