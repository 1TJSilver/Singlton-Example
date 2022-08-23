import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        logger.log("Program started, Good day");
        logger.log("We ask the user to enter input data for the list");
        System.out.print("Please, enter list size \n-> ");
        int size = scanner.nextInt();
        System.out.print("Please, enter max value in list \n-> ");
        int max = scanner.nextInt();
        System.out.print("Please, enter number for sort list\n-> ");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);
        logger.log("Add " + size + " random numbers");
        addRandom(list, size, max);
        logger.log("Create list, with numbers: " + showList(list));
        logger.log("Start filter");
        list = filter.filterOut(list);
        logger.log("Sorted list: " + showList(list));
        logger.log("End program");
    }
    public static void addRandom(List<Integer> list, int size, int max){
        Random random = new Random();
        for (int i = 0; i < size; i++){
            list.add(random.nextInt(max));
        }
    }
    public static String showList(List<Integer> list){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++){
            result.append(list.get(i) + " ");
        }
        return result.toString();
    }
}
