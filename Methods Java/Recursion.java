public class Recursion {
    
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1); 
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(5);  
        System.out.println("Sum is: " + result);
    }
}

/*
Recursion is the technique of making a function call itself.
This technique provides a way to break complicated problems
down into simple problems which are easier to solve.
*/