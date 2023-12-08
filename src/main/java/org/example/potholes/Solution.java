package org.example.potholes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

  public int solution(String S, int B) {

    if (S == null || !validateStringS(S) || !validateBudget(B) || !validateStringLength(S)) {
      return 0;
    }

    List<Integer> potholesSegmentsList = getPotholesSegmentsList(S);

    return getPotholesFixed(potholesSegmentsList, B);
  }

  private static List<Integer> getPotholesSegmentsList(String S) {

    int length = S.length();
    int counter = 0;
    List<Integer> counters = new ArrayList<>();

    for (int i = 0; i < S.length(); i++) {
      char current = S.charAt(i);

      if (current == 'x' && (i == (length - 1))) {
        counter += 1;
        if (counter != 0) {
          counters.add(counter);
        }
      }

      if (current == 'x') {
        counter += 1;
      } else {
        if (counter != 0) {
          counters.add(counter);
        }
        counter = 0;
      }
    }
    Collections.sort(counters, (x, y) -> y - x);

    return counters;
  }

  public static boolean validateStringLength(String str) {
    int length = str.length();
    return length >= 1 && length <= 100000;
  }

  public static boolean validateBudget(int B) {
    return B >= 0 && B <= 200000;
  }

  public static boolean validateStringS(String S) {
    return S.matches("[x.]+");
  }

  private static int getPotholesFixed(List<Integer> potholesSegments, int budget) {

    int potholesFixed = 0;
    for (int potholes : potholesSegments) {

      if (budget == 0) {
        break;
      }

      if (budget > potholes) {
        potholesFixed += potholes;
        budget = budget - (potholes + 1);
      }

      if (budget <= potholes) {
        budget -= 1;
        potholesFixed += budget;
        budget = 0;
      }

    }
    return potholesFixed;
  }
  
  public static void main(String[] args) {
    Solution mySolution = new Solution();

    int a = mySolution.solution("..", 5);
    System.out.println("POTHOLES :: " + ".." + " BUDGET :: " + 5 + " ==> TOTAL FIXED HOLES :: " + a);

    int d = mySolution.solution("x.x.xxx...x", 14);
    System.out.println("POTHOLES :: " + "x.x.xxx...x" + " BUDGET :: " + 14 + " ==> TOTAL FIXED HOLES :: " + d);

    int b = mySolution.solution("..xxxxx", 4);
    System.out.println("POTHOLES :: " + "..xxxxx" + " BUDGET :: " + 4 + " ==> TOTAL FIXED HOLES :: " + b);

    int c = mySolution.solution("...xxx..x....xxx.", 7);
    System.out.println("POTHOLES :: " + "...xxx..x....xxx." + " BUDGET :: " + 7 + " ==> TOTAL FIXED HOLES :: " + c);
  }
}