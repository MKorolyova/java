import java.util.*;

public class ArgumentAnalyzer {
    public  ArrayList<String> analyze(String[] arguments,  String substring){

       ArrayList<String> argumentsWithSubstring= new  ArrayList<String>();
        for(String arg : arguments){
            if(arg.contains(substring)){
                argumentsWithSubstring.add(arg);
            }
        }
        return argumentsWithSubstring;
    }
}
