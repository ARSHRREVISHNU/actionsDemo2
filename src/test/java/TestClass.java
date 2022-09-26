import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {


@Test
public void method1(){
    Assert.assertEquals(2,2);
}

@Test
public void method2(){
    Assert.assertEquals("This is a string", "This is a String");
}

}
