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
//		l.add(new String[]{"林剑泓","***201145"});
		return l;
//		return Arrays.asList(new Object[][] {
//			{"林剑泓","***201145"},
//			{"王迪","***216238"},
//			{"董跃","***205149"},
//			{"金禹成","***205293"},
//			{"贡志豪","***207169"},
//			{"俞林昊","***207450"},
//			{"贾真真","***234253"},
//			{"木热迪力·卡依尔","***244075"},
//			{"杨宇成","***244076"},
//			{"沈国伟","***244077"},
//			{"安子霄","***244080"},
//			{"扎西美朗","***244082"},
//			{"张雨晴","***244084"},
//			{"艾力扎提·艾合麦提","***244086"},
//			{"陈梦琦","***244087"},
//			{"韩嘉晨","***244092"},
//			{"刘禹尚","***244096"},
//			{"吕智鹏","***244097"},
//			{"邱家康","***244102"},
//			{"李晓鹏","***244114"},
//			{"尚林杰","***244115"},
//			{"吴家旺","***244120"},
//			{"张可为","***244121"},
//			{"杨应兴","***244134"},
//			{"张勇","***244135"},
//			{"周翔","***244136"},
//			{"韩睿倩","***244139"},
//			{"吴光远","***244142"},
//			{"张作成","***244146"},
//			{"陈焕顺","***244162"},
//			{"张睿","***244163"},
//			{"黄硕","***244167"},
//			{"王听雨","***244174"},
//			{"刘航","***244176"},
//			{"张希程","***244178"},
//			{"王天祥","***244192"},
//			{"焦宏通","***244193"},
//			{"宋钊","***244204"},
//			{"吴万钦","***244210"},
//			{"李梓宁","***244227"},
//			{"刘沫洋","***244228"},
//			{"肖学敏","***244230"},
//			{"杜宇轩","***244238"},
//			{"潘祎哲","***244240"},
//			{"陈世博","***244241"},
//			{"郎文翀","***244247"},
//			{"苏思凡","***244248"},
//			{"张文滔","***244257"},
//			{"黄小花","***244275"},
//			{"马梦圆","***244284"},
//			{"王博彦","***244285"},
//			{"张宇杭","***244287"},
//			{"马欣莹","***244295"},
//			{"吴卓逊","***244303"},
//			{"周雨辰","***244304"},
//			{"魏文轩","***244307"},
//			{"钱成志","***244311"},
//			{"黄禹明","***244313"},
//			{"尹汉宸","***244318"},
//			{"崔骏","***244334"},
//			{"刘格伦","***244337"},
//			{"李世军","***244340"},
//			{"郑睿恺","***244342"},
//			{"李浠贤","***244358"},
//			{"程健","***244370"},
//			{"王国超","***244381"},
//			{"唐涛","***244385"},
//			{"罗许扬","***244392"},
//			{"高金卫","***244393"},
//			{"胡安然","***244404"},
//			{"王禹力","***244410"},
//			{"张薇","***244423"},
//			{"林盟","***058908"},
//			{"杨世峰","***058909"},
//			{"骆钲澔","***000293"},
//			{"多安","***000347"},
//			{"恩沃","***000414"}
//		});
		}
	@Test
	public void testgetid() {
		assertEquals(gi.method(inputString),expectedResult);
		gi.driver.close();
	}
}
