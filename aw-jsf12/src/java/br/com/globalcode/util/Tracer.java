package br.com.globalcode.util;

public class Tracer {
    private static int logId = 0;

    public Tracer() {
    }

    public static void log(Object loggedObject, String text) {
        logId++;
        System.out
        .println(logId + "  [" + loggedObject.getClass().getName() + "] " +
                           text);
    }

}

