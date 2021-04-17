import org.junit.Test;

import static org.junit.Assert.*;

public class CalcClassForJunitTest {
    private CalcClassForJunit testCalc = new CalcClassForJunit(2, 4);

    @Test
    public void setNum1(){
        testCalc.setNumber1(2);
    }

    @Test
    public void setNum2(){
        testCalc.setNumber2(4);
    }

    @Test
    public void getNum1(){
        assertEquals(2, testCalc.getNumber1());
    }

    @Test
    public void getNum2(){
        assertEquals(4, testCalc.getNumber2());
    }

    @Test
    public void testSum(){
        assertEquals(6, testCalc.sumThemUp());
    }
    @Test
    public void testDif(){
        assertEquals(2, testCalc.subThemUp());
    }
    @Test
    public void testMul(){
        assertEquals(8, testCalc.mulThemUp());
    }
    @Test
    public void testDiv(){
        assertEquals(2, testCalc.divThemUp());
    }
}