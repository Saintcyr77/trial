import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class houseRobberTest{
    houseRobber r = new houseRobber();
        @Test
        void main() {

            Assertions.assertEquals(13, houseRobber.a());
        }


    @org.junit.jupiter.api.Test
    void testMain() {
            Assertions.assertEquals(13, r.a());

    }


}