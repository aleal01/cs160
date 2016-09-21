// R18 Assignment
// Author: Aaron Leal
// Date:   Nov 17, 2015
// Class:  CS160
// Email:  aleal96@rams.colostate.edu
public class Music {
	private String songTitle;
    private String albumName;
    private String artistName;
    private int releaseYear;
    
    public Music(String title, String album, String artist, int year)
    { 
    	songTitle = title;
    	albumName = album;
    	artistName = artist;
    	releaseYear = year;
    }
    public String getTitle() {
    	return songTitle;
    }
    public String getAlbum() { 
    	return albumName;
    }
    public String getArtist() { 
    	return artistName;
    }
    public int getYear() { 
    	return releaseYear;
    }
    public String toString() {
    	return songTitle + "," +  albumName + "," + artistName + "," + releaseYear;
    }
    public double getPrice() { 
    	if(releaseYear < 1970){
    		return 1.29;
    	}
    	else if (releaseYear >= 1970 && releaseYear <= 1979){
    		return 1.89;
    	}
    	else if (releaseYear >= 1980 && releaseYear <= 1989){
    		return 0.69;
    	}
    	else if (releaseYear >= 1990 && releaseYear <= 1999){
    		return 0.99;
    	}
    	else if (releaseYear >= 200 && releaseYear <= 2009){
    		return 1.39;
    	}
    	else{
    		return 0.59;
    	}
    }
}
