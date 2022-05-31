import java.util.List;

public class MyClass {

    public boolean lambdaExpressions(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum() > 5;
    }
}









































