package ActualTC;


import org.testng.annotations.Test;
import org.testng.Assert;
import com.vtiger.genericutilities.Baseclass;
import com.vtiger.pomclasses.CreateNewOrganizationPage4;
import com.vtiger.pomclasses.Homepage2;
import com.vtiger.pomclasses.OrganizationInformationPage5;
import com.vtiger.pomclasses.OrganizationPage3;

public class createOrganizationTest extends Baseclass {
@Test
public void createorg() {
	//click on orgmodule
	Homepage2 hp=new Homepage2(driver);
	hp.clickOnOrgLink();
	//click on lookup image
	OrganizationPage3 op=new OrganizationPage3(driver);
	op.clickOnOrgLookUpImg();
	//give org name
	CreateNewOrganizationPage4 cnop=new CreateNewOrganizationPage4(driver);
	cnop.createNewOrganization("capgemini"+ju.getRandomNum());
	//get the header and verify
	OrganizationInformationPage5 oip=new OrganizationInformationPage5(driver);
	String header = oip.getHeader();
	//verify
	Assert.assertTrue(header.contains("capgemini"));
	System.out.println("===ORGANIZATION IS CREATED AND TC IS PASS===");
}
}
