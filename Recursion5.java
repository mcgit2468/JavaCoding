// Recursion5.java
// Recursive version of my binary program
class Recursion5 {
    static void binary(String soFar, int n){
    if(n == 0){
    System.out.println(soFar);
    }
    else{
    binary(soFar + "0", n-1);
    binary(soFar + "1", n-1);
    }
    }
    // overload binary to make it more natural to call from main
    static void binary(int n){
    binary("", n);
    }
    public static void main(String[] args){
    binary(3);
    }
    }