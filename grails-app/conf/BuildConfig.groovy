grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
grails.project.war.file = "target/ROOT.war"
def gebVersion = "0.9.2"
def seleniumVersion = "2.35.0"
grails.project.fork = [

        run: false,

]
// uncomment (and adjust settings) to fork the JVM to isolate classpaths
//grails.project.fork = [
//   run: [maxMemory:1024, minMemory:64, debug:false, maxPerm:256]
//]

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
        excludes 'grails-plugin-log4j', 'log4j'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false
    // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    credentials {
        realm = "Artifactory Realm"
        host = "gr-artmaven.appnor.net:8081"
        username = "gdboling"
        password = ""
    }

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        // mavenRepo "http://gr-artmaven.appnor.net:8081/artifactory/ext-release-local"
        // Details from docx4j Getting Started Guide at http://dev.plutext.org/svn/docx4j/trunk/docx4j/docs/Docx4j_GettingStarted.html
//    mavenRepo "http://dev.plutext.org/svn/docx4j/trunk/docx4j/m2"
//    mavenRepo "https://webdavclient4j.svn.sourceforge.net/svnroot/webdavclient4j/trunk/m2"

        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories

        mavenRepo "http://repo.grails.org/grails/libs-releases/"
//    mavenRepo "http://repo.grails.org/grails/core"
//
//    mavenRepo "http://maven.springframework.org/milestone/"
//    mavenRepo "http://download.java.net/maven/2/"
//    mavenRepo "http://oss.sonatype.org/content/repositories/snapshots"

        //mavenRepo "http://m2repo.spockframework.org/snapshots"
        // mavenRepo "http://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-support"
    }

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.

        runtime 'mysql:mysql-connector-java:5.1.29'
        test "org.spockframework:spock-grails-support:0.7-groovy-2.0"
        //compile "genrocket:genrocket:1.0"
//    compile 'org.docx4j:docx4j:2.5.0'
//    compile ":excel-export:0.2.1"
        compile "com.stripe:stripe-java:2.3.0"
        compile 'com.lowagie:itext:4.2.1'
//    compile "org.grails:grails-webflow:$grailsVersion"
        runtime 'joda-time:joda-time:2.4'
        // test("org.seleniumhq.selenium:selenium-firefox-driver:$seleniumVersion")
        compile 'org.grails.plugins:logback:0.3.1'
        //test "org.gebish:geb-spock:$gebVersion"
        //test "org.gebish:geb-junit4:$gebVersion"
        //test "org.gebish:geb-junit3:${gebVersion}"
        //test "org.grails:grails-datastore-test-support:1.0.2-grails-2.4"
        //compile 'org.apache.httpcomponents:httpcore:4.3'
        //compile 'org.apache.httpcomponents:httpclient:4.3'
//        compile 'ch.qos.logback:logback-classic:1.0.6'

    }

    plugins {


        build ":tomcat:7.0.55"

        // plugins for the compile step
//    compile ":scaffolding:2.1.2"
        compile ':cache:1.1.8'
//    compile ":asset-pipeline:1.9.9"

        // plugins needed at runtime but not for compilation
        runtime ":hibernate4:4.3.6.1" // or ":hibernate:3.6.10.18"
        runtime ":database-migration:1.4.0"
        runtime ":jquery:1.11.1"
        runtime "org.grails.plugins:gsp-resources:0.4.4"

        // Uncomment these (or add new ones) to enable additional resources capabilities
//    runtime ":zipped-resources:1.0"
//    runtime ":cached-resources:1.0"
        runtime ':resources:1.2.8'
        //runtime ":yui-minify-resources:0.1.5"

        compile ":spring-security-core:1.2.7.4"
//    compile ":greenmail:1.3.4"
        compile ":asynchronous-mail:1.2"
//    compile ":lesscss-resources:1.3.3"
        test ":code-coverage:1.2.6"

        compile ":functional-test:2.0.RC1"
        //  compile ":ckeditor:4.4.1.0"

        //ErrorReport
        //  runtime 'org.grails.plugins:jcaptcha:1.2.1'
        //  runtime 'org.grails.plugins:jquery:1.4.2.5'

//    runtime ":jquery:1.11.1"
        //   test ":geb:$gebVersion"
//    test(":spock:0.7") {
//      exclude "spock-grails-support"
//    }
    }
}
