package com.git.Xpath;

public class xPathAxes {


    /*
    * self - Target - like (0,0 axes) which is origin
    *  parent:: one step upward
    * /.. parent
    * /ancestor:: parent /grand parent  / their parent
    * //ancestor:: stair case level node/same level along with current
    *
    * /preceding-sibling:: elder sibling  //sibling means same level, preceding means top
    * /preceding:: sibling (any type of sibling) + and their children + grand children etc
    * //preceding:: sibling + their children + grand children
    *
    * following-sibling:: younger sibling //
    * following:: younger sibling and their family members
    *
    * descendant:: children + grand children
    * from self to ancestor -  immediate ancestor (no parent)
    *
    * ((//a[normalize-space (text())='Markets'])[1]/following::a[normalize-space(text())='News'])[1]
     //a[normalize-space (text())='Markets']
    *      * (//li[@class="menu_l1 active sub_nav"]/following::a[@title="News"])[last()-1]
     * (//li[@class="menu_l1 active sub_nav"]/following::a[@title="News"])[position()=2]
     * (//li[@class="menu_l1 active sub_nav"]/following::a[@title="News"])[last()]

     *
    * https://www.flipkart.com/
    * //div[text()='Wearables ']/preceding-sibling::div
    * //div[text()='Wearables ']/parent::div
    * //div[text()='Wearables ']/ancestor::div[@class='css-175oi2r'] --doubt how to identify the corresponding div
    * //div[text()='Wearables ']/ancestor::div[@class='css-175oi2r r-13awgt0 r-eqz5dr']
    * //div[text()='Wearables ']/preceding::div[text()='Audio ']
    * //div[text()='Wearables ']/preceding::div[text()='Launches ']
    * //div[text()='Wearables ']/following::div[text()='Grooming ']
    * //div[text()='Wearables ']/following::div[text()='Mobile cases ']
    * //div[text()='Wearables ']/following::div[text()='Chargers ']
    *
    * //div[@class='rOWPP0']/following::a[text()='Contact Us']
    * child:: immediate child
    * descendant:: down any where in his family
    *
    * https://smartcare.sbilife.co.in/SmartCare/pre/login
    * //div[@id='otpDivId']/preceding-sibling::div[@id='captchaDivId']
    * //div[@id='otpDivId']/preceding::input[@placeholder='*Answer Captcha']
    * //div[@id='otpDivId']/following-sibling::h4[text()=' Group customers ']
    * //div[@id='otpDivId']/following::a[text()='click here']
    *
    * //input[@placeholder='Mobile Number/Email Id']/ancestor::a[@class='OTP float-end'] - pls explain once about ancestor
    * //input[@placeholder='Mobile Number/Email Id']/ancestor::form[@class='ng-untouched ng-pristine ng-valid']
    * --ancestor means parent/grandparent/their parent only ?//grand parent sibling comes under ancestor ?
    * //input[@placeholder='Mobile Number/Email Id']/parent::div[@id="mobileEmailField"]
    * //input[@placeholder='Mobile Number/Email Id']/ancestor::div[@id="mobileEmailField"]
    *
    *
    *
    * */
}
