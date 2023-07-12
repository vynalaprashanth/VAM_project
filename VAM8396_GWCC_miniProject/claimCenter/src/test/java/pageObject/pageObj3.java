package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utillls.BrowserFactory;

public class pageObj3 {
	
	BrowserFactory bf = new BrowserFactory();
	
	@FindBy(xpath="//*[@id=\"TabBar-SearchTab\"]/div[3]/div")
	WebElement cliamDropDown;
	@FindBy(xpath="//*[@id=\"TabBar-SearchTab-Search_ClaimSearchesGroup\"]/div[1]/div[2]")
	WebElement cliams;
	@FindBy(xpath="//*[@id=\"SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-ClaimNumber\"]/div/input")
	WebElement cliamNumber;
	@FindBy(xpath="//*[@id=\"SimpleClaimSearch-SimpleClaimSearchScreen-SimpleClaimSearchDV-ClaimSearchAndResetInputSet-Search\"]")
	WebElement search1;
	@FindBy(xpath="//div[@id='TabBar-SearchTab-Search_ActivitySearch']/div//div[2]")
	WebElement activites;
	@FindBy(xpath="//*[@id=\"ActivitySearch-ActivitySearchScreen-ActivitySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]")
	WebElement search2;
	@FindBy(xpath="//*[@id=\"TabBar-SearchTab-Search_RecoverySearch\"]/div/div[2]")
	WebElement recovery;
	@FindBy(xpath="//*[@id=\"RecoverySearch-RecoverySearchScreen-RecoverySearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search\"]")
	WebElement search3;
	@FindBy(xpath="//*[@id=\"RecoverySearch-RecoverySearchScreen-RecoverySearchDV-RecoverySearchRequiredInputSet-ClaimNumber\"]/div/input")
	WebElement recoveryCliamNumber;
	
	public void cliamsDD() throws InterruptedException {
		bf.implicitWait();
		Thread.sleep(3000);
		cliamDropDown.click();
		
		
		
	}
	
	public void searchClaims() throws InterruptedException {
		bf.implicitWait();
		Thread.sleep(3000);
		cliams.click();
		cliamNumber.sendKeys("00000001806");
		search1.click();
	}
	
	public void activites() throws InterruptedException {
		bf.implicitWait();
		activites.click();
		cliamNumber.sendKeys("00000002509");
		search2.click();
	}
	
	
	public void recovery() throws InterruptedException {
		bf.implicitWait();
		recovery.click();
		recoveryCliamNumber.sendKeys("00000001806");
		search3.click();
		Thread.sleep(2000);
		bf.closeBrowser();
		
	}
}
