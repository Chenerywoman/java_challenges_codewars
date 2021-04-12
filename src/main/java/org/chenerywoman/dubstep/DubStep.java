package org.chenerywoman.dubstep;

public class DubStep {
    public static String SongDecoder (String song)
    {

        return song.replace("WUB", " ").trim().replaceAll("\\s+", " ");
    }
}
