package test;

import main.LinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test {
    LinkedList<Integer> list = new LinkedList<>();

    @Before
    public void initialize() {
        list.addNodeLast(59);
        list.addNodeLast(70);
        list.addNodeLast(30);
    }


    @Test
    public void testToFindTheNodeIsPresentOrNot() {
        assertEquals(true,list.findNodeWithValue(30));
    }

}
