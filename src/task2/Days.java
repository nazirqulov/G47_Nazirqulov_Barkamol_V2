package task2;

import java.time.LocalDate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Days {
    public static void main(String[] args) {
        LocalDate start=LocalDate.of(2019,3,1);
        LocalDate end=LocalDate.of(2024,9,30);
        ExecutorService executor= Executors.newSingleThreadExecutor();
        AtomicInteger Hours=new AtomicInteger();
        for (int Year = start.getYear(); Year <end.getYear() ; Year++) {
            int finalYear=Year;
            executor.execute(()->{
                for (LocalDate date = LocalDate.of(2019,3,1);
                     date.getYear()==finalYear ; date=date.plusDays(1)) {
                    if (date.getDayOfWeek().getValue()==6){
                        Hours.addAndGet(6);
                    }
                    if (date.getDayOfWeek().getValue()==7){
                        Hours.addAndGet(9);
                    }
                }
            });
        }
        executor.shutdown();
        while (!executor.isTerminated()){}
        System.out.println("Soat:"+Hours);
    }
}
