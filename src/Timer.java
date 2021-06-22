public class Timer {
    private int min;
    private int sec;

    public Timer(int min, int sec) {
        if(min<0 || sec<0) throw new RuntimeException("Negative value for timer!");
        this.min = min;
        this.min += sec / 60;
        this.sec = sec % 60;
    }

    public void startTimer() {
        while (min != 0 || sec != 0) {
            System.out.print(min < 10 ? "0" + min : min);
            System.out.print(":");
            System.out.println(sec < 10 ? "0" + sec : sec);
            if (sec != 0) --sec;
            else {
                --min;
                sec = 59;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("00:00");
    }

}
