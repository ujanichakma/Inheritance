public class WorldClock extends Clock {

        private int timeOffset;

        public WorldClock(int timeOffset) {

            this.timeOffset = timeOffset;

        }

        public int getHour() {

            int hour = super.getHour() + timeOffset;

            if (hour > 23) {

                while (hour > 23) {

                    hour = 23 - hour;

                }

            }

            if (hour < 0) {

                while (hour < 0) {

                    hour = 23 + hour;

                }

            }

            return hour;

        }
}
