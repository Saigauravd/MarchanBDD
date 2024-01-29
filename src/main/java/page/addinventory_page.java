package page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addinventory_page {

	public WebDriver driver;
	
	@FindBy(xpath = "//*[@class='text-truncate active']")
	private WebElement inventoryModule;
	
	@FindBy(xpath = "//*[@class='mr-2 img-typ']")
	private WebElement addbutton;
	
@FindBy(xpath = "//*[@id='product-name-value']")
private WebElement productName;
	
@FindBy(xpath = "//*[@placeholder='Select Category']")
private WebElement SelectCategory;

@FindBy(xpath = "//*[@name='schema-type']")
private WebElement SelectBrand;

@FindBy(xpath = "(//*[@class='form-control ng-pristine ng-valid ng-touched'])[2]")
private WebElement abv;

@FindBy(xpath = "(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")
private WebElement Origin;

@FindBy(xpath = "(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")
private WebElement Size;
	
@FindBy(xpath = "(//*[@class='form-control ng-pristine ng-valid ng-touched'])[3]")
private WebElement TastingNotes;
@FindBy(xpath = "(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[3]")
private WebElement YearAged;

@FindBy(xpath = "(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[4]")
private WebElement Speciality;

@FindBy(xpath = "(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[5]")
private WebElement Baseingridient;
@FindBy(xpath = "(//*[@class='form-control ng-untouched ng-pristine ng-valid'])[6]")
private WebElement foodPairing;

@FindBy(xpath = "(//*[@name='schema-type'])[2]")
private WebElement SelectProducttype;
	
@FindBy(xpath = "(//*[@id='Curbside'])")
private WebElement Curbside;

@FindBy(xpath = "(//*[@id='description-value'])")
private WebElement Describtions;

@FindBy(xpath = "(//*[@id='main_product_image'])")
private WebElement Image;

@FindBy(xpath = "(//*[@id='sku-value'])")
private WebElement SKU;

@FindBy(xpath = "(//*[@id='barcodetype-value'])")
private WebElement SelectBaecode;

@FindBy(xpath = "//*[@id='price-value']")
private WebElement price;

@FindBy(xpath = "(//*[@id='has_variant_title'])")
private WebElement togglevariant;

@FindBy(xpath = "(//*[@onclick='saveProductDetails(this)'])")
private WebElement Save;

public addinventory_page(WebDriver driver)
{
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
public void Inventoryy()
{
	wait.until(ExpectedConditions.elementToBeClickable(inventoryModule)).click();;
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	addbutton.click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 productName.sendKeys("Jack Denials");
	 Select selc =  new Select(SelectCategory);
	 selc.selectByValue("3841599794754903");
	 
	 Select selb = new Select(SelectBrand);
	 selb.selectByValue("3841685027607079");
	 
	 abv.sendKeys("JD");
	 
	Origin.sendKeys("Scotchland");
	Size.sendKeys("1 litrs");
	TastingNotes.sendKeys("Keep it cool");
	YearAged.sendKeys("21");
	Speciality.sendKeys("Sweet");
	Baseingridient.sendKeys("Wheat");
	foodPairing.sendKeys("Bread");
	Select selp = new Select(SelectProducttype);
	selp.selectByValue("3839080796594416");
	Curbside.click();
	Describtions.sendKeys("Welcome to Jack Daniel's Tennessee Whiskey. Discover our story of independence, our family of whiskeys, recipes, and our distillery in Lynchburg, Tennessee.");
	Image.sendKeys(System.getProperty("user.dir")+".//Screenshot_11.png");
}
	
	
	
}
