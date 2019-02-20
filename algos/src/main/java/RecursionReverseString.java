package main.java;

public class RecursionReverseString {
    public static void main(String[] a) {
        String string = "penguin";
       new RecursionReverseString().reverse(string, string, 0);
    }

    private void reverse(String string, String reversed, int iteration) {
        String temp = string;
        if (temp.length() == 0 || temp.length() == 1) {
            System.out.println("result: " + reversed);
            return;
        }

        int tempLength = (temp.length() - 1 == 0) ? 1 : temp.length() - 1;
        temp = temp.substring(1, tempLength);

        reversed = "" + reversed.substring(0, iteration) +
                string.charAt(string.length() - 1) +
                temp +
                string.charAt(0) +
                reversed.substring(reversed.length() - (iteration));

        iteration++;
        reverse(temp, reversed, iteration);

    }
}
