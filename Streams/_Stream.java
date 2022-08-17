package Streams;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
	public static void main(String[] args) {
		List<Boolean>is = List.of(true,false);
		is.stream()
		.map(b -> b.toString())
		.mapToInt(String::length)
		.forEach(System.out::println);
		
		System.out.println();
		
		is.stream()
		.filter(b->b.booleanValue())
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}
}
