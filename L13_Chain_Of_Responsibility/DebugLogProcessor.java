package L13_Chain_Of_Responsibility;

public class DebugLogProcessor extends LogProgressor{
    DebugLogProcessor(LogProgressor nextLogProcessor){
    super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("INFO: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
