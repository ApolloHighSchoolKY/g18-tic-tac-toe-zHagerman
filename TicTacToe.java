//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];

	}

	public TicTacToe(String game)
	{
		char[][] fat = new char[3][3];
		int count = 0;
		//Row major order will happen here
		for(int row = 0; row <fat.length; row++)
		{
			
			for(int col = 0; col < fat[row].length; col++)
			{
				fat[row][col] = (game.charAt(count));
				count++;
			}
			
		}
		mat = fat;
	}

	public String getWinner()
	{
		char[][]mat1 = new char[3][3];
		mat1 = mat;
		String result= "";

		if(mat1[0][0]== mat1[0][1] && mat1[0][1] == mat1[0][2])
			result="" + mat1[0][0] +" is the winner horizontally";
		else if(mat1[1][0]== mat1[1][1] && mat1[1][1] == mat1[1][2])
			result="" + mat1[1][0] +" is the winner horizontally";
		else if(mat1[2][0]== mat1[2][1] && mat1[2][1] == mat1[2][2])
			result="" + mat1[2][0] +" is the winner horizontally";
		else if(mat1[0][0]== mat1[1][0] && mat1[1][0] == mat1[2][0])
			result="" + mat1[0][0] +" is the winner verticallly";
		else if(mat1[0][1]== mat1[1][1] && mat1[1][1] == mat1[2][1])
			result="" + mat1[1][1] +" is the winner verticallly";
		else if(mat1[0][2]== mat1[1][2] && mat1[1][2] == mat1[2][2])
			result="" + mat1[0][2] +" is the winner verticallly";
		else if(mat1[0][0]== mat1[1][1] && mat1[1][1] == mat1[2][2])
			result="" + mat1[1][1] +" is the winner diagonally";
		else if(mat1[2][0]== mat1[1][1] && mat1[1][1] == mat1[0][2])
			result="" + mat1[2][0] +" is the winner diagonally";
		else
			result="The game is a tie";

		return result;
	}

	public String toString()
	{
		String output="";
	for(int row = 0; row < mat.length; row++)
    {
      System.out.println(Arrays.toString(mat[row]));
    }
		return output;
	}
}