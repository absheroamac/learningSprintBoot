public class Main {

     public static void main(String[] args) throws InterruptedException {
        
        System.out.println(Thread.currentThread().getName());
        myThread thread = new myThread();
        Thread threadWithRunnable = new Thread(new myRunnable());

        threadWithRunnable.setPriority(10);
        thread.setPriority(1);
        thread.start();
        threadWithRunnable.start();
        threadWithRunnable.setName("Runnable Thread");
        thread.setName("workerThread");
        thread.join();

        System.out.println("Running at the end");
        
     }
}

class myThread extends Thread {
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("thread Running"+Thread.currentThread().getName());
    }
}

class myRunnable implements Runnable{
    public void run(){
        System.out.println("Runnable thread Running"+Thread.currentThread().getName());
    }
}