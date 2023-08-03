

import org.example.StringToIntegerConverter;
import org.junit.Test;



import static junit.framework.TestCase.assertEquals;


public class NumberTest {


    @Test
    public void boundaryConditions(){
     assertEquals((short) -3, (short)StringToIntegerConverter.convert("-3"));
     assertEquals((short) 500, (short)StringToIntegerConverter.convert("500"));
     assertEquals((short) 32766, (short)StringToIntegerConverter.convert("32766"));
     assertEquals((short) -32766, (short)StringToIntegerConverter.convert("-32766"));
    }

    @Test(expected = NumberFormatException.class)
    public void outOfBoundaryConditions(){

        StringToIntegerConverter.convert("327661");
        StringToIntegerConverter.convert("-327661");
    }



}
