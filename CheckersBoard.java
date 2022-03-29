import javax.lang.model.util.ElementScanner14;

public class CheckersBoard {

    public static int rows = 8; 
    public static int columns = 8; 

    static int[][] board = new int[rows][columns];


    public static void Newboard(){
         
       //initialize black positions

        for(int i = 0 ; i <= 2 ; i++){
            for(int j = 0; j <= 7; j++){
                if ((i + j) % 2 == 0)   //looking for even 
                board[i][j] = 0;
                else
                board[i][j] = 1;
                 
            System.out.println(" Row: "+ i +" Column: "+j+ " got assigned " + board[i][j] );

            }
        }

         //initialize Red positions

        for(int k = 5 ; k <= 7 ; k++){
            for(int m = 0; m <= 7; m++){
                if ((k + m) % 2 == 1)  // looking for odd 
                board[k][m] = 2;
                else
                board[k][m] = 0;
            System.out.println(" Row: "+k+" Column: "+m+" got assigned " + board[k][m]);
            }
            
        }

    }

    public static void countColor(String color){
        color = color.toLowerCase();
        int redcount = 0;
        int blackcount = 0;
        int enpty = 0;
        for(int n = 0 ; n <= 7 ; n++){
            for(int o = 0; o <= 7; o++){
                if (board[n][o] == 2){
                    redcount ++;
                } 
                else if (board[n][o] == 1){
                blackcount ++;
                }
                else{
                    enpty++;
                }
            }
            
        }
        if (color.equals("black")) {
        System.out.println("There are " + blackcount + " Black Pieces ");
        }
        else{
            System.out.println("There are " + redcount + " Red Pieces ");
        }
    }
    public static void display(){
         
        
 
         for(int i = 7 ; i >= 0 ; i--){                          //reversed the for look to start high and work down .. 
            System.out.print("\r\n");
            //System.out.print("|" +board[i][j]+ "|\t");            
             for(int j = 0; j <= 7; j++){             
                System.out.print("|" +board[i][j]+ "|\t");
                
       
             
               
             }
         }
 
 
     }

public class Moves{

        public static void move(int x1 , int y1 , int x2 , int y2 ){
                    

    }  
    

    public static void main(String[] args)
    {
        Newboard();
        countColor("Black");
        display();
    }

}

}