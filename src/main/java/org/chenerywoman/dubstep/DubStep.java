package org.chenerywoman.dubstep;

import java.util.Arrays;
import java.util.StringJoiner;

public class DubStep {
    public static String SongDecoder (String song)
    {
        String withoutWubs = song.replaceAll("WUB", " ").trim();
        String[] arr = withoutWubs.split(" ");
        StringJoiner joiner = new StringJoiner("");

        for(int i = 0; i < arr.length; i++) {

            if (arr[i] != " "){
                joiner.add(arr[i]);
            }
        }

        return  joiner.toString();
    }
}
