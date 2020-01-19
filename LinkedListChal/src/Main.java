import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	private static ArrayList<Album> albums=new ArrayList<Album>();
	
	public static void main(String[] args) {
		
		Album album=new Album("asadsd","xadsa");
		album.addSong("casc",3.5);
		album.addSong("asc",1.5);
		album.addSong("bbgc",2.5);
		album.addSong("recc",4.5);
		
		albums.add(album);
		
		album=new Album("hytfdsd","mhgfdsa");
		album.addSong("fvsz",3.5);
		album.addSong("trghbtncc",8.5);
		album.addSong("csdfsv ssvc",2.5);
		album.addSong("nhrecc",3.5);
		album.addSong("qerecc",5.5);
		
		albums.add(album);
		
		LinkedList<Song> playList=new LinkedList<Song>();
		albums.get(0).addToPlayList("asc",playList);
		albums.get(0).addToPlayList("recc",playList);
		albums.get(0).addToPlayList("as",playList);//not exists
		albums.get(1).addToPlayList(3,playList);
		albums.get(2).addToPlayList(1,playList);
		albums.get(3).addToPlayList(21,playList);//not exists
		
		play(playList);
	}
//-----------------------------------------------------------------		
	private static void play(LinkedList<Song> playList)
	{
		Scanner sc=new Scanner(System.in);
		boolean quit=false;
		boolean forward=true;
				
		ListIterator<Song> listIterator=playList.listIterator();
		if(playList.size()==0)
		{
			return;
		}
		else
		{
			System.out.println("Playing" + listIterator.next().toString());	
			printList(playList);
		}	
		
		while(!quit)
		{
			int action=sc.nextInt();
			sc.nextLine();
			
			switch(action)
			{
			case 0:
				System.out.println("Quit");
				quit=true;
				break;
			case 1:
				if(!forward)
				{
					if(listIterator.hasNext())
					{
						listIterator.next();
					}
					forward=true;
				}
				if(listIterator.hasNext())
					{
					System.out.println(listIterator.next().toString());
					}
				else
				{
				  System.out.println("No song");	
				   forward=false;
				}			
				break;
			case 2:
				if(forward)
				{
					if(listIterator.hasPrevious())
					{
						listIterator.previous();
					}
					forward=false;
				}
				if(listIterator.hasPrevious())
					{
					System.out.println(listIterator.previous().toString());
					}
				else
				{
				  System.out.println("No song");	
				   forward=true;
				}	
				break;
			case 3:
				if(forward)
				{
				  if(listIterator.hasPrevious())
				  {
					  System.out.println(listIterator.previous());
					  forward=false;
				  }
				  else
				  {
					  System.out.println("At start");
					  forward=true;
				  }
				}
				 else
				 {
					 if(listIterator.hasNext())
					  {
						  System.out.println(listIterator.next());
						  forward=true;
					  }
					  else
					  {
						  System.out.println("At last.....");
						  forward=false;
					  } 
				}		
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;	
			case 6:
				if(playList.size()>0)
				{
				listIterator.remove();
				if(listIterator.hasNext())
				{
					System.out.println(listIterator.next());
				}
				else if(listIterator.hasPrevious())
				{
					System.out.println(listIterator.previous());
				}
				}
				break;
			}			
		}	
	}
//--------------------------------------------------------------------	
	private static void printMenu()
	{		
		System.out.println("Available actions are...");
		System.out.println("0 to quit");
		System.out.println("1 for next...");
		System.out.println("2 for previous...");		
		System.out.println("3 Replay... ");
		System.out.println("4 for list of songs");
		System.out.println("5 print actions");	
		System.out.println("6 to remove");
	}
//-------------------------------------------------------------------	
	private static void printList(LinkedList<Song> playList)	
	{
	Iterator<Song> listIterator=playList.iterator();
	System.out.println("=============================");
	
	while(listIterator.hasNext())
	{
	System.out.println(listIterator.next());
	System.out.println("===============================");
	}
	}
//---------------------------------------------------------------------
}