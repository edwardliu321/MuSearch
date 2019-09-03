package datatypes;

import java.util.Iterator;

import search.Search;
import sort.Sort;


/**
 * get songs from id and id from songs
 * @author Edward
 *
 */
public class Songs implements Iterable<Song> {
	
	private Song[] songs; //sorted by ids
	private int n;
	
	public Songs(Song[] songs ){
		n = songs.length;
		
		this.songs = songs;
		
		Sort.sort(songs);
	}
	
	public Song getById(String id){
		int i = Search.binarySearchIndex(songs, 0, n, new Song(id, null, null, null, null));
		return songs[i];
	}	
	
	public Iterator<Song> iterator()  {
        return new ListIterator<Song>(0);  
    }

    private class ListIterator<Song> implements Iterator<Song> {
        private int i;

        public ListIterator(int first) {
            i = first;
        }

        public boolean hasNext() { return i != n; }
        public void remove() { throw new UnsupportedOperationException(); }

        public Song next() {
            Song item = (Song)songs[i];
            i++;
            return (Song)item;
        }
    }	
}
