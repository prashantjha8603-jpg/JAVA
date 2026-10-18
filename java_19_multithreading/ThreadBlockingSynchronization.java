package java_19_multithreading;


class SharedResource {

    synchronized void display(String message) {
        System.out.println(
            Thread.currentThread().getName() + " entered display()"
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println(message);

        System.out.println(
            Thread.currentThread().getName() + " leaving display()"
        );
    }
}

class WorkerThread extends Thread {

    private SharedResource resource;
    private String message;

    WorkerThread(SharedResource resource, String message, String name) {
        super(name);
        this.resource = resource;
        this.message = message;
    }

    public void run() {
        resource.display(message);
    }
}

public class ThreadBlockingSynchronization {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        WorkerThread t1 = new WorkerThread(
            resource, "Hello from Thread 1", "Thread-1"
        );

        WorkerThread t2 = new WorkerThread(
            resource, "Hello from Thread 2", "Thread-2"
        );

        t1.start();
        t2.start();
    }
}
