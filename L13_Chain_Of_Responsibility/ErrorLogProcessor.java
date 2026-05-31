package L13_Chain_Of_Responsibility;

public class ErrorLogProcessor extends LogProgressor{
    ErrorLogProcessor(LogProgressor nextLogProcessor){
    super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == ERROR){
            System.out.println("ERROR: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}
