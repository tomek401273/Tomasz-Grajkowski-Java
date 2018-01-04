package readingFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReader {
    int numberchoosenGrid = -1;
    int numberChossenPlusNine = 0;
    String acualRow = "";
    List<String> allGrids = new ArrayList<>();
    List<String> choosenGrid = new ArrayList<>();

    public void readFile() {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/text.txt").getFile());
        System.out.println(file.getPath());
        Path path = Paths.get(file.getPath());
        try {
            Stream<String> fileLines = Files.lines(path);
            allGrids = fileLines.collect(Collectors.toList());


            //  fileLines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Coś coś się popsuło i nie było mnie słychać....");
            System.out.println(e);
        }


    }

    public List<String> chooseGrid(String grid) {
        grid = "Grid " + grid;

        for (int i = 0; i < allGrids.size(); i++) {
            acualRow = allGrids.get(i);
            // System.out.println(acualRow);
            if (allGrids.get(i).equals(grid)) {
                System.out.println("lubie placki");
                numberchoosenGrid = i;
                numberChossenPlusNine = numberchoosenGrid + 9;

            }
            if (numberchoosenGrid > -1) {
                choosenGrid.add(allGrids.get(i));
                if (i == numberchoosenGrid + 9) {
                    numberchoosenGrid = -1;
                }
            }
        }
        return choosenGrid;
    }

    public void parseData(List<String> grid) {
        String row;
        int value=0;

        System.out.println("Your grid: " + grid.get(0));
        System.out.println();
        grid.remove(0);
        for (int i = 0; i < grid.size(); i++) {
            row = grid.get(i);
            //System.out.println(row);
            for (int j = 0; j < 9; j++) {
                value = Integer.parseInt(row.substring(j,j+1));
                System.out.print(value);
            }
            value++;
            System.out.println(" ee"+value);
        }

    }

}
