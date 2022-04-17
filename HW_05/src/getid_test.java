import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import com.beust.jcommander.Parameter;

@RunWith(Parameterized.class)
public class getid_test {
	private String inputString;
	private String expectedResult;
	static private getid gi;
	static List<Object[]> l = read_csv.read("E:/EC/HW_05/src/user_info.csv");
	
	@BeforeClass
	public static void setup() {
		
	}
	
	@AfterClass
	public static void teardown() {
	    
	}
	public getid_test(String inputString, 
		      String expectedResult) {
		      this.inputString = inputString;
		      this.expectedResult = expectedResult;
		   }
	@Parameterized.Parameters
	public static Collection<Object[]> getData(){
//		l.add(new String[]{"ÁÖ½£ãü","***201145"});
		return l;
		}
	@Test
	public void testgetid() {
		assertEquals(gi.method(inputString),expectedResult);
		gi.driver.close();
	}
}
