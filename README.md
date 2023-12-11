# POTHOLES

You are given a task to fix potholes in a road. The road is described by a string S consisting of N characters. Each character represents a single fragment of the road.
Character '' denotes a smooth surface and 'x' denotes a pothole. For example, S = "
"...xxxx" means that the road starts with three smooth fragments, followed by three
potholes, followed by two smooth fragments and ending with one pothole.
You can choose any number of consecutive potholes and fix all of them. Fixing a segment consisting of K consecutive potholes costs K + 1. In the example above, fixing the
first two consecutive potholes costs 2 + 1 = 3 and fixing the last pothole costs 1 + 1 = 2. After these fixes, the road would look like this: "
.....х..."
You are given a budget B. You can fix multiple segments containing potholes as long as you fit in the budget. What is the maximum number of potholes you can fix?
Write a function:
class Solution { public int solution(String S, int B); }
that, given the string S of length N and the integer B, returns the maximum number of potholes that can be fixed.
Examples:
1. Given S = "
"...xx....xxx." and B = 7, the function should return 5. You can start by fixing the first three consecutive potholes for a cost of 4, obtaining the road:
xxx". Then, you can fix the last two potholes for a cost of 3, obtaining the road:"
'.............". The total cost is 7, which fits in the budget, and you fix 5 potholes in
total.
2. Given S = "xxxxx" and B = 4, the function should return 3. One way is to fix the middle three potholes, which costs the whole budget and makes the road look as follows:
"x..". Alternatively, you could fix the first three potholes or the last three potholes.
3. Given S = "x.x.xxx..." and B = 14, the function should return 6. You can fix all the potholes, which costs 2 + 2 + 4 + 2 = 10, leaving you with the spare budget of 4. This
fixes the entire road.
4. Given S = "." and B = 5, the function should return 0. There are no potholes to fix.
Write an efficient algorithm for the following assumptions:
• N is an integer within the range [1.100,000];
• B is an integer within the range [0.200,000;
• string S consists only of characters ' and 'x'.





# LETTERS
You are given a string letters made of N English letters. Count the number of different letters that appear in both uppercase and lowercase where all lowercase occurrences of the given letter appear before any uppercase occurrence.
For example, for letters = "aaAbcCABBc" the answer is 2. The condition is met for letters 'a' and 'b', but not for 'c'.
Write a function:
class Solution { public int solution(String letters);}
that, given a string letters, returns the number of different letters fulfilling the conditions above.
Examples:
1. Given letters = "aaAbcCABBc", the function should return 2, as explained above.
2. Given letters = "xyzXYZabcABC", the function should return 6.
3. Given letters = "ABCabcAefG", the function should return 0.
Write an efficient algorithm for the following assumptions:
• N is an integer within the range [1.. 100,000];
• string letters is made only of letters (a-z and/or A-Z).
