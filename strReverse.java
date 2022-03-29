// Java program to reverse a string using While loop


public class strReverse {

    public static void main(String[] args)

    {

    String stringInput = "My String Output";   

    //Get the String length

    int iStrLength=stringInput.length();    

    //Using While loop

while(iStrLength >0)

{

System.out.print(stringInput.charAt(iStrLength -1)); 

iStrLength--;

}

    }

}