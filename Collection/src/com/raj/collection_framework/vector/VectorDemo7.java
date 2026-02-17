package com.raj.collection_framework.vector;
import java.util.Iterator; 
import java.util.Vector; 

//IPL Auction 
record Player(Integer id, String name, Double basePrice) { 

} 

class IPLAuction{ 
	
	private String iplTeam; 
	private Vector<Player> listOfPlayers;
	
	public IPLAuction(String iplTeam) { 
		super(); 
		this.iplTeam = iplTeam; 
		listOfPlayers = new Vector<Player>();  //Composition 

	} 

	public void addPlayer(Player player) { 
		listOfPlayers.add(player); 
	} 

	public void displayAllThePlayers() { 
		System.out.println("All the players "+iplTeam); 
		listOfPlayers.forEach(Player -> System.out.println(Player)); 
	} 
	
	public void  retainOrRemove() { 
		Iterator<Player> iterator = listOfPlayers.iterator(); 
		while(iterator.hasNext()) { 
			Player player = iterator.next(); 
			if(player.basePrice() > 100000) { 
				iterator.remove(); 
			}  
		} 
	} 
} 

public class VectorDemo7 { 
	
	public static void main(String[] args) { 
		
		IPLAuction ipl = new IPLAuction("SRH"); 
		ipl.addPlayer(new Player(111, "Abhishek", 190000D)); 
		ipl.addPlayer(new Player(222, "Head", 98000D)); 
		ipl.addPlayer(new Player(333, "Klassen", 92000D)); 
		ipl.addPlayer(new Player(444, "Nitish", 189000D)); 
		ipl.retainOrRemove(); 
		ipl.displayAllThePlayers();  
	}  
} 