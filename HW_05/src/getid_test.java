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
//		l.add(new String[]{"�ֽ���","***201145"});
		return l;
//		return Arrays.asList(new Object[][] {
//			{"�ֽ���","***201145"},
//			{"����","***216238"},
//			{"��Ծ","***205149"},
//			{"�����","***205293"},
//			{"��־��","***207169"},
//			{"�����","***207450"},
//			{"������","***234253"},
//			{"ľ�ȵ�����������","***244075"},
//			{"�����","***244076"},
//			{"���ΰ","***244077"},
//			{"������","***244080"},
//			{"��������","***244082"},
//			{"������","***244084"},
//			{"�������ᡤ��������","***244086"},
//			{"������","***244087"},
//			{"���γ�","***244092"},
//			{"������","***244096"},
//			{"������","***244097"},
//			{"��ҿ�","***244102"},
//			{"������","***244114"},
//			{"���ֽ�","***244115"},
//			{"�����","***244120"},
//			{"�ſ�Ϊ","***244121"},
//			{"��Ӧ��","***244134"},
//			{"����","***244135"},
//			{"����","***244136"},
//			{"���ٻ","***244139"},
//			{"���Զ","***244142"},
//			{"������","***244146"},
//			{"�»�˳","***244162"},
//			{"���","***244163"},
//			{"��˶","***244167"},
//			{"������","***244174"},
//			{"����","***244176"},
//			{"��ϣ��","***244178"},
//			{"������","***244192"},
//			{"����ͨ","***244193"},
//			{"����","***244204"},
//			{"������","***244210"},
//			{"������","***244227"},
//			{"��ĭ��","***244228"},
//			{"Фѧ��","***244230"},
//			{"������","***244238"},
//			{"�˵t��","***244240"},
//			{"������","***244241"},
//			{"������","***244247"},
//			{"��˼��","***244248"},
//			{"������","***244257"},
//			{"��С��","***244275"},
//			{"����Բ","***244284"},
//			{"������","***244285"},
//			{"���","***244287"},
//			{"����Ө","***244295"},
//			{"��׿ѷ","***244303"},
//			{"���곽","***244304"},
//			{"κ����","***244307"},
//			{"Ǯ��־","***244311"},
//			{"������","***244313"},
//			{"�����","***244318"},
//			{"�޿�","***244334"},
//			{"������","***244337"},
//			{"������","***244340"},
//			{"֣���","***244342"},
//			{"�����","***244358"},
//			{"�̽�","***244370"},
//			{"������","***244381"},
//			{"����","***244385"},
//			{"������","***244392"},
//			{"�߽���","***244393"},
//			{"����Ȼ","***244404"},
//			{"������","***244410"},
//			{"��ޱ","***244423"},
//			{"����","***058908"},
//			{"������","***058909"},
//			{"���۝�","***000293"},
//			{"�ల","***000347"},
//			{"����","***000414"}
//		});
		}
	@Test
	public void testgetid() {
		assertEquals(gi.method(inputString),expectedResult);
		gi.driver.close();
	}
}
