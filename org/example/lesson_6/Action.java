package lesson_6;

public class Action {
    public String trickName;
    public String coach;

    public Action(String trickName, String coach) {
        this.trickName = trickName;
        this.coach = coach;
    }

    public String getTrickName() {
        return trickName;
    }

    public void setTrickName(String trickName) {
        this.trickName = trickName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Action{" +
                "trickName='" + trickName + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }
}
