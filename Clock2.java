import java.util.Date;

class Clock2 {
    private int AlarmHours;
    private int AlarmMinutes;


    public int getHours() {
        String timeStr = new Date().toString().split(" ")[3];
        int hour = Integer.parseInt(timeStr.split(":")[0]);
        return hour;
    }


    public int getMinutes() {
        String timeStr = new Date().toString().split(" ")[3];
        int minute = Integer.parseInt(timeStr.split(":")[1]);
        return minute;
    }

    public String getTime() {
        if (AlarmHours == -1 && AlarmMinutes == -1)
            return String.format("%02d:%02d", getHours(), getMinutes());
        else {
            if (getHours() >= AlarmHours && getMinutes() >= AlarmMinutes) {
                AlarmHours = -1;
                AlarmMinutes = -1;
                return String.format("%02d:%02d Alarm %c", getHours(), getMinutes(), '\u23F0');
            } else {
                return String.format("%02d:%02d", getHours(), getMinutes());
            }
        }
    }

    public void setAlarm(int hours, int minutes) {
        AlarmHours = hours;
        AlarmMinutes = minutes;
    }
}
