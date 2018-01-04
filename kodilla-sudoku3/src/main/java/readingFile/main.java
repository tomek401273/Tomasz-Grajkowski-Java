package readingFile;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String numberGrid;
        FileReader fileReader = new FileReader();
        Scanner sc = new Scanner(System.in);
        System.out.println("Which grig would You like to solve. Write number since 01 to 50");
        numberGrid= sc.nextLine();
        //   numberGrid="03";
        System.out.println("You chice grid number: "+numberGrid);
        fileReader.readFile();
        List<String> choosenGrid =  fileReader.chooseGrid(numberGrid);

        fileReader.parseData(choosenGrid);
    }
}
