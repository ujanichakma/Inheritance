public class Clock {

        public Clock() {

        }

        public int getMinute() {

            String s = new java.util.Date().toString();

            return Integer.parseInt(s.substring(14, 16));

        }

        public int getHour() {

            String s = new java.util.Date().toString();

            return Integer.parseInt(s.substring(11, 13));

        }

        public String getTime() {

            return getHour() + ":" + getMinute();

        }

}
