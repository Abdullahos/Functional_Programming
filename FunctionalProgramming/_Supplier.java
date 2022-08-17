package FunctionalProgramming;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;
/*
 * Supplier Interface Represents a supplier of results.
 * results can be obtained by get()
 */
public class _Supplier {
	public static void main(String[] args) {
		
		Supplier<String> getCurrentDateAsString = () ->
														LocalDate.now().toString();
		System.out.println(getCurrentDateAsString.get());
		 
		//get List of results
		Supplier<List<String>>getSupplierOfList = () ->
														List.of("E0","E1","E2");
		System.out.println(getSupplierOfList.get());
	}
}
