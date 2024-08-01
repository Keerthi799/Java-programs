package Keerthi;

public class DemoStringBuffer {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Appending strings
        sb.append(" World");
        sb.append("!");

        // Inserting a string
        sb.insert(6, "Java ");

        // Reversing the string
        sb.reverse();

        // Converting to string and printing
        String result = sb.toString();
        System.out.println(result);

        // Resetting and clearing the StringBuffer
        sb.setLength(0);
        sb.append("StringBuffer is thread-safe");
       System.out.println(sb.toString());
    }
}