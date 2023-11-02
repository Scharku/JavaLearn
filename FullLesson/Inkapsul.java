package FullLesson;

public class Inkapsul {

    final String pol;

    public Inkapsul(String pol) {
        this.pol = pol;
    }

    private int vozrast;

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

}
