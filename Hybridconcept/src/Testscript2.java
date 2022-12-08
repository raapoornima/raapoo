package test_scripts;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic_scripts.Base_Test;
import generic_scripts.GenericExcel2;
import pom_scripts.PomFblogin;

public class Testscript2 extends Base_Test {
	@Test
	public void script() throws EncryptedDocumentException, IOException
	{
		String username=GenericExcel2.getData("Sheet1",0, 0);
		String password=GenericExcel2.getData("Sheet1", 1, 0);
		 
		PomFblogin pm=new PomFblogin(driver);
pm.UserName(username);
pm.PassWord(password);
Assert.fail();
pm.ClickLogin();
		
		
	}

}
