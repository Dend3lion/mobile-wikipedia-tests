# Test automation project for [Wikipedia](https://ru.wikipedia.org/) mobile app

<p align="center"><a href="https://ru.wikipedia.org/"><img src="media/images/Wiki_logo.png" align="center" width="200" height="200" alt="Wiki"/></a></p>  

## :bookmark_tabs: Contents
- [Technologies and tools](#computer-technologies-and-tools)
- [Test cases](#clipboard-test-cases)
- [Running tests locally](#rocket-running-tests-locally)
- [Build in Jenkins](#-build-in-jenkins)
- [Test results in Allure report](#-test-results-in-allure-report)
- [Test management in Allure TestOps](#-allure-testops)
- [Integration with Jira](#-integration-with-jira)
- [Remote launch in Browserstack](#-remote-launch-in-browserstack)
- [Notification of test results in Telegram](#-notification-of-test-results-in-telegram)
- [Test video](#film_strip-test-video)


## :computer: Technologies and tools
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img width="6%" title="IntelliJ IDEA" src="media/images/Intelij_IDEA.svg"></a>
<a href="https://www.java.com/"><img width="6%" title="Java" src="media/images/Java.svg"></a>
<a href="https://github.com/allure-framework"><img width="6%" title="Allure Report" src="media/images/Allure_Report.svg"></a>
<a href="https://qameta.io/"><img width="5%" title="Allure TestOps" src="media/images/AllureTestOps.svg"></a>
<a href="https://gradle.org/"><img width="6%" title="Gradle" src="media/images/Gradle.svg"></a>
<a href="https://junit.org/junit5/"><img width="6%" title="JUnit5" src="media/images/JUnit5.svg"></a>
<a href="https://github.com/"><img width="6%" title="GitHub" src="media/images/GitHub.svg"></a>
<a href="https://www.jenkins.io/"><img width="6%" title="Jenkins" src="media/images/Jenkins.svg"></a>
<a href="https://web.telegram.org/"><img width="6%" title="Telegram" src="media/images/Telegram.svg"></a>
<a href="https://www.atlassian.com/software/jira/"><img width="5%" title="Jira" src="media/images/Jira.svg"></a>
<a href="https://www.browserstack.com/"><img width="5%" title="BroserStack" src="media/images/Browserstack.svg"></a>
<a href="https://appium.io/"><img width="5%" title="Appium" src="media/images/Appium.svg"></a>
</p>

Automated tests are written in the `Java` language using `JUnit 5` and `Selenide`. The project is built with `Gradle`. For remote execution, a task is implemented in `Jenkins` to generate an `Allure report` and send the results to `Telegram` using a bot. Local execution is done in the `Android Studio` emulator. Remote execution on real mobile devices is carried out on `Browserstack`. `Appium Server GUI` and `Appium Inspector` are used for writing automated tests. To manage test scenarios and manually initiate test runs, `Allure TestOps` is utilized, and the results of their completion are linked to `Jira` issues.

## :clipboard: Test cases
- :white_check_mark: Successful article search
- :white_check_mark: Check main page sections
- :white_check_mark: Hide featured article
- :white_check_mark: Change language

## :rocket: Running tests locally

### Local launch (via emulator)

```bash
gradle clean test -Dhost=local
```

> To run local tests, the following programs are required: Appium, Appium Server, Android Studio

### Remote launch (via browserstack)

```bash
gradle clean test -Dhost=browserstack
```

## <img alt="Jenkins" width="5%" src="media/images/Jenkins.svg"/> Build in [Jenkins](https://jenkins.autotests.cloud/job/mobile-wikipedia-tests/)
<p align="center">  
<img src="media/images/Jenkins_Screenshot.png" alt="Jenkins" width="950"/></a>  
</p>

## <img alt="Allure Report" width="5%" src="media/images/Allure_Report.svg"/> Test results in [Allure report](https://jenkins.autotests.cloud/job/mobile-wikipedia-tests/allure/)
<p align="center">  
<img src="media/images/AllureReport_Main.png" alt="Allure Report main page" width="950"/></a>  
</p>
<p align="center">  
<img src="media/images/AllureReport_Tests.png" alt="Allure Report suites page" width="950"/></a>  
</p>

## <img alt="Allure TestOps" width="4%" src="media/images/AllureTestOps.svg"/> Test management in [Allure TestOps](https://allure.autotests.cloud/project/4001/dashboards)
<p align="center">  
<img src="media/images/AllureTestOps_Main.png" alt="Allure Report main page" width="950"/></a>  
</p>
<p align="center">  
<img src="media/images/AllureTestOps_Tests.png" alt="Allure Report suites page" width="950"/></a>  
</p>

## <img alt="Jira" width="4%" src="media/images/Jira.svg"/> Integration with [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1085)
<p align="center">  
<img src="media/images/Jira_Task.png" alt="Jira task page" width="950"/></a>  
</p>


## <img alt="Telegam" width="5%" src="media/images/Telegram.svg"/> Notification of test results in [Telegram](https://play.google.com/store/apps/details?id=org.telegram.messenger&hl=ru&gl=US)
<p align="center">  
<img src="media/images/Telegram_Bot.png" alt="Telegram bot" width="300"/></a>  
</p>

## <img alt="Browserstack" width="4%" src="media/images/Browserstack.svg"/> Remote launch in [Browserstack](https://app-automate.browserstack.com/dashboard/v2/builds/100cb76c76a2eb6a330a94f7a6590a887adb5fde/sessions/863b2681e96634f718fa7a3efc990accc8be97a5)
<p align="center">  
<img src="media/images/Browserstack_Test.png" alt="Browserstack launch page" width="950"/></a>  
</p>

## :film_strip: Test video
<p align="center">  
<img src="media/gifs/Test_Video.gif" alt="Test Video" width="250"/></a>  
</p>
