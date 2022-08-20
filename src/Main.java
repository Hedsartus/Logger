import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int countList = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений: ");
        int maxValueList = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        fillIntegerList(integerList, countList, maxValueList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int filterValue = scanner.nextInt();
        Filter filter = new Filter(filterValue);

        List<Integer> listResult = filter.filterOut(integerList);
        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        listResult.forEach(e -> System.out.print(e + " "));
        System.out.println();
        logger.log("Завершаем программу");
    }

    public static void fillIntegerList(List<Integer> integerList, int count, int maxValue) {
        System.out.print("Вот случайный список: ");
        for (int i = 0; i < count; i++) {
            int cell = getRandomInteger(maxValue);
            integerList.add(cell);
            System.out.print(cell + " ");
        }
        System.out.println();
    }

    public static int getRandomInteger(int maxValue) {
        Random random = new Random();
        return random.nextInt(maxValue);
    }
}