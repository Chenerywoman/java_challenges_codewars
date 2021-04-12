package org.chenerywoman.dubstep;

import java.util.Arrays;
import java.util.StringJoiner;

public class DubStep {
    public static String SongDecoder (String song)
    {
        String withoutWubs = song.replaceAll("WUB", " ").trim();
        String removeExtraSpaces = withoutWubs.replaceAll("\\s+", " ");

        return removeExtraSpaces;
    }
}
