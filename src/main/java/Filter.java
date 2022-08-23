import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result;
        result = source.stream()
                .filter(x -> {
                    boolean result1 = x >= treshold;
                    if (result1) {
                        logger.log("Number " + x + " passed the test");
                    } else {
                        logger.log("Number " + x + " not passed the test");
                    }
                    return result1;
                })
                .collect(Collectors.toList());
        return result;
    }
}