package task4;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LoggerExample {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(LoggerExample.class.getName());
        CustomHandler customHandler=new CustomHandler();
        CustomFormat customFormatter=new CustomFormat();
        customHandler.setFormatter(customFormatter);
        logger.addHandler(customHandler);
        try {
            throw new Exception("Bu xato!!!");
        }catch (Exception e){
            logger.log(Level.SEVERE,"Xatolik yuz berdi",e);
        }
    }
}
