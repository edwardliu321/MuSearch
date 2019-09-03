package datatypes;


public class Song implements Comparable<Song> {
	protected String songId;
	protected String name;
	protected String artist;
	protected String album;
	protected String date;
	


	public Song(String songId, String name, String albulm, String artist, String date){
		this.songId = songId;
		this.name = name;
		this.artist = artist;
		this.album = albulm;
		this.date = date;
	}


	public String getSongId() {
		return songId;
	}


	public String getName() {
		return name;
	}


	public String getArtist() {
		return artist;
	}


	public String getAlbum() {
		return album;
	}


	public String getDate() {
		return date;
	}
	
	public String toString() {
		return String.format("%s, %s, %s, %s", name,artist,album,date);
	}
	
	
	public int compareTo(Song o) {
		return this.songId.compareTo(o.songId);	
	}
}