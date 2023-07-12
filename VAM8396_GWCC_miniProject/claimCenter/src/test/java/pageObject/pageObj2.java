	package pageObject;
	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.ui.Select;
	
	import utillls.BrowserFactory;
	
	public class pageObj2 {
		BrowserFactory bf = new BrowserFactory();
	
		@FindBy(xpath = "//*[@id=\"TabBar-ClaimTab\"]/div[3]/div")
		WebElement clickCliamDropDown;
		@FindBy(xpath = "//*[@id=\"TabBar-ClaimTab-ClaimTab_FNOLWizard\"]/div")
		WebElement newClaim;
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-policyNumber\"]/div/input")
		WebElement policyNumber;
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FNOLWizard_FindPolicyScreen-FNOLWizardFindPolicyPanelSet-Search\"]")
		WebElement search;
		@FindBy(xpath = "//input[@class='gw-min-visible gw-DateValueWidget--dateInput']")
		WebElement date;
		@FindBy(xpath = "//*[@id=\"FNOLWizard-Next\"]/div/div[2]")
		WebElement next;
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FNOLWizard_PickPolicyRiskUnitsScreen-PolicySummaryVehicleLV-0-VehicleSelected_Cell\"]/div")
		WebElement selectBox;
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ReportedBy_NameMenuIcon\"]/div[1]")
		WebElement updateName;
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-ReportedBy_Name-ClaimNewPersonOnlyPickerMenuItemSet-ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem\"]/div/div[2]")
		WebElement updateName1;
		@FindBy(xpath = "//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-FirstName\"]/div/input")
		WebElement firstName;
		@FindBy(xpath = "//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV-PersonNameInputSet-GlobalPersonNameInputSet-LastName\"]/div/input")
		WebElement lastName;
		@FindBy(xpath = "//*[@id=\"NewContactPopup-ContactDetailScreen-ContactBasicsDV_tb-ContactDetailToolbarButtonSet-CustomUpdateButton\"]/div/div[2]")
		WebElement update_click;
		@FindBy(xpath = "//*[@id=\"FNOLWizard-Finish\"]/div")
		WebElement finish;
	
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-HowReported\"]/div/div/select")
		WebElement select11;
	
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_BasicInfoScreen-PanelRow-BasicInfoDetailViewPanelDV-Claim_ReportedByType\"]/div/div/select")
		WebElement select21;
	
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-Claim_LossCause\"]/div/div/select")
		WebElement select31;
	
		@FindBy(xpath = "//*[@id=\"FNOLWizard-FullWizardStepSet-FNOLWizard_NewLossDetailsScreen-LossDetailsAddressDV-AddressDetailInputSetRef-CCAddressInputSet-globalAddressContainer-Address_Picker\"]/div/div/select")
		WebElement select41;
	
		public void cliamAndNewClaim() {
			bf.implicitWait();
			clickCliamDropDown.click();
			newClaim.click();
		}
	
		public void policyNumber() {
			bf.implicitWait();
			policyNumber.sendKeys("7147621171");
	
		}
	
		public void searching() {
			bf.implicitWait();
			search.click();
			
			
		}
	
		public void dateValue() {
	bf.implicitWait();
			
	date.sendKeys("06/23/2023");
	next.click();
			
		}
	
		public void nextButton() {
			bf.implicitWait();
			
			next.click();
		}
	
		public void selectBoxM() {
			bf.implicitWait();
			selectBox.click();
			next.click();
		}
	
		public void basicInfo() {
			bf.implicitWait();
			Select select = new Select(select11);
			select.selectByVisibleText("Phone");
	
		}
	
		public void SelectName() {
			bf.implicitWait();
			updateName.click();
		}
	
		public void ChooseNewPerson() {
			bf.implicitWait();
			updateName1.click();
		}
	
		public void EnterFirstName() {
			bf.implicitWait();
			firstName.sendKeys("tony");
		}
	
		public void EnterLastName() {
			bf.implicitWait();
			lastName.sendKeys("stark");
		}
	
		public void ClickUpdate() {
			bf.implicitWait();
	
			update_click.click();
		}
	
		public void relavtiveType() {
			bf.implicitWait();
	
			Select select1 = new Select(select21);
			select1.selectByVisibleText("Employee");
			next.click();
	
		}
	
		public void SelectLossCause() {
			bf.implicitWait();
			bf.implicitWait();
			Select select2 = new Select(select31);
			select2.selectByVisibleText("Malicious mischief and vandalism");
	
		}
	
		public void selectLocation() {
			bf.implicitWait();
			Select select3 = new Select(select41);
			select3.selectByIndex(0);
	
			finish.click();
		}
	
	}
