public class LogLevels {

    public static String message(String logLine) {
        if( !(logLine.contains("[INFO]") || logLine.contains("[WARNING]") || logLine.contains("[ERROR]"))){
            return logLine.trim();
        }
        else{
            int i = logLine.indexOf("]:");
            logLine=logLine.substring(i+2,logLine.length());
                return logLine.trim();
        }
  
    }

    public static String logLevel(String logLine) {
        if(logLine.toUpperCase().contains("[ERROR]")) return "error";
        else if(logLine.toUpperCase().contains("[WARNING]")) return "warning";
        else if(logLine.toUpperCase().contains("[INFO]")) return "info";
        return "";
    }

    public static String reformat(String logLine) {
        logLine=logLine.trim();
        int i = logLine.indexOf("]: ")+2;
        if(i==-1) return "Invalid log";
        return (logLine.substring(i,logLine.length())+" ("+logLevel(logLine)+")").trim();
    }
}
