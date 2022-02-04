import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class SkillDemoTester {
    @Test
    public void getStringTester() {
        assertEquals(SkillDemo.getString(1), "CSE");
    }
}
