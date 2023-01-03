# Test Appium

Basic Appium and Cucumber - BDD framework. **Appium** is a mobile web, native, and hybrid application test automation tool. Appium can test Android applications and iOS applications. **Cucumber** is a software tool or framework supporting using behavior-driven development (BDD) in our software test process.

# List of tools has to be installed
- Intellij - IDE
- Appium - Mobile Automation library
- Maven
- Java - Programming language
- Cucumber - BDD
- Android SDK
- Gherkin Plugin
- JUnit
- Android studio for device emulator

# Installation
1. JAVA SDK installation 
2. Intellij installation 
3. Install cucumber and gherkin plugin 
4. Install node and appium 
5. Install maven
6. Download Android SDK (we can download from Intellij -> /Preferences/System Settings/Android SDK)
7. Setup environment
~~~
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-18.0.2.1.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH
export ANDROID_HOME=/Users/bagus.setiyono/Library/Android/sdk
export PATH="${ANDROID_HOME}/tools:${PATH}"
export PATH="${ANDROID_HOME}/emulator:${PATH}"
export PATH="${ANDROID_HOME}/platform-tools:${PATH}"
~~~
8. Create project MAVEN with installed IDE
10. Write code. We have some packages. pages is for class page every screen. setups is for set capabilities and set driver. steps is for store steps scenario. utilities is for hooks.
11. Capabilities
~~~
"platformName" : "Android"
"platformVersion" : "8"
"appPackage" : "com.saucelabs.mydemoapp.android"
"appActivity" : "com.saucelabs.mydemoapp.android.view.activities.SplashActivity"
"udid" : "emulator-5554"
~~~

# How to Run
1. open android emulator device (we are using Nexus 5X with android version is 8)
2. install apk. we can find apk in src/test/resources/app
2. open TestRunner java file.
2. click run in TestRunner java class. we run using feature tags.
3. if you using appium server gui, make sure the server is not running with the same ip and port with our automation.

