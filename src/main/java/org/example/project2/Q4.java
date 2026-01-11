package org.example.project2;
/*
Check if a String is Palindrome: Determine whether a given string is a palindrome,
which means it reads the same forwards and backward. For example, "madam" is a
palindrome
 */
public class Q4 {
    // Palindrome: dad  mom pop
    // Non Palindrome :car computer cat

    public static void main(String[] args) {
        String originalStr="dad";
        String reversedStr=Q3.reverseString(originalStr);
        boolean isPalindrome=originalStr.equals(reversedStr);
        if(isPalindrome){
            System.out.println("The String "+originalStr+" is a Palindrome ");
        }else {
            System.out.println("The String "+originalStr+" is not a Palindrome ");
        }
    }
}
