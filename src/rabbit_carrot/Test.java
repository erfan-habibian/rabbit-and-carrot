package rabbit_carrot;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String st = "yes";
	
		while(st.equals("yes"))
		{	
		System.out.println("enter your level:\n1.intermediate\n2.medium\n3.hard");
		int level = input.nextInt();
		if(level<1 || level >3)
		{
			System.out.print("wrong choice!");
			continue;
		}
			Game g = new Game(level);
			int[][] alaki = g.towdbans();
			for(int i=0; i<g.getsize(); i++)
				{
					for(int j=0; j<g.getsize(); j++)
					{
						g.getBoard()[i][j]='-';
					}
				}
			
			
		/*	for(int i=0; i<g.getsize(); i++)
				g.getBoard()[g.rowofbans()[i]][g.columnofbans()[i]] = '0';*/
			/*try{for(int i=0; i<g.sizeofbans(); i++)
				g.getBoard()[g.rowofbans()[i]][g.columnofbans()[i]] = '0';
			}
			
			catch(ArrayIndexOutOfBoundsException e){
				continue;
			}*/
			
		/*	for(int i=0; i<g.getsize(); i++)
			{
				for(int j=0; j<g.getsize(); j++){
					if(g.getBoard()[i][j] == alaki[i][j])
						g.getBoard()[i][j] = '&';}
			}*/
			
			int[] new1 = g.new1();
			
			/*for(int i=0, j=0; i<g.getsize(); i++, j+=2)
				g.getBoard()[j][new1[i]] = '0';*/
			
			int start = g.getBoard()[0][0] = 's';
			int finish = g.getBoard()[g.getsize()-1][g.getsize()-1] = 'g';
			
		while(true)
		{
			if(g.checkfinish())
				break;
			for(int i=0; i<100; i++)
				System.out.println();
	/*		for(int i=0; i<g.sizeofbans(); i++)
				System.out.print(g.rowofbans()[i] + " " + g.columnofbans()[i] + "   ");*/
		//	System.out.print(g.rowofbans() + "\n" + g.columnofbans());
			
			
			
			
			System.out.print(" " );
			for(int i=0; i<g.getsize(); i++)
				System.out.print( "   " + i);
			System.out.println("\n");
			for(int i=0; i<g.getsize(); i++)
			{
				System.out.print(i + "   ");
				for(int j=0; j<g.getsize(); j++)
				{
					System.out.print(g.getBoard()[j][i] + "   ");
				}
				System.out.println("\n");
			}
			
			g.move();
			
//			g.showBoard();            //
/*			for(int i=0; i<100; i++)
				System.out.println();
			System.out.print(" " );
			for(int i=1; i<=g.getsize(); i++)
				System.out.print( "   " + i);
			System.out.println("\n");
			for(int i=0; i<g.getsize(); i++)
			{
				System.out.print(i+1 + "   ");
				for(int j=0; j<g.getsize(); j++)
				{ 
					System.out.print(g.getBoard()[j][i] + "   ");
				}
				System.out.println("\n");
			}*/
			
			
			
		}
		
		
		System.out.print("**************\ncongradulation\n***YOU WON.***\n**************\ndo you want to start again?(yes/no)");
		st = input.next();
		
		}
		
		System.out.print("Game was finished...");
	}

}
