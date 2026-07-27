class Logger {
HashMap<String, Integer> msgTimeStamp;
    public Logger() {
         msgTimeStamp=new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        //HashMap<String, Integer> msgTimeStamp=new HashMap<>();
        if(!msgTimeStamp.containsKey(message))
        {
            msgTimeStamp.put(message, timestamp);
            return true;
        }
        else{
            int lastTimeStamp=msgTimeStamp.get(message);
            if(timestamp<lastTimeStamp+10)
            {
                return false;
            }
            else
            {
                 msgTimeStamp.put(message, timestamp);
                 return true;
            }
        }
    
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
