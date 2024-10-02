package task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderService orderService=new OrderService();
        for (int i = 0; i <5; i++) {
           Thread thread=new Thread(()->{
               for (int j = 0; j < 1000; j++) {
                   orderService.increaseOrderCount();
               }
           });
           thread.start();
        }

        Thread.sleep(500);
        System.out.println("Natija:"+orderService.getOrderCount());
    }
}
