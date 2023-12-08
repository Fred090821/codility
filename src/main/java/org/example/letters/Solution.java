package org.example.letters;

import java.util.HashSet;
import java.util.Set;

class Solution {

  public int solution(String letters) {

    Set<Character> lowerCaseSet = new HashSet<>();
    Set<Character> upperCaseSet = new HashSet<>();
    int count = 0;

    if (letters == null || !letters.matches("^[a-zA-Z]*$") || letters.length() < 1 || letters.length() > 100000) {
      return count;
    }

    for (char c : letters.toCharArray()) {

      if (Character.isLowerCase(c)) {
        if (upperCaseSet.contains(Character.toUpperCase(c)) && lowerCaseSet.contains(Character.toLowerCase(c))) {
          count = count - 1;
        }
        if (!upperCaseSet.contains(Character.toUpperCase(c))) {
          lowerCaseSet.add(c);
        }
      } else {
        if (Character.isUpperCase(c) && lowerCaseSet.contains(Character.toLowerCase(c)) && upperCaseSet.add(c)) {
          count = count + 1;
        } else if (Character.isUpperCase(c)) {
          upperCaseSet.add(c);
        }

      }
    }
    return count > 0 ? count : 0;
  }

  public static void main(String[] args) {

    String letters11 = "aaAbcCABBc";
    String letters22 = "xyzXYZabcABC";
    String letters33 = "ABCabcAefG";

    String letter = " "; // Expected output: 0
    String letters = null; // Expected output: 0
    String letters1 = ""; // Expected output: 0
    String letters2 = "aA"; // Expected output: 1
    String letters3 = "aA"; // Expected output: 1
    String letters4 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Expected output: 0
    String letters5 = "aAabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Expected output: 1
    String letters6 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"; // Expected output: 0
    String letters7 = "abcdefghijklmnopqrstuvwxyzABCDEFGH-IJKLMNOPQRSTUVWXYZ"; // Expected output: 0

    Solution mySolution= new Solution();
    System.out.println(mySolution.solution(letters4));
  }

}