package anagram

fun isAnagram(param1: String, param2: String): Boolean {
    val map = HashMap<Char, Int>()

    val string1 = param1.toLowerCase()
    val string2 = param2.toLowerCase()

    string1.forEach {
        if (!map.containsKey(it))
            map[it] = 1
        else
            map[it] = map[it]?.plus(1)!!
    }

    var isAnagram = true
    string2.forEach {
        if (!map.containsKey(it)) {
            isAnagram = false
            return@forEach
        }
        map[it] = map[it]?.minus(1)!!
    }

    if (!isAnagram) return false

    map.forEach {
        if (it.value != 0) {
            isAnagram = false
            return@forEach
        }
    }
    return isAnagram
}

fun main() {
}