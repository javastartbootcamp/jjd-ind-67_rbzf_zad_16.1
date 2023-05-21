package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        printSeasons();
        String userInput = scanner.nextLine();
        Season season = getSeason(userInput);
        if (season == null) {
            System.out.println("Niewlasciwa nazwa pory roku");
            return;
        }

        System.out.println("W tej porze roku są następujące miesiące:");
        System.out.println(Arrays.toString(season.getMonthList()));

    }

    private static Season getSeason(String userInput) {
        Season season = null;
        for (int i = 0; i < Season.values().length; i++) {
            if (userInput.equalsIgnoreCase(Season.values()[i].getPlTranslation())) {
                season = Season.values()[i];
                break;
            }
        }
        return season;
    }

    private void printSeasons() {
        for (Season season : Season.values()) {
            System.out.println(season.getPlTranslation());
        }
    }

}
