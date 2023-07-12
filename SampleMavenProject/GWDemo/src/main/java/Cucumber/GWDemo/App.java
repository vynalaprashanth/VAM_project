package Cucumber.GWDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
	static WebDriver driver;
	static String url= "http://23.20.231.101:8280/cc/ClaimCenter.do";

	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//System.out.println("URL is Printed");


		driver.get(url);
		driver.manage().window().maximize();

		driver.findElement(By.name("Login-LoginScreen-LoginDV-username")).sendKeys("su");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("gw");

		driver.findElement(By.xpath("//div[@class='gw-action--inner gw-hasDivider']")).click();
		Thread.sleep(2000);


//search claims
		
		WebElement dr=driver.findElement(By.xpath("//*[@id=\"TabBar-SearchTab\"]/div[3]/div"));

		dr.click();
		WebElement dr1=driver.findElement(By.xpath("//*[@id=\"TabBar-SearchTab-Search_ClaimSearchesGroup\"]/div[1]/div[2]"));
		dr1.click();
		driver.findElement(By.xpath
				("//*[@id=\"SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-ClaimNumber\"]/div/input")).sendKeys("00000001806");
		driver.findElement(By.xpath
				("//*[@id=\"SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-ClaimSearchAndResetInputSet-Search\"]")).click();   		
		Thread.sleep(3000);

		//Search activities 
		driver.findElement(By.xpath("//*[@id=\"TabBar-SearchTab\"]/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"TabBar-SearchTab-Search_ActivitySearch\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"ActivitySearch-ActivitySearchScreen-ActivitySearchDV-ActivitySearchRequiredInputSet-Claims_ClaimNumber\"]/div/input")).sendKeys("000-00-002509");
		driver.findElement(By.xpath("//*[@id=\"ActivitySearch-ActivitySearchScreen-ActivitySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]")).click();
Thread.sleep(3000);
		
//Search Recoveries
		driver.findElement(By.xpath("//*[@id=\"TabBar-SearchTab\"]/div[3]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"TabBar-SearchTab-Search_RecoverySearch\"]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-ClaimNumber\"]/div/input")).sendKeys("000-00-001806");
driver.findElement(By.xpath("//*[@id=\"RecoverySearch-RecoverySearchScreen-RecoverySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]/div")).click();



//claim process


//7147621171
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"TabBar-ClaimTab\"]/div[3]/div")).click();
driver.findElement(By.xpath("//*[@id=\"TabBar-ClaimTab-ClaimTab_FNOLWizard\"]/div")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-policyNumber\"]/div/input")).sendKeys("7147621171");
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Search\"]")).click();

driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_LossDate\"]/div/input")).sendKeys("06/22/2023");
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_lossTime\"]/div/input[1]")).sendKeys("12:00");
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Claim_lossTime\"]/div/input[2]")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-Next\"]/div/div[2]")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-VehicleSelected\"]/div/input")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-Next\"]/div/div[2]")).click();

driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ReportedBy_NameMenuIcon\"]/div[1]")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem\"]/div/div[2]")).click();
driver.findElement(By.xpath("//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-LastName\"]/div/input")).sendKeys("PR");

driver.findElement(By.xpath("//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton\"]/div/div[2]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Claim_ReportedByType\"]/div/div/select")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Claim_ReportedByType\"]/div/div/select/option[6]")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-Next\"]/div/div[2]")).click();


driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-Claim_LossCause\"]/div/div/select")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-Claim_LossCause\"]/div/div/select/option[7]")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Address_Picker\"]/div/div/select")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Address_Picker\"]/div/div/select/option[1]")).click();
driver.findElement(By.xpath("//*[@id=\"FNOLWizard-Finish\"]/div/div[2]")).click();

// Log out GuideWire
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"gw-TabBarWidget--settings\"]/div[1]/span")).click();

driver.findElement(By.xpath("//*[@id=\"TabBar-LogoutTabBarLink\"]")).click();

driver.close();



//driver.findElement(By.xpath("//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV-ContactEFTLV_tb-Add\"]/div")).click();
//driver.findElement(By.xpath("//*[@id=\"FNOLWizard-Next\"]/div/div[2]")).click();











	}

}