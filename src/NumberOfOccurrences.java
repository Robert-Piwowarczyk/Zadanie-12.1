import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class NumberOfOccurrences {
    public static void main(String[] args) {
        try {
            List<Integer> allNumbers = readFromFile("numbers.txt");
            numberOfOccurentsNumbers(allNumbers);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku numbers.txt");
        }
    }
    private static void numberOfOccurentsNumbers(List<Integer> allNumbers) {
        Set<Integer> uniqueNumbers = new TreeSet<>(allNumbers);
        for (Integer number : uniqueNumbers) {
            System.out.println(number + " - liczba wystąpieńcyfry: " + Collections.frequency(allNumbers, number));
        }
    }
    private static List<Integer> readFromFile(String fileName) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(fileName));
        List<Integer> result = new ArrayList<>();
        while (sc.hasNextInt()) {
            int next = sc.nextInt();
            result.add(next);
        }
        return result;
    }
}




