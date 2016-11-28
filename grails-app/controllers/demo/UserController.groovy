package demo

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class UserController {

    def index() {
        Logger log = LoggerFactory.getLogger(getClass())
//        println log.class
        log.error('logback Intialiazed');
    }
}
