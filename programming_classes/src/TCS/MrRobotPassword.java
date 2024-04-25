//package TCS;
//
//import java.util.Scanner;
//
//public class MrRobotPassword {
//    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your password:");
//        String password = scanner.nextLine();
//        
////        String password1 = "YourPassword 123";
////        if (password1.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?!.*[ /])(?!.*_$).{6,}$")) {
////            System.out.println("Password valid.");
////        } else {
////            System.out.println("Invalid password, try again.");
////        }
//
//        if (isValidPassword(password)) {
//            System.out.println("Password valid.");
//        } else {
//            System.out.println("Invalid password, try again.");
//        }
//        
//        scanner.close();
//    }
//    
//    public static boolean isValidPassword(String password) {
//        // Check length
//        if (password.length() < 6) {
//            return false;
//        }
//        
//        // Check for at least one numeric digit
//        boolean hasDigit = false;
//        // Check for at least one lowercase letter
//        boolean hasLowercase = false;
//        // Check for at least one uppercase letter
//        boolean hasUppercase = false;
////        System.out.println(Character.isDigit('1'));
////        System.out.println(Character.isLowerCase('a'));
////        System.out.println(password.toCharArray());
////        
//        
//        
//        for (char ch : password.toCharArray()) {
//            if (Character.isDigit(ch)) {
//                hasDigit = true;
//                System.out.println(Character.isDigit(ch));
//              
//            } else if (Character.isLowerCase(ch)) {
//                hasLowercase = true;
//                System.out.println(Character.isLowerCase(ch));
//               
//            } else if (Character.isUpperCase(ch)) {
//                hasUppercase = true;
//                System.out.println(Character.isUpperCase(ch));
//              
//            }
//            
//            // Check for space or slash
//            if (ch == ' ' || ch == '/') {
//                return false;
//            }
//        }
//        
//        // Check if all conditions are met
//        return hasDigit && hasLowercase && hasUppercase;
//    }
//}
