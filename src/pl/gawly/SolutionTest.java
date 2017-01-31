package pl.gawly;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    public void testExample0() {
        Assert.assertEquals(1, s.solution(new int[]{3, 1, 2, 4, 3}));
    }

    @Test
    public void testMin() {
        Assert.assertEquals(2, s.solution(new int[]{3, 1}));
    }

    @Test
    public void testMax() {
        Assert.assertEquals(2000, s.solution(new int[]{-1000, 1000}));
    }
}
