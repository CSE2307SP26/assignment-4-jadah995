package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    // 1. Spellchecker should tell how many words it knows
    @Test
    void test() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(0, words);
    } 
   
    // 2. new word increases the count
    @Test
    void testAddWordIncreasesCount() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("cat");
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(1, words);
    }

    // 3. Adding dupe word does not increase count
    @Test
    void testDuplicateWord() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("cat");
        checker.addWord("cat");
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(1, words);
    }

    // 4. Correctly spelled word returns true
    @Test
    void testcorrect() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("dog");
        boolean result = checker.isSpelledCorrectly("dog");

        // 3. Use assertions to validate
        assertTrue(result);
    }

    // 5. Improperly spelled word returns false
    @Test
    void testImproperlySpelledWord() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("dog");
        boolean result = checker.isSpelledCorrectly("doog");

        // 3. Use assertions to validate
        assertFalse(result);
    }

    // 6. Spellchecker ignores case
    @Test
    void testIgnoreCase() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("cat");
        boolean result = checker.isSpelledCorrectly("CaT");

        // 3. Use assertions to validate
        assertTrue(result);
    }

    // 7. Suggest closest alphabetical word
    @Test
    void testSuggestClosestWord() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("bank");
        String suggestion = checker.suggestWord("bamk");

        // 3. Use assertions to validate
        assertEquals("bank", suggestion);
    }

    // 8. returns same word if already correct
    @Test
    void testSuggestAlreadyCorrectWord() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("zebra");
        String suggestion = checker.suggestWord("zebra");

        // 3. Use assertions to validate
        assertEquals("zebra", suggestion);
    }

    // 9. diff case does not duplicate
    @Test
    void testNoDuplicate() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("cat");
        checker.addWord("CAT");
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(1, words);
    }

    // 10. Ignore empty words
    @Test
    void testIgnoreWords() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("");
        checker.addWord("   ");
        int words = checker.getNumberOfWords();

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    // 1. Spellchecker should tell how many words it knows
    @Test
    void test() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(0, words);
    } 
   
    // 2. new word increases the count
    @Test
    void testAddWordIncreasesCount() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("cat");
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(1, words);
    }

    // 3. Adding dupe word does not increase count
    @Test
    void testDuplicateWord() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("cat");
        checker.addWord("cat");
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(1, words);
    }

    // 4. Correctly spelled word returns true
    @Test
    void testcorrect() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("dog");
        boolean result = checker.isSpelledCorrectly("dog");

        // 3. Use assertions to validate
        assertTrue(result);
    }

    // 5. Improperly spelled word returns false
    @Test
    void testImproperlySpelledWord() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("dog");
        boolean result = checker.isSpelledCorrectly("doog");

        // 3. Use assertions to validate
        assertFalse(result);
    }

    // 6. Spellchecker ignores case
    @Test
    void testIgnoreCase() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("cat");
        boolean result = checker.isSpelledCorrectly("CaT");

        // 3. Use assertions to validate
        assertTrue(result);
    }

    // 7. Suggest closest alphabetical word
    @Test
    void testSuggestClosestWord() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("bank");
        String suggestion = checker.suggestWord("bamk");

        // 3. Use assertions to validate
        assertEquals("bank", suggestion);
    }

    // 8. returns same word if already correct
    @Test
    void testSuggestAlreadyCorrectWord() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("zebra");
        String suggestion = checker.suggestWord("zebra");

        // 3. Use assertions to validate
        assertEquals("zebra", suggestion);
    }

    // 9. diff case does not duplicate
    @Test
    void testNoDuplicate() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("cat");
        checker.addWord("CAT");
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(1, words);
    }

    // 10. Ignore empty words
    @Test
    void testIgnoreWords() {

        // 1. Create the object to be tested
        SpellChecker checker = new SpellChecker();

        // 2. Call the method being tested
        checker.addWord("");
        checker.addWord("   ");
        int words = checker.getNumberOfWords();

        // 3. Use assertions to validate
        assertEquals(0, words);
    }


