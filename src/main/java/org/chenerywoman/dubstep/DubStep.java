package org.chenerywoman.dubstep;

import java.util.Arrays;
import java.util.StringJoiner;

public class DubStep {
    public static String SongDecoder (String song)
    {

        return song.replaceAll("WUB", " ").trim().replaceAll("\\s+", " ");
    }
}
