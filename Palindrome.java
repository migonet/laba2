public class Palindrome {
public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
    String s = args[i];
    System.out.println(isPalindrome(s));
    }
    }
    
    // Возвращает строку в обратном порядке
    public static String reverseString(String s) {
    String new_string = "";
    for (int i = 1; i <= s.length(); i++) {
    int var = s.length()-i;
    new_string += s.charAt(var);
    }
    return new_string;
    }
    
    // Проверяет является ли s палиндромом
    public static boolean isPalindrome(String s) {
    String new_string = reverseString(s);
    return s.equalsIgnoreCase(new_string);
    }
}
