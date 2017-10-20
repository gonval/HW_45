package core;import java.util.concurrent.TimeUnit;import java.util.logging.*;import org.openqa.selenium.*;import org.openqa.selenium.htmlunit.HtmlUnitDriver;public class FuncHtmlUnit {	static WebDriver driver;	static String url;	static long start;	static long finish;	public static void open(String url) {		String USERAGENT = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:55.0) Gecko/20100101 Firefox/55.0";		Logger.getLogger("").setLevel(Level.OFF);		driver = new HtmlUnitDriver();		((HtmlUnitDriver) driver).setJavascriptEnabled(true);		((HtmlUnitDriver) driver).getBrowserVersion().setUserAgent(USERAGENT);		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);		driver.get(url);		System.out.println(				"UserAgent: " + (String) ((JavascriptExecutor) driver).executeScript("return navigator.userAgent;"));	}	public static boolean isPresent(By by) {		if (driver.findElements(by).size() > 0)			return true;		else			return false;	}	public static boolean isVisible(By by) {		if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed())			return true;		else			return false;	}	static By vitali_01 = By.xpath("//tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"); // sgnup	// area	static By vitali_02 = By.xpath("//*[@id=\"id_f_title\"]"); // signup title	static By vitali_03 = By.xpath("//*[@id=\"id_f_label_fn\"]"); // first name	// title	static By vitali_04 = By.xpath("//*[@id=\"id_fname\"]"); // first name field	static By vitali_05 = By.xpath("//*[@id=\"id_f_label_ea\"]"); // email title	static By vitali_06 = By.xpath("//*[@id=\"id_email\"]"); // email field	static By vitali_07 = By.xpath("//*[@id=\"id_rb_label_g\"]"); // gender	// title	static By vitali_08 = By.xpath("//tr[1]/td[1]/table[2]/tbody[1]/tr[1]/td[2]"); // gender	// area	// male	static By vitali_09 = By.xpath("//*[@id=\"id_rb_label_m\"]"); // gender text	// male	static By vitali_10 = By.xpath("//*[@id=\"id_gender_male\"]"); // check	// button	// male	static By vitali_11 = By.xpath("//table/tbody/tr/td[1]/table[2]/tbody/tr/td[4]"); // gender	// text	// female	static By vitali_12 = By.xpath("//*[@id=\"id_rb_label_f\"]"); // signup &	// confirmation	static By vitali_13 = By.xpath("//*[@id=\"id_gender_female\"]"); // check	// button	// mfeale	static By vitali_14 = By.xpath("//*[@id=\"id_cb_label_t\"]"); // I agree	// text	static By vitali_15 = By.xpath("//*[@id=\"id_terms\"]"); // I agree check	// button	static By vitali_16 = By.xpath("//*[@id=\"id_img_facebook\"]"); // facebook	static By vitali_17 = By.xpath("//*[@id=\"id_img_twitter\"]"); // twitter	static By vitali_18 = By.xpath("//*[@id=\"id_img_flickr\"]"); // flickr	static By vitali_19 = By.xpath("//*[@id=\"id_img_youtube\"]"); // youtube	static By vitali_20 = By.xpath("//*[@id=\"id_reset_button\"]"); // reset	// button	static By vitali_21 = By.xpath("//*[@id=\"id_submit_button\"]"); // submit	// button	static By vitali_22 = By.xpath("//*[@id=\"id_current_location\"]"); // current	// location	static By vitali_23 = By.xpath("//*[@id=\"id_temperature\"]"); // current	// temperature	static By vitali_24 = By.xpath("//*[@id=\"id_weather_icon\"]"); // weather	// icon	static By vitali_25 = By.xpath("//*[@id=\"id_f_label_ln\"]"); // last name	// text	static By vitali_26 = By.xpath("//*[@id=\"id_lname\"]"); // last name field	static By vitali_27 = By.xpath("//*[@id=\"id_f_label_pn\"]"); // phone	// number	// name	static By vitali_28 = By.xpath("//*[@id=\"id_phone\"]"); // phone number	// field	static By vitali_29 = By.xpath("//*[@id=\"id_f_label_s\"]"); // stste name	static By vitali_30 = By.xpath("//*[@id=\"id_state\"]"); // state field	// dropdown	static By vitali_31 = By.xpath("//*[@id=\"os_browser\"]"); // OS and browser	static By vitali_32 = By.xpath("//*[@id=\"copyright\"]"); // copyrights	static By vitali_33 = By.xpath("//*[@id=\"timestamp\"]"); // current date	static By vitali_34 = By.xpath("//*[@id=\"fname_error\"]/img"); // error	// arrow	// first	// name	static By vitali_35 = By.xpath("//*[@id=\"ErrorLine\"]"); // error text	// description	static By vitali_36 = By.xpath("//*[@id=\"lname_error\"]/img"); // error	// arrow	// last name	static By vitali_37 = By.xpath("//*[@id=\"email_error\"]/img"); // error	// arrow	// email	static By vitali_38 = By.xpath("//*[@id=\"phone_error\"]/img"); // error	// arrow	// phone	// number	static By vitali_39 = By.xpath("//tr[1]/td[1]/table[1]/tbody[1]/tr[5]/td[5]"); // error	// massage	// area	static By vitali_40 = By.xpath("//tr/td/table/tbody/tr[1]/td[5]"); // web	// servises	// area	static By vitali_41 = By.xpath("//*[@id=\"id_quotes\"]"); // header	static By vitali_42 = By.xpath("//form[1]/table[1]/tbody[1]/tr[3]/td[1]"); // view	// pain	// area	static By vitali_43 = By.xpath("//form[1]/table[1]/tbody[1]/tr[4]/td[1]"); // footer	// line	public static void pageSignUpValidation(String url) {		open(url);		System.out.println("Page URL: " + driver.getCurrentUrl());		System.out.println("01. UI element [Sign Up area]: " + (isPresent(vitali_01) ? "Exists" : "Not exist")); // signup		System.out.println("02. UI element [Sign Up title]: " + (isPresent(vitali_02) ? "Exists" : "Not exist")); // signup		System.out.println("03. UI element [First name title]: " + (isPresent(vitali_03) ? "Exists" : "Not exist")); // signup		System.out.println("04. UI element [First name field]: " + (isPresent(vitali_04) ? "Exists" : "Not exist")); // signup		System.out.println("05. UI element [Email title]: " + (isPresent(vitali_05) ? "Exists" : "Not exist")); // signup																												// &																												// confirmation		System.out.println("06. UI element [Email field]: " + (isPresent(vitali_06) ? "Exists" : "Not exist")); // signup																												// &																												// confirmation		System.out.println("07. UI element [Gender title]: " + (isPresent(vitali_07) ? "Exists" : "Not exist")); // signup																													// &																													// confirmation		System.out.println("08. UI element [Gender area for Male]: " + (isPresent(vitali_08) ? "Exists" : "Not exist")); // signup																															// &																															// confirmation		System.out.println("09. UI element [Gender text for Male]: " + (isPresent(vitali_09) ? "Exists" : "Not exist")); // signup																															// &																															// confirmation		System.out				.println("10. UI element [Check button for Male]: " + (isPresent(vitali_10) ? "Exists" : "Not exist")); // signup																														// &																														// confirmation		System.out.println("11. UI element [Gender text Female]: " + (isPresent(vitali_11) ? "Exists" : "Not exist")); // signup																														// &																														// confirmation		System.out				.println("12. UI element [Sign Up &confirmation]: " + (isPresent(vitali_12) ? "Exists" : "Not exist")); // signup																														// &																														// confirmation		System.out.println("13. UI element [Check button Female]: " + (isPresent(vitali_13) ? "Exists" : "Not exist")); // signup																														// &																														// confirmation		System.out.println("14. UI element [I agree text]: " + (isPresent(vitali_14) ? "Exists" : "Not exist")); // signup																													// &																													// confirmation		System.out.println("15. UI element [I agree check button]: " + (isPresent(vitali_15) ? "Exists" : "Not exist")); // signup		System.out.println("16. UI element [Facebook link]: " + (isPresent(vitali_16) ? "Exists" : "Not exist")); // signup		System.out.println("17. UI element [Twitter link]: " + (isPresent(vitali_17) ? "Exists" : "Not exist")); // signup		System.out.println("18. UI element [Flickr link]: " + (isPresent(vitali_18) ? "Exists" : "Not exist")); // signup		System.out.println("19. UI element [Youtube link]: " + (isPresent(vitali_19) ? "Exists" : "Not exist")); // signup		System.out.println("20. UI element [Reset button]: " + (isPresent(vitali_20) ? "Exists" : "Not exist")); // signup		System.out.println("21. UI element [Submit botton]: " + (isPresent(vitali_21) ? "Exists" : " Not exist ")); // signup		System.out.println("22. UI element [Current location]: " + (isPresent(vitali_22) ? "Exists" : " Not exist ")); // signup		System.out				.println("23. UI element [Current temperature]: " + (isPresent(vitali_23) ? "Exists" : " Not exist ")); // signup		System.out.println("24. UI element [Wether icon]: " + (isPresent(vitali_24) ? "Exists" : " Not exist ")); // signup		System.out.println("25. UI element [Last Name text]: " + (isPresent(vitali_25) ? "Exists" : " Not exist ")); // signup		System.out.println("26. UI element [Last Name field]: " + (isPresent(vitali_26) ? "Exists" : "Not exist")); // signup		System.out.println("27. UI element [Phone number text]: " + (isPresent(vitali_27) ? "Exists" : "Not exist")); // signup		System.out.println("28. UI element [Phone number field]: " + (isPresent(vitali_28) ? "Exists" : "Not exist")); // signup		System.out.println("29. UI element [State name]: " + (isPresent(vitali_29) ? "Exists" : "Not exist")); // signup		System.out.println("30. UI element [State dropdown]: " + (isPresent(vitali_30) ? "Exists" : "Not exist")); // signup		System.out.println("31. UI element [OS and browser]: " + (isPresent(vitali_31) ? "Exists" : "Not exist")); // signup		System.out.println("32. UI element [Copyrights]: " + (isPresent(vitali_32) ? "Exists" : "Not exist")); // signup		System.out.println("33. UI element [Current date]: " + (isPresent(vitali_33) ? "Exists" : "Not exist")); // signup		System.out.println("34. UI element [Error First Name]: " + (isPresent(vitali_34) ? "Exists" : "Not exist")); // signup		System.out.println("35. UI element [Error Text field]: " + (isPresent(vitali_35) ? "Exists" : "Not exist")); // signup		System.out.println("36. UI element [Error Last Name]: " + (isPresent(vitali_36) ? "Exists" : "Not exist")); // signup		System.out.println("37. UI element [Error Email]: " + (isPresent(vitali_37) ? "Exists" : "Not exist")); // signup		System.out.println("38. UI element [Error phone number]: " + (isPresent(vitali_38) ? "Exists" : "Not exist")); // signup		System.out.println("39. UI element [Error Massage area]: " + (isPresent(vitali_39) ? "Exists" : "Not exist")); // signup		System.out.println("40. UI element [Web services area]: " + (isPresent(vitali_40) ? "Exists" : " Not exist")); // signup		System.out.println("41. UI element [Header]: " + (isPresent(vitali_41) ? "Exists" : " Not exist")); // signup		System.out.println("42. UI element [View pain area): " + (isPresent(vitali_42) ? "Exists" : " Not exist")); // confirmation		System.out.println("43. UI element [Footer line]: " + (isPresent(vitali_43) ? "Exists" : " Not exist")); // confirmation		System.out.println("------------- VISABILITY----------------");		System.out.println("34. UI element [Error First Name]: " + (isVisible(vitali_34) ? "Visible" : " Not visible")); // signup		System.out.println("35. UI element [Error Text field]: " + (isVisible(vitali_35) ? "Visible" : " Not visible")); // signup		System.out.println("36. UI element [Error Last Name]: " + (isVisible(vitali_36) ? "Visible" : " Not visible"));		System.out.println("37. UI element [Error Email]: " + (isVisible(vitali_37) ? "Visible" : " Not visible"));		System.out				.println("38. UI element [Error phone number]: " + (isVisible(vitali_38) ? "Visible" : " Not visible"));		System.out				.println("39. UI element [Error Massage area]: " + (isVisible(vitali_39) ? "Visible" : " Not visible"));		System.out.println("OS/Browser: " + driver.findElement(vitali_31).getText()); // signup	}	public static void pageConfirmationValidation(String url) {		open(url);		System.out.println("Page URL: " + driver.getCurrentUrl());		System.out.println("01. UI element [Sign Up area]: " + (isPresent(vitali_01) ? "Exists" : "Not exist")); // signup		System.out.println("02. UI element [Sign Up title]: " + (isPresent(vitali_02) ? "Exists" : "Not exist")); // signup		System.out.println("03. UI element [First name title]: " + (isPresent(vitali_03) ? "Exists" : "Not exist")); // signup		System.out.println("04. UI element [First name field]: " + (isPresent(vitali_04) ? "Exists" : "Not exist")); // signup		System.out.println("05. UI element [Email title]: " + (isPresent(vitali_05) ? "Exists" : "Not exist")); // signup																												// &																												// confirmation		System.out.println("06. UI element [Email field]: " + (isPresent(vitali_06) ? "Exists" : "Not exist")); // signup																												// &																												// confirmation		System.out.println("07. UI element [Gender title]: " + (isPresent(vitali_07) ? "Exists" : "Not exist")); // signup																													// &																													// confirmation		System.out.println("08. UI element [Gender area for Male]: " + (isPresent(vitali_08) ? "Exists" : "Not exist")); // signup																															// &																															// confirmation		System.out.println("09. UI element [Gender text for Male]: " + (isPresent(vitali_09) ? "Exists" : "Not exist")); // signup																															// &																															// confirmation		System.out				.println("10. UI element [Check button for Male]: " + (isPresent(vitali_10) ? "Exists" : "Not exist")); // signup																														// &																														// confirmation		System.out.println("11. UI element [Gender text Female]: " + (isPresent(vitali_11) ? "Exists" : "Not exist")); // signup																														// &																														// confirmation		System.out				.println("12. UI element [Sign Up &confirmation]: " + (isPresent(vitali_12) ? "Exists" : "Not exist")); // signup																														// &																														// confirmation		System.out.println("13. UI element [Check button Female]: " + (isPresent(vitali_13) ? "Exists" : "Not exist")); // signup																														// &																														// confirmation		System.out.println("14. UI element [I agree text]: " + (isPresent(vitali_14) ? "Exists" : "Not exist")); // signup																													// &																													// confirmation		System.out.println("15. UI element [I agree check button]: " + (isPresent(vitali_15) ? "Exists" : "Not exist")); // signup		System.out.println("16. UI element [Facebook link]: " + (isPresent(vitali_16) ? "Exists" : "Not exist")); // signup		System.out.println("17. UI element [Twitter link]: " + (isPresent(vitali_17) ? "Exists" : "Not exist")); // signup		System.out.println("18. UI element [Flickr link]: " + (isPresent(vitali_18) ? "Exists" : "Not exist")); // signup		System.out.println("19. UI element [Youtube link]: " + (isPresent(vitali_19) ? "Exists" : "Not exist")); // signup		System.out.println("20. UI element [Reset button]: " + (isPresent(vitali_20) ? "Exists" : "Not exist")); // signup		System.out.println("21. UI element [Submit botton]: " + (isPresent(vitali_21) ? "Exists" : " Not exist ")); // signup		System.out.println("22. UI element [Current location]: " + (isPresent(vitali_22) ? "Exists" : " Not exist ")); // signup		System.out				.println("23. UI element [Current temperature]: " + (isPresent(vitali_23) ? "Exists" : " Not exist ")); // signup		System.out.println("24. UI element [Wether icon]: " + (isPresent(vitali_24) ? "Exists" : " Not exist ")); // signup		System.out.println("25. UI element [Last Name text]: " + (isPresent(vitali_25) ? "Exists" : " Not exist ")); // signup		System.out.println("26. UI element [Last Name field]: " + (isPresent(vitali_26) ? "Exists" : "Not exist")); // signup		System.out.println("27. UI element [Phone number text]: " + (isPresent(vitali_27) ? "Exists" : "Not exist")); // signup		System.out.println("28. UI element [Phone number field]: " + (isPresent(vitali_28) ? "Exists" : "Not exist")); // signup		System.out.println("29. UI element [State name]: " + (isPresent(vitali_29) ? "Exists" : "Not exist")); // signup		System.out.println("30. UI element [State dropdown]: " + (isPresent(vitali_30) ? "Exists" : "Not exist")); // signup		System.out.println("31. UI element [OS and browser]: " + (isPresent(vitali_31) ? "Exists" : "Not exist")); // signup		System.out.println("32. UI element [Copyrights]: " + (isPresent(vitali_32) ? "Exists" : "Not exist")); // signup		System.out.println("33. UI element [Current date]: " + (isPresent(vitali_33) ? "Exists" : "Not exist")); // signup		System.out.println("34. UI element [Error First Name]: " + (isPresent(vitali_34) ? "Exists" : "Not exist")); // signup		System.out.println("35. UI element [Error Text field]: " + (isPresent(vitali_35) ? "Exists" : "Not exist")); // signup		System.out.println("36. UI element [Error Last Name]: " + (isPresent(vitali_36) ? "Exists" : "Not exist")); // signup		System.out.println("37. UI element [Error Email]: " + (isPresent(vitali_37) ? "Exists" : "Not exist")); // signup		System.out.println("38. UI element [Error phone number]: " + (isPresent(vitali_38) ? "Exists" : "Not exist")); // signup		System.out.println("39. UI element [Error Massage area]: " + (isPresent(vitali_39) ? "Exists" : "Not exist")); // signup		System.out.println("40. UI element [Web services area]: " + (isPresent(vitali_40) ? "Exists" : " Not exist")); // signup		System.out.println("41. UI element [Header]: " + (isPresent(vitali_41) ? "Exists" : " Not exist")); // signup		System.out.println("42. UI element [View pain area): " + (isPresent(vitali_42) ? "Exists" : " Not exist")); // confirmation		System.out.println("43. UI element [Footer line]: " + (isPresent(vitali_43) ? "Exists" : " Not exist")); // confirmation	}	public static void main(String[] args) {		System.out.println("Browser: HtmlUnit");		start = System.currentTimeMillis();		pageSignUpValidation("http://alex.academy/exe/signup/v1/index.php");		pageConfirmationValidation("http://alex.academy/exe/signup/v1/confirmation.php");		driver.quit();		finish = System.currentTimeMillis();		System.out.println("Response time: " + (finish - start) + " ms");	}}