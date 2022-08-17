package FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

import FunctionalProgramming.FunctionalFilter.Song;

public class _Function {
	public int add_1_fn(int n) {
		return n+1;
	}
	public static void main(String[] args) {
		Function<Integer,Integer> add_1 = num -> num+1;
		Function<Integer,Integer> multiply_by_10 = num -> num*10;
		
		int addOne = add_1.apply(1);
		System.out.println(addOne);
		int mult_by_10 = multiply_by_10.apply(addOne);
		System.out.println(mult_by_10);
		
		//chaining 
		int add_by_one_then_mult_by_10 = add_1.andThen(multiply_by_10).apply(1);
		System.out.println(add_by_one_then_mult_by_10);
		
		//bi function: 2 input and 1 out
		BiFunction<Integer, Integer, Integer> add_1_mult_chaining = (num, multiplier) -> (num+1)*multiplier;
		int add_1_mult_10 = add_1_mult_chaining.apply(2,10);
		System.out.println(add_1_mult_10);
		
		
	}
}
