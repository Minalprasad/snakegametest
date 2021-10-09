/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.awt.Button;
import java.awt.event.KeyEvent;
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
public class KeyboardListenerTest
{
    private int key_code;
    private int direction;
    
    public KeyboardListenerTest(int key_code, int direction)
    {
        this.key_code = key_code;
        this.direction = direction;
    }
    
    @Parameterized.Parameters   //list of parameters and returns for the test
    public static Collection input()
    {
        return Arrays.asList(new Object[][]
        {
            {KeyEvent.VK_RIGHT, 1},
            {KeyEvent.VK_UP, 3},
            {KeyEvent.VK_LEFT, 2},
            {KeyEvent.VK_DOWN, 4}
        });
    }

    /**
     * Test of keyPressed method, of class KeyboardListener.
     */
    @Test
    public void testKeyPressed()
    {
        //press a key from the list
        Button b = new Button();
        KeyEvent ke = new KeyEvent(b, 0, 0, 0, key_code, ' ');
        KeyboardListener kl = new KeyboardListener();
        kl.keyPressed(ke);
        
        //get the direction and assert
        int d = ThreadsController.directionSnake;
        Assert.assertEquals(d, direction);
    }
}
