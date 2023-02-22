package Default_Package;

class MyThread implements Runnable {
    private final Object lock;

    public MyThread(Object lock) {
        this.lock = lock;
    }

    public void run() {
        synchronized(lock) {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting");
                lock.wait();
                System.out.println(Thread.currentThread().getName() + " has been notified");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class NotifyAllExample {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(new MyThread(lock), "Thread-1");
        Thread t2 = new Thread(new MyThread(lock), "Thread-2");
        Thread t3 = new Thread(new MyThread(lock), "Thread-3");
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(2000);

        // Using notifyAll() to wake up all waiting threads
        synchronized(lock) {
            lock.notifyAll();
        }
    }
}

