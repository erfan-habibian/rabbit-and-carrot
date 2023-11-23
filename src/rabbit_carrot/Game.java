package rabbit_carrot;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	
	private int size;
	private char[][] board;
	private int level;
	
	public int row = 0;
	public int column = 0;
//	public int[] randOfRow = randOfRow();
//	public int start = rand(size);
//	public int finish = rand(size);
	
//	public int finishHome = rand(size);
	
	public Game(int level)
	{
		this.level = level;
		board = new char[getsize()][getsize()];
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				board[i][j]='.';
			}
		}
	}
//	public int startHome = rand(getsize()-1);
	public int currentRow = 0;
	public int currentColumn = 0;
	
	
	public void move()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter the row and column:");
		row = input.nextInt();
		column = input.nextInt();
		
		if(checkmove1() && !checkmove3(row, column))
			setboard(row, column);
	/*	else if(checkmove3(row, column))
		{
			System.out.print("wrong choice! try again:\n");
			move();
			
			
		}*/
		else
		{
			System.out.print("wrong choice! try again:\n");
			move();
		}
		currentRow = row;
		currentColumn = column;
	}
	
	public boolean checkmove1()
	{
		if((Math.abs(row - currentRow) + Math.abs(column - currentColumn) <= 1) && !(row>getsize() || row<0 || column>getsize() || column<0))
			return true;
		else
			return false;
	}
	public boolean checkmove2(int x, int y)
	{
		if(x!=rowofbans()[x] && y!=columnofbans()[y])
			return true;
		else
			return false;
	}
	
	public boolean checkmove3(int x, int y)
	{
		if(x>getsize() || x<0 || y>getsize() || y<0)
			return true;
		else
			return false;
	}
	
	
	public boolean checkfinish()
	{
		if(currentRow == getsize()-1 && currentColumn == getsize()-1)
			return true;
		else
			return false;
	}
	

/*	public int finishHome()
	{
		return finishHome;
	}*/
	
	
	public void setboard(int x, int y)
	{
		board[x][y] = '*';
	}
	
	public void showBoard()
	{
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size; j++)
			{
				System.out.print(board[i][j] + " ");
				
			}
			System.out.println();
		}
	}
	
	public char[][] getBoard()
	{
		return board;
	}
	
	
	public int rand(int scope)
	{
		Random rand = new Random();
		int a = rand.nextInt(scope - 1);
		return a;
	}
	
	public int getsize()
	{
		switch(level)
		{
		case 1:
			return 5;
		case 2:
			return 10;
		default:
			return 15;
		}
	}
	
/*	public int setCurrentRow(int x)
	{
		return x;
	}
	public int setCurrentColumn(int y)
	{
		return y;
	}*/
	
	public int getsizeofnewrand()
	{
		switch(level)
		{
		case 1:
			return 2;
		case 2:
			return 5;
		default:
			return 7;
		}
		
	}
	
	public int[] new1()
	{
		int[] arr = new int[getsizeofnewrand()];
		for(int i=0; i<arr.length; i++)
			arr[i] = rand(getsize());
			
			return arr;
				
	}
	
	
	
	public int sizeofbans()
	{
		switch(level)
		{
		case 1:
			return 9;
		case 2:
			return 18;
		default:
			return 36;
		}
	}
	
	public int[] randomarray()
	{
		int[] arr = new int[getsize()];
		for(int i=0; i<getsize(); i++)
			arr[i] = rand(getsize());
		return arr;
	}
	
	public int[] rowofbans()
	{
		int arr[] = randomarray();
		return arr;
	}
	public int[] columnofbans()
	{
		int arr[] = randomarray();
		return arr;
	}
	
	public int[][] towdbans()
	{
		int arr[][] = new int[getsize()][getsize()];
		for(int i=0; i<getsize(); i++)
		{
			for(int j=0; j<getsize(); j++)
				arr[i][j] = arr[rand(getsize())][rand(getsize())];
			
		}
		return arr;
	}
	
	
	
	public int[] randOfRow(int scope)
	{
		int[] randofrow = null;
		for(int i=0; i<scope; i++)
			randofrow[i] = rand(size);
		return randofrow;
	}
	
	public int[] randOfColumn(int scope)
	{
		int[] randofcolumn = null;
		for(int i=0; i<scope; i++)
			randofcolumn[i] = rand(size);
		return randofcolumn;
	}
	
	
	
	
	

}
