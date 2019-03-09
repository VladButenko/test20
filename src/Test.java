
public class Test {

    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        int timeToWait = 10; //second
        for (int i = 0; i < timeToWait; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        int timeToWait = 10; //second
        for (int i = 0; i < timeToWait; i++) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
