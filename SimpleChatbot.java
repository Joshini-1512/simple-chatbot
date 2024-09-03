import java.util.Scanner;
public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chatbot: Hi there! How can I help you today?");
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();  // Convert input to lowercase for easier matching
            
            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Chatbot: Hello! How can I assist you?");
            } 
            else if (userInput.contains("how are you")) {
                System.out.println("Chatbot: I'm just a program, so I don't have feelings, but thanks for asking!");
            } 
            else if (userInput.contains("your name") || userInput.contains("who are you")) {
                System.out.println("Chatbot: I'm a simple chatbot created to assist you with basic tasks.");
            } 
            else if (userInput.contains("bye") || userInput.contains("goodbye")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;  // Exit the loop and end the conversation
            } 
            else {
                System.out.println("Chatbot: I'm sorry, I don't understand that. Can you please rephrase?");
            }
        }
        scanner.close();
    }
}