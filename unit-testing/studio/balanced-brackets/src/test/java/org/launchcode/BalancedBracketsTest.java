package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void charactersInBracketReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[abc]"));
    }

    @Test
    public void onlyOneBracketAndCharacterReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[f"));
    }

    @Test
    public void onlyOneBracketOntPlusOneCharacterEqualsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("f]"));
    }

    @Test
    public void tooManyBracketsOnRightSideIsFalse (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }

    @Test
    public void ManyBracketsOnLeftSideIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]]"));
    }

    @Test
    public void ReturnsTrueBecauseOfEvenAmountOfBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void noClosingBracketsSoItReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[abc"));
    }

    @Test
    public void bracketsAreNotFacingzEachOtherSoIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void charactersWithNonClosingBracketsAreFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]abc["));
    }

    @Test
    public void twoBalancedBracketsAndAnUnclosedOneIsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][]]"));
    }

    @Test
    public void woBracketsWithSteingAndUnclosedBracketsReturnsFalse (){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][TwoTwo]]"));
    }

}


