public class Test {


        public static void main(String[] args) {

            Clock c = new Clock();

            System.out.printf("%02d:%02d\n", c.getHour(), c.getMinute());

            WorldClock worldClock = new WorldClock(3);

            System.out.println(worldClock.getTime());

        }

}
