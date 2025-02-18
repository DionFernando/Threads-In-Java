public class MyRunnable implements Runnable{
    private String name;

    public MyRunnable(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Thread Started :" + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Ended : " + name);

    }
}