import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheLabyrinthOfTheMinotaurTest {
    private TheLabyrinthOfTheMinotaur labyrinthOfTheMinotaur = new TheLabyrinthOfTheMinotaur();

    @Test
    public void testSomething() {
        Assert.assertFalse("Test fall",TheLabyrinthOfTheMinotaur.winLose(-1, 10));
        Assert.assertTrue("Test fall",TheLabyrinthOfTheMinotaur.winLose(8, 10));
    }

}