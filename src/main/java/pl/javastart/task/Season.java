package pl.javastart.task;

public enum Season {
    //uzupełnij
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[] {"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("Jesień", new String[] {"wrzesień", "październik", "listopad"}),
    WINTER("Zima", new String[] {"grudzień", "styczeń", "luty"});

    private final String plTranslation;
    private final String[] monthList;

    Season(String plTranslation, String[] monthList) {
        this.plTranslation = plTranslation;
        this.monthList = monthList;
    }

    public String getPlTranslation() {
        return plTranslation;
    }

    public String[] getMonthList() {
        return monthList;
    }

    public static Season getSeason(String userInput) {
        Season season = null;
        for (Season value : Season.values()) {
            if (userInput.equalsIgnoreCase(value.getPlTranslation())) {
                season = value;
                break;
            }
        }
        return season;
    }

}
