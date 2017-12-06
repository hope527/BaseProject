
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangalTest {
    @Test
    public void getType() throws Exception {
        Triangal tringal = new Triangal(5 , 10, 5);

        String result = tringal.getType();

        Assert.assertEquals("不是三角形",result);
    }

}
