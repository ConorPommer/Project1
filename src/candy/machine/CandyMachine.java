 /*
Conor Pommer
period 2
Candy Machine
*/

        

package candy.machine;



import java.util.Scanner;


public class CandyMachine {

    public static Scanner in = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome To THS's Copmuter Candy Machine!");
        System.out.println("\t All candy provided is virtual");
        System.out.println("\n");
        System.out.println("How much money do you got? > ");
        double money = in.nextDouble();
        
        System.out.println("$" + money +" that's all?");
        
        System.out.println("Well, let me show you what we have here.");
        System.out.println("\n");
        
        System.out.println("A      $.65   Twix");
        System.out.println("B      $.50   Chips");
        System.out.println("C      $.75   Nutter Butter");
        System.out.println("D      $.65   Peanut Butter Cup");
        System.out.println("E      $.55   Juicy Fruit Gum");
        
        double twix = .65;
        double nutterButter = .75;
        double chips = .5;
        double peanutButterCup = .65;
        double juicyFruitGum = .55;
                
        
        System.out.println("So, what will you have? ");
        
        String candyBar = in.next();
        
        double change = 0;
        
        switch(candyBar.toUpperCase()){
            case "A":
                if(money - twix >= 0){
                    change = money - twix;
                }
                else {
                    System.out.println("You're broke take that "
                            + "somewhere else");
                }
        break;
            case "B":
                if(money - chips >= 0){
                    change = money - chips;
                }
                else {
                    System.out.println("You're Broke take "
                            + "that somewhere else");
                }
        break;
            case "C":
                if(money - nutterButter >= 0){
                    change = money - twix;
                }
                else {
                    System.out.println("You're Broke take that "
                            + "somewhere else");
                }
        break;
            case "D":
                if(money - peanutButterCup >= 0){
                    change = money - peanutButterCup;
                }
                else {
                    System.out.println("You're Broke take "
                            + "that somewhere else");
                }
        break;
            case "E":
                if(money - juicyFruitGum >= 0){
                    change = money - juicyFruitGum;
                }
                else {
                    System.out.println("You're Broke take "
                            + "that somewhere else");
                }
        }
    }
    
}
