import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyClass {

    private static final Logger loggerLog4j = LogManager.getLogger(MyClass.class);

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        loggerLog4j.info("Log main method");
        mc.lambdaExpressions(Arrays.asList(1, 2, 3));
    }

    public boolean lambdaExpressions(List<Integer> numbers) {
        loggerLog4j.info("Call lambda");
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum() > 5;
    }
}









































