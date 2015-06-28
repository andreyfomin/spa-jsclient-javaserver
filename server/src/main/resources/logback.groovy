import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.classic.html.HTMLLayout
import ch.qos.logback.core.ConsoleAppender
import ch.qos.logback.core.FileAppender
import ch.qos.logback.core.encoder.LayoutWrappingEncoder
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

import java.nio.charset.Charset

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO

def bySecond = timestamp("ddMMyyyy")

appender("SPA_APP_LOG_FILE", FileAppender) {
    file = "logs/spa-main-${bySecond}.log"
    encoder(PatternLayoutEncoder) {
        pattern = "%date %level [%thread] %logger{10} [%file:%line] %msg%n"
    }
}

appender("FILE", RollingFileAppender) {
    file = "logs/logFile.html"
    rollingPolicy(TimeBasedRollingPolicy) {
        fileNamePattern = "logs/logFile.%d{yyyy-MM-dd}.%i.html"
        timeBasedFileNamingAndTriggeringPolicy(SizeAndTimeBasedFNATP) {
            maxFileSize = "50MB"
        }
        maxHistory = 30
    }
    encoder(LayoutWrappingEncoder) {
        charset = Charset.forName("UTF-8")
        layout(HTMLLayout) {
            pattern = "%d{HH:mm:ss.SSS}%thread%level%logger%line%msg"
        }
    }
}

//appender("CRON_JOB_FILE", FileAppender) {
//    file = "ebs-admin-cron-job-${bySecond}.log"
//    encoder(PatternLayoutEncoder) {
//        pattern = "%date %level [%thread] %logger{10} [%file:%line] %msg%n"
//    }
//}

appender("STDOUT", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
        pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
    }
}

//logger("com.ebs.admin.server.scheduled", INFO, ["CRON_JOB_FILE"], true)

root(DEBUG, ["STDOUT", "FILE"])