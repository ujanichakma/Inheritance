class Test2 {
    public static void main(String[] args) {
        // creating a Clock with current time
        Clock clock = new Clock();
        WorldClock2 worldClock = new WorldClock2(12);
        worldClock.setAlarm(0, 12);
        System.out.println(clock.getTime());
        System.out.println(worldClock.getTime());
    }
}
