package steps;

import java.util.ArrayList;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AboutPage;
import pages.AddOnsPage;
import pages.AssetsPage;
import pages.BeneficiariesPage;
import pages.ChangePasswordPage;
import pages.CheckOutPage;
import pages.CodePage;
import pages.DashboardPage;
import pages.ExecutorsPage;
import pages.FinancialDecisionsPage;
import pages.HomePage;
import pages.IDdocsPage;
import pages.LoginPage;
import pages.MedicalDecisionsPage;
import pages.OrdersPage;
import pages.PaymentsPage;
import pages.PersonalPage;
import pages.RegistrationPage;
import pages.ReviewConfirmPage;
import pages.ThankYouPage;
import pages.UnionListPage;
import utilities.Base;
import utilities.CommonFunctions;
import utilities.LogFunctions;

public class StepDefinitions extends Base {
	LoginPage loginPage;
	HomePage homePage;
	CodePage codePage;
	AboutPage aboutPage;
	RegistrationPage registrationPage;
	ChangePasswordPage changePasswordPage;
	PersonalPage personalPage;
	AssetsPage assetsPage;
	BeneficiariesPage beneficiariesPage;
	ExecutorsPage executorsPage;
	IDdocsPage idDocsPage;
	ReviewConfirmPage reviewConfirmPage;
	PaymentsPage paymentsPage;
	AddOnsPage addOnsPage;
	ThankYouPage thankyouPage;
	FinancialDecisionsPage financialDecisionsPage;
	MedicalDecisionsPage medicalDecisionsPage;
	DashboardPage dashboardPage;
	UnionListPage unionListPage;
	String Email;
	CheckOutPage checkOutPage;
	OrdersPage ordersPage;

	// ================================================== Universal Functions ==================================================
	@Before
	public void setup(Scenario scenario) {
		LogFunctions.startLog(scenario);

		Base.initialization();
	}

	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			LogFunctions.error("TEST - FAILED");
			CommonFunctions.screenshot(scenario);
		}
		else {
			LogFunctions.info("TEST - PASSED");
		}

		LogFunctions.endLog(scenario);
		// driver.quit();
	}

	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable { // Always the start page.
		driver.get(prop.getProperty("url"));
		loginPage = new LoginPage();

	}

	@Given("^user opens admin page$")
	public void user_opens_admin_page() throws Throwable { // Always the start page.
		driver.get(prop.getProperty("url4"));
		loginPage = new LoginPage();

	}

	@When("^user clicks on new order on incomplete order popup$")
	public void user_clicks_on_new_order_on_incomplete_order_popup() throws Throwable {
		if (new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(), 'DEBUG You have an incomplete Order')]")))).isDisplayed()) {
			homePage.clickNewOrderOnPopUp();

		}
		else {
			homePage.clickCouplesProduct();

		}
	}

	@Then("^user checks if funeral wishes question is mandatory$")
	public void user_checks_if_funeral_wishes_question_is_mandatory() throws Throwable {

	}

	@Given("^user opens browser and decides to proceed to the activation links page$")
	public void user_opens_browser_and_decides_to_proceed_to_the_activation_links_page() throws Throwable {
		driver.get(prop.getProperty("url2"));
		codePage = new CodePage();
	}

	@Then("^user is on \"([^\"]*)\" page$")
	public void user_is_on_page(String arg1) throws Throwable {
		CommonFunctions.checkPageTitle(arg1);
		CommonFunctions.wait(5000, false);
	}

	@Then("^user is on \"([^\"]*)\" popup in page \"([^\"]*)\"$")
	public void user_is_on_popup_in_page(String arg1, String arg2) throws Throwable {
		CommonFunctions.checkPopupOnPage(arg2, arg1);
	}

	@Then("^user sees feedback message \"([^\"]*)\"$")
	public void user_sees_feedback_message(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageDisplayed(arg1);
	}

	@Then("^user does not see feedback message \"([^\"]*)\"$")
	public void user_does_not_see_feedback_message(String arg1) throws Throwable {
		CommonFunctions.checkFeedbackMessageNotDisplayed(arg1);
	}

	@When("^user becomes inactive for \"([^\"]*)\" minutes$")
	public void user_becomes_inactive_for_minutes(Integer arg1) throws Throwable {
		CommonFunctions.wait(arg1, true);
	}

	@Then("^user sees no results in the table$")
	public void user_sees_no_results_in_the_table() throws Throwable {
		CommonFunctions.textDisplayedInPage("No matching records found.");
	}

	@When("^user sees alert message \"([^\"]*)\" and clicks on \"([^\"]*)\"$")
	public void user_sees_alert_message_and_clicks_on(String arg1, String arg2) throws Throwable {
		CommonFunctions.checkAlertMessageIsDisplayed(arg1);
		CommonFunctions.clickOnPopUp(arg2);
	}

	@Then("^user sees alert message \"([^\"]*)\"$")
	public void user_sees_alert_message(String arg1) throws Throwable {
		CommonFunctions.checkAlertMessageIsDisplayed(arg1);
	}

	@Then("^user does not see alert$")
	public void user_does_not_see_alert(String arg1) throws Throwable {
		CommonFunctions.checkAlertIsNotDisplayed();
	}

	@Then("^user sees message \"([^\"]*)\"$")
	public void user_sees_message(String arg1) throws Throwable {
		CommonFunctions.textDisplayedInPage(arg1);
	}

	@Then("^user sees Are you currently in hospital question with no answer in personal info summary$")
	public void user_sees_Are_you_currently_in_hospital_question_with_no_answer_in_personal_info_summary() throws Throwable {
		reviewConfirmPage.HospitalNoSummary();
	}

	@Then("^user sees Are you currently in hospital question with yes answer in personal info summary$")
	public void user_sees_Are_you_currently_in_hospital_question_with_yes_answer_in_personal_info_summary() throws Throwable {
		reviewConfirmPage.HospitalYesSummary();
	}

	@Then("^user clicks edit button on personal info summary$")
	public void user_clicks_edit_button_on_personal_info_summary() throws Throwable {
		reviewConfirmPage.ClickEditPersonalInfoSummary();
	}

	@Then("^user edits some personal details$")
	public void user_edits_some_personal_details() throws Throwable {
		personalPage.SelectTitlePersonalPage("Reverend");
		personalPage.SetOccupation(" Update");
	}

	@Then("^user edits some about you details$")
	public void user_edits_some_about_you_details() throws Throwable {
		aboutPage.clickNABtnLaw();
	}

	@Then("^user sees diagnosed question with no answer in personal info summary$")
	public void user_sees_diagnosed_question_with_no_answer_in_personal_info_summary() throws Throwable {
		reviewConfirmPage.DiagnosedNoSummary();
	}

	@Then("^user checks the personal info summary details$")
	public void user_checks_the_personal_info_summary_details() throws Throwable {
		CommonFunctions.textDisplayedInPage("Title");
		CommonFunctions.textDisplayedInPage("Dr");
		CommonFunctions.textDisplayedInPage("Date of Birth");
		CommonFunctions.textDisplayedInPage("14/11/2019");
		CommonFunctions.textDisplayedInPage("First name");
		CommonFunctions.textDisplayedInPage("dim");
		CommonFunctions.textDisplayedInPage("Middle name");
		CommonFunctions.textDisplayedInPage("Family name");
		CommonFunctions.textDisplayedInPage("camuin");
		CommonFunctions.textDisplayedInPage("Residential address");
		CommonFunctions.textDisplayedInPage("No.22 Diamond Street Bahayang Pagasa Imus Cavite");
		CommonFunctions.textDisplayedInPage("Email");
		CommonFunctions.textDisplayedInPage("demeth@gmail.com");
		CommonFunctions.textDisplayedInPage("Phone Number");
		CommonFunctions.textDisplayedInPage("4772834");
		CommonFunctions.textDisplayedInPage("Occupation");
		CommonFunctions.textDisplayedInPage("Consultant");
		CommonFunctions.textDisplayedInPage("Postal address");
		CommonFunctions.textDisplayedInPage("Same as Residential Address");
		CommonFunctions.textDisplayedInPage("Are you currently in hospital?");
		reviewConfirmPage.HospitalNoSummary();
		CommonFunctions.textDisplayedInPage("Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will?");
		reviewConfirmPage.DiagnosedNoSummary();
	}

	@Then("^user checks the About you summary details$")
	public void user_checks_the_About_you_summary_details() throws Throwable {
		CommonFunctions.textDisplayedInPage("Current Marital Status");
		CommonFunctions.textDisplayedInPage("Single");
		CommonFunctions.textDisplayedInPage("Have you had a family law property settlement?");
		reviewConfirmPage.FamilyLawPropertyNo();
		CommonFunctions.textDisplayedInPage("Do you have any children?");
		reviewConfirmPage.HaveChildrenNo();
		reviewConfirmPage.HaveDependentsNo();
		reviewConfirmPage.HaveWillNone();

	}

	@Then("^user checks the Assets summary details$")
	public void user_checks_the_Assets_summary_details() throws Throwable {
		CommonFunctions.textDisplayedInPage("Do you have any assets?");
		reviewConfirmPage.HaveAssetsNo();
		CommonFunctions.textDisplayedInPage("Do you have any debts?");
		reviewConfirmPage.HaveDebtsNo();
		CommonFunctions.textDisplayedInPage("Do you have any superannuation?");
		reviewConfirmPage.HaveSuperNo();
		CommonFunctions.textDisplayedInPage("Do you have life insurance separate from your superannuation?");
		reviewConfirmPage.HaveLifeInsuranceSuperNo();
		CommonFunctions.textDisplayedInPage("Do you control a trust?");
		reviewConfirmPage.HaveTrustNo();
		CommonFunctions.textDisplayedInPage("Do you control a self-managed superannuation fund?");
		reviewConfirmPage.HaveSuperFundNo();
		CommonFunctions.textDisplayedInPage("Do you own your own business, or are you a partner in a partnership?");
		reviewConfirmPage.HaveBusinessNo();

	}

	@Then("^user checks the Executors summary details$")
	public void user_checks_the_Executors_summary_details() throws Throwable {
		CommonFunctions.textDisplayedInPage("Who do you want to manage your estate?");
		CommonFunctions.textDisplayedInPage("Backup Executor");
		CommonFunctions.textDisplayedInPage("Name:");
		CommonFunctions.textDisplayedInPage("Backup Test Upback");
		CommonFunctions.textDisplayedInPage("Relationship:");
		CommonFunctions.textDisplayedInPage("Cousin");
		CommonFunctions.textDisplayedInPage("First Option Executor");
		CommonFunctions.textDisplayedInPage("Name:");
		CommonFunctions.textDisplayedInPage("First Test Option");
		CommonFunctions.textDisplayedInPage("Relationship:");
		CommonFunctions.textDisplayedInPage("Father");
		CommonFunctions.textDisplayedInPage("Would you like Maurice Blackburn to assist with Managing your estate?");
		CommonFunctions.textDisplayedInPage("Funeral Wishes");
		CommonFunctions.textDisplayedInPage("I have no wishes");

	}

	@Then("^user checks the Beneficiaries summary details$")
	public void user_checks_the_Beneficiaries_summary_details() throws Throwable {
		CommonFunctions.textDisplayedInPage("Do you want to give the whole of your estate equally to any children you have in the future?");
		reviewConfirmPage.BenefFutureChildrenQuestionYes();
		CommonFunctions.textDisplayedInPage("If any of your children predecease you, do you want to divide it equally amongst their children?");
		reviewConfirmPage.BenefDisasterQuestionNo();
		CommonFunctions.textDisplayedInPage("If all of your listed beneficiaries pass away, what would you like us to do with their share?");
		reviewConfirmPage.BenefDisasterQuestionField();
		CommonFunctions.textDisplayedInPage("Do you wish to leave any gifts?");
		reviewConfirmPage.HaveGiftNo();

	}

	@Then("^user sees family law property question with no asnwer in about you summary$")
	public void user_sees_family_law_property_question_with_no_asnwer_in_about_you_summary() throws Throwable {
		reviewConfirmPage.FamilyLawPropertyNo();
	}

	@Then("^user sees do you have children question with no asnwer in about you summary$")
	public void user_sees_do_you_have_children_question_with_no_asnwer_in_about_you_summary() throws Throwable {
		reviewConfirmPage.HaveChildrenNo();
	}

	@Then("^user sees family law property question with yes asnwer in about you summary$")
	public void user_sees_family_law_property_question_with_yes_asnwer_in_about_you_summary() throws Throwable {
		reviewConfirmPage.FamilyLawPropertyYes();
	}

	@Then("^user sees diagnosed question with yes answer in personal info summary$")
	public void user_sees_diagnosed_question_with_yes_answer_in_personal_info_summary() throws Throwable {
		reviewConfirmPage.DiagnosedYesSummary();
	}

	@Then("^user sees question \"([^\"]*)\"$")
	public void user_sees_question(String arg1) throws Throwable {
		CommonFunctions.textDisplayedInPage(arg1);
	}

	@Then("^user sees disaster question displayed$")
	public void user_sees_disaster_question_displayed() throws Throwable {
		beneficiariesPage.DisasterQuestionDisplayed();
	}

	@When("^user agrees to terms and agreement inside the ID docs Page$")
	public void user_agrees_to_terms_and_agreement_inside_the_ID_docs_Page() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.wait(5000, false);
		idDocsPage.ClickQuestion1();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
	}

	@Then("^user clicks on add POA on addons page$")
	public void user_clicks_on_add_POA_on_addons_page() throws Throwable {
		addOnsPage.clickAddPOAButton();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
	}

	@Then("^user sees beneficiary question displayed$")
	public void user_sees_beneficiary_question_displayed() throws Throwable {
		beneficiariesPage.BeneficiaryQuestionDisplayed();
	}

	@When("^user clicks yes to do you have assets question$")
	public void user_clicks_yes_to_do_you_have_assets_question() throws Throwable {
		assetsPage.ClickYesQuestion1();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to do you have debts question$")
	public void user_clicks_no_to_do_you_have_debts_question() throws Throwable {
		assetsPage.ClickNoQuestion2();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to If any of your children predecease you, do you want to divide it equally amongst their children question$")
	public void user_clicks_yes_to_If_any_of_your_children_predecease_you_do_you_want_to_divide_it_equally_amongst_their_children_question() throws Throwable {
		beneficiariesPage.ClickYesQuestion2();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to If any of your children predecease you, do you want to divide it equally amongst their children question$")
	public void user_clicks_no_to_If_any_of_your_children_predecease_you_do_you_want_to_divide_it_equally_amongst_their_children_question() throws Throwable {
		beneficiariesPage.ClickNoQuestion2();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to Do you wish to leave any gifts question$")
	public void user_clicks_no_to_Do_you_wish_to_leave_any_gifts_question() throws Throwable {
		beneficiariesPage.ClickGiftNo();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to Do you wish to leave any gifts question$")
	public void user_yes_no_to_Do_you_wish_to_leave_any_gifts_question() throws Throwable {
		beneficiariesPage.ClickGiftYes();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to Do you want to give the whole estate equally to your children question$")
	public void user_clicks_yes_to_Do_you_want_to_give_the_whole_estate_equally_to_your_children_question() throws Throwable {
		beneficiariesPage.ClickYesQuestion1SingleWithChildren();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to Do you want to give the whole estate equally to your children question$")
	public void user_clicks_no_to_Do_you_want_to_give_the_whole_estate_equally_to_your_children_question() throws Throwable {
		beneficiariesPage.ClickNoQuestion1SingleWithChildren();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to Do you want to include any children you have in the future question$")
	public void user_clicks_yes_to_Do_you_want_to_include_any_children_you_have_in_the_future_question() throws Throwable {
		beneficiariesPage.ClickYesQuestion1();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to if your spouse/partner predeceases you, do you want to give the whole of your estate equally to any children you have in the future question$")
	public void user_clicks_yes_to_if_your_spouse_partner_predeceases_you_do_you_want_to_give_the_whole_of_your_estate_equally_to_any_children_you_have_in_the_future_question() throws Throwable {
		beneficiariesPage.ClickYesQuestion1();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to if your spouse/partner predeceases you, do you want to give the whole of your estate equally to any children you have in the future question$")
	public void user_clicks_no_to_if_your_spouse_partner_predeceases_you_do_you_want_to_give_the_whole_of_your_estate_equally_to_any_children_you_have_in_the_future_question() throws Throwable {
		beneficiariesPage.ClickNoQuestion1();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to Do you want to leave your whole estate to your spouse/partner if they survive you question$")
	public void user_clicks_yes_to_Do_you_want_to_leave_your_whole_estate_to_your_spouse_partner_if_they_survive_you_question() throws Throwable {
		beneficiariesPage.ClickYesQuestion1WithSpouse();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to Do you want to leave your whole estate to your spouse/partner if they survive you question$")
	public void user_clicks_no_to_Do_you_want_to_leave_your_whole_estate_to_your_spouse_partner_if_they_survive_you_question() throws Throwable {
		beneficiariesPage.ClickNoQuestion1WithSpouse();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to Do you want to include any children you have in the future question$")
	public void user_clicks_no_to_Do_you_want_to_include_any_children_you_have_in_the_future_question() throws Throwable {
		beneficiariesPage.ClickNoQuestion1();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to Do you want to give the whole of your estate equally to any children you have in the future question$")
	public void user_clicks_yes_to_Do_you_want_to_give_the_whole_of_your_estate_equally_to_any_children_you_have_in_the_future_question() throws Throwable {
		beneficiariesPage.ClickYesQuestion1();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to Do you want to give the whole of your estate equally to any children you have in the future question$")
	public void user_clicks_no_to_Do_you_want_to_give_the_whole_of_your_estate_equally_to_any_children_you_have_in_the_future_question() throws Throwable {
		beneficiariesPage.ClickNoQuestion1();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to do you have debts question$")
	public void user_clicks_yes_to_do_you_have_debts_question() throws Throwable {
		assetsPage.ClickYesQuestion2();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to do you have any superannuation question$")
	public void user_clicks_no_to_do_you_have_any_superannuation_question() throws Throwable {
		assetsPage.ClickNoQuestion3();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to do you have any superannuation question$")
	public void user_clicks_yes_to_do_you_have_any_superannuation_question() throws Throwable {
		assetsPage.ClickYesQuestion3();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to do you have life insurance separate from your superannuation$")
	public void user_clicks_no_to_do_you_have_life_insurance_separate_from_your_superannuation() throws Throwable {
		assetsPage.ClickNoQuestion4();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to do you have life insurance separate from your superannuation$")
	public void user_clicks_yes_to_do_you_have_life_insurance_separate_from_your_superannuation() throws Throwable {
		assetsPage.ClickYesQuestion4();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to do you control a trust question$")
	public void user_clicks_no_to_do_you_control_a_trust_question() throws Throwable {
		assetsPage.ClickNoQuestion5();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to do you control a trust question$")
	public void user_clicks_yes_to_do_you_control_a_trust_question() throws Throwable {
		assetsPage.ClickYesQuestion5();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to do you control a self-managed superannuation fund question$")
	public void user_clicks_no_to_do_you_control_a_self_managed_superannuation_fund_question() throws Throwable {
		assetsPage.ClickNoQuestion6();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to Do you intend to grant any life interests or rights to occupy in your Will question$")
	public void user_clicks_yes_to_Do_you_intend_to_grant_any_life_interests_or_rights_to_occupy_in_your_Will_question() throws Throwable {
		assetsPage.ClickRightsYes();
	}

	@When("^user clicks no to Do you intend to grant any life interests or rights to occupy in your Will question$")
	public void user_clicks_no_to_Do_you_intend_to_grant_any_life_interests_or_rights_to_occupy_in_your_Will_question() throws Throwable {
		assetsPage.ClickRightsNo();
	}

	@When("^user clicks yes to do you control a self-managed superannuation fund question$")
	public void user_clicks_yes_to_do_you_control_a_self_managed_superannuation_fund_question() throws Throwable {
		assetsPage.ClickYesQuestion6();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to do you own your own business or are you a partner in a partnership question$")
	public void user_clicks_no_to_do_you_own_your_own_business_or_are_you_a_partner_in_a_partnership_question() throws Throwable {
		assetsPage.ClickNoQuestion7();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to do you own your own business or are you a partner in a partnership question$")
	public void user_clicks_yes_to_do_you_own_your_own_business_or_are_you_a_partner_in_a_partnership_question() throws Throwable {
		assetsPage.ClickYesQuestion7();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks on Add Asset$")
	public void user_clicks_on_Add_Asset() throws Throwable {
		assetsPage.ClickAddAsset();
		CommonFunctions.wait(5000, false);
	}

	@When("^user edits the details of the newly added asset$")
	public void user_edits_the_details_of_the_newly_added_asset() throws Throwable {
		assetsPage.EditFillUpAllOtherFields();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks on Edit Asset$")
	public void user_clicks_on_Edit_Asset() throws Throwable {
		assetsPage.ClickEditAsset();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks on Delete Asset$")
	public void user_clicks_on_Delete_Asset() throws Throwable {
		assetsPage.ClickDeleteAsset();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}

	@When("^user clicks on Cancel Asset$")
	public void user_clicks_on_Cancel_Asset() throws Throwable {
		assetsPage.ClickCancelAsset();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to do you have assets question$")
	public void user_clicks_no_to_do_you_have_assets_question() throws Throwable {
		assetsPage.ClickNoQuestion1();
	}

	@Then("^user checks if do you have assets question is mandatory$")
	public void user_checks_if_do_you_have_assets_question_is_mandatory() throws Throwable {
		assetsPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
		assetsPage.DisplayedNoQuestion1Required();
	}

	@Then("^user checks if Select Asset question is mandatory$")
	public void user_checks_if_Select_Asset_question_is_mandatory() throws Throwable {
		assetsPage.DisplayedSelectAssetDropdownRequired();
	}

	@Then("^user checks on validation on Select Asset$")
	public void user_checks_on_validation_on_Select_Asset() throws Throwable {
		assetsPage.CheckSelectAssetDropdownDefaultValue();
		CommonFunctions.wait(5000, false);
		assetsPage.CheckSelectAssetDropdownValues();
		CommonFunctions.wait(5000, false);
	}

	@When("^user sees password policy on tooltip$")
	public void user_sees_password_policy_on_tooltip() throws Throwable {
		registrationPage.CheckToolTipContent1();
	}

	@When("^user sees password policy on tooltip on change password page$")
	public void user_sees_password_policy_on_tooltip_on_change_password_page() throws Throwable {
		changePasswordPage.CheckToolTipContent1();
	}

	@Then("^user sees products displayed on landing page$")
	public void user_sees_products_displayed_on_landing_page() throws Throwable {
		homePage.displayedSinglesProduct();
		homePage.displayedCouplesProduct();
	}

	@When("^user selects singles product$")
	public void user_selects_singles_product() throws Throwable {
		homePage.clickSinglesProduct();
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects couples product$")
	public void user_selects_couples_product() throws Throwable {
		homePage.clickCouplesProduct();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks Standard will product for couples$")
	public void user_clicks_Standard_will_product_for_couples() throws Throwable {
		personalPage = homePage.clickCouplesProductStandardWillBtn();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks Standard will product for singles$")
	public void user_clicks_Standard_will_product_for_singles() throws Throwable {
		personalPage = homePage.clickSinglesProductStandardWillBtn();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks Standard victorian will product for singles$")
	public void user_clicks_Standard_victorian_will_product_for_singles() throws Throwable {
		personalPage = homePage.clickSinglesProductStandardWillVicBtn();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks MyLife will product for singles$")
	public void user_clicks_MyLife_will_product_for_singles() throws Throwable {
		personalPage = homePage.clickMyLifeProductStandardSingleWillBtn();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks MyLife will product for couples$")
	public void user_clicks_MyLife_will_product_for_couples() throws Throwable {
		personalPage = homePage.clickMyLifeProductStandardCoupleWillBtn();
		CommonFunctions.wait(5000, false);
	}

	@When("^user checks if additional questions displayed for single is correct when single product is selected$")
	public void user_checks_if_additional_questions_displayed_for_single_is_correct_when_single_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForSingleSinglesPackage();
	}

	@When("^user checks if additional questions displayed for single is correct when couple product is selected$")
	public void user_checks_if_additional_questions_displayed_for_single_is_correct_when_couple_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForSingleCouplesPackage();
	}

	@When("^user checks if additional questions displayed for widowed is correct when couple product is selected$")
	public void user_checks_if_additional_questions_displayed_for_widowed_is_correct_when_couple_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForWidowedCouple();
	}

	@When("^user checks if additional questions displayed for married is correct when couple product is selected$")
	public void user_checks_if_additional_questions_displayed_for_married_is_correct_when_couple_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForMarried();
	}

	@When("^user checks if additional questions displayed for separated is correct when couple product is selected$")
	public void user_checks_if_additional_questions_displayed_for_separated_is_correct_when_couple_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForSeparatedAndDivorced();
	}

	@When("^user checks if additional questions displayed for divorced is correct when couple product is selected$")
	public void user_checks_if_additional_questions_displayed_for_divorced_is_correct_when_couple_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForSeparatedAndDivorced();
	}

	@When("^user checks if additional questions displayed for separated is correct when single product is selected$")
	public void user_checks_if_additional_questions_displayed_for_separated_is_correct_when_single_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForSeparatedAndDivorced();
	}

	@When("^user checks if additional questions displayed for divorced is correct when single product is selected$")
	public void user_checks_if_additional_questions_displayed_for_divorced_is_correct_when_single_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForSeparatedAndDivorced();
	}

	@When("^user checks if additional questions displayed for defacto is correct when couple product is selected$")
	public void user_checks_if_additional_questions_displayed_for_defacto_is_correct_when_couple_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForDefactoAndEngaged();
	}

	@When("^user checks if additional questions displayed for engaged is correct when couple product is selected$")
	public void user_checks_if_additional_questions_displayed_for_engaged_is_correct_when_couple_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForDefactoAndEngaged();
	}

	@When("^user checks if additional questions displayed for married is correct when single product is selected$")
	public void user_checks_if_additional_questions_displayed_for_married_is_correct_when_single_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForMarried();
	}

	@When("^user checks if additional questions displayed for defacto is correct when single product is selected$")
	public void user_checks_if_additional_questions_displayed_for_defacto_is_correct_when_single_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForDefactoAndEngaged();
	}

	@When("^user checks if additional questions displayed for engaged is correct when single product is selected$")
	public void user_checks_if_additional_questions_displayed_for_engaged_is_correct_when_single_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForDefactoAndEngaged();
	}

	@When("^user checks if additional questions displayed for widowed is correct when single product is selected$")
	public void user_checks_if_additional_questions_displayed_for_widowed_is_correct_when_single_product_is_selected() throws Throwable {
		aboutPage.AdditionalQuestionsForWidowedSingle();
	}

	@Then("^user checks if the personal details content is complete$")
	public void user_checks_if_the_personal_details_content_is_complete() throws Throwable {

		personalPage.CheckTitleDropdown();
		personalPage.CheckFirstName();
		personalPage.CheckMiddleName();
		personalPage.CheckFamilyName();
		personalPage.CheckDateOfBirth();
		personalPage.CheckPhoneNumber();
		personalPage.CheckOccupation();
		personalPage.CheckResidentialAddressLine1();
		personalPage.CheckResidentialAddressLine2();
		personalPage.CheckResidentialSuburb();
		personalPage.CheckResidentialState();
		personalPage.CheckResidentialPostCode();
		personalPage.CheckResidentialAddressSameAsResidential();
		personalPage.CheckAdditionalQuestion1();
		personalPage.CheckYesQuestion1();
		personalPage.CheckNoQuestion1();
		personalPage.CheckAdditionalQuestion2();
		personalPage.CheckYesQuestion2();
		personalPage.CheckYesQuestion2();
		personalPage.CheckNextButton();
		personalPage.CheckCancelButton();

	}

	@Then("^the user checks if titles inside the Title dropdown is complete$")
	public void the_user_checks_if_titles_inside_the_Title_dropdown_is_complete() throws Throwable {
		String[] TitledropdownValues = { "Select one", "Dr", "Miss", "Mr", "Mrs.", "Ms", "Professor", "Reverend" };
		personalPage.CheckTitleDropdownValues(TitledropdownValues);

	}

	@When("^user selects Postal Address same as Residential checkbox$")
	public void user_selects_Postal_Address_same_as_Residential_checkbox() throws Throwable {
		personalPage.ClickPostalAddressSameAsResidential();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects no on first question$")
	public void user_selects_no_on_first_question() throws Throwable {
		personalPage.ClickNoFirstQuestion();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects yes on first question$")
	public void user_selects_yes_on_first_question() throws Throwable {
		personalPage.ClickYesFirstQuestion();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects no on second question$")
	public void user_selects_no_on_second_question() throws Throwable {
		personalPage.ClickNoSecondQuestion();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects yes on second question$")
	public void user_selects_yes_on_second_question() throws Throwable {
		personalPage.ClickYesSecondQuestion();
		CommonFunctions.wait(5000, false);
	}

	@When("^user checks if All Postal detail fields is not displayed$")
	public void user_checks_if_All_Postal_detail_fields_is_not_displayed() throws Throwable {
		personalPage.HiddenPostalDetailFields();
	}

	@When("^user checks if All Postal detail fields is displayed$")
	public void user_checks_if_All_Postal_detail_fields_is_displayed() throws Throwable {
		personalPage.DisplayedPostalDetailFields();
	}

	@Then("^user checks if relationship status dropdown is displayed$")
	public void user_checks_if_relationship_status_dropdown_is_displayed() throws Throwable {
		aboutPage.DisplayedRelationshipStatus();
	}

	@Then("^user checks if Cancel and Back button is displayed$")
	public void user_checks_if_Cancel_and_Back_button_is_displayed() throws Throwable {
		aboutPage.DisplayedNextBtn();
		aboutPage.DisplayedCancelBtn();
	}

	@When("^user selects no on law property settlement$")
	public void user_selects_no_on_law_property_settlement() throws Throwable {
		aboutPage.clickNoBtnLaw();
	}

	@When("^user selects yes on law property settlement$")
	public void user_selects_yes_on_law_property_settlement() throws Throwable {
		aboutPage.clickYesBtnLaw();
	}

	@When("^user selects NA on law property settlement$")
	public void user_selects_NA_on_law_property_settlement() throws Throwable {
		aboutPage.clickNABtnLaw();
	}

	@When("^user check if years of settlement field is not displayed$")
	public void user_check_if_years_of_settlement_field_is_not_displayed() throws Throwable {
		aboutPage.HiddenYearSettlement();
	}

	@When("^user check if years of settlement field is displayed$")
	public void user_check_if_years_of_settlement_field_is_displayed() throws Throwable {
		aboutPage.DisplayedYearSettlement();
	}

	@Then("^the user checks if States inside the Residential State dropdown is complete$")
	public void the_user_checks_if_States_inside_the_Residential_State_dropdown_is_complete() throws Throwable {
		String[] StatedropdownValues = { "Select one", "ACT", "NSW", "NT", "QLD", "SA", "TAS", "VIC", "WA" };
		personalPage.CheckResStateDropdownValues(StatedropdownValues);

	}

	@Then("^the user checks if Statuses inside the Relationship Status dropdown is complete$")
	public void the_user_checks_if_Statuses_inside_the_Relationship_Status_dropdown_is_complete() throws Throwable {
		String[] RelStatus = { "Select One", "Single", "Defacto", "Engaged", "Married", "Widowed", "Separated", "Divorced" };
		aboutPage.CheckRelationshipStatusDropdownValues(RelStatus);
	}

	@Then("^the user checks if States inside the Postal State dropdown is complete$")
	public void the_user_checks_if_States_inside_the_Postal_State_dropdown_is_complete() throws Throwable {
		String[] StatedropdownValues = { "Select one", "ACT", "NSW", "NT", "QLD", "SA", "TAS", "VIC", "WA" };
		personalPage.CheckPostalStateDropdownValues(StatedropdownValues);

	}

	@Then("^user check if \"([^\"]*)\" is the default value of the Relationship Status dropdown$")
	public void user_check_if_is_the_default_value_of_the_Relationship_Status_dropdown(String arg1) throws Throwable {
		aboutPage.CheckRelStatusDefaultValue(arg1);
	}

	@Then("^user check if \"([^\"]*)\" is the default value of the title dropdown$")
	public void user_check_if_is_the_default_value_of_the_title_dropdown(String arg1) throws Throwable {
		personalPage.CheckTitleDefaultValue(arg1);
	}

	@Then("^user check if \"([^\"]*)\" is the default value of the Residential State dropdown$")
	public void user_check_if_is_the_default_value_of_the_Residential_State_dropdown(String arg1) throws Throwable {
		personalPage.CheckResStateDefaultValue(arg1);
	}

	@Then("^user check if \"([^\"]*)\" is the default value of the Postal State dropdown$")
	public void user_check_if_is_the_default_value_of_the_Postal_State_dropdown(String arg1) throws Throwable {
		personalPage.CheckPostalStateDefaultValue(arg1);
	}

	@Then("^user checks if Title dropdown is mandatory$")
	public void user_checks_if_Title_dropdown_is_mandatory() throws Throwable {
		personalPage.ClearFirstName();
		personalPage.ClearFamilyName();
		personalPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
		personalPage.CheckTitleDropdownMandatory();

	}

	@Then("^user click the next button on the beneficiaries page$")
	public void user_click_the_next_button_on_the_beneficiaries_page() throws Throwable {
		executorsPage = beneficiariesPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user click the next button on the executors page$")
	public void user_click_the_next_button_on_the_executors_page() throws Throwable {
		idDocsPage = executorsPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user click the next button on the review and confirm page$")
	public void user_click_the_next_button_on_the_review_and_confirm_page() throws Throwable {
		addOnsPage = reviewConfirmPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user click the next button with POA on the financial decision page$")
	public void user_click_the_next_button_with_POA_on_the_financial_decision_page() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.wait(2000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		medicalDecisionsPage = financialDecisionsPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user selects Both financial and personal matters on enduring power of attorney options$")
	public void user_selects_Both_financial_and_personal_matters_on_enduring_power_of_attorney_options() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.wait(2000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		financialDecisionsPage.clickBothFinancialAndPersonalMatters();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user selects Only financial matters on enduring power of attorney options$")
	public void user_selects_Only_financial_matters_on_enduring_power_of_attorney_options() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.wait(2000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		financialDecisionsPage.clickOnlyFinancialMatters();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user selects Only personal matters on enduring power of attorney options$")
	public void user_selects_Only_personal_matters_on_enduring_power_of_attorney_options() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.wait(2000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		financialDecisionsPage.clickOnlyPersonalMatters();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user enter \"([^\"]*)\" as limitation value$")
	public void user_enter_as_limitation_value(String arg1) throws Throwable {
		CommonFunctions.wait(5000, false);
		financialDecisionsPage.SetLimitationsInput(arg1);
		CommonFunctions.wait(5000, false);
	}

	@Then("^user selects \"([^\"]*)\" on When do you want your Financial/Personal Decision Makers to start to act dropdown$")
	public void user_selects_on_When_do_you_want_your_Financial_Personal_Decision_Makers_to_start_to_act_dropdown(String arg1) throws Throwable {
		financialDecisionsPage.SelectValueOnAttorneyWhenToActDropdown(arg1);
		CommonFunctions.wait(5000, false);
	}

	@Then("^user sees mandatory validation inside the financial decision page for both financial and personal matters$")
	public void user_sees_mandatory_validation_inside_the_financial_decision_page_for_both_financial_and_personal_matters() throws Throwable {
		financialDecisionsPage.FinancialDecisionsMandatoryFieldsBoth();
	}

	@Then("^user sees mandatory validation inside the financial decision page for both financial and personal matters with personal$")
	public void user_sees_mandatory_validation_inside_the_financial_decision_page_for_both_financial_and_personal_matters_with_personal() throws Throwable {
		financialDecisionsPage.FinancialDecisionsMandatoryFieldsBothWithPersonal();
	}

	@Then("^user clicks yes to Personal Decision Makers question$")
	public void user_clicks_yes_to_Personal_Decision_Makers_question() throws Throwable {
		financialDecisionsPage.clickPersonalDecisionMakerRadioYes();
	}

	@Then("^user clicks no to Personal Decision Makers question$")
	public void user_clicks_no_to_Personal_Decision_Makers_question() throws Throwable {
		financialDecisionsPage.clickPersonalDecisionMakerRadioNo();
	}

	@Then("^user sees mandatory validation inside the financial decision page$")
	public void user_sees_mandatory_validation_inside_the_financial_decision_page() throws Throwable {
		financialDecisionsPage.FinancialDecisionsMandatoryFields();
	}

	@Then("^user sees mandatory validation inside the financial decision page for financial matters$")
	public void user_sees_mandatory_validation_inside_the_financial_decision_page_for_financial_matters() throws Throwable {
		financialDecisionsPage.FinancialDecisionsMandatoryFieldsFinancial();
	}

	@Then("^user clicks on add financial decision maker$")
	public void user_clicks_on_add_financial_decision_maker() throws Throwable {
		financialDecisionsPage.clickAddPOA();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user clicks on add personal decision maker$")
	public void user_clicks_on_add_personal_decision_maker() throws Throwable {
		financialDecisionsPage.clickAddPOA();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user sees mandatory fields validation on adding financial decision maker$")
	public void user_sees_mandatory_fields_validation_on_adding_financial_decision_maker() throws Throwable {
		financialDecisionsPage.FinancialDecisionsMandatoryFieldsOnAddingFinancial();
	}

	@Then("^user sees mandatory fields validation on adding personal decision maker$")
	public void user_sees_mandatory_fields_validation_on_adding_personal_decision_maker() throws Throwable {
		financialDecisionsPage.FinancialDecisionsMandatoryFieldsOnAddingFinancial();
	}

	@Then("^user clicks on add personal decision maker on financial decision page$")
	public void user_clicks_on_add_personal_decision_maker_on_financial_decision_page() throws Throwable {
		financialDecisionsPage.AddPersonalDecisionMakerID();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user clicks on add financial decision maker on financial decision page$")
	public void user_clicks_on_add_financial_decision_maker_on_financial_decision_page() throws Throwable {
		financialDecisionsPage.AddFinancialDecisionMakerID();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user checks if add financial decision maker button on financial decision page is hidden$")
	public void user_checks_if_add_financial_decision_maker_button_on_financial_decision_page_is_hidden() throws Throwable {
		financialDecisionsPage.AddFinancialDecisionMakerIDHidden();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user checks if add personal decision maker button on financial decision page is hidden$")
	public void user_checks_if_add_personal_decision_maker_button_on_financial_decision_page_is_hidden() throws Throwable {
		financialDecisionsPage.AddPersonalDecisionMakerIDHidden();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user sees mandatory validation inside the financial decision page for personal matters$")
	public void user_sees_mandatory_validation_inside_the_financial_decision_page_for_personal_matters() throws Throwable {
		financialDecisionsPage.FinancialDecisionsMandatoryFieldsPersonal();
	}

	@Then("^user click the next button with POA on the AddOns page$")
	public void user_click_the_next_button_on_the_AddOns_page() throws Throwable {
		CommonFunctions.wait(5000, false);
		financialDecisionsPage = addOnsPage.clickNextWithPOA();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user click the next button without adding POA on the AddOns page$")
	public void user_click_the_next_button_without_adding_POA_on_the_AddOns_page() throws Throwable {
		paymentsPage = addOnsPage.clickNextWithoutPOA();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects Foreign Passport as first identification type$")
	public void user_selects_Foreign_Passport_as_first_identification_type() throws Throwable {
		idDocsPage.SelectForeignPassportFirstID();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects Driver License as first identification type$")
	public void user_selects_Driver_License_as_first_identification_type() throws Throwable {
		idDocsPage.SelectDriverLicenseFirstID();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects Driver License as second identification type$")
	public void user_selects_Driver_License_as_second_identification_type() throws Throwable {
		idDocsPage.SelectDriverLicenseSecondID();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects Medicare as first identification type$")
	public void user_selects_Medicare_as_first_identification_type() throws Throwable {
		idDocsPage.SelectMedicareFirstID();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects Medicare as second identification type$")
	public void user_selects_Medicare_as_second_identification_type() throws Throwable {
		idDocsPage.SelectMedicareSecondID();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects Foreign Passport as second identification type$")
	public void user_selects_Foreign_Passport_as_second_identification_type() throws Throwable {
		idDocsPage.SelectForeignPassportFirstID();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user checks if mandatory fields for Foreign Passport and Australian Passport Identification type$")
	public void user_checks_if_mandatory_fields_for_Foreign_Passport_and_Australian_Passport_Identification_type() throws Throwable {
		idDocsPage.displayMandatoryForeignPassport();
		idDocsPage.displayMandatoryAUPassport();
	}

	@Then("^user checks if mandatory fields for Driver License and Medicare Identification type$")
	public void user_checks_if_mandatory_fields_for_Driver_License_and_Medicare_Identification_type() throws Throwable {
		idDocsPage.displayMandatoryDriversLicense();
		idDocsPage.displayMandatoryMedicare();
	}

	@When("^user adds foreign passport details$")
	public void user_adds_foreign_passport_details() throws Throwable {
		idDocsPage.FillUpForeignPassport();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}

	@When("^user adds driver license details$")
	public void user_adds_driver_license_details() throws Throwable {
		idDocsPage.FillUpDriversLicense();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}

	@When("^user adds medicare details$")
	public void user_adds_medicare_details() throws Throwable {
		idDocsPage.FillUpMedicare();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}

	@When("^user adds autralian passport details$")
	public void user_adds_autralian_passport_details() throws Throwable {
		idDocsPage.FillUpAustralianPassport();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}

	@When("^user selects Australian Passport as first identification type$")
	public void user_selects_Australian_Passport_as_first_identification_type() throws Throwable {
		idDocsPage.SelectAustralianPassportSecondID();
		CommonFunctions.wait(5000, false);
	}

	@When("^user selects Australian Passport as second identification type$")
	public void user_selects_Australian_Passport_as_second_identification_type() throws Throwable {
		idDocsPage.SelectAustralianPassportSecondID();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks next button on the ID docs page$")
	public void user_clicks_next_button_on_the_ID_docs_page() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		reviewConfirmPage = idDocsPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user clicks back button on the ID docs page$")
	public void user_clicks_back_button_on_the_ID_docs_page() throws Throwable {
		executorsPage = idDocsPage.ClickBackButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to Would you like Maurice Blackburn to help your Executor manage your estate question$")
	public void user_clicks_no_to_Would_you_like_Maurice_Blackburn_to_help_your_Executor_manage_your_estate_question() throws Throwable {
		executorsPage.clickQuestion16B();
	}

	@Then("^user click Buried to when i pass away I wish to be$")
	public void user_click_Buried_to_when_i_pass_away_I_wish_to_be() throws Throwable {
		executorsPage.clickQuestion17A();
	}

	@When("^user click Cremated to when i pass away I wish to be$")
	public void user_click_Cremated_to_when_i_pass_away_I_wish_to_be() throws Throwable {
		executorsPage.clickQuestion17B();
	}

	@Then("^user updates details of first executor$")
	public void user_updates_details_of_first_executor() throws Throwable {
		executorsPage.UpdateExecutorBackup();
	}

	@When("^user clicks edit button on first executor$")
	public void user_clicks_edit_button_on_first_executor() throws Throwable {
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.wait(5000, false);
		executorsPage.clickEditExecutor();
	}

	@Then("^user deletes the first executor$")
	public void user_deletes_the_first_executor() throws Throwable {
		executorsPage.clickDeleteExecutor();
	}

	@Then("^user update the executor details from backup to first option$")
	public void user_update_the_executor_details_from_backup_to_first_option() throws Throwable {
		executorsPage.clickQuestion14A();
		executorsPage.clickBTNAdd3();
	}

	@When("^user selects i have no wish on funeral wishes$")
	public void user_selects_i_have_no_wish_on_funeral_wishes() throws Throwable {
		executorsPage.clickQuestion17D();
	}

	@Then("^user selects i have other on funeral wishes$")
	public void user_selects_i_have_other_on_funeral_wishes() throws Throwable {
		executorsPage.clickQuestion17C();
	}

	@Then("^user fills up financial decision maker details with Primary Decision Maker$")
	public void user_fills_up_financial_decision_maker_details_with_Primary_Decision_Maker() throws Throwable {
		financialDecisionsPage.SetFinancialDecisionsMandatoryFieldsOnAddingFinancialPDMYes();
	}

	@Then("^user fills up personal decision maker details with Primary Decision Maker$")
	public void user_fills_up_personal_decision_maker_details_with_Primary_Decision_Maker() throws Throwable {
		financialDecisionsPage.SetFinancialDecisionsMandatoryFieldsOnAddingFinancialPDMYes();
	}

	@Then("^user fills up financial decision maker details without Primary Decision Maker$")
	public void user_fills_up_financial_decision_maker_details_without_Primary_Decision_Maker() throws Throwable {
		financialDecisionsPage.SetFinancialDecisionsMandatoryFieldsOnAddingFinancialPDMNo();
	}

	@Then("^user selects i have cremated on funeral wishes$")
	public void user_selects_i_have_cremated_on_funeral_wishes() throws Throwable {
		executorsPage.clickQuestion17B();
	}

	@Then("^user selects i have buried on funeral wishes$")
	public void user_selects_i_have_buried_on_funeral_wishes() throws Throwable {
		executorsPage.clickQuestion17A();
	}

	@Then("^user sees funeral wishes field$")
	public void user_sees_funeral_wishes_field() throws Throwable {
		executorsPage.DisplayQuestion20();
	}

	@Then("^user checks if Relationship Status dropdown is mandatory$")
	public void user_checks_if_Relationship_Status_dropdown_is_mandatory() throws Throwable {
		aboutPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
		aboutPage.CheckRelationshipStatusDropdownMandatory();
	}

	@When("^user clicks on Next button on personal page$")
	public void user_clicks_on_Next_button_on_personal_page() throws Throwable {
		aboutPage = personalPage.ClickNextButton();
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks next page to review and confirm details$")
	public void user_clicks_next_page_to_review_and_confirm_details() throws Throwable {
		reviewConfirmPage = personalPage.clickNextToReviewConfirm();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user checks the person mandatory fields inside the adding of beneficiaries page$")
	public void user_checks_the_person_mandatory_fields_inside_the_adding_of_beneficiaries_page() throws Throwable {
		beneficiariesPage.MandatoryFieldsInAddingBeneficiaryPerson();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user checks the charity mandatory fields inside the adding of beneficiaries page$")
	public void user_checks_the_charity_mandatory_fields_inside_the_adding_of_beneficiaries_page() throws Throwable {
		beneficiariesPage.MandatoryFieldsInAddingBeneficiaryCharity();
		CommonFunctions.wait(5000, false);
	}

	@When("^user adds person beneficiaries with amount$")
	public void user_adds_person_beneficiaries_with_amount() throws Throwable {
		beneficiariesPage.AddBeneficiaryPersonWithAmount();
	}

	@When("^user edits benefeciaries detail$")
	public void user_edits_benefeciaries_detail() throws Throwable {
		beneficiariesPage.EditBeneficiaryPersonWithAmount();
	}

	@When("^user adds person beneficiaries with percentage$")
	public void user_adds_person_beneficiaries_with_percentage() throws Throwable {
		beneficiariesPage.AddBeneficiaryPersonWithPercentage();
	}

	@When("^user adds charity beneficiaries with amount$")
	public void user_adds_charity_beneficiaries_with_amount() throws Throwable {
		beneficiariesPage.AddBeneficiaryCharityWithAmount();
	}

	@When("^user adds charity beneficiaries with percentage$")
	public void user_adds_charity_beneficiaries_with_percentage() throws Throwable {
		beneficiariesPage.AddBeneficiaryCharityWithPercentage();
	}

	@When("^user clicks on Cancel button on personal page$")
	public void user_clicks_on_Cancel_button_on_personal_page() throws Throwable {
		personalPage.ClickNextButton();
	}

	@Then("^user checks if Residential State dropdown is mandatory$")
	public void user_checks_if_Residential_State_dropdown_is_mandatory() throws Throwable {
		personalPage.CheckResStateDropdownMandatory();
	}

	@Then("^user checks if Postal State dropdown is mandatory$")
	public void user_checks_if_Postal_State_dropdown_is_mandatory() throws Throwable {
		personalPage.CheckPostalStateDropdownMandatory();

	}

	@Then("^user check if First name field is mandatory$")
	public void user_check_if_First_name_field_is_mandatory() throws Throwable {
		personalPage.CheckFirstNameMandatory();
	}

	@Then("^user check if Phone Number field is mandatory$")
	public void user_check_if_Phone_Number_field_is_mandatory() throws Throwable {
		personalPage.CheckPhoneNumberMandatory();
	}

	@Then("^user check if Residential Postcode field is mandatory$")
	public void user_check_if_Residential_Postcode_field_is_mandatory() throws Throwable {
		personalPage.CheckResPostcodeMandatory();
	}

	@Then("^user check if Postal Postcode field is mandatory$")
	public void user_check_if_Postal_Postcode_field_is_mandatory() throws Throwable {
		personalPage.CheckPostalPostcodeMandatory();
	}

	@Then("^user check if First Question is mandatory$")
	public void user_check_if_First_Question_is_mandatory() throws Throwable {
		personalPage.CheckFirstQuestionMandatory();
	}

	@Then("^user check if Second Question is mandatory$")
	public void user_check_if_Second_Question_is_mandatory() throws Throwable {
		personalPage.CheckSecondQuestionMandatory();
	}

	@Then("^user check if Residential address line one field is mandatory$")
	public void user_check_if_Residential_address_line_one_field_is_mandatory() throws Throwable {
		personalPage.CheckResidentialAddressLine1Mandatory();
	}

	@When("^user clicks add dependent button$")
	public void user_clicks_add_dependent_button() throws Throwable {
		aboutPage.ClickAddDependent();
	}

	@When("^user clicks edit dependent button$")
	public void user_clicks_edit_dependent_button() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.wait(5000, false);
		aboutPage.ClickEditFirstDependent();

	}

	@When("^user deletes first dependent$")
	public void user_deletes_first_dependent() throws Throwable {
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.wait(5000, false);
		aboutPage.ClickDeleteFirstDependent();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks save dependent button$")
	public void user_clicks_save_dependent_button() throws Throwable {
		aboutPage.ClickSaveAddDependent();
	}

	@When("^user adds a dependent that lives in Australia$")
	public void user_adds_a_dependent_that_lives_in_Australia() throws Throwable {
		aboutPage.AddAUDependent();
	}

	@When("^user adds a dependent that does not live in Australia$")
	public void user_adds_a_dependent_that_does_not_live_in_Australia() throws Throwable {
		aboutPage.AddNonAUDependent();
	}

	@When("^user edits dependent details$")
	public void user_edits_dependent_details() throws Throwable {
		aboutPage.AddNonAUDependent();
	}

	@Then("^user check if Residential address line two field is mandatory$")
	public void user_check_if_Residential_address_line_two_field_is_mandatory() throws Throwable {
		personalPage.CheckResidentialAddressLine1Mandatory();
	}

	@Then("^user check if Postal address line one field is mandatory$")
	public void user_check_if_Postal_address_line_one_field_is_mandatory() throws Throwable {
		personalPage.CheckPostalAddressLine1Mandatory();
	}

	@When("^user selects \"([^\"]*)\" as title on personal page$")
	public void user_selects_as_title_on_personal_page(String arg1) throws Throwable {
		personalPage.SelectTitlePersonalPage(arg1);
	}

	@When("^user selects \"([^\"]*)\" as Relationship Status on about page$")
	public void user_selects_as_Relationship_Status_on_about_page(String arg1) throws Throwable {
		aboutPage.SelectRelationshipStatusPersonalPage(arg1);
		CommonFunctions.wait(10000, false);
	}

	@When("^user selects \"([^\"]*)\" as Residential state on personal page$")
	public void user_selects_as_Residential_state_on_personal_page(String arg1) throws Throwable {
		personalPage.SelectResStatePersonalPage(arg1);
	}

	@When("^user clicks yes on do you have any other dependents question$")
	public void user_clicks_yes_on_do_you_have_any_other_dependents_question() throws Throwable {
		aboutPage.ClickDependentsYes();
	}

	@When("^user selects \"([^\"]*)\" as Asset on assets page$")
	public void user_selects_as_Asset_on_assets_page(String arg1) throws Throwable {
		assetsPage.SelectAssetonDropdown(arg1);
		CommonFunctions.wait(5000, false);
	}

	@When("^user checks if validations of fields inside the adding of property asset is implemented$")
	public void user_checks_if_validations_of_fields_inside_the_adding_of_property_asset_is_implemented() throws Throwable {
		assetsPage.CheckRequiredPropertyFields();
	}

	@When("^user checks if validations of fields inside the adding of bank account asset is implemented$")
	public void user_checks_if_validations_of_fields_inside_the_adding_of_bank_account_asset_is_implemented() throws Throwable {
		assetsPage.CheckRequiredBankAccountFields();
	}

	@When("^user checks if validations of fields inside the adding of vehicle asset is implemented$")
	public void user_checks_if_validations_of_fields_inside_the_adding_of_vehicle_asset_is_implemented() throws Throwable {
		assetsPage.CheckRequiredVehicleFields();
	}

	@When("^user checks if validations of fields inside the adding of shares asset is implemented$")
	public void user_checks_if_validations_of_fields_inside_the_adding_of_shares_asset_is_implemented() throws Throwable {
		assetsPage.CheckRequiredSharesFields();
	}

	@When("^user checks if validations of fields inside the adding of other asset is implemented$")
	public void user_checks_if_validations_of_fields_inside_the_adding_of_other_asset_is_implemented() throws Throwable {
		assetsPage.CheckRequiredOtherFields();
	}

	@When("^user fills up all fields inside the adding of property asset$")
	public void user_fills_up_all_fields_inside_the_adding_of_property_asset() throws Throwable {
		assetsPage.FillUpAllPropertyFields();
	}

	@When("^user fills up all fields inside the adding of shares asset$")
	public void user_fills_up_all_fields_inside_the_adding_of_shares_asset() throws Throwable {
		assetsPage.FillUpAllSharesFields();
	}

	@When("^user fills up all fields inside the adding of other asset$")
	public void user_fills_up_all_fields_inside_the_adding_of_other_asset() throws Throwable {
		assetsPage.FillUpAllOtherFields();
	}

	@When("^user fills up all fields inside the adding of vehicle asset$")
	public void user_fills_up_all_fields_inside_the_adding_of_vehicle_asset() throws Throwable {
		assetsPage.FillUpAllVehicleFields();
	}

	@When("^user fills up all fields inside the adding of bank account asset$")
	public void user_fills_up_all_fields_inside_the_adding_of_bank_account_asset() throws Throwable {
		assetsPage.FillUpAllBankAccountFields();
	}

	@When("^user selects \"([^\"]*)\" as Residential Postcode on personal page$")
	public void user_selects_as_Residential_Postcode_on_personal_page(String arg1) throws Throwable {
		personalPage.SelectResPostcodePersonalPage(arg1);
	}

	@When("^user inputs \"([^\"]*)\" as date of birth on personal page$")
	public void user_inputs_as_date_of_birth_on_personal_page(String arg1) throws Throwable {
		// personalPage.SelectDateToday();
		personalPage.SetDateOfBirth(arg1);
		// personalPage.SetDateOfBirth(arg1);
		// CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		// CommonFunctions.wait(5000, false);
	}

	@When("^user select today as birth date$")
	public void user_select_today_as_birth_date() throws Throwable {
		personalPage.SelectDateToday();
	}

	@When("^user inputs \"([^\"]*)\" as Phone Number on personal page$")
	public void user_inputs_as_Phone_Number_on_personal_page(String arg1) throws Throwable {
		personalPage.SetPhoneNumber(arg1);
	}

	@When("^user inputs \"([^\"]*)\" as Occupation on personal page$")
	public void user_inputs_as_Occupation_on_personal_page(String arg1) throws Throwable {
		personalPage.SetOccupation(arg1);
	}

	@When("^user inputs \"([^\"]*)\" as Residential address line one on personal page$")
	public void user_inputs_as_Residential_address_line_one_on_personal_page(String arg1) throws Throwable {
		personalPage.SetResAddressline1(arg1);
	}

	@When("^user inputs \"([^\"]*)\" as Residential suburb on personal page$")
	public void user_inputs_as_Residential_suburb_on_personal_page(String arg1) throws Throwable {
		personalPage.SetResSuburb(arg1);
	}

	@When("^user click the next button on the about page$")
	public void user_click_the_next_button_on_the_about_page() throws Throwable {
		assetsPage = aboutPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user click the back button on the about page$")
	public void user_click_the_back_button_on_the_about_page() throws Throwable {
		personalPage = aboutPage.ClickBackButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user click the next button on the assets page$")
	public void user_click_the_next_button_on_the_assets_page() throws Throwable {
		beneficiariesPage = assetsPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user click the back button on the assets page$")
	public void user_click_the_back_button_on_the_assets_page() throws Throwable {
		aboutPage = assetsPage.ClickBackButton();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user check if Family name field is mandatory$")
	public void user_check_if_Family_name_field_is_mandatory() throws Throwable {
		personalPage.CheckFirstNameMandatory();
	}

	@Then("^user checks if mandatory fields are validated$")
	public void user_checks_if_mandatory_fields_are_validated() throws Throwable {
		aboutPage.RequiredValidationOnAboutPage();
	}

	@When("^user checks if mandatory fields are validated when single is selected$")
	public void user_checks_if_mandatory_fields_are_validated_when_single_is_selected() throws Throwable {
		aboutPage.RequiredValidationOnAboutPageSingle();
	}

	@When("^user checks if mandatory fields are validated when widowed is selected$")
	public void user_checks_if_mandatory_fields_are_validated_when_widowed_is_selected() throws Throwable {
		aboutPage.RequiredValidationOnAboutPageWidowed();
	}

	@When("^user checks if mandatory fields are validated when married is selected$")
	public void user_checks_if_mandatory_fields_are_validated_when_married_is_selected() throws Throwable {
		aboutPage.RequiredValidationOnAboutPageMarried();
	}

	@When("^user checks if mandatory fields are validated when separated is selected$")
	public void user_checks_if_mandatory_fields_are_validated_when_separated_is_selected() throws Throwable {
		aboutPage.RequiredValidationOnAboutPageSeparated();
	}

	@When("^user checks if mandatory fields are validated when divorced is selected$")
	public void user_checks_if_mandatory_fields_are_validated_when_divorced_is_selected() throws Throwable {
		aboutPage.RequiredValidationOnAboutPageSeparated();
	}

	@When("^user fill up the all required fields for single status$")
	public void user_fill_up_the_all_required_fields_for_single_status() throws Throwable {
		aboutPage.FillUpMandatoryFieldsSingle();
	}

	@When("^user fill up the all required fields for single status with children$")
	public void user_fill_up_the_all_required_fields_for_single_status_with_children() throws Throwable {
		aboutPage.FillUpMandatoryFieldsSingleWithChild();
	}

	@When("^user fills up for single status for step children$")
	public void user_fills_up_for_single_status_for_step_children() throws Throwable {
		aboutPage.AddChildrenStepChild();
	}

	@When("^user clicks on add superannuation button$")
	public void user_clicks_on_add_superannuation_button() throws Throwable {
		assetsPage.ClickAddSuper();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks cancel button on adding superannuation$")
	public void user_clicks_cancel_button_on_adding_superannuation() throws Throwable {
		assetsPage.ClickAddSuperCancel();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks save button on adding superannuation$")
	public void user_clicks_save_button_on_adding_superannuation() throws Throwable {
		assetsPage.ClickAddSuperSave();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user sees mandatory fields validation for adding superannuation$")
	public void user_sees_mandatory_fields_validation_for_adding_superannuation() throws Throwable {
		assetsPage.MandatoryfieldsAddSuper();
	}

	@When("^user adds superannuation with unsure death beneficiary$")
	public void user_adds_superannuation_with_unsure_death_beneficiary() throws Throwable {
		assetsPage.AddSuperWithDeathBenefUnsure();
	}

	@When("^user adds superannuation with no death beneficiary$")
	public void user_adds_superannuation_with_no_death_beneficiary() throws Throwable {
		assetsPage.AddSuperWithDeathBenefNo();
	}

	@When("^user adds superannuation with death beneficiary$")
	public void user_adds_superannuation_with_death_beneficiary() throws Throwable {
		assetsPage.AddSuperWithDeathBenefYes();
	}

	@When("^user sees validation on question do you have any other dependents$")
	public void user_sees_validation_on_question_do_you_have_any_other_dependents() throws Throwable {
		aboutPage.DisplayMandatoryFieldsDependent();
	}

	@When("^user clicks save button on adding death beneficiary$")
	public void user_clicks_save_button_on_adding_death_beneficiary() throws Throwable {
		assetsPage.SuperDeathBenefSave();
	}

	@When("^user fill up the all required fields for single status with minor child$")
	public void user_fill_up_the_all_required_fields_for_single_status_with_minor_child() throws Throwable {
		aboutPage.FillUpMandatoryFieldsSingleWithMinorChild();
	}

	@When("^user fill up the all required fields for married status without children$")
	public void user_fill_up_the_all_required_fields_for_married_status_without_children() throws Throwable {
		aboutPage.FillUpMandatoryFieldsSingleWithChild();
	}

	@When("^user clicks add death benificiary$")
	public void user_clicks_add_death_benificiary() throws Throwable {
		assetsPage.ClickAddSuperBenef();
	}

	@When("^user clicks edit death benificiary$")
	public void user_clicks_edit_death_benificiary() throws Throwable {
		assetsPage.ClickEditSuperBenef();
	}

	@Then("^user deletes the first death benificiary$")
	public void user_deletes_the_first_death_benificiary() throws Throwable {
		assetsPage.ClickDeleteSuperBenef();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}

	@Then("^user sees mandatory fields validation for nominating beneficiary$")
	public void user_sees_mandatory_fields_validation_for_nominating_beneficiary() throws Throwable {
		assetsPage.DisplayValidationOnMandatoryFieldsForNominatedDeathBenef();
	}

	@When("^user clicks yes on Is it Binding question$")
	public void user_clicks_yes_on_Is_it_Binding_question() throws Throwable {
		assetsPage.ClickBindingYes();
	}

	@When("^user clicks no on Is it Binding question$")
	public void user_clicks_no_on_Is_it_Binding_question() throws Throwable {
		assetsPage.ClickBindingNo();
	}

	@When("^user clicks unsure on Is it Binding question$")
	public void user_clicks_unsure_on_Is_it_Binding_question() throws Throwable {
		assetsPage.ClickBindingUnsure();
	}

	@Then("^user nominates a beneficiary$")
	public void user_nominates_a_beneficiary() throws Throwable {
		assetsPage.NominateBeneficiary();
	}

	@When("^user edits the nominated beneficiary$")
	public void user_edits_the_nominated_beneficiary() throws Throwable {
		assetsPage.EditNominateBeneficiary();
	}

	@When("^user fill up the all required fields for widowed status$")
	public void user_fill_up_the_all_required_fields_for_widowed_status() throws Throwable {
		aboutPage.FillUpMandatoryFieldsWidowed();
	}

	@When("^user fill up the all required fields for defacto status$")
	public void user_fill_up_the_all_required_fields_for_defacto_status() throws Throwable {
		aboutPage.FillUpMandatoryFieldsDefacto();
	}

	@When("^user fill up the all required fields for engaged status$")
	public void user_fill_up_the_all_required_fields_for_engaged_status() throws Throwable {
		aboutPage.FillUpMandatoryFieldsEngaged();
	}

	@When("^user fill up the all required fields for married status$")
	public void user_fill_up_the_all_required_fields_for_married_status() throws Throwable {
		aboutPage.FillUpMandatoryFieldsMarried();
	}

	@When("^user fill up the all required fields for married status with spouse email$")
	public void user_fill_up_the_all_required_fields_for_married_status_with_spouse_email() throws Throwable {
		aboutPage.FillUpMandatoryFieldsMarriedWithSpouse();
	}

	@When("^user fill up the all required fields for married status with children$")
	public void user_fill_up_the_all_required_fields_for_married_status_with_children() throws Throwable {
		aboutPage.FillUpMandatoryFieldsMarriedWithChildren();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks yes to If your spouse/partner predeceases you do you want to give the whole estate equally to your children question$")
	public void user_clicks_yes_to_If_your_spouse_partner_predeceases_you_do_you_want_to_give_the_whole_estate_equally_to_your_children_question() throws Throwable {
		beneficiariesPage.ClickYesQuestion1SingleWithChildren();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks no to If your spouse/partner predeceases you do you want to give the whole estate equally to your children question$")
	public void user_clicks_no_to_If_your_spouse_partner_predeceases_you_do_you_want_to_give_the_whole_estate_equally_to_your_children_question() throws Throwable {
		beneficiariesPage.ClickNoQuestion1SingleWithChildren();
		CommonFunctions.wait(5000, false);
	}

	@When("^user fill up the all required fields for separated status$")
	public void user_fill_up_the_all_required_fields_for_separated_status() throws Throwable {
		aboutPage.FillUpMandatoryFieldsSeparated();
		CommonFunctions.wait(5000, false);
	}

	@When("^user fill up the all required fields for divorced status$")
	public void user_fill_up_the_all_required_fields_for_divorced_status() throws Throwable {
		aboutPage.FillUpMandatoryFieldsDivorced();
	}

	@When("^user checks if mandatory fields are validated when defacto is selected$")
	public void user_checks_if_mandatory_fields_are_validated_when_defacto_is_selected() throws Throwable {
		aboutPage.RequiredValidationOnAboutPageDefacto();
	}

	@When("^user answers yes to question do have children$")
	public void user_answers_yes_to_question_do_have_children() throws Throwable {
		aboutPage.YesChildren();
	}

	@When("^user checks if all fields inside the adding of children is complete$")
	public void user_checks_if_all_fields_inside_the_adding_of_children_is_complete() throws Throwable {
		aboutPage.CheckContentAddChildren();
	}

	@When("^user adds a legitimate child$")
	public void user_adds_a_legitimate_child() throws Throwable {
		aboutPage.AddChildrenToggleOffOn();
		CommonFunctions.wait(5000, false);
		aboutPage.AddChildrenClickAddChild();
		CommonFunctions.wait(5000, false);
		aboutPage.AddChildrenLegitimate();
		CommonFunctions.wait(5000, false);
	}

	@When("^user checks if validation on mandatory fields inside the adding of guardian is implemented$")
	public void user_checks_if_validation_on_mandatory_fields_inside_the_adding_of_guardian_is_implemented() throws Throwable {
		aboutPage.AddGauardianClickAddGuardian();
		CommonFunctions.wait(5000, false);
		aboutPage.ClickGuardianSave();
		CommonFunctions.wait(5000, false);
		aboutPage.DisplayMandatoryFieldsOnGuardian();

	}

	@When("^user checks if the default value for country inside the adding of guardian screen is set to Australia$")
	public void user_checks_if_the_default_value_for_country_inside_the_adding_of_guardian_screen_is_set_to_Australia() throws Throwable {
		aboutPage.CheckGuardianCountryDefaultValue();
	}

	@When("^user adds a guardian$")
	public void user_adds_a_guardian() throws Throwable {
		aboutPage.AddGauardianClickAddGuardian();
		CommonFunctions.wait(5000, false);
		aboutPage.AddGuardian();
	}

	@When("^user edits the detials of secondary guardian$")
	public void user_edits_the_detials_of_secondary_guardian() throws Throwable {
		aboutPage.EditSecondaryGuardian();
	}

	@When("^user deletes the secondary guardian$")
	public void user_deletes_the_secondary_guardian() throws Throwable {
		CommonFunctions.wait(5000, false);
		aboutPage.DeleteSecondaryGuardian();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.wait(5000, false);

	}

	@When("^user adds secondary guardian$")
	public void user_adds_secondary_guardian() throws Throwable {
		aboutPage.AddGauardianClickAddGuardian();
		CommonFunctions.wait(5000, false);
		aboutPage.AddGuardian2();
	}

	@When("^user selects yes on guardian question$")
	public void user_selects_yes_on_guardian_question() throws Throwable {
		aboutPage.ClickGuardianYes();
		CommonFunctions.wait(5000, false);
	}

	@When("^user checks if guardian question is mandatory$")
	public void user_checks_if_guardian_question_is_mandatory() throws Throwable {
		aboutPage.GuardianRequiredDisplayed();
		CommonFunctions.wait(5000, false);
	}

	@When("^user adds another legitimate child$")
	public void user_adds_another_legitimate_child() throws Throwable {
		aboutPage.AddChildrenClickAddChild();
		CommonFunctions.wait(5000, false);
		aboutPage.AddChildrenLegitimate();
		CommonFunctions.wait(5000, false);
	}

	@When("^user edits first child's details$")
	public void user_edits_first_child_s_details() throws Throwable {
		aboutPage.ClickEditFirstChild();
		CommonFunctions.wait(5000, false);
		aboutPage.AddChildrenFromPrevious();

	}

	@When("^user removes second child$")
	public void user_removes_second_child() throws Throwable {
		aboutPage.ClickDeleteSecondChild();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));

	}

	@Then("^user confirms on the acknowledgement inside the review and confirm page$")
	public void user_confirms_on_the_acknowledgement_inside_the_review_and_confirm_page() throws Throwable {
		reviewConfirmPage.ClickConfirmAcknowledgement();
	}

	@When("^user check if add child link is displayed for the user to add another child$")
	public void user_check_if_add_child_link_is_displayed_for_the_user_to_add_another_child() throws Throwable {
		aboutPage.AddChildrenLinkDisplayed();
	}

	@When("^user checks if mandatory fields are validated when engaged is selected$")
	public void user_checks_if_mandatory_fields_are_validated_when_engaged_is_selected() throws Throwable {
		aboutPage.RequiredValidationOnAboutPageDefacto();
	}

	@Then("^user check if Occupation field is mandatory$")
	public void user_check_if_Occupation_field_is_mandatory() throws Throwable {
		personalPage.CheckOccupationMandatory();
	}

	@When("^user check if mandatory fields validation in adding children is implemented$")
	public void user_check_if_mandatory_fields_validation_in_adding_children_is_implemented() throws Throwable {
		aboutPage.CheckAddChildrenRequired();
	}

	@Then("^user check if Residential Suburb field is mandatory$")
	public void user_check_if_Residential_Suburb_field_is_mandatory() throws Throwable {
		personalPage.CheckResSuburbMandatory();
	}

	@Then("^user check if Postal Suburb field is mandatory$")
	public void user_check_if_Postal_Suburb_field_is_mandatory() throws Throwable {
		personalPage.CheckPostalSuburbMandatory();
	}

	@Then("^user check if Date of birth is mandatory$")
	public void user_check_if_Date_of_birth_is_mandatory() throws Throwable {
		personalPage.CheckDOBMandatory();
	}

	@Then("^user check if Date of birth contains format validation$")
	public void user_check_if_Date_of_birth_contains_format_validation() throws Throwable {
		personalPage.CheckDOBPlaceholder();
		personalPage.SetInvalidDOB();
		CommonFunctions.wait(10000, false);
		personalPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
		personalPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
		personalPage.CheckInvalidDOBValidation();
	}

	@Then("^user check if Middle name field is not mandatory$")
	public void user_check_if_Middle_name_field_is_not_mandatory() throws Throwable {
		personalPage.CheckMiddleNameNotMandatory();
	}

	@Then("^user checks if First name field max length is set to fifty$")
	public void user_checks_if_First_name_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthFirstName();
	}

	@Then("^user checks if Phone Number field max length is set to ten$")
	public void user_checks_if_Phone_Number_field_max_length_is_set_to_ten() throws Throwable {
		personalPage.MaxlengthPhoneNumber();
	}

	@When("^user clicks on add beneficiary$")
	public void user_clicks_on_add_beneficiary() throws Throwable {
		beneficiariesPage.ClickBeneficiaryQuestion();
	}

	@When("^user clicks on add executor$")
	public void user_clicks_on_add_executor() throws Throwable {
		executorsPage.clickQuestion2();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks add executor button$")
	public void user_clicks_add_executor_button() throws Throwable {
		executorsPage.clickAddExecutorButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks on cancel beneficiary$")
	public void user_clicks_on_cancel_beneficiary() throws Throwable {
		beneficiariesPage.ClickCancelBeneficiary();
	}

	@When("^user clicks on edit beneficiary$")
	public void user_clicks_on_edit_beneficiary() throws Throwable {
		beneficiariesPage.ClickEditBeneficiary();
	}

	@When("^user clicks on delete beneficiary$")
	public void user_clicks_on_delete_beneficiary() throws Throwable {
		beneficiariesPage.ClickDeleteBeneficiary();
	}

	@Then("^user checks if mandatory fields for adding executor is implemented$")
	public void user_checks_if_mandatory_fields_for_adding_executor_is_implemented() throws Throwable {
		executorsPage.displayQuestion1();
		executorsPage.displayQuestion3();
		executorsPage.displayQuestion4();
		executorsPage.displayQuestion6();
		executorsPage.displayQuestion7();
		executorsPage.displayQuestion9();
		executorsPage.displayQuestion11();
		executorsPage.displayQuestion13();

	}

	@When("^user adds first option executor$")
	public void user_adds_first_option_executor() throws Throwable {
		executorsPage.FillUpExecutorFirstOption();

	}

	@When("^user adds back up executor$")
	public void user_adds_back_up_executor() throws Throwable {
		executorsPage.FillUpExecutorBackup();

	}

	@When("^user deletes a benefeciaries$")
	public void user_deletes_a_benefeciaries() throws Throwable {
		beneficiariesPage.ClickDeleteBeneficiary();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}

	@Then("^user checks if Residential Postcode field max length is set to ten$")
	public void user_checks_if_Residential_Postcode_field_max_length_is_set_to_ten() throws Throwable {
		personalPage.MaxlengthResPostcode();
	}

	@Then("^user checks if Postal Postcode field max length is set to ten$")
	public void user_checks_if_Postal_Postcode_field_max_length_is_set_to_ten() throws Throwable {
		personalPage.MaxlengthPostalPostcode();
	}

	@Then("^user checks if Family name field max length is set to fifty$")
	public void user_checks_if_Family_name_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthFirstName();
	}

	@Then("^user checks if Occupation field max length is set to fifty$")
	public void user_checks_if_Occupation_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthOccupation();
	}

	@Then("^user checks if Residential Suburb field max length is set to fifty$")
	public void user_checks_if_Residential_Suburb_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthResSuburb();
	}

	@Then("^user checks if Postal Suburb field max length is set to fifty$")
	public void user_checks_if_Postal_Suburb_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthPostalSuburb();
	}

	@Then("^user checks if Residential address line one field max length is set to fifty$")
	public void user_checks_if_Residential_address_line_one_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthResidentialAddressLine1();
	}

	@Then("^user checks if Residential address line two field max length is set to fifty$")
	public void user_checks_if_Residential_address_line_two_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthResidentialAddressLine2();
	}

	@Then("^user checks if Postal address line one field max length is set to fifty$")
	public void user_checks_if_Postal_address_line_one_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthPostalAddressLine1();
	}

	@Then("^user checks if Postal address line two field max length is set to fifty$")
	public void user_checks_if_Postal_address_line_two_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthPostalAddressLine2();
	}

	@Then("^user checks if Middle name field max length is set to fifty$")
	public void user_checks_if_Middle_name_field_max_length_is_set_to_fifty() throws Throwable {
		personalPage.MaxlengthFirstName();
	}

	@Then("^user checks if Couples product is selected by default$")
	public void user_checks_if_Couples_product_is_selected_by_default() throws Throwable {
		homePage.checkCouplesProductRadioButtonIsToggled();
	}

	@Then("^user sees Standard will Get Started button for couples product$")
	public void user_sees_Standard_will_Get_Started_button_for_couples_product() throws Throwable {
		homePage.displayedCouplesProductStandardWillBtn();
	}

	@Then("^user sees MyLife will Get Started button for couples product$")
	public void user_sees_MyLife_will_Get_Started_button_for_couples_product() throws Throwable {
		homePage.displayedCouplesProductMyLifeWillBtn();
	}

	@Then("^user does not see the message \"([^\"]*)\"$")
	public void user_does_not_see_the_message(String arg1) throws Throwable {
		CommonFunctions.textNotDisplayedInPage(arg1);
	}

	@When("^user hits the tab key$")
	public void user_hits_the_tab_key() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
	}

	@When("^user hits the escape key$")
	public void user_hits_the_escape_key() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ESCAPE));
	}

	@When("^user hits the enter key$")
	public void user_hits_the_enter_key() throws Throwable {
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}

	// ================================================== Login Page Functions ==================================================
	@When("^user logs into app$")
	public void user_logs_into_app() throws Throwable {
		loginPage.setEmailInput(prop.getProperty("primaryAccountEmail"));
		loginPage.setPasswordInput(prop.getProperty("primaryAccountPassword"));

		homePage = loginPage.clickLoginButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user logs into app with the \"([^\"]*)\" and \"([^\"]*)\" as the login credentials$")
	public void user_logs_into_app_with_the_and_as_the_login_credentials(String arg1, String arg2) throws Throwable {
		loginPage.setEmailInput(arg1);
		loginPage.setPasswordInput(arg2);

		homePage = loginPage.clickLoginButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user logs into app with the \"([^\"]*)\" and \"([^\"]*)\" as the admin login credentials$")
	public void user_logs_into_app_with_the_and_as_the_admin_login_credentials(String arg1, String arg2) throws Throwable {
		loginPage.setEmailInputAdmin(arg1);
		loginPage.setPasswordInput(arg2);

		homePage = loginPage.clickLoginButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user login into app with the \"([^\"]*)\" and \"([^\"]*)\" as the login credentials$")
	public void user_login_into_app_with_the_and_as_the_login_credentials(String arg1, String arg2) throws Throwable {
		loginPage.setEmailInput(arg1);
		loginPage.setPasswordInput(arg2);
		loginPage.clickLoginButton1();

		addOnsPage = loginPage.clickLoginButton1();
		CommonFunctions.wait(5000, false);
	}

	@When("^user inputs an \"([^\"]*)\" in the forgotten password email field$")
	public void user_inputs_an_in_the_forgotten_password_email_field(String arg1) throws Throwable {
		loginPage.setForgottenPasswordEmailField(arg1);
		loginPage.clickForgottenPasswordSubmitBtn();
		CommonFunctions.wait(5000, false);
	}

	@When("^user inputs \"([^\"]*)\" in the First Name field on registration page$")
	public void user_inputs_in_the_First_Name_field_on_registration_page(String arg1) throws Throwable {
		registrationPage.setFirstNameField(arg1);
	}

	@When("^user inputs \"([^\"]*)\" in the Family Name field on registration page$")
	public void user_inputs_in_the_Family_Name_field_on_registration_page(String arg1) throws Throwable {
		registrationPage.setFamilyNameField(arg1);
	}

	@When("^user input \"([^\"]*)\" in the Email field on registration page$")
	public void user_input_in_the_Email_field_on_registration_page(String arg1) throws Throwable {
		registrationPage.setEmailField(arg1);
	}

	@When("^user inputs \"([^\"]*)\" in the Email field on registration page$")
	public void user_inputs_in_the_Email_field_on_registration_page(String arg1) throws Throwable {
		arg1 = CommonFunctions.stringAppendDateTime(arg1);
		Email = registrationPage.setEmailField(arg1);
	}

	@When("^user inputs \"([^\"]*)\" in the Password field on registration page$")
	public void user_inputs_in_the_Password_field_on_registration_page(String arg1) throws Throwable {
		registrationPage.setPasswordField(arg1);
	}

	@When("^user inputs \"([^\"]*)\" in the Password field on change password page$")
	public void user_inputs_in_the_Password_field_on_change_password_page(String arg1) throws Throwable {
		changePasswordPage.setPasswordField(arg1);
	}

	@When("^user inputs \"([^\"]*)\" in the Confirm Password field on change password page$")
	public void user_inputs_in_the_Confirm_Password_field_on_change_password_page(String arg1) throws Throwable {
		changePasswordPage.setConfirmPasswordField(arg1);
	}

	@When("^user inputs \"([^\"]*)\" in the Confirm Password field on registration page$")
	public void user_inputs_in_the_Confirm_Password_field_on_registration_page(String arg1) throws Throwable {
		registrationPage.setConfirmPasswordField(arg1);
	}

	@When("^user selects \"([^\"]*)\" on state dropdown$")
	public void user_selects_on_state_dropdown(String arg1) throws Throwable {
		registrationPage.SelectValueOnStateDropdown(arg1);
	}

	@When("^user selects \"([^\"]*)\" on source dropdown$")
	public void user_selects_on_source_dropdown(String arg1) throws Throwable {
		registrationPage.SelectValueOnSourceDropdown(arg1);
	}

	@When("^user sees the previous \"([^\"]*)\" value displayed in the email field$")
	public void user_sees_the_previous_value_displayed_in_the_email_field(String arg1) throws Throwable {
		loginPage.containsValueEmailInput(arg1);
	}

	@When("^user checks if password field is cleared$")
	public void user_checks_if_password_field_is_cleared() throws Throwable {
		loginPage.PasswordValueNull();
	}

	@Then("^user validates his account is logged in$")
	public void user_validates_his_account_is_logged_in() throws Throwable {
		homePage.containsValueUserFullNameLabel(prop.getProperty("primaryAccountName"));
	}

	@When("^user logs out of the app$")
	public void user_logs_out_of_the_app() throws Throwable {
		homePage.clickUserFullNameAccordionLogoutLink();
		CommonFunctions.wait(5000, false);
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to log out?']");

		loginPage = homePage.clickLogoutPopupYesButton();
		// Then I click "Yes, log out" on popup
	}

	@When("^user clicks on \"([^\"]*)\" and logs out$")
	public void user_clicks_on_and_logs_out(String arg1) throws Throwable {
		homePage.clickUserFullName(arg1);
		homePage.clickUserFullNameAccordionLogoutLink();
		CommonFunctions.wait(10000, false);
	}

	@When("^the user clicks on forgot password link$")
	public void the_user_clicks_on_forgot_password_link() throws Throwable {
		loginPage.clickForgottenPasswordLink();
		CommonFunctions.wait(5000, false);
	}

	@When("^the user clicks on submit button on change password page$")
	public void the_user_clicks_on_submit_button_on_change_password_page() throws Throwable {
		changePasswordPage.clickOnSubmitButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user checks if validation on required field on change password page is displayed$")
	public void user_checks_if_validation_on_required_field_on_change_password_page_is_displayed() throws Throwable {
		changePasswordPage.DisplayedReqNewPasswordField();
		changePasswordPage.DisplayedConfirmReqPasswordField();

	}

	@When("^the user clicks on reset password link$")
	public void the_user_clicks_on_reset_password_link() throws Throwable {
		changePasswordPage = codePage.clickResetPasswordLink();
		CommonFunctions.wait(5000, false);
	}

	@When("^the user clicks on activation link$")
	public void the_user_clicks_on_activation_link() throws Throwable {
		loginPage = codePage.clickActivationLink(Email);
		CommonFunctions.wait(5000, false);
	}

	@When("^the user click on register link$")
	public void the_user_click_on_register_link() throws Throwable {
		registrationPage = loginPage.clickForgottenRegisterLink();
		CommonFunctions.wait(5000, false);
	}

	@When("^user agrees on Maurice Blackburn's Privacy Policy by ticking the checkbox$")
	public void user_agrees_on_Maurice_Blackburn_s_Privacy_Policy_by_ticking_the_checkbox() throws Throwable {
		registrationPage.clickPrivacyCheckbox();
	}

	@When("^user agrees on Maurice Blackburn's Terms and Condition by ticking the checkbox$")
	public void user_agrees_on_Maurice_Blackburn_s_Terms_and_Condition_by_ticking_the_checkbox() throws Throwable {
		registrationPage.clickRequiredCheckbox2();
	}

	@When("^the user hovers on the password policy tooltip$")
	public void the_user_hovers_on_the_password_policy_tooltip() throws Throwable {
		registrationPage.HoverOnPasswordToolTip();
		// CommonFunctions.wait(5000, false);
	}

	@When("^the user hovers on the password policy tooltip on change password page$")
	public void the_user_hovers_on_the_password_policy_tooltip_on_change_password_page() throws Throwable {
		changePasswordPage.HoverOnPasswordToolTip();
		// CommonFunctions.wait(15000, false);
	}

	@When("^the user clicks on create account button$")
	public void the_user_clicks_on_create_account_button() throws Throwable {
		registrationPage.clickCreateAccountButton();
		CommonFunctions.wait(8000, false);
	}

	@When("^the user clicks on Privacy policy link$")
	public void the_user_clicks_on_Privacy_policy_link() throws Throwable {
		registrationPage.clickPrivacyLink();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks on cancel button$")
	public void user_clicks_on_cancel_button() throws Throwable {
		homePage.clickLogoutPopupCancelButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user clicks on yes button$")
	public void user_clicks_on_yes_button() throws Throwable {
		homePage.clickLogoutPopupYesButton();
		CommonFunctions.wait(5000, false);
	}

	@When("^user checks if logout prompt is closed$")
	public void user_checks_if_logout_prompt_is_closed() throws Throwable {
		homePage.NotdisplayedLogoutPopup();
	}

	@Then("^user checks if the forgotten password page contents is complete$")
	public void user_checks_if_the_forgotten_password_page_contents_is_complete() throws Throwable {
		loginPage.displayedForgottenPasswordUserEmail();
		loginPage.displayedForgottenPasswordSubmitBtn();
	}

	@Then("^user checks the content of the change password page$")
	public void user_checks_the_content_of_the_change_password_page() throws Throwable {
		changePasswordPage.DisplayedNewPasswordField();
		changePasswordPage.DisplayedConfirmPasswordField();
		changePasswordPage.DisplayedSubmitButton();
	}

	@Then("^user checks if the registration page contents is complete$")
	public void user_checks_if_the_registration_page_contents_is_complete() throws Throwable {
		registrationPage.displayedFirstNameField();
		registrationPage.displayedFamilyNameField();
		registrationPage.displayedEmailField();
		registrationPage.displayedPasswordField();
		registrationPage.displayedConfirmPasswordField();
		registrationPage.displayedStateDropdown();
		registrationPage.displayedSourceDropdown();
		registrationPage.displayedPrivacyCheckbox();
		registrationPage.displayedCreateAccountButton();
		registrationPage.displayedBacktoLoginLink();

	}

	@Then("^user sees validation on all required fields$")
	public void user_sees_validation_on_all_required_fields() throws Throwable {
		registrationPage.displayedRequiredFirstNameField();
		registrationPage.displayedRequiredFamilyNameField();
		registrationPage.displayedRequiredEmailField();
		registrationPage.displayedRequiredPasswordField();
		registrationPage.displayedRequiredConfirmPasswordField();
		registrationPage.displayedRequiredStateDropdown();
		registrationPage.displayedRequiredSourceDropdown();
	}

	@Then("^user checks if describe field is displayed when \"([^\"]*)\" is selected as source dropdown$")
	public void user_checks_if_describe_field_is_displayed_when_is_selected_as_source_dropdown(String arg1) throws Throwable {
		registrationPage.SelectValueOnSourceDropdown(arg1);
		registrationPage.displayedDescriptionField();

	}

	@Then("^user checks if describe field is mandatory field when \"([^\"]*)\" is selected as source dropdown$")
	public void user_checks_if_describe_field_is_mandatory_field_when_is_selected_as_source_dropdown(String arg1) throws Throwable {
		registrationPage.SelectValueOnSourceDropdown(arg1);
		CommonFunctions.wait(5000, false);
		registrationPage.clickCreateAccountButton();
		CommonFunctions.wait(5000, false);
		registrationPage.displayedRequiredDescriptionField();
	}

	@When("^user checks if Maurice Blackburn's Privacy Policy checkbox is mandatory$")
	public void user_checks_if_Maurice_Blackburn_s_Privacy_Policy_checkbox_is_mandatory() throws Throwable {
		registrationPage.displayedRequiredPrivacyCheckbox();
	}

	@Then("^user checks if Maurice Blackburn's Terms and Condition checkbox is mandatory$")
	public void user_checks_if_Maurice_Blackburn_s_Terms_and_Condition_checkbox_is_mandatory() throws Throwable {
		registrationPage.displayedRequiredPrivacyCheckbox();
	}

	@Then("^user checks if validation on invalid email is displayed$")
	public void user_checks_if_validation_on_invalid_email_is_displayed() throws Throwable {
		registrationPage.displayedInvalidEmailField();
	}

	@When("^user checks if validation on registered email is displayed$")
	public void user_checks_if_validation_on_registered_email_is_displayed() throws Throwable {
		registrationPage.displayedInvalidRegisteredEmailField();
	}

	@When("^user checks if validation on invalid password is displayed$")
	public void user_checks_if_validation_on_invalid_password_is_displayed() throws Throwable {
		registrationPage.displayedInvalidPasswordField();
	}

	@When("^user checks if validation on invalid confirm password is displayed$")
	public void user_checks_if_validation_on_invalid_confirm_password_is_displayed() throws Throwable {
		registrationPage.displayedInvalidConfirmPasswordField();
	}

	@When("^user sees logout prompt with buttons Yes, log out and Cancel$")
	public void user_sees_logout_prompt_with_buttons_Yes_log_out_and_Cancel() throws Throwable {
		CommonFunctions.switchFrameByXPath("//*[text() = 'Are you sure you want to log out?']");
		homePage.displayedLogoutPopup();
		homePage.displayedbutton_LogoutPopup_Yes();
		homePage.displayedbutton_LogoutPopup_Cancel();

	}

	@Then("^user checks if the contents inside the login page is complete$")
	public void user_checks_if_the_contents_inside_the_login_page_is_complete() throws Throwable {

		loginPage.displayedEmailInput();
		loginPage.displayedPassInput();
		loginPage.displayedButtonLogIn();
		loginPage.displayedForgottenPasswordLink();
		loginPage.displayedRegisterLink();

	}

	@When("^user checks if validation error for required field appears on login page$")
	public void user_checks_if_validation_error_for_required_field_appears_on_login_page() throws Throwable {
		loginPage.displayedRequiredFieldOninput_Email();
		loginPage.displayedRequiredFieldOninput_Password();
	}

	@When("^user clicks on add debt$")
	public void user_clicks_on_add_debt() throws Throwable {
		assetsPage.clickAddDebt();
	}

	@Then("^user checks mandatory fields in debt$")
	public void user_checks_mandatory_fields_in_debt() throws Throwable {
		assetsPage.CheckRequiredDebtFields();
	}

	@When("^user fills up debt$")
	public void user_fills_up_debt() throws Throwable {
		assetsPage.FillUpDebtFields();
	}

	@When("^user adds another debt$")
	public void user_add_another_debt() throws Throwable {
		assetsPage.FillUpDebtFields2();
	}

	@When("^user edits debt$")
	public void user_edits_debt() throws Throwable {
		assetsPage.UpdateDebtFields();
	}

	@When("^user removes debt$")
	public void user_removes_debt() throws Throwable {
		assetsPage.ClickDeleteDebt1();
		assetsPage.ClickDeleteDebt2();
	}

	@When("^user cancels debt with unsaved changes$")
	public void user_cancels_debt_with_unsaved_changes() throws Throwable {
		assetsPage.ClickCancelDebt();
	}

	/** Beneficiaries - GIFT */
	@Then("^user checks required fields in the gift section$")
	public void user_checks_required_fields_in_gift_section() throws Throwable {
		beneficiariesPage.CheckGiftRequiredFields();
	}

	@Then("^user fills up gift from beneficiaries$")
	public void user_fills_up_gift_from_beneficiaries() throws Throwable {
		beneficiariesPage.FillUpGiftSection();
		CommonFunctions.wait(5000, false);
		beneficiariesPage.FillUpGiftSection2();

	}

	@When("^user updates gift from beneficiaries$")
	public void user_updates_gift_from_beneficiaries() throws Throwable {
		beneficiariesPage.UpdatesGiftSection();
		CommonFunctions.wait(5000, false);
		beneficiariesPage.UpdatesGiftSection2();

	}

	@Then("^user removes gift beneficiary$")
	public void user_removes_gift_beneficiary() throws Throwable {
		beneficiariesPage.clickDeleteGift();
		CommonFunctions.wait(5000, false);

	}

	@Then("^user cancels created gift beneficiary$")
	public void user_cancels_created_gift_beneficiary() throws Throwable {
		CommonFunctions.wait(5000, false);

	}

	@When("^user confirms that he completed the form himself$")
	public void user_confirms_that_he_completed_the_form_himself() throws Throwable {
		reviewConfirmPage.clickQuestion1();
	}

	@When("^user clicks the next button on the review and confirm page$")
	public void user_clicks_the_next_button_on_the_review_and_confirm_page() throws Throwable {
		paymentsPage = reviewConfirmPage.clickNextPaymentButton();
	}

	@When("^user clicks the next button on the review and confirm page to go to add-on page$")
	public void user_clicks_the_next_button_on_the_review_and_confirm_page_to_go_to_addon_page() throws Throwable {
		addOnsPage = reviewConfirmPage.clickNextAddOnsButton();
	}

	@When("^user clicks the next button on the add-ons page$")
	public void user_clicks_the_next_button_on_the_addons_page() throws Throwable {
		paymentsPage = addOnsPage.clickNextWithoutPOA();
	}

	@Then("^user sees the power of attorney product$")
	public void user_sees_the_power_of_attorney_product() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Power of Attorney documents']")));
	}

	@When("^user clicks no to do you want to do your will with your spouse or partner question$")
	public void user_clicks_no_to_do_you_want_to_do_your_will_with_your_spouse_or_partner_question() throws Throwable {
		aboutPage.clickWillTogetherRadioNoRadioButton();
	}

	@When("^user clicks no to do you want to leave your whole estate to your spouse/partner if they survive you question$")
	public void user_clicks_no_to_do_you_want_to_leave_your_whole_estate_to_your_spouse_partner_if_they_survive_you_question() throws Throwable {
		beneficiariesPage.ClickNoQuestion1WithSpouse();
	}

	@Then("^user sees the add your spouse/partner option$")
	public void user_sees_the_add_your_spouse_partner_option() throws Throwable {
		CommonFunctions.elementDisplayed(driver.findElement(By.xpath("//*[text() = 'Add your Spouse/Partner']")));
	}

	@When("^user clicks yes to do you want to do your will with your spouse or partner question$")
	public void user_clicks_yes_to_do_you_want_to_do_your_will_with_your_spouse_or_partner_question() throws Throwable {
		aboutPage.clickWillTogetherRadioYesRadioButton();
		CommonFunctions.wait(2500, false);
	}

	@When("^user inputs \"([^\"]*)\" as the email address of the spouse/partner$")
	public void user_inputs_as_the_email_address_of_the_spouse_partner(String arg1) throws Throwable {
		aboutPage.setQuestion8Input(arg1);
	}

	@Then("^user click the next button to the idDocs page$")
	public void user_click_the_next_button_to_the_idDocs_page() throws Throwable {
		idDocsPage = beneficiariesPage.clickNextIDDocs();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user click the back button to the idDocs page$")
	public void user_click_the_back_button_to_the_idDocs_page() throws Throwable {
		beneficiariesPage = idDocsPage.ClickBackIDDocs();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user click the back button to the Beneficiaries Page$")
	public void user_click_the_back_button_to_the_Beneficiaries_page() throws Throwable {
		assetsPage = beneficiariesPage.clickBackToAssets();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user reviews and confirms will details$")
	public void user_reviews_and_confirms_will_details() throws Throwable {
		CommonFunctions.wait(5000, false);
		reviewConfirmPage.validatesFields();
	}

	@Then("^user reviews personal details$")
	public void user_reviews_personal_details() throws Throwable {
		CommonFunctions.wait(5000, false);
		reviewConfirmPage.validateVicPersonalDetails();
	}

	@Then("^user confirms will details$")
	public void user_confirms_will_details() throws Throwable {
		CommonFunctions.scrollToBottomOfPage();
		CommonFunctions.wait(5000, false);
		reviewConfirmPage.ClickConfirmAcknowledgement();
	}

	@When("^user clicks the next button to confirm will$")
	public void user_clicks_the_next_button_to_confirm_will() throws Throwable {
		CommonFunctions.wait(5000, false);
		thankyouPage = reviewConfirmPage.clickNextThankYou();
	}

	// Union details
	@Then("^pop-up header is displayed$")
	public void pop_up_header_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.DisplayedPopupHeader();
	}

	@Then("^user click free standard will$")
	public void user_click_free_standard_will() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.ClickFreeStandardWill();
	}

	@Then("^affiliated unions dropdown is displayed$")
	public void affiliated_unions_dropdown_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.DisplayedSelectAffliatedUnions();
	}

	@When("^user selects \"([^\"]*)\" as affliated unions$")
	public void user_selects_as_affliated_unions(String arg1) throws Throwable {
		homePage.SelectAffiliatedUnion(arg1);
	}

	@Then("^your member number field is displayed$")
	public void your_member_number_field_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.DisplayedYourMemberNumber();
	}

	@Then("^member number footnote is displayed$")
	public void member_number_footnote_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		homePage.DisplayedMemberNumberFootnote();
	}

	@Then("^cancel button is displayed$")
	public void cancel_button_is_displayed() throws Throwable {
		homePage.DisplayedCancelBtn();
	}

	@Then("^user click on confirm button$")
	public void user_click_on_confirm_button() throws Throwable {
		homePage.DisplayedConfirmBtn();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user click on cancel button$")
	public void user_click_on_cancel_button() throws Throwable {
		homePage.ClickCancelBtn();
		CommonFunctions.wait(5000, false);
	}

	@Then("^affiliated union alert message is displayed$")
	public void affiliated_union_alert_message_is_displayed() throws Throwable {
		homePage.DisplayedValidationMessage1();
	}

	@Then("^your member number alert message is displayed$")
	public void your_member_number_alert_message_is_displayed() throws Throwable {
		homePage.DisplayedValidationMessage2();
	}

	@When("^user enter \"([^\"]*)\" on your member number$")
	public void user_enter_on_your_member_number(String arg1) throws Throwable {
		homePage.SetMemberNumber(arg1);
	}

	@When("^user check the cost$")
	public void user_check_the_cost() throws Throwable {
		homePage.DisplayedCost();

	}

	@When("^user check the total cost$")
	public void user_check_the_total_cost() throws Throwable {
		homePage.DisplayedTotalCost();
	}

	@When("^user check the total cost with POA$")
	public void user_check_the_total_cost_with_POA() throws Throwable {
		homePage.DisplayedTotalCostWithPOA();
	}

	@Then("^user sees validation on mandatory field inside the medical decision page$")
	public void user_sees_validation_on_mandatory_field_inside_the_medical_decision_page() throws Throwable {
		medicalDecisionsPage.DisplayedDecisionMakerReq();
	}

	@Then("^user clicks on add decision maker on medical decision page$")
	public void user_clicks_on_add_decision_maker_on_medical_decision_page() throws Throwable {
		medicalDecisionsPage.clickAddDecisionMaker();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user clicks on add decision maker$")
	public void user_clicks_on_add_decision_maker() throws Throwable {
		medicalDecisionsPage.clickAddPOA();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user clicks on I do not want to appoint a Medical Decision Maker checkbox$")
	public void user_clicks_on_I_do_not_want_to_appoint_a_Medical_Decision_Maker_checkbox() throws Throwable {
		medicalDecisionsPage.clickIDontWantDecisionMaker();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user clicks back button on review and confirm page to go back to medical decision page$")
	public void user_clicks_back_button_on_review_and_confirm_page_to_go_back_to_medical_decision_page() throws Throwable {
		medicalDecisionsPage = reviewConfirmPage.ClickBackButtonMedical();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user sees validation on mandatory fields on adding a decision maker$")
	public void user_sees_validation_on_mandatory_fields_on_adding_a_decision_maker() throws Throwable {
		medicalDecisionsPage.DecisionMAkerMandatoryFieldsOnAddingOne();
	}

	@Then("^user clicks next button on the medical decision page$")
	public void user_clicks_next_button_on_the_medical_decision_page() throws Throwable {
		reviewConfirmPage = medicalDecisionsPage.ClickNextButton();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user fills up all required fields on adding a decision maker$")
	public void user_fills_up_all_required_fields_on_adding_a_decision_maker() throws Throwable {
		medicalDecisionsPage.SetDecisionMakerMandatoryFields();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user selects yes on Do you have an Advance Care Directive currently in place question$")
	public void user_selects_yes_on_Do_you_have_an_Advance_Care_Directive_currently_in_place_question() throws Throwable {
		medicalDecisionsPage.clickYes();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user selects no on Do you have an Advance Care Directive currently in place question$")
	public void user_selects_no_on_Do_you_have_an_Advance_Care_Directive_currently_in_place_question() throws Throwable {
		medicalDecisionsPage.clickNo();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user inputs date on What date did you sign your Advance Care Directive question$")
	public void user_inputs_date_on_What_date_did_you_sign_your_Advance_Care_Directive_question() throws Throwable {
		medicalDecisionsPage.SetAdvanceCareSignDate();
	}

	@Then("^user clicks on edit button on medical decision page$")
	public void user_clicks_on_edit_button_on_medical_decision_page() throws Throwable {
		medicalDecisionsPage.clickEditDecisionMaker();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user clicks on remove button on medical decision page$")
	public void user_clicks_on_remove_button_on_medical_decision_page() throws Throwable {
		medicalDecisionsPage.clickRemoveDecisionMaker();
		CommonFunctions.wait(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.wait(1500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.wait(5000, false);
	}

	@Then("^user edits some details on the added decision maker$")
	public void user_edits_some_details_on_the_added_decision_maker() throws Throwable {
		medicalDecisionsPage.EditDecisionMakerMandatoryFields();
		CommonFunctions.wait(5000, false);
	}

	@When("^user fills up mandatory fields inside the personal page for victorian$")
	public void user_fills_up_mandatory_fields_inside_the_personal_page_for_victorian() throws Throwable {
		personalPage.SelectTitlePersonalPage("Dr");
		CommonFunctions.wait(2000, false);
		// personalPage.SelectDateToday();
		personalPage.SetPhoneNumber("4772834");
		CommonFunctions.wait(2000, false);
		personalPage.SetOccupation("Consultant");
		CommonFunctions.wait(2000, false);
		personalPage.SetResAddressline1("Australia");
		CommonFunctions.wait(2000, false);
		personalPage.SetResSuburb("Melbourne");
		CommonFunctions.wait(2000, false);
		personalPage.SelectResStatePersonalPage("VIC");
		CommonFunctions.wait(2000, false);
		personalPage.SelectResPostcodePersonalPage("4103");
		CommonFunctions.wait(2000, false);
		personalPage.ClickPostalAddressSameAsResidential();
		CommonFunctions.wait(2000, false);
		personalPage.ClickNoFirstQuestion();
		CommonFunctions.wait(2000, false);
		personalPage.ClickNoSecondQuestion();
		personalPage.SetDateOfBirth("05/09/1990");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));

	}

	@When("^user fills up mandatory fields inside the personal page for non victorian$")
	public void user_fills_up_mandatory_fields_inside_the_personal_page_for_non_victorian() throws Throwable {
		personalPage.SelectTitlePersonalPage("Dr");
		personalPage.SelectDateToday();
		personalPage.SetPhoneNumber("4772834");
		personalPage.SetOccupation("Consultant");
		personalPage.SetResAddressline1("Australia");
		personalPage.SetResSuburb("Executive Lane");
		personalPage.SelectResStatePersonalPage("QLT");
		personalPage.SelectResPostcodePersonalPage("4103");
		personalPage.ClickPostalAddressSameAsResidential();
		personalPage.ClickNoFirstQuestion();
		personalPage.ClickNoSecondQuestion();

	}

	@Then("^user clicks no to all assets question$")
	public void user_clicks_no_to_all_assets_question() throws Throwable {
		assetsPage.ClickNoQuestion1();
		assetsPage.ClickNoQuestion2();
		assetsPage.ClickNoQuestion3();
		assetsPage.ClickNoQuestion4();
		assetsPage.ClickNoQuestion5();
		assetsPage.ClickNoQuestion6();
		assetsPage.ClickNoQuestion7();

	}

	// @When("^user adds second driver license details$")
	// public void user_adds_second_driver_license_details() throws Throwable {
	// idDocsPage.FillUpSecondDriversLicense();
	// CommonFunctions.wait(5000, false);
	// reviewConfirmPage = idDocsPage.ClickNextButton();
	// }

	@Then("^user checks the information inside the review and confirm after medical POA page$")
	public void user_checks_the_information_inside_the_review_and_confirm_after_medical_POA_page() throws Throwable {
		CommonFunctions.textDisplayedInPage("Thank you for providing your information.");
		CommonFunctions.textDisplayedInPage("Please confirm the below details are correct.");
		CommonFunctions.textDisplayedInPage("NOTE: This is not Enduring Powers of Attorney. It is a copy of the information you provided to us online.");
		CommonFunctions.textDisplayedInPage("One of our expert Wills & Estates lawyers will review this information and be in touch soon.");
		CommonFunctions.textDisplayedInPage("Enduring Power of Attorney");
		CommonFunctions.textDisplayedInPage("Do you want your Enduring Power of Attorney to be for:");
		CommonFunctions.textDisplayedInPage("Only financial matters");
		CommonFunctions.textDisplayedInPage("Financial Decision Maker");
		CommonFunctions.textDisplayedInPage("Primary Financial Power of Attorney");
		CommonFunctions.textDisplayedInPage("Name:");
		CommonFunctions.textDisplayedInPage("Demeth Rey Camuin");
		CommonFunctions.textDisplayedInPage("Relationship:");
		CommonFunctions.textDisplayedInPage("Son");
		CommonFunctions.textDisplayedInPage("When do you want your Financial/Personal Decision Makers to start to act?");
		CommonFunctions.textDisplayedInPage("Immediately");
		CommonFunctions.textDisplayedInPage("Are there any limitations that you would like to discuss?");
		// CommonFunctions.textDisplayedInPage("This a test Limitation");
		CommonFunctions.textDisplayedInPage("Medical Power of Attorney");
		CommonFunctions.textDisplayedInPage("I do not want to appoint a Medical Decision Maker");
		reviewConfirmPage.DisplayYesIDoNotWantToAppointAMedicalDecisionMaker();

	}

	@When("^user clicks the next button on the review and confirm page to go to payments page$")
	public void user_clicks_the_next_button_on_the_review_and_confirm_page_to_go_to_payments_page() throws Throwable {
		paymentsPage = reviewConfirmPage.ClickNextButtonPayment();
		CommonFunctions.wait(5000, false);
	}

	@When("^user uploads a will inside the about you page$")
	public void user_uploads_a_will_inside_the_about_you_page() throws Throwable {
		aboutPage.UploadValidWill();
		CommonFunctions.wait(5000, false);
	}

	@When("^user uploads more than one will inside the about you page$")
	public void user_uploads_more_than_one_will_inside_the_about_you_page() throws Throwable {
		aboutPage.UploadMoreWills();
	}

	@When("^user uploads a will with invalid file format inside the about you page$")
	public void user_uploads_a_will_with_invalid_file_format_inside_the_about_you_page() throws Throwable {
		aboutPage.UploadWillInvalidFileFormat();
	}

	@When("^user uploads a will with invalid file size inside the about you page$")
	public void user_uploads_a_will_with_invalid_file_size_inside_the_about_you_page() throws Throwable {
		aboutPage.UploadWill10MBPLUS();
		CommonFunctions.wait(5000, false);
	}

	@When("^user removes the attached file on about you page$")
	public void user_removes_the_attached_file_on_about_you_page() throws Throwable {
		aboutPage.ClickRemoveAttachment();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user click on I do not want a MDM$")
	public void user_click_on_I_do_not_want_a_MDM() throws Throwable {
		medicalDecisionsPage.clickIDontWantDecisionMaker();
	}

	@Then("^user click next$")
	public void user_click_next() throws Throwable {
		medicalDecisionsPage.ClickNextButton();
	}

	@Then("^POA is displayed in the order summary$")
	public void poa_is_displayed_in_the_order_summary() throws Throwable {
		CommonFunctions.textDisplayedInPage("Power of Attorney");

	}

	@Then("^Standard will legal document is displayed in the order summary$")
	public void standard_will_legal_document_is_displayed_in_the_order_summary() throws Throwable {
		CommonFunctions.textDisplayedInPage("Standard");
		CommonFunctions.wait(5000, false);

	}

	@Then("^user clicks on back button on the order summary page$")
	public void user_clicks_on_back_button_on_the_order_summary_page() throws Throwable {
		CommonFunctions.wait(5000, false);
		reviewConfirmPage = paymentsPage.clickBack();

	}

	@Then("^user clicks on pay now button$")
	public void user_clicks_on_pay_now_button() throws Throwable {
		CommonFunctions.wait(5000, false);
		checkOutPage = paymentsPage.clickPayNow();
		CommonFunctions.wait(5000, false);

	}

	@When("^user clicks on continue on incomplete order popup$")
	public void user_clicks_on_continue_on_incomplete_order_popup() throws Throwable {
		if (new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(), 'DEBUG You have an incomplete Order')]")))).isDisplayed()) {
			paymentsPage = homePage.ClickContiueButtonPopUp();
		}
		else {

		}

	}
	// @Then("^user sees next button on the ID docs page$")
	// public void user_sees_next_button_on_the_ID_docs_page() throws Throwable {
	// idDocsPage.DisplayedNextButton();
	// }

	// Checkout - invalid payment steps
	@When("^user sees card type option$")
	public void user_sees_card_type_option() throws Throwable {
		checkOutPage.displayCardType();
	}

	@When("^user sees card number input$")
	public void user_sees_card_number_input() throws Throwable {
		checkOutPage.displayCardNumber();
	}

	@When("^user sees expiration date month selection$")
	public void user_sees_expiration_date_month_selection() throws Throwable {
		checkOutPage.displayExpMonth();
	}

	@When("^user sees expiration date year selection$")
	public void user_sees_expiration_date_year_selection() throws Throwable {
		checkOutPage.displayYearMonth();
	}

	@When("^user sees CVN input$")
	public void user_sees_CVN_input() throws Throwable {
		checkOutPage.displayCVN();
	}

	@When("^user clicks the pay button$")
	public void user_clicks_the_pay_button() throws Throwable {
		checkOutPage.ClickPayButton();

	}

	@Then("^error message Card type is a required field is displayed$")
	public void error_message_Card_type_is_a_required_field_is_displayed() throws Throwable {
		checkOutPage.displayCardTypeErrorMessage();
	}

	@Then("^error message Enter a valid card number is displayed$")
	public void error_message_Enter_a_valid_card_number_is_displayed() throws Throwable {
		checkOutPage.displayCardNumberErrorMessage();
	}

	@Then("^error message Enter a valid expiry date is displayed$")
	public void error_message_Enter_a_valid_expiry_date_is_displayed() throws Throwable {
		checkOutPage.displayCardExpirationErrorMessage();
	}

	@Then("^user clicks the cancel button$")
	public void user_clicks_the_cancel_button() throws Throwable {
		checkOutPage.ClickCancelButton();
	}

	@When("^user sees validation message Are you sure you want to cancel your order\\?$")
	public void user_sees_validation_message_Are_you_sure_you_want_to_cancel_your_order() throws Throwable {
		checkOutPage.displayCancelOrderPopup();
	}

	@Then("^user clicks no$")
	public void user_clicks_no() throws Throwable {
		checkOutPage.clickNoCancelOrder();
	}

	@Then("^user clicks yes$")
	public void user_clicks_yes() throws Throwable {
		checkOutPage.clickYesCancelOrder();
	}

	@Then("^user clicks on return to website button$")
	public void user_clicks_on_return_to_website_button() throws Throwable {
		homePage = checkOutPage.ClickReturn();
	}

	// Checkout - valid payment steps
	@Then("^user enter payment details$")
	public void user_enter_payment_details() throws Throwable {
		checkOutPage.fillUpPaymentDetails();
	}

	@Then("^user select month$")
	public void user_select_month() throws Throwable {
		checkOutPage.selectMonth();
	}

	@Then("^user select year$")
	public void user_select_year() throws Throwable {
		checkOutPage.selectYear();
	}

	// @When("^user clicks the next button on the review and confirm page to go to payments page$")
	// public void user_clicks_the_next_button_on_the_review_and_confirm_page_to_go_to_payments_page() throws Throwable {
	// paymentsPage = reviewConfirmPage.ClickNextButtonPayment();
	// }

	@Then("^user redirects to \"([^\"]*)\" page$")
	public void user_redirects_to__page(String arg1) throws Throwable {
		if (driver.getTitle().equals("Personal Details")) {
			if (arg1 == "Personal Details")
				personalPage = idDocsPage.ProgressPersonal();
			CommonFunctions.wait(5000, false);
		}
		else if (driver.getTitle().equals("About You")) {
			if (arg1 == "About You")
				aboutPage = idDocsPage.ProgressChangeAbout();
			CommonFunctions.wait(5000, false);
		}

		else if (driver.getTitle().equals("Assets")) {
			if (arg1 == "Assets")
				assetsPage = aboutPage.ProgressChangeAssets();
			CommonFunctions.wait(5000, false);
		}

		else if (driver.getTitle().equals("Beneficiaries")) {
			if (arg1 == "Beneficiaries")
				beneficiariesPage = assetsPage.ProgressChangeBeneficiaries();
			CommonFunctions.wait(5000, false);
		}

		else if (driver.getTitle().equals("Executors")) {
			if (arg1 == "Executors")
				executorsPage = beneficiariesPage.ProgressChangeExecutors();
			CommonFunctions.wait(5000, false);
		}

		else if (driver.getTitle().equals("ID Check")) {
			if (arg1 == "ID Check")
				idDocsPage = executorsPage.ClickNextButton();
			CommonFunctions.wait(5000, false);
		}

		else if (driver.getTitle().equals("ReviewAndConfirm")) {
			if (arg1 == "ReviewAndConfirm")
				reviewConfirmPage = idDocsPage.ProgressChangeReviewConfirm();
			CommonFunctions.wait(5000, false);
		}
	}

	@Then("^user redirects to Personal Details page$")
	public void user_redirects_to_Personal_Details_page() throws Throwable {
		personalPage = idDocsPage.ProgressPersonal();
	}

	@Then("^user redirects to About You page$")
	public void user_redirects_to_About_You_page() throws Throwable {
		aboutPage = personalPage.ProgressChangeAbout();
	}

	@Then("^user redirects to Assets page$")
	public void user_redirects_to_Assets_page() throws Throwable {
		assetsPage = aboutPage.ProgressChangeAssets();
	}

	@Then("^user redirects to Beneficiaries page$")
	public void user_redirects_to_Beneficiaries_page() throws Throwable {
		beneficiariesPage = assetsPage.ProgressChangeBeneficiaries();
	}

	@Then("^user redirects to Executors page$")
	public void user_redirects_to_Executors_page() throws Throwable {
		executorsPage = beneficiariesPage.ProgressChangeExecutors();
	}

	@Then("^user verifies if will is complete$")
	public void user_verifies_if_will_is_complete() throws Throwable {
		addOnsPage.CheckProgressConfirmed();
	}

	// @When("^user clicks the next button on the review and confirm page to go to payments page$")
	// public void user_clicks_the_next_button_on_the_review_and_confirm_page_to_go_to_payments_page() throws Throwable {
	// paymentsPage = reviewConfirmPage.ClickNextButtonPayment();
	// }

	@Then("^user checks dashboard table displayed$")
	public void user_checks_dashboard_table_displayed() throws Throwable {
		dashboardPage.checksDashboardRows();
	}

	@Then("^user checks newest row in dashboard$")
	public void user_checks_newest_row_in_dashboard() throws Throwable {
		dashboardPage.displayedNewestRow();
	}

	@Then("^user checks oldest row in dashboard$")
	public void user_checks_oldest_row_in_dashboard() throws Throwable {
		dashboardPage.displayedOldestRow();
	}

	@When("^user searches for a user in dashboard$")
	public void user_searchs_a_user_in_dashboard() throws Throwable {
		dashboardPage.SearchDashboardUser();
		dashboardPage.displayMoreOptionSearchFields();
	}

	@When("^user searches for a user that is not in dashboard$")
	public void user_searches_for_a_user_that_is_not_dashboard() throws Throwable {
		dashboardPage.SearchDashboardEmptyUser();
	}

	@Then("^user updates action details in dashboard$")
	public void user_updates_action_details_in_dashboard() throws Throwable {
		dashboardPage.UpdateUserActions();
	}

	@When("^user enters invalid date in action$")
	public void user_enters_invalid_date_in_action() throws Throwable {
		dashboardPage.enterInvalidDate();
	}

	@When("^user sorts dashboard column$")
	public void user_sorts_dashboard_collumn() throws Throwable {
		dashboardPage.SortsColumnInDashboardTable();
	}

	@When("^user clicks more option to search$")
	public void user_uses_more_option_to_search() throws Throwable {
		dashboardPage.clickMoreOption();
	}

	@When("^user clicks hide option to search$")
	public void user_uses_hide_option_to_search() throws Throwable {
		dashboardPage.clickHideOption();
	}

	@Then("^user checks if search fields are displayed$")
	public void user_checks_if_search_fields_are_displayed() throws Throwable {
		dashboardPage.displayMoreOptionSearchFields();
	}

	@Then("^user sees no forms in the dashboard$")
	public void user_sees_no_forms_in_the_dashboard() throws Throwable {
		CommonFunctions.textDisplayedInPage("No form items to show...");
	}

	@Then("^user searches for a user using more options$")
	public void user_searches_for_a_user_using_more_options() throws Throwable {
		dashboardPage.FillUpMoreOptionSearchFields();
	}

	@Then("^user verifies if css is displayed")
	public void user_verifies_if_css_is_displayed() throws Throwable {
		homePage.checkCSSColor();
	}

	@Then("^user checks standard will title is displayed")
	public void user_checks_standard_will_title_is_displayed() throws Throwable {
		homePage.checkStandardSingleWillText();
	}

	@Then("^user checks standard will body is displayed")
	public void user_checks_standard_will_body_is_displayed() throws Throwable {
		homePage.checkSingleWillBodyText();
	}

	@Then("^user checks couple will title is displayed")
	public void user_checks_couple_will_title_is_displayed() throws Throwable {
		homePage.checkStandardCoupleWillText();
	}

	@Then("^user checks couple will body is displayed")
	public void user_checks_couple_will_body_is_displayed() throws Throwable {
		homePage.checkCoupleWillBodyText1();
	}

	@Then("^user checks couple will types is displayed")
	public void user_checks_couple_will_types_is_displayed() throws Throwable {
		homePage.checkCoupleWillBodyText2();
	}

	// MW-177 MW-114 MW-115
	@When("^user logs into app with the \"([^\"]*)\" and \"([^\"]*)\" to dashboard$")
	public void user_logs_into_app_with_the_and_to_dashboard(String arg1, String arg2) throws Throwable {
		loginPage.setEmailInput(arg1);
		loginPage.setPasswordInput(arg2);
		dashboardPage = loginPage.clickLoginDashboard();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user clicks on union list menu$")
	public void user_clicks_on_union_list_menu() throws Throwable {
		CommonFunctions.wait(5000, false);
		unionListPage = dashboardPage.clickUnionList();
	}

	@Then("^user clicks on add union button$")
	public void user_clicks_on_add_union_button() throws Throwable {
		unionListPage.clickAddUnion();
	}

	@Then("^check add rule$")
	public void check_add_rule() throws Throwable {
		unionListPage.checkAddRule();
	}

	@Then("^user fill up add union details$")
	public void user_fill_up_add_union_details() throws Throwable {
		unionListPage.fillUpUnionDetails_alpha();
		// unionListPage.fillUpUnionDetails_alpha(); for MW-180
		// unionListPage.fillUpUnionDetails_numeric_alphanumeric for MW-114,115,177
	}

	@Then("^user click cancel button$")
	public void user_click_cancel_button() throws Throwable {
		unionListPage.clickCancelUnion();
	}

	@Then("^user click save button$")
	public void user_click_save_button() throws Throwable {
		unionListPage.clickSaveUnion();
	}

	@Then("^user sees alert message$")
	public void user_sees_alert_message() throws Throwable {
		unionListPage.alertMessageDisplay();
	}

	@Then("^user select alphanumeric string type$")
	public void user_select_alphanumeric_string_type() throws Throwable {
		unionListPage.selectAlphanumericStringType();
	}

	@Then("^user sees alert message for alpha location$")
	public void user_sees_alert_message_for_alpha_location() throws Throwable {
		unionListPage.alertMessageDisplay_AlphaLocation();
	}

	// Edit Union
	@Then("^user clicks on edit union$")
	public void user_clicks_on_edit_union() throws Throwable {
		unionListPage.clickEditButton2();
		// unionListPage.clickEditButton2(); for MW - 180
		// unionListPage.clickEditButton(); for MW - 114,115,177
	}

	@Then("^user fill up edit union details$")
	public void user_fill_up_edit_union_details() throws Throwable {
		unionListPage.fillUpEditUnionDetails_numeric();
		// unionListPage.fillUpEditUnionDetails_numeric(); for MW - 180
		// unionListPage.fillUpEditUnionDetails_numeric_alphanumeric();for MW - 114,115,177
	}

	@Then("^user check for the edited union$")
	public void user_check_for_the_edited_union() throws Throwable {
		CommonFunctions.textDisplayedInPage("AlphaNumeric01");
	}

	@Then("^user enter min length greater than max length$")
	public void user_enter_min_length_greater_than_max_length() throws Throwable {
		unionListPage.fillUpUnionDetails_SampleUnion1();
	}

	@When("^user enter min length less than zero$")
	public void user_enter_min_length_less_than_zero() throws Throwable {
		unionListPage.fillUpUnionDetails_SampleUnion2();
	}

	@When("^user enter alpha length equal to max length$")
	public void user_enter_alpha_length_equal_to_max_length() throws Throwable {
		unionListPage.fillUpUnionDetails_SampleUnion3();
	}

	@When("^user enter alpha length greater than to max length$")
	public void user_enter_alpha_length_greater_than_to_max_length() throws Throwable {
		unionListPage.fillUpUnionDetails_SampleUnion4();
	}

	@When("^user enter alpha length equal to zero$")
	public void user_enter_alpha_length_equal_to_zero() throws Throwable {
		unionListPage.fillUpUnionDetails_SampleUnion5();
	}

	@When("^user enter alpha length less than zero$")
	public void user_enter_alpha_length_less_than_zero() throws Throwable {
		unionListPage.fillUpUnionDetails_SampleUnion6();
	}

	@When("^user enter max length greater than fifty$")
	public void user_enter_max_length_greater_than_fifty() throws Throwable {
		unionListPage.fillUpUnionDetails_SampleUnion7();
	}

	@Then("^user clicks on edit union then cancel$")
	public void user_clicks_on_edit_union_then_cancel() throws Throwable {
		unionListPage.clickEditButton1();
	}

	@Then("^user fill up edit union details and cancel$")
	public void user_fill_up_edit_union_details_and_cancel() throws Throwable {
		unionListPage.fillUpUnionDetails_numeric();
	}

	// Delete Union
	@Then("^user click delete button$")
	public void user_click_delete_button() throws Throwable {
		unionListPage.clickDeleteButton();
		CommonFunctions.wait(5000, false);
	}

	@Then("^windows alert message is displayed$")
	public void windows_alert_message_is_displayed() throws Throwable {
		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		unionListPage.displayDeleteAlertMessage();
	}

	@Then("^user checks page footer in home page$")
	public void user_checks_page_footer_in_home_page() throws Throwable {
		homePage.checkFooterIfDisplayed();
	}

	@Then("^user clicks on proceed payment button$")
	public void user_clicks_on_proceed_payment_button() throws Throwable {
		paymentsPage.clickProceedPayment();
		CommonFunctions.wait(5000, false);
	}

	@Then("^user checks POA amount displayed$")
	public void user_checks_POA_amount_displayed() throws Throwable {
		paymentsPage.checkAddonsDisplayed();
	}

	@When("^user sees spouse/partner will tooltip$")
	public void user_sees_spouse_partner_will_tooltip() throws Throwable {
		aboutPage.DisplayTooltipForSpouse();
	}

	@When("^user checks the content of spouse/partner will tooltip$")
	public void user_checks_the_content_of_spouse_partner_will_tooltip() throws Throwable {
		aboutPage.ClickTooltipForSpouse();
		CommonFunctions.wait(2000, false);
		CommonFunctions.textDisplayedInPage("We recommend that you and your partner prepare your Wills at the same time. If you have assets which are held jointly or you are leaving your assets to your partner, and you die first, then these assets will belong to your partner. Your partner will need a Will to deal with the ultimate distribution. If at this stage we only prepare your Will, we may not be able to assist your partner with a Will later because to do so may create a conflict of interest. It is also cheaper to do both Wills at the same time.");
	}

	@When("^user clicks yes to Do you have any children question$")
	public void user_clicks_yes_to_Do_you_have_any_children_question() throws Throwable {
		aboutPage.ClickChildrenYes();
	}

	@When("^user clicks add child on about you page$")
	public void user_clicks_add_child_on_about_you_page() throws Throwable {
		aboutPage.ClickAddChild();
	}

	@When("^user sees significant will tooltip$")
	public void user_sees_significant_will_tooltip() throws Throwable {
		aboutPage.DisplayTooltipSignificant();
	}

	@When("^user checks the content of significant will tooltip$")
	public void user_checks_the_content_of_significant_will_tooltip() throws Throwable {
		aboutPage.ClickTooltipSignificant();
		CommonFunctions.wait(2000, false);
		CommonFunctions.textDisplayedInPage("You might be leaving part of your estate to a person who needs help with managing their assets or has asset protection issues. Let us know if you are naming a beneficiary who runs their own business or is in a job where they are at risk of being sued or whose personal circumstances mean that they are vulnerable (e.g. have mental health or addiction concerns or have a disability) so that we can talk to you about the best way to deal with their part of the estate.");
		aboutPage.AddChildrenLegitimate();
	}

	@When("^user sees dependents will tooltip$")
	public void user_sees_dependents_will_tooltip() throws Throwable {
		aboutPage.DisplayTooltipDependents();
	}

	@When("^user checks the content of dependents will tooltip$")
	public void user_checks_the_content_of_dependents_will_tooltip() throws Throwable {
		aboutPage.ClickTooltipDependents();
		CommonFunctions.wait(2000, false);
		CommonFunctions.textDisplayedInPage("A Dependent includes someone you financailly support or someone who lives with you and with whom you have a supportive relationship. It does not usually include a housemate.");
	}

	@When("^user sees upload will tooltip$")
	public void user_sees_upload_will_tooltip() throws Throwable {
		aboutPage.DisplayTooltipUploadWill();
	}

	@When("^user sees Death beneficiary tooltip$")
	public void user_sees_Death_beneficiary_tooltip() throws Throwable {
		assetsPage.DisplayTooltipDeathBenef();
	}

	@When("^user checks the content of upload will tooltip$")
	public void user_checks_the_content_of_upload_will_tooltip() throws Throwable {
		aboutPage.ClickTooltipUploadWill();
		CommonFunctions.wait(2000, false);
		CommonFunctions.textDisplayedInPage("It is helpful for us to see a copy of your old Will to understand how your wishes have changed. This may impact the advice we give you. DO NOT unstaple or damage your old Will as this may make it invalid.");
	}

	@Then("^user checks the content of Death beneficiary tooltip$")
	public void user_checks_the_content_of_Death_beneficiary_tooltip() throws Throwable {
		assetsPage.ClickTooltipDeathBenef();
		CommonFunctions.wait(1500, false);
		CommonFunctions.textDisplayedInPage("Your superannuation is not automatically covered by your Will. You should contact your superannuation fund or advisor directly to find out whether you require a Binding Death Benefit Nomination or other documentation to direct the payment of your superannuation death benefits. There may be different tax consequences depending on your nominated beneficiaries and you should seek financial advice.");
		// CommonFunctions.textDisplayedInPage("If you do not have a valid Binding Death Benefit Nomination at the date of your death then the Trustee of the superannuation fund may have the
		// discretion to determine how your death benefits are paid. If your nomination is Non-Binding then your superannuation fund may take it into consideration but will not be bound to pay your
		// death benefits in the way you have chosen.");
	}

	@Then("^user clicks yes on Have you nominated a beneficiary$")
	public void user_clicks_yes_on_Have_you_nominated_a_beneficiary() throws Throwable {
		assetsPage.ClickSuperDeathBenefYes();
	}

	@When("^user sees binding tooltip$")
	public void user_sees_binding_tooltip() throws Throwable {
		assetsPage.DisplayTooltipBinding();
	}

	@Then("^user checks the content of binding tooltip$")
	public void user_checks_the_content_of_binding_tooltip() throws Throwable {
		assetsPage.ClickTooltipBinding();
		CommonFunctions.wait(1500, false);
		CommonFunctions.textDisplayedInPage("A nomination is binding if you have nominated a dependent or interdependent. This may include your spouse or children. You should contact your Superannuation fund to check this definition.");
	}

	@When("^user sees assets tooltip$")
	public void user_sees_assets_tooltip() throws Throwable {
		assetsPage.DisplayTooltipAssets();
	}

	@Then("^user checks the content of assets tooltip$")
	public void user_checks_the_content_of_assets_tooltip() throws Throwable {
		assetsPage.ClickTooltipAssets();
		CommonFunctions.wait(1500, false);
		CommonFunctions.textDisplayedInPage("An Asset is something of financial value that you solely or jointly own.");
	}

	@When("^user sees trusts tooltip$")
	public void user_sees_trusts_tooltip() throws Throwable {
		assetsPage.DisplayTooltipTrusts();
	}

	@Then("^user checks the content of trusts tooltip$")
	public void user_checks_the_content_of_trusts_tooltip() throws Throwable {
		assetsPage.ClickTooltipTrusts();
		CommonFunctions.wait(1500, false);
		assetsPage.DisplayTooltipTrustsVideo();

	}

	@Then("^user sees superannuation tooltip$")
	public void user_sees_superannuation_tooltip() throws Throwable {
		assetsPage.DisplayTooltipSuper();
	}

	@Then("^user checks the content of superannuation tooltip$")
	public void user_checks_the_content_of_superannuation_tooltip() throws Throwable {
		assetsPage.ClickTooltipSuper();
		CommonFunctions.wait(1500, false);
		assetsPage.DisplayTooltipSuperVideo();
	}

	@Then("^user sees life interest tooltip$")
	public void user_sees_life_interest_tooltip() throws Throwable {
		assetsPage.DisplayTooltipInterests();
	}

	@Then("^user checks the content of life interest tooltip$")
	public void user_checks_the_content_of_life_interest_tooltip() throws Throwable {
		assetsPage.ClickTooltipInterests();
		CommonFunctions.wait(1500, false);
		CommonFunctions.textDisplayedInPage("A life interest allows you to give property to another person for their lifetime, and upon their death, the asset can be given to someone else.");
	}

	@Then("^user sees ownership tooltip$")
	public void user_sees_ownership_tooltip() throws Throwable {
		assetsPage.DisplayTooltipOwnership();
	}

	@Then("^user checks the content of ownership tooltip$")
	public void user_checks_the_content_of_ownership_tooltip() throws Throwable {
		assetsPage.ClickTooltipOwnership();
		CommonFunctions.wait(1500, false);
		assetsPage.DisplayTooltipOwnershipVideo();
	}

	@When("^user sees guardian tooltip$")
	public void user_sees_guardian_tooltip() throws Throwable {
		aboutPage.DisplayTooltipGuardian();
	}

	@When("^user checks the content of guardian tooltip$")
	public void user_checks_the_content_of_guardian_tooltip() throws Throwable {
		aboutPage.ClickTooltipGuardian();
		CommonFunctions.wait(1500, false);
		aboutPage.DisplayTooltipGuardianVideo();
	}

	@Then("^user sees beneficiaries tooltip$")
	public void user_sees_beneficiaries_tooltip() throws Throwable {
		beneficiariesPage.DisplayBeneficiaries_Tooltip();
	}

	@Then("^user checks the content of beneficiaries tooltip$")
	public void user_checks_the_content_of_beneficiaries_tooltip() throws Throwable {
		beneficiariesPage.ClickBeneficiaries_Tooltip();
		CommonFunctions.wait(1500, false);
		CommonFunctions.textDisplayedInPage("Your Beneficiaries are the people you want to leave your estate to. Estate is the word used to refer to the assets that you own in your sole name when you die.");
	}

	@Then("^user sees executors tooltip$")
	public void user_sees_executors_tooltip() throws Throwable {
		executorsPage.DisplayExecutors_Tooltip();
	}

	@Then("^user sees Lawyers of Your Estate tooltip$")
	public void user_sees_Lawyers_of_Your_Estate_tooltip() throws Throwable {
		executorsPage.DisplayLawyersOfEstate_Tooltip();
	}

	@Then("^user checks the content of executors tooltip$")
	public void user_checks_the_content_of_executors_tooltip() throws Throwable {
		executorsPage.ClickExecutors_Tooltip();
		CommonFunctions.wait(1500, false);
		CommonFunctions.textDisplayedInPage("Your Executor (also known as your Trustee) is the person or people who are responsible for ensuring that the terms of your Will are carried out after your death.  ");
	}

	@Then("^user checks the content of Lawyers of Your Estate tooltip$")
	public void user_checks_the_content_of_Lawyers_of_Your_Estate_tooltip() throws Throwable {
		executorsPage.ClickLawyersOfEstate_Tooltip();
		CommonFunctions.wait(1500, false);
		CommonFunctions.textDisplayedInPage("Your Executors may need help in dealing with the legal aspects of the estate after your death including applying to the Court for a Grant of Probate. You can include a wish that Maurice Blackburn is to assist your Executors with this process. This wish is not binding on your executors and if they would prefer to do it themselves or use another lawyer then they are free to do so.");
	}

	@Then("^user sees POA tooltip with video$")
	public void user_sees_POA_tooltip_with_video() throws Throwable {
		addOnsPage.DisplayPowerOfAttorney_Tooltip2();
		CommonFunctions.wait(1500, false);
		addOnsPage.clickPowerOfAttorney_Tooltip2();
		addOnsPage.DisplayPowerOfAttorney_Tooltip2Video();
	}

	@Then("^user sees Enduring POA tooltip$")
	public void user_sees_Enduring_POA_tooltip() throws Throwable {
		financialDecisionsPage.DisplayEnduringPOA_Tooltip2();
		CommonFunctions.wait(1500, false);
		financialDecisionsPage.ClickEnduringPOA_Tooltip2();
	}

	@Then("^user sees when to act tooltip$")
	public void user_sees_when_to_act_tooltip() throws Throwable {
		financialDecisionsPage.DisplayWhenToAct_Tooltip();
		CommonFunctions.wait(1500, false);
		financialDecisionsPage.ClickWhenToAct_Tooltip();
	}

	@Then("^user sees Medical Decision Maker tooltip$")
	public void user_sees_Medical_Decision_Maker_tooltip() throws Throwable {
		medicalDecisionsPage.DisplayMedicalDecisionMaker_Tooltip();
		CommonFunctions.wait(1500, false);
		medicalDecisionsPage.clickMedicalDecisionMaker_Tooltip();
	}

	@Then("^user sees Advance Care tooltip$")
	public void user_sees_Advance_Care_tooltip() throws Throwable {
		medicalDecisionsPage.DisplayAdvanceCare_Tooltip();
		CommonFunctions.wait(1500, false);
		medicalDecisionsPage.clickAdvanceCare_Tooltip();
	}

	@Then("^user check for the will price$")
	public void user_check_for_the_will_price() throws Throwable {

	}

	@Then("^user close browser$")
	public void user_close_browser() throws Throwable {
		driver.close();

	}

	@Then("^user get text$")
	public void user_get_text() throws Throwable {
		WebElement element = driver.findElement(By.xpath("(//div[contains(@id,'Everything')]//div)[1]//span"));
		System.out.println(element.getText());
		CommonFunctions.textDisplayedInPage("Same as Residential Address");
	}

	@Then("^error message is displayed$")
	public void error_message_is_displayed() throws Throwable {
		unionListPage.displayDuplicateAlertMessage();
	}

	@Then("^user check the total standard will cost with POA$")
	public void user_check_the_total_standard_will_cost_with_POA() throws Throwable {
		paymentsPage.DisplayedTotalStandardWillCostWithPOA();
	}

	@Then("^user check the total couple will cost with POA$")
	public void user_check_the_total_couple_will_cost_with_POA() throws Throwable {
		paymentsPage.DisplayedTotalStandardWillCostWithPOA();
	}

	@Then("^user check on the label$")
	public void user_check_on_the_label() throws Throwable {
		reviewConfirmPage.validatePersonalDetails();
		CommonFunctions.wait(5000, false);
	}

	@Then("^Do you want your Enduring Power of Attorney to be for tooltip is displayed$")
	public void do_you_want_your_Enduring_Power_of_Attorney_to_be_for_tooltip_is_displayed() throws Throwable {
		CommonFunctions.wait(5000, false);
		financialDecisionsPage.DisplayPowerOfAttorney_Tooltip3();

	}

	@Then("^user clicks on the Do you want your Enduring Power of Attorney to be for tooltip$")
	public void user_clicks_on_the_Do_you_want_your_Enduring_Power_of_Attorney_to_be_for_tooltip() throws Throwable {
		financialDecisionsPage.clickPowerOfAttorney_Tooltip3();
	}

	@Then("^user check POA text content$")
	public void user_check_POA_text_content() throws Throwable {
		addOnsPage.TextDisplay();
	}

	@Then("^user checks relationship status if single and widowed are not available$")
	public void user_checks_relationship_status_if_single_and_widowed_are_not_available() throws Throwable {
		String[] RelStatus = { "Select One", "Defacto", "Engaged", "Married", "Separated", "Divorced" };
		aboutPage.CheckRelationshipStatusDropdownValues(RelStatus);
	}

	@Then("^user checks POA consent for spouse$")
	public void user_checks_POA_consent_for_spouse() throws Throwable {
		aboutPage.displayEmailConsent();
	}

	@Then("^user clicks download cost disclosure$")
	public void user_clicks_download_cost_disclosure() throws Throwable {
		paymentsPage.clickCostDisclosure();
	}

	@Given("^user opens browser and proceeds to orders page$")
	public void user_opens_browser_and_proceeds_to_orders_page() throws Throwable {
		driver.get(prop.getProperty("orders"));
		ordersPage = new OrdersPage();
		CommonFunctions.wait(1500, false);
	}

	@Then("^user selects \"([^\"]*)\" on user dropdown$")
	public void user_selects_on_user_dropdown(String arg1) throws Throwable {
		ordersPage.SetSelectUser(arg1);
		CommonFunctions.wait(1500, false);
	}

	@Then("^user clicks on delete all button$")
	public void user_clicks_on_delete_all_button() throws Throwable {
		ordersPage.ClickDeleteAllButton();
		CommonFunctions.wait(1500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.wait(1500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.wait(5000, false);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();

	}

	@Then("^user clicks ok button on popup$")
	public void user_clicks_ok_button_on_popup() throws Throwable {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	@When("^user clicks on Maurice Blackburn's Terms and Collection$")
	public void user_clicks_on_Maurice_Blackburn_s_Terms_and_Collection() throws Throwable {
		registrationPage.clickTermsCondition();
		CommonFunctions.wait(5000, false);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		CommonFunctions.wait(3000, false);

	}

	@When("^user clicks on Maurice Blackburn's Collection Statement$")
	public void user_clicks_on_Maurice_Blackburn_s_Collection_Statement() throws Throwable {
		registrationPage.clickCollectionStatement();
		CommonFunctions.wait(5000, false);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		CommonFunctions.wait(3000, false);

	}

	@When("^user clicks on Maurice Blackburn's Privacy Policy$")
	public void user_clicks_on_Maurice_Blackburn_s_Privacy_Policy() throws Throwable {
		registrationPage.clickPrivacyPolicy();
		CommonFunctions.wait(5000, false);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));
		CommonFunctions.wait(3000, false);

	}

	@Then("^user checks spouse invitation message$")
	public void user_checks_spouse_invitation_message() throws Throwable {
		addOnsPage.clickAddSpouse();
		CommonFunctions.wait(3000, false);
		addOnsPage.checkSpouseBody();
	}

	@Then("^user input spouse email$")
	public void user_input_spouse_email() throws Throwable {
		addOnsPage.setSpouseEmailInput();

	}

	@Then("^user clicks save spouse email$")
	public void user_clicks_save_spouse_email() throws Throwable {
		addOnsPage.clickSaveSpouse();
	}

	@Then("^user checks if union is duplicated$")
	public void user_checks_if_union_is_duplicated() throws Throwable {
		unionListPage.displayedRequiredName();
	}

	@Then("^user checks for searched user in dashboard$")
	public void user_checks_for_searched_user_in_dashboard() throws Throwable {
		dashboardPage.displayedNewestRow();
	}

	@Then("^user clicks on first identification document$")
	public void user_clicks_on_first_identification_document() throws Throwable {
		idDocsPage.clickAddFirstIdentification();
		CommonFunctions.wait(3000, false);
		idDocsPage.clickAddFirstIdentification();
		CommonFunctions.wait(3000, false);
	}

	@Then("^user clicks on second identification document$")
	public void user_clicks_on_second_identification_document() throws Throwable {
		idDocsPage.clickAddSecondIdentification();
		CommonFunctions.wait(3000, false);
	}

	@Then("^user adds first identification$")
	public void user_adds_first_identification() throws Throwable {
		idDocsPage.clickAddID();
		CommonFunctions.wait(3000, false);
	}

	@Then("^user adds second identification$")
	public void user_adds_second_identification() throws Throwable {
		idDocsPage.clickAddID();
		CommonFunctions.wait(3000, false);
	}

	@Then("^user clicks change to go back to personal page$")
	public void user_clicks_change_to_go_back_to_personal_page() throws Throwable {
		personalPage = reviewConfirmPage.ProgressChangePersonal();
		CommonFunctions.wait(3000, false);
	}

}