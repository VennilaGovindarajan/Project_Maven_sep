package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Pom.Address_Page;
import com.Pom.Address_Page1;
import com.Pom.Dresses_Page;
import com.Pom.EvenDress_Page;
import com.Pom.Frame1_Page;
import com.Pom.Frames2_Page;
import com.Pom.Home_Page;
import com.Pom.Login_Page;
import com.Pom.OrderSummary_Page1;
import com.Pom.Orderconfirm_Page;
import com.Pom.Orderconfirm_Page1;
import com.Pom.Ordersummary_Page;
import com.Pom.Payment_Page;
import com.Pom.Payment_Page1;
import com.Pom.Product_img_Page;
import com.Pom.Product_img_Page1;
import com.Pom.Shipping_Page;
import com.Pom.Shipping_Page1;
import com.Pom.Summary_Page;
import com.Pom.Summary_Page1;
import com.Pom.Tops_Page;

public class Page_Object_Manager {

	public WebDriver driver; // null

	private Home_Page hp;

	private Login_Page lp;

	private Dresses_Page dp;

	private EvenDress_Page ep;

	private Frame1_Page f1p;

	private Product_img_Page pimg;

	private Summary_Page sump;

	private Address_Page addp;

	private Shipping_Page shipp;

	private Payment_Page payp;

	private Ordersummary_Page orderp;

	private Orderconfirm_Page orderconp;

	private Tops_Page topsp;

	private Frames2_Page f2p;

	private Product_img_Page1 pimg1;
	
	private Summary_Page1 sump1;
	
	private Address_Page1 addp1;
	
	private Shipping_Page1 shipp1;
	
	private Payment_Page1 payp1;
	
	private OrderSummary_Page1 orderp1;
	
	private Orderconfirm_Page1 orderconp1;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2; // --> chrome

		PageFactory.initElements(driver, this);
	}

	public Home_Page getInstanceHp() {
		hp = new Home_Page(driver);
		return hp;

	}

	public Login_Page getInstanceLp() {
		lp = new Login_Page(driver);
		return lp;
	}

	public Dresses_Page getInstanceDp() {
		dp = new Dresses_Page(driver);
		return dp;

	}

	public EvenDress_Page getInstanceEp() {
		ep = new EvenDress_Page(driver);
		return ep;
	}

	public Frame1_Page getInstanceF1p() {
		f1p = new Frame1_Page(driver);
		return f1p;

	}

	public Product_img_Page getInstancePimg() {
		pimg = new Product_img_Page(driver);
		return pimg;

	}

	public Summary_Page getInstanceSump() {
		sump = new Summary_Page(driver);
		return sump;
	}

	public Tops_Page getInstanceTops() {
		topsp = new Tops_Page(driver);
		return topsp;

	}

	public Address_Page getInstanceAddp() {
		addp = new Address_Page(driver);
		return addp;

	}

	public Shipping_Page getInstanceShipp() {
		shipp = new Shipping_Page(driver);
		return shipp;

	}

	public Payment_Page getInstancePayp() {
		payp = new Payment_Page(driver);
		return payp;

	}

	public Ordersummary_Page getInstanceOrderp() {
		orderp = new Ordersummary_Page(driver);
		return orderp;

	}

	public Orderconfirm_Page getInstanceOrderconp() {
		orderconp = new Orderconfirm_Page(driver);
		return orderconp;

	}

	public Frames2_Page getInstanceF2p() {
		f2p = new Frames2_Page(driver);
		return f2p;

	}

	public Product_img_Page1 getInstancePimg1() {
		pimg1 = new Product_img_Page1(driver);
		return pimg1;

	}
	public Summary_Page1 getInstanceSump1() {
		sump1 = new Summary_Page1(driver);
		return sump1;

	}
public Address_Page1 getInstanceAddp1() {
	addp1= new Address_Page1(driver);
	return addp1;
}

public Shipping_Page1 getInstanceShipp1() {
	shipp1=new Shipping_Page1(driver);
	return shipp1;
}

public Payment_Page1 getInstancePayp1() {
	payp1=new Payment_Page1(driver);
	return payp1;

}
public OrderSummary_Page1 getInstanceOrderP1() {
	orderp1 = new OrderSummary_Page1(driver);
	return orderp1;

}
public Orderconfirm_Page1 getInstanceOrderconp1() {
	orderconp1 = new Orderconfirm_Page1(driver);
	return orderconp1;

}
}
