package entity;

import java.io.Serializable;

public class Teacher implements Serializable {
    private static final long serialVersionUID = -4202768994328171449L;

    private String Tname;
    private int Tage;

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    public int getTage() {
        return Tage;
    }

    public void setTage(int tage) {
        Tage = tage;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Tname='" + Tname + '\'' +
                ", Tage=" + Tage +
                '}';
    }
}
