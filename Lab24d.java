//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main(String[] args) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		//Read how many times you should read
		
			TicTacToe ttt = new TicTacToe("XXXOOXXOO");
			System.out.println(ttt.toString());
			System.out.println(ttt.getWinner());
			System.out.println("\n");
			
			TicTacToe ttt2 = new TicTacToe("OXOOXOXOX");
			System.out.println(ttt2.toString());
			System.out.println(ttt2.getWinner());
			System.out.println("\n");

			TicTacToe ttt3 = new TicTacToe("OXOXXOXOO");
			System.out.println(ttt3.toString());
			System.out.println(ttt3.getWinner());
			System.out.println("\n");

			TicTacToe ttt4 = new TicTacToe("OXXOXOXOO");
			System.out.println(ttt4.toString());
			System.out.println(ttt4.getWinner());
			System.out.println("\n");

			TicTacToe ttt5 = new TicTacToe("XOXOOOXXO");
			System.out.println(ttt5.toString());
			System.out.println(ttt5.getWinner());
			System.out.println("\n");
			
			//Tic tac toe only wants this file.nextline()	
			
			//Make tic tac toe object

			//print the game

			//Print the winner
		

	}
}



