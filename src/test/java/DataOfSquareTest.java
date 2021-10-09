/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.awt.Color;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author menal
 */
@RunWith(Parameterized.class)
public class DataOfSquareTest
{
    private int col;
    private Color expected_color;
    
    public DataOfSquareTest(int col, Color expected_color)
    {
        this.col = col;
        this.expected_color = expected_color;
    }
    
    @Parameterized.Parameters   //list of parameters and returns for the test
    public static Collection input()
    {
        return Arrays.asList(new Object[][]
        {
            {0, Color.darkGray},
            {1, Color.BLUE},
            {2, Color.white}
        });
    }
    
    /**
     * Test of lightMeUp method, of class DataOfSquare.
     */
    @Test
    public void testLightMeUp()
    {
        DataOfSquare dos = new DataOfSquare(col);
        Assert.assertEquals(expected_color, dos.C.get(col));
    }
}
