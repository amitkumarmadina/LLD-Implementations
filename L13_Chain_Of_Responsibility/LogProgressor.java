package L13_Chain_Of_Responsibility;

public abstract class LogProgressor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR  = 3;

    LogProgressor nextLoggerProcessor;

    LogProgressor(LogProgressor loggerProgressor){
        this.nextLoggerProcessor = loggerProgressor;
    }

    public void log(int logLevel, String message){
        if(nextLoggerProcessor != null){
            nextLoggerProcessor.log(logLevel, message);
        }
    }
}
