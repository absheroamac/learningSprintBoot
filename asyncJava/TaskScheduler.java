class Task extends Thread{
    private String taskName;

    public Task(String taskName){
        this.taskName = taskName;
        this.setName(taskName);
    }

    public void run(){
        System.out.println("Currently Started "+Thread.currentThread().getName());

        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            e.printStackTrace();

        }

        System.out.println("Completed "+Thread.currentThread().getName());
    }
}


public class TaskScheduler {

    public static void main(String args[]){
        System.out.println("Welcome");

        Task task1 = new Task("emailSender");
        Task task2 = new Task("dataProcessor");
        Task task3 = new Task("Logger");

        task1.start();
        task2.start();
        task3.start();

        try{
            task1.join();
            task3.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();

        }

        System.out.println("Welcome");
    }
}