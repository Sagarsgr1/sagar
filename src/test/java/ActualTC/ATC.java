package ActualTC;

import org.testng.Assert;
import org.testng.annotations.Test;

import contact.genericuti.Bcls;
import contactmodule.Homepage2;
import contactmodule.contactInformationpage;
import contactmodule.contactpage;
import contactmodule.createNewcontact;

public class ATC extends Bcls {
	@Test
	public void createcontact() {
		//click on conmodule
		Homepage2 hp=new Homepage2(driver);
		hp.clickonContactsLink();;
		//click on lookup image
		contactpage op=new contactpage(driver);
		op.clickOncontLookUpImg();
		//give con name
		createNewcontact cncp=new createNewcontact(driver);
		cncp.createNewcontact("const"+ju.getRandomNum());
		//get the header and verify
		contactInformationpage oip=new contactInformationpage(driver);
		String header = oip.getHeader();
		//verify
		Assert.assertTrue(header.contains("const"));
		System.out.println("===CONTACT IS CREATED AND TC IS PASS===");
	}
}
