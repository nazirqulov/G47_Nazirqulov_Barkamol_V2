package task4;

import java.time.LocalDateTime;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class CustomHandler extends Handler {
    @Override
    public void publish(LogRecord record) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime.getYear()+"."+localDateTime.getMonth().getValue()+"."+localDateTime.getDayOfWeek().getValue()+"_"+
                localDateTime.getHour()+":"+localDateTime.getMinute()+"."+record.getLoggerName());
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }
}
