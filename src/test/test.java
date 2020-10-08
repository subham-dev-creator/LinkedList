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
        list.addNodeMid(30);
        list.insertAtTargetPosition(30,40);
    }


    @Test
    public void testToFindTheNodeIsPresentOrNot() {
        assertEquals(true,list.findNodeWithValue(40));
        list.deleteSpecificNode(40);
        assertEquals(false,list.findNodeWithValue(40));
    }


}
