package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        printSeasons();
        String userInput = scanner.nextLine();
        Season season = Season.getSeason(userInput);
        if (season == null) {
            System.out.println("Niewlasciwa nazwa pory roku");
            return;
        }

        System.out.println("W tej porze roku są następujące miesiące:");
        System.out.println(Arrays.toString(season.getMonthList()));

    }

    private void printSeasons() {
        for (Season season : Season.values()) {
            System.out.println(season.getPlTranslation());
        }
    }

}
