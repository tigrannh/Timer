public class TimerThread extends Thread {
    Timer timer;

    public TimerThread(int min, int sec) {
        timer = new Timer(min,sec);
    }

    @Override
    public void run() {
        timer.startTimer();
    }
}
