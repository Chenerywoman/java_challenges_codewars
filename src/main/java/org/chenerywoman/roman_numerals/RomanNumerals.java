package org.chenerywoman.roman_numerals;

/*

Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer. Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.

conversion.solution(1000); //should return "M"

Symbol    Value
I          1
V          5
X          10
L          50
C          100
D          500
M          1,000

Remember that there can't be more than 3 identical symbols in a row.
*/

public class RomanNumerals {

    public String convert(int n){

        String numeral = "";

        switch(n){
            case 1: numeral = "I";
                    break;
            case 5: numeral = "V";
                    break;
            case 10: numeral = "X";
                    break;
            case 50: numeral = "L";
                    break;
            case 100: numeral = "C";
                    break;
            case 500: numeral = "D";
                    break;
            case 1000: numeral = "M";
                    break;

        }
        return numeral;
    }
}
