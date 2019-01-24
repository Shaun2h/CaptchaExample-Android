# CaptchaExample-Android:
Referenced from http://www.devexchanges.info/2016/11/implement-captcha-in-android.html <br>
Example has been however, made to work correctly without any errors.<br>
## Requirements
Utilises native Java libraries, no additional installations are required.
### Details
This is not meant to be utilised as a library of any form, and is instead a working example of the captcha in the article provided above. <br>
As it requires nothing but the native libraries to provide a very simple example of a working captcha, it can be used in more complicated projects if external libraries have to be avoided in their creation. <br>
* CaptchaExample-Android/Captchatest/app/src/main/java/com/example/user/captchatest/MainActivity.java - The main activity script.
 * CaptchaExample-Android/Captchatest/app/src/main/java/com/example/user/captchatest/Captcha.java - Text based captcha. Text here is generated in text.java <br>
* CaptchaExample-Android/Captchatest/app/src/main/java/com/example/user/captchatest/Mathtest.java - Mathematics version of the test.
* CaptchaExample-Android/Captchatest/app/src/main/java/com/example/user/captchatest/Text.java - Generates text for captcha.java
* CaptchaExample-Android/Captchatest/app/src/main/res/layout/activity_main.xml - dictates the main activity's layout.
* CaptchaExample-Android/Captchatest/app/src/main/res/values/strings.xml - dictates the strings for the main activity layout.
Of note is that styles.xml and colors.xml are also available in the same file as strings.xml

A basic activity should also be visible upon successful setting up of this project. <br>
For expedient setup, only the files noted above are vital for a quick demonstration, and can be copied into a brand new android project. <br>
All relative file paths were provided above.
