package FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import FunctionalProgramming.FunctionalFilter.Song;

public class _Consumer {

	public static void main(String[] args) {
		System.out.println(new _Consumer().getClass().toString());
		//Consumer 1 i/p and no return
		Consumer<Song> songConsumer = song -> System.out.println(song);
		songConsumer.accept(new Song(true, "ay ya ya"));
				
		//BIConsumer 2 i/p and no return
		BiConsumer<Song,Song> songBiConsumer = (song1,song2) -> System.out.println(song1+"\n"+song2);
		songBiConsumer.accept(new Song(true, "song1"),new Song(true, "song2"));
					
	}

}
