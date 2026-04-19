import static org.junit.Assert.*;
import org.junit.Test;

public class ExplorerSearchTest {
    @Test
    public void testReachableArea_someUnreachable() {
        int[][] island = {
            {1,1,1,3,1,1},
            {3,2,3,1,3,1},
            {1,1,1,1,3,3},
            {3,1,2,1,0,1},
            {1,1,1,2,1,1},
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(14, actual);
    }

    // Add more tests here!
    // Come up with varied cases

    @Test
    public void testReachableArea_onlyStartPosition() {
        int[][] island = {
            {0}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(1, actual);
    }

    @Test
    public void testfindStartSimple() {
        int[][] island = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        int[] start = ExplorerSearch.findStart(island);

        assertArrayEquals(new int[]{1,1}, start);
    }

    @Test
    public void testReachableArea_simpleMovement() {
        int[][] island = {
            {0, 1}
        };
        int actual = ExplorerSearch.reachableArea(island);
        assertEquals(2, actual);
    }
}
