public class Radio {
    private double freq;
    private int volume;

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "freq=" + freq +
                ", volume=" + volume +
                '}';
    }
}
