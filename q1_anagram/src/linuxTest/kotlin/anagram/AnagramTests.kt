package anagram

import kotlin.test.Test
import kotlin.test.assertFalse

class AnagramTests {
    @Test
    fun whenInputIsAnagramString_shouldReturnTrue() {
        assert(isAnagram("param", "raamp"))
    }

    @Test
    fun whenInputContainsMixCaseAnagramString_shouldReturnTrue() {
        assert(isAnagram("PaRAm", "rAaMp"))
    }

    @Test
    fun whenInputContainsNumberAnagramString_shouldReturnTrue() {
        assert(isAnagram("Pa18r", "1par8"))
    }

    @Test
    fun whenInputContainsEspecialCharAnagramString_shouldReturnTrue() {
        assert(isAnagram("q*&@#3", "&*@3q#"))
    }

    @Test
    fun whenInputStringsAreNotAnagram_shouldReturnFalse() {
        assertFalse(isAnagram("param", "para"))
    }
}