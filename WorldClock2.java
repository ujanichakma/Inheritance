class WorldClock2 extends Clock2 {
    private int offset;

    public WorldClock2(int offset) {
        this.offset = offset % 24;
    }

    public int getHours() {

        int hr = super.getHours();
        hr += offset;
        if (hr > 23) {
            hr = hr - 24;
        } else if (hr < 0) {
            hr = hr + 24;
        }
        return hr;
    }

    public void setAlarm(int hours, int minutes) {
        super.setAlarm((hours + offset) % 24, minutes);
    }
}

