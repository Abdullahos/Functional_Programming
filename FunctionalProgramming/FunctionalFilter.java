package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FunctionalFilter {
	static class Song{
		boolean released;
		String title;
		public Song(boolean released, String title) {
			this.title = title;
			this.released = released;
		}
		@Override
		public String toString() {
			return "title "+title+" ,released "+released;
		}
	}
	public static void main(String[] args) {
		List<Song>songs = new ArrayList<Song>();
		songs.add(new Song(false,"a"));
		songs.add(new Song(true,"a"));
		songs.add(new Song(true,"b"));
		songs.add(new Song(false,"b"));
		//predicate that take Song and return boolean
		Predicate<Song> predicate = song -> song.title.equals("a");
		songs.stream().filter(predicate).forEach(System.out::println);
	}
}
