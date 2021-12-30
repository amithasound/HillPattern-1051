//amitha sound
import java.util.Scanner;
public class HillPattern{
 public static void main (String [] args){
   Scanner kb = new Scanner(System.in);
   int rows;
   int hash = 1; 
   
   
 do{
 
 System.out.println("Enter the rows: ");
 rows = kb.nextInt();
 
 if(rows <= 0){
   System.out.println("Input should be positive");
 }
 
 
    
}while(rows <= 0);
    
    
for (int i = rows; i>=1; i--){ //rows
   for(int space = (i * 2) - 2 ; space>=1;space--){ //after counting the spaces the number was the input * 2 -2
      System.out.print(" "); //spaces
   }
   for (int k = 1; k<=hash;k++){ 
       System.out.print("# ");//hastags
   }
   System.out.println();
   hash+=2; //want to increase each row by two hashtags
    
    
    
 
     
 }

  }
}