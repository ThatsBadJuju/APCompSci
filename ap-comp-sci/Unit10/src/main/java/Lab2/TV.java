package Lab2;

public abstract class TV  {
    private boolean tvOn;

    public boolean isTvOn() {
        return tvOn;
    }

    public void setTvOn(boolean tvOn) {
        this.tvOn = tvOn;
    }

    public abstract String tvType();
}
