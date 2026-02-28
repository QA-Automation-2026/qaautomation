package com.xPathLocators;

public class sibliingPrecedingXpaths {
    /*
     * following-X-path-->
     * webiste:https://www.makemytrip.com/
    * //a[@class='headerIcons makeFlex hrtlCenter column active']/following::li[@class="menu_Hotels"]
    * //a[@class='headerIcons makeFlex hrtlCenter column active']/following::li[@class="menu_Holidays removeItemMargin"]
    * //a[@class='headerIcons makeFlex hrtlCenter column active']/following::li[@class="menu_Homestays"]
    * //a[@class='headerIcons makeFlex hrtlCenter column active']/following::li[@class="menu_Trains"]
    * //a[@class='headerIcons makeFlex hrtlCenter column active']/following::li[@class="menu_Buses"]
    * //span[text()= 'Cabs']/following::li[@class="menu_Visa"]
    * //span[text()= 'Cabs']/following::li[@class="menu_Forex"]
    * //span[text()= 'Cabs']/following::li[@class="menu_TravelInsurance"]
    * flipkart:
    * //div[text()='Fashion ']/following::div[text()='Travel ']
    * //div[text()='Electronics ']/following::div[text()='Home & kitchen ']
    * //div[text()='GenZ Trends ']/following::div[text()='Beauty ']
    *  //div[text()='Beauty ']/following::div[text()='SuperCoin ']
    *
    * Precidings: https://www.makemytrip.com/
    * //span[text()='Cabs']/preceding::li[@data-cy="menu_Buses"]
    * //li[@data-cy="menu_Buses"]/preceding::span[text()='Trains']
    * //span[text()='Trains']/preceding::li[@data-cy="menu_Holidays"]
    * //span[text()='Trains']/preceding::span[@class="logoContainer"]
    * //span[text()='Where2Go']/preceding::ul[@class="wishlistHeader isStickyHeader"]
    * //h3[@class="appDnldCnt__heading"]/preceding::li[@data-cy="account"]
    * //li[@data-cy="account"]/preceding::li[@data-cy="listYourProperty"]
    * Flipkart:
    * //div[text()='Food & Health ']/preceding::div[text()='Fashion ']
    * //div[text()='Fashion ']/preceding::img[@width="46"]
    * //div[text()='Fashion ']/preceding::img[@width="36.25"]
    */

}
