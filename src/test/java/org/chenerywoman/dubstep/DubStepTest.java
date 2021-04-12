package org.chenerywoman.dubstep;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DubStepTest  {
    @Test
    public void Test1() {
        assertEquals("ABC", new DubStep().SongDecoder("WUBWUBABCWUB"));
    }
    @Test
    public void Test2()
    {
        assertEquals("R L", new DubStep().SongDecoder("RWUBWUBWUBLWUB"));
    }
}