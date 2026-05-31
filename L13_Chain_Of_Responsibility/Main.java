package L13_Chain_Of_Responsibility;

public class Main {
    public static void main(String[] args) {
        LogProgressor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObj.log(LogProgressor.ERROR, "exception happens");
        logObj.log(LogProgressor.DEBUG, "need to debug this");
        logObj.log(LogProgressor.INFO, "just for info");
    }
}
