import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        logger.log("Запускаем фильтрацию");

        for (int i = 0; i < source.size(); i++) {
            int element = source.get(i);

            if (element > this.treshold) {
                result.add(element);
                logger.log("Элемент " + element + " проходит");
            } else {
                logger.log("Элемент " + element + " не проходит");
            }
        }

        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        Collections.sort(result);
        return result;
    }
}