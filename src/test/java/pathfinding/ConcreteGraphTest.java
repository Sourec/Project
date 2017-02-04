package pathfinding;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ConcreteGraphTest {
    public void setUp() throws Exception {

    }

    @Test
    public void findPath() throws Exception {
        ConcreteNode[] straightNodes = new ConcreteNode[5];
        ConcreteNode[][] gridNodes = new ConcreteNode[100][100];

        //Ugh... init
        for (int i = 0; i < straightNodes.length; i++)
            straightNodes[i] = new ConcreteNode();

        for (int i = 0; i < 100; i++)
            for (int j = 0; j < 100; j++)
                gridNodes[i][j] = new ConcreteNode();

        //Create a simple straightshot array of nodes to idiot-test the pathfinding
        for (int i = 0; i < straightNodes.length; i++)
        {
            if (i > 0)
                straightNodes[i].addNeighbor(straightNodes[i-1]);
            if (i < straightNodes.length - 1)
                straightNodes[i].addNeighbor(straightNodes[i+1]);
        }

        //Create a more complicated grid of nodes to check for actual pathfinding ability where many choices exist
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
            	gridNodes[i][j].setX(i);
            	gridNodes[i][j].setY(j);
                if (i > 0)
                    gridNodes[i][j].addNeighbor(gridNodes[i-1][j]);
                if (i < 99)
                    gridNodes[i][j].addNeighbor(gridNodes[i+1][j]);
                if (j > 0)
                    gridNodes[i][j].addNeighbor(gridNodes[i][j-1]);
                if (j < 99)
                    gridNodes[i][j].addNeighbor(gridNodes[i][j+1]);
            }
        }
        Graph graph = new ConcreteGraph();

        //Straight shot pathing test
        assertNotNull(graph.findPath(straightNodes[0], straightNodes[straightNodes.length - 1]));
        assertEquals(straightNodes.length - 1, graph.findPath(straightNodes[0], straightNodes[straightNodes.length - 1]).size());

        //Grid pathing test
        assertNotNull(graph.findPath(gridNodes[0][0], gridNodes[0][99]));
       	assertEquals(100, graph.findPath(gridNodes[0][0], gridNodes[99][99]).size());
        assertNotNull(graph.findPath(gridNodes[0][0], gridNodes[99][99]));
        assertTrue(graph.findPath(gridNodes[0][0], gridNodes[99][99]).size() > 100);

        //Edge cases
        assertNull(graph.findPath(null, null));
        assertNull(graph.findPath(gridNodes[0][0], straightNodes[0])); //no path
    }

}