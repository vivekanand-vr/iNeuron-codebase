  package getitdone.com;

import java.util.Scanner;
/* updates are;
 * 1)setting user name and password
 * 2)verifying user name and password
 * 3)game continues to play after result declared until stopped manually.
 */

class UserCredentials{
	 private String userName;
	 private String password;
	public UserCredentials(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	
	
}

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied!");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}


public class GuesserGame {

	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Set username");
		  String userName = sc.nextLine();
		 System.out.println("Set password");
              String password =sc.nextLine();	
              
              UserCredentials uc=new UserCredentials(userName,password);
              
              System.out.println(" Enter the user name.");
              String verifyName=sc.nextLine();
              System.out.println("Enter the password");
              String verifyPassword=sc.nextLine();
              
              if(uc.getUserName().equalsIgnoreCase(verifyName) && uc.getPassword().equals(verifyPassword)) {
			
            	 while(true) { 
            	  Umpire u=new Umpire();
            	  u.collectNumFromGuesser();
            	  u.collectNumFromPlayers();
            	  u.compare();
            	  
            	 }

	}
              else {
            	  System.out.println("Incorrect user name or password");
            	
              }
	}

}
