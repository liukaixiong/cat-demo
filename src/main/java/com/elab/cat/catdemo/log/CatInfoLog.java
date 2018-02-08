package com.elab.cat.catdemo.log;

import com.dianping.cat.Cat;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.spi.ThrowableInformation;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author Liukx
 * @create 2018-02-06 17:58
 * @email liukx@elab-plus.com
 **/
public class CatInfoLog extends AppenderSkeleton {

    protected void append(LoggingEvent event) {
        boolean isTraceMode = Cat.getManager().isTraceMode();
        Level level = event.getLevel();
        if (level.isGreaterOrEqual(Level.ERROR)) {
            this.logError(event);
        } else if (!isTraceMode) {
            this.logTrace(event);
        }

    }

    private String buildExceptionStack(Throwable exception) {
        if (exception != null) {
            StringWriter writer = new StringWriter(2048);
            exception.printStackTrace(new PrintWriter(writer));
            return writer.toString();
        } else {
            return "";
        }
    }

    public void close() {
    }

    private void logError(LoggingEvent event) {
        ThrowableInformation info = event.getThrowableInformation();
        if (info != null) {
            Throwable exception = info.getThrowable();
            Object message = event.getMessage();
            if (message != null) {
                Cat.logError(String.valueOf(message), exception);
            } else {
                Cat.logError(exception);
            }
        }

    }

    private void logTrace(LoggingEvent event) {
        String type = "Log4j";
        String name = event.getLevel().toString();
        Object message = event.getMessage();
        String data;
        if (message instanceof Throwable) {
            data = this.buildExceptionStack((Throwable) message);
        } else {
            data = event.getMessage().toString();
        }

        ThrowableInformation info = event.getThrowableInformation();
        if (info != null) {
            data = data + '\n' + this.buildExceptionStack(info.getThrowable());
            Cat.logError(data, info.getThrowable());
            return;
        }
        Cat.logEvent(type, name, "0", data);
    }

    public boolean requiresLayout() {
        return false;
    }

}
