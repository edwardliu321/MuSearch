package helper;

import graph.Graph;

import java.util.Scanner;

import containers.Queue;
import datatypes.Song;
import datatypes.Songs;


public class IdGetter{
	Songs songs;
	Graph g;
	
	public IdGetter(Songs songs, Graph g){
		this.songs = songs;
		this.g = g;
	}
	
	public String getId(String songName, String artist){
		if (songName.length() <= 1 && artist.length() <= 1) return "";
		
		Queue<Song> q = new Queue<Song>();
		addSame(q,songName,artist);
		if (q.size() == 0) return "";
		
		int counter = 1;
		for (Song song : q){
			System.out.printf("%d. \"%s\", %s, %s\n", counter++, song.getName(), song.getArtist(), song.getAlbum());
		}
		System.out.println("Choose song (Enter number). 0 to cancel");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n <= 0) return "";
		for(int i = 0; i < n-1; i++)
			q.dequeue();
		s.close();
		return q.dequeue().getSongId();
	}
	
	
	private void addSame(Queue<Song> q, String songName, String artist){
		for(Song s : songs){
			if (s.getName().toLowerCase().contains(songName.toLowerCase())){
				if(s.getArtist().toLowerCase().contains(artist.toLowerCase()))
					if (g.contains(s.getSongId()))
						q.enqueue(s);
			}
		}
	}	

}
