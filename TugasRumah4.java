class Logger {
    void log(String message) {
        System.out.println("Log: " + message);
    }
}

class FileLogger extends Logger {
    @Override
    void log(String message) {
        System.out.println("Writing to file: " + message);
    }
}

public class TugasRumah4 {
    public static void main(String[] args) {
        Logger logger = new Logger();
        FileLogger fileLogger = new FileLogger();

        logger.log("This is a log message"); // Memanggil method log() dari kelas Logger
        fileLogger.log("This is a file log message"); // Memanggil method log() dari kelas FileLogger (override)
    }
}
