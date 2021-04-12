package org.chenerywoman.winner;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WinnerTest {
        @Test
        public void basicTests() {
            Assert.assertEquals("Lew", Winner.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry"
                    , 5,
                    4), "Lew"));
            Assert.assertEquals("Harry", Winner.declareWinner(new Fighter("Lew", 10, 2),new Fighter(
                    "Harry",
                    5, 4), "Harry"));
            Assert.assertEquals("Harald", Winner.declareWinner(new Fighter("Harald", 20, 5), new Fighter(
                    "Harry", 5, 4), "Harry"));
            Assert.assertEquals("Harald", Winner.declareWinner(new Fighter("Harald", 20, 5), new Fighter(
                    "Harry", 5, 4), "Harald"));
            Assert.assertEquals("Harald", Winner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter(
                    "Harald", 20, 5), "Jerry"));
            Assert.assertEquals("Harald", Winner.declareWinner(new Fighter("Jerry", 30, 3), new Fighter(
                    "Harald", 20, 5), "Harald"));
        }
    }

