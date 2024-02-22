import java.util.Scanner;

public class realTesting {
    
 public static void main(String[] args) {
    int[] tenSpots = {0,1,2,3,4,5,6,7,8,9};
        //Problem 10
        //Print the array to the console in the correct order
        //CODE HERE
for(int i = 0; i < 10; i++) {
    System.out.println(tenSpots[i]);
    
    }
for(int j = 0; j < 10; j++) {
    for(int h = j + 1; h < 10; h++) {
        if (tenSpots[j] == tenSpots[h]) {
            System.out.println(tenSpots[j] + " there is a duplicate! INITIATING SELF DESTRUCT!!!!!!!");
        } else {
            System.out.println("Lordy, Lordy, ya dun not have a duplicate");
            }
        }
    }

Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine(); // Reads a line of text from the console

        System.out.println("Enter your age:");
        int age = scanner.nextInt(); // Reads an integer from the console

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();

}


}
