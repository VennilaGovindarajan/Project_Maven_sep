package com.mvnpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Pom.Address_Page;
import com.Pom.Dresses_Page;
import com.Pom.EvenDress_Page;
import com.Pom.Frame1_Page;
import com.Pom.Home_Page;
import com.Pom.Login_Page;
import com.Pom.Orderconfirm_Page;
import com.Pom.Ordersummary_Page;
import com.Pom.Payment_Page;
import com.Pom.Product_img_Page;
import com.Pom.Shipping_Page;
import com.Pom.Summary_Page;
import com.helper.File_Reader_Manager;
import com.mvnpractice.Project_BaseClass;
import com.sdp.Page_Object_Manager;

public class Mini_Project extends Project_BaseClass {
	public static WebDriver driver = browserConfig("chrome") ; // --> null

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {
//		driver = browserConfig("chrome");  //--> chrome

		String url = File_Reader_Manager.getInstance().getInstanceCR().getLaunchBrowser();
		launchBrowser(url);

//		launchBrowser("http://automationpractice.com/index.php");
		waitConcept(null, "implicit", 20);
		clickonElement(pom.getInstanceHp().getSignin());
		waitConcept(null, "implicit", 20);
		
		String emailId = File_Reader_Manager.getInstance().getInstanceCR().getEmailId();
		inputValues(pom.getInstanceLp().getEmailId(), emailId);
		
//		String password = File_Reader_Manager.getInstance().getInstanceCR().getPassword();
//		inputValues(pom.getInstanceLp().getPassword(), password);
		String password = Read_TestData_from_Excel("C:\\Users\\admin\\Desktop\\Testcase1.xlsx", 7, 5);
		inputValues(pom.getInstanceLp().getPassword(), password);
		
		clickonElement(pom.getInstanceLp().getSignInBtn());
		mousebasedActions(pom.getInstanceDp().getDressesMenu());
		clickonElement(pom.getInstanceDp().getDressesMenu());
		mousebasedActions(pom.getInstanceEp().getEveDresses());
		clickonElement(pom.getInstanceEp().getEveDresses());
		mousebasedActions(pom.getInstanceEp().getPrintedDress());
		clickonElement(pom.getInstanceEp().getPrintedDress());
		clickonElement(pom.getInstanceEp().getQuickView());
		waitConcept(null, "implicit", 10);
		frames(pom.getInstanceF1p().getFrame1());
		waitConcept(null, "implicit", 10);
		for (int i = 1; i < 10; i++) {
			clickonElement(pom.getInstanceF1p().getPlusBtn());
		}
		
		selectBy(pom.getInstanceF1p().getSizeBtn(), "value","3");
		clickonElement(pom.getInstanceF1p().getColour());
		clickonElement(pom.getInstanceF1p().getAddtoCart());
		defaultcontent();
		waitConcept(null, "implicit", 10);
		clickonElement(pom.getInstancePimg().getProceedBtn());
		javascript(pom.getInstanceSump().getShopping());
		waitConcept(null, "implicit", 10);
		takescreenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Screenshot\\projectpic1.png");
		waitConcept(null, "implicit", 10);
		clickonElement(pom.getInstanceSump().getProceedBtn2());
		clickonElement(pom.getInstanceAddp().getProceedBtn3());
		clickonElement(pom.getInstanceShipp().getCheckBox());
		clickonElement(pom.getInstanceShipp().getProceedBtn4());
		waitConcept(null, "implicit", 10);
		clickonElement(pom.getInstancePayp().getPaybyBank());
		javascript(pom.getInstanceOrderp().getOrderSummary());
		waitConcept(null, "implicit", 10);
		takescreenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Screenshot\\projectpic2.png");
		waitConcept(null, "implicit", 10);
		clickonElement(pom.getInstanceOrderp().getConfirmOrder());
		javascript(pom.getInstanceOrderconp().getOrderConfirmation());
		takescreenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Screenshot\\projectpic3.png");

		// miniproject --> another product purchase
		clickonElement(pom.getInstanceOrderconp().getLogo());
		waitConcept(null, "implicit", 10);
		mousebasedActions(pom.getInstanceHp().getWomenMenu());
		waitConcept(null, "implicit", 10);
		mousebasedActions(pom.getInstanceHp().getTops());
		clickonElement(pom.getInstanceHp().getTops());
		mousebasedActions(pom.getInstanceTops().getFadedTshirt());
		mousebasedActions(pom.getInstanceTops().getQuickView2());
		clickonElement(pom.getInstanceTops().getQuickView2());
		frames(pom.getInstanceF2p().getFrame2());

		for (int i = 0; i < 10; i++) {
			clickonElement(pom.getInstanceF2p().getPlusBtn1());

		}
		
		selectBy(pom.getInstanceF2p().getSizeBtn1(), "index", "1");
		clickonElement(pom.getInstanceF2p().getColour1());
		clickonElement(pom.getInstanceF2p().getAddtocart1());
		driver.switchTo().defaultContent();
		sleep(2000);
		takescreenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Screenshot\\projectpic4.png");
		clickonElement(pom.getInstancePimg1().getProceedBtn5());
		javascript(pom.getInstanceSump1().getShoppingCart());
		sleep(2000);
		takescreenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Screenshot\\projectpic5.png");
		clickonElement(pom.getInstanceSump1().getProceedBtn6());
		clickonElement(pom.getInstanceAddp1().getProceedBtn7());
		clickonElement(pom.getInstanceShipp1().getCheckBox1());
		clickonElement(pom.getInstanceShipp1().getProceedBtn8());
		javascript(pom.getInstancePayp1().getPleasechoose());
		sleep(2000);
		takescreenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Screenshot\\projectpic6.png");
		clickonElement(pom.getInstancePayp1().getBankwire());
		javascript(pom.getInstanceOrderP1().getOrdersummary());
		sleep(2000);
		takescreenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Screenshot\\projectpic7.png");
		clickonElement(pom.getInstanceOrderP1().getConfirmOrder1());
		javascript(pom.getInstanceOrderconp1().getOrderConfirm());
		sleep(2000);
		takescreenshot("C:\\Users\\admin\\eclipse-workspace\\Maven_Project\\Screenshot\\projectpic8.png");
	}

	

}
