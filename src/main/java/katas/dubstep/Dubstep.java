package katas.dubstep;

public class Dubstep {
	public static String SongDecoder (String song){
		song = song.replaceAll("WUB", " ");
		song = song.replaceAll("\\s+", " ");
		return song.trim();
	}
	public static void main(String[] args) {
		System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
	}

}
