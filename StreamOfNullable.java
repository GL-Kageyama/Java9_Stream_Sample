import java.util.List;
import java.util.Optional;

public class StreamOfNullable {

	public static void main(String[] args) {

		List<String> listArgs = List.of(args);
		List<String> listNull = null;

		// Allowing a null value
		Optional<List<String>> valueArgs = Optional.ofNullable(listArgs);
		Optional<List<String>> valueNull = Optional.ofNullable(listNull);

		// No need for a null decision
		valueArgs.stream().flatMap(b -> b.stream()).forEach(System.out::println);
		valueNull.stream().flatMap(b -> b.stream()).forEach(System.out::println);

	}
}

//============================================
//               Output Sample
//============================================

// $ javac StreamOfNullable.java
// $ java StreamOfNullable a b c d e f g
// a
// b
// c
// d
// e
// f
// g
// $ java StreamOfNullable
// $ java StreamOfNullable a b c d e f g
// a
// b
// c
// d
// e
// f
// g

//============================================