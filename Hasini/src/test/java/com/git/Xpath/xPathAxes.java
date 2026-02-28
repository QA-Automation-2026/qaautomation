package com.git.Xpath;

public class xPathAxes {


    /*
    * self - Target - like (0,0 axes) which is origin
    *  parent:: one step upward
    * ancestor:: parent or above parent
    * preceding-sibling:: elder sibling  //sibling means same level, preceding means top
    * preceding:: //sibling + and their children/grand children etc
    * following-sibling:: younger sibling //
    * following:: younger sibling and their family members
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
    * https://smartcare.sbilife.co.in/SmartCare/pre/login
    * //div[@id='otpDivId']/preceding-sibling::div[@id='captchaDivId']
    * //div[@id='otpDivId']/preceding::input[@placeholder='*Answer Captcha']
    * //div[@id='otpDivId']/following-sibling::h4[text()=' Group customers ']
    * //div[@id='otpDivId']/following::a[text()='click here']
    *
    *
    *
    * */
}
