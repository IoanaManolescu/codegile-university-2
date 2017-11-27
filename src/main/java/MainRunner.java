import com.codegile.university.ioana.week1.day1.problem1.NumberSort;
import com.codegile.university.ioana.week1.day1.problem2.NameSort;

import java.io.FileNotFoundException;

public class MainRunner {

    public static void main(String[] args) throws FileNotFoundException {

        NumberSort numberSort = new NumberSort();
        numberSort.sortNumbersFromFile();

        NameSort nameSort = new NameSort();
        nameSort.nameSortCount();


    }
}

