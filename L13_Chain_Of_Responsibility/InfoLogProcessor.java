package L13_Chain_Of_Responsibility;

public class InfoLogProcessor extends LogProgressor{
    InfoLogProcessor(LogProgressor nextLogProcessor){
    super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("INFO: " + message);
        }else{
            super.log(logLevel, message);
        }
    }
}

