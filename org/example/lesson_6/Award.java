package lesson_6;


public class Award {
    private String contest;
    private String place;
    private int year;

    @Override
    public String toString() {
        return "Award{" +
                "contest='" + contest + '\'' +
                ", place='" + place + '\'' +
                ", year=" + year +
                '}';
    }

    public Award(String contest, String place, int year) {
        this.contest = contest;
        this.place = place;
        this.year = year;
    }


}
