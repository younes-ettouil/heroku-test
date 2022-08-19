package premo.gmaobackend.enums;

public enum Shift {
    MATIN("matain"), SOIR("soir"), NUIT("nuit");


    private String shift;

    private Shift(String shift) {
        this.shift = shift;
    }

    public String getShift() {
        return this.shift;
    }


    public void setShift(Shift soir) {

    }
}
