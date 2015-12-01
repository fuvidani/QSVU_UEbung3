package main.java.unittests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * <h4>Black Box test for {@link Stack} wiht jUnit-4</h4>
 * <p>This class consists of 16 independent test-cases for testing
 * the functionality of the {@link Stack} class. It ensures correct
 * behaviour for the following methods:</p>
 * <p><ol>
 * <li>{@code empty}</li>
 * <li>{@code peek}</li>
 * <li>{@code pop}</li>
 * <li>{@code push}</li>
 * <li>{@code search}</li>
 * </ol>
 * </p>
 * <p>The class contains both positive and negative test-cases.</p>
 *
 * @author Daniel Fuevesi
 * @version 1.0.0
 * @since 01.12.15
 */
public class QSVU_UEbung3_1326576_Fuevesi_Daniel_StackTest {

    private Stack<Integer> stack;
    private int integer1;
    private int integer2;
    private int integer3;
    private int integer4;
    private int integer5;

    @Before
    public void setUp(){
        this.stack = new Stack<>();
        this.integer1 = 1;
        this.integer2 = 2;
        this.integer3 = 3;
        this.integer4 = 4;
        this.integer5 = 5;
    }

    @After
    public void tearDown(){
        this.stack = null;
    }

    @Test
    public void empty_ShouldReturnTrue(){
        Assert.assertTrue(stack.empty());
    }

    @Test
    public void notEmpty_ShouldReturnFalse(){
        stack.push(integer1);
        Assert.assertFalse(stack.empty());
    }

    @Test
    public void push_ShouldNotBeEmptyAndContainPushedElements(){
        Assert.assertTrue(stack.empty());
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer3);
        Assert.assertFalse(stack.empty());
        Assert.assertTrue(stack.contains(integer1) && stack.contains(integer2) && stack.contains(integer3));
    }

    @Test
    public void push_ShouldContainElementsAndReturnCorrectSize(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer3);
        Assert.assertTrue(stack.contains(integer3) && !stack.contains(integer4));
        stack.push(integer4);
        Assert.assertTrue(stack.contains(integer4));
        Assert.assertTrue(stack.size() == 4);
    }

    @Test
    public void pop_ShouldReturnElementsInCorrectOrder(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer3);
        stack.push(integer4);
        int i1 = stack.pop();
        int i2 = stack.pop();
        int i3 = stack.pop();
        int i4 = stack.pop();
        Assert.assertTrue(i1 == integer4 && i2 == integer3 && i3 == integer2 && i4 == integer1);
    }

    @Test(expected = NullPointerException.class)
    public void pop_NullElementsShouldThrowException(){
        try {
            stack.push(null);
            stack.push(null);
        /* Assert that null elements were indeed pushed */
            Assert.assertTrue(!stack.empty() && stack.size() == 2);
        }catch (NullPointerException e){
            // NullPointer cannot be thrown here
            Assert.fail();
        }
        int i = stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void pop_EmptyStackShouldThrowException(){
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void pop_EmptyStackAfterOperationsShouldThrowException(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer5);
        try{
            stack.pop();
            stack.pop();
            stack.pop();
        }catch (EmptyStackException e){
            Assert.fail();
        }
        stack.pop();
    }

    @Test
    public void peek_ShouldReturnElementOnTopWithoutRemovingIt(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer5);
        Assert.assertTrue(stack.size() == 3);
        int top = stack.peek();
        Assert.assertTrue(top == integer5 && stack.size() == 3 && stack.contains(integer5));
    }

    @Test(expected = NullPointerException.class)
    public void peek_NullElementShouldThrowExceptionWhenAssigned(){
        try {
            stack.push(null);
            Assert.assertTrue(!stack.empty() && stack.size()==1);
        }catch (NullPointerException e){
            Assert.fail();
        }
        int i = stack.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void peek_EmptyStackShouldThrowExpception(){
        stack.peek();
    }

    @Test(expected = EmptyStackException.class)
    public void peek_EmptyStackAfterOperationsShouldThrowException(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer5);
        try{
            int i1 = stack.peek();
            stack.pop();
            int i2 = stack.peek();
            stack.pop();
            int i3 = stack.peek();
            stack.pop();
            Assert.assertTrue(i1 == integer5 && i2 == integer2 && i3 == integer1);
            Assert.assertTrue(stack.empty());
        }catch (EmptyStackException e){
            Assert.fail();
        }
        stack.peek();
    }

    @Test
    public void search_ElementShouldReturnCorrectPosition(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer3);
        stack.push(integer4);
        Assert.assertEquals(1,stack.search(integer4));
        Assert.assertEquals(2,stack.search(integer3));
        Assert.assertEquals(3,stack.search(integer2));
        Assert.assertEquals(4,stack.search(integer1));
    }

    @Test
    public void search_InvalidElementShouldReturnMinusOne(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer3);
        stack.push(integer4);
        Assert.assertEquals(-1,stack.search(integer5));
    }

    @Test
    public void search_ElementThatIsAddedLater(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer3);
        stack.push(integer4);
        Assert.assertEquals(-1,stack.search(integer5));
        stack.push(integer5);
        Assert.assertEquals(1,stack.search(integer5));
    }

    @Test
    public void search_DuplicateElementShouldReturnCorrectPosition(){
        stack.push(integer1);
        stack.push(integer2);
        stack.push(integer3);
        stack.push(integer4);
        stack.push(integer1);  // duplicate
        stack.push(integer5);
        Assert.assertTrue(stack.size() == 6);
        Assert.assertEquals(2,stack.search(integer1));
        stack.pop();
        Assert.assertTrue(stack.size() == 5);
        Assert.assertEquals(1,stack.search(integer1));
        stack.pop(); // delete the closer "1"
        Assert.assertTrue(stack.size() == 4);
        Assert.assertEquals(4,stack.search(integer1));
    }

}
