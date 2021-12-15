package ru.vsu.cs.maslovaei;

public class TestProgram {
    TestCase testCase = new TestCase();
    Solution solution = new Solution();

    public boolean tests(){
        if(solution.findQuantityOfElements(testCase.array1) !=4) {
            System.out.println("Test 1 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array2) !=3) {
            System.out.println("Test 2 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array3) !=4) {
            System.out.println("Test 3 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array4) !=5) {
            System.out.println("Test 4 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array5) !=4) {
            System.out.println("Test 5 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array6) !=4) {
            System.out.println("Test 6 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array7) !=3) {
            System.out.println("Test 7 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array8) !=1) {
            System.out.println("Test 8 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array9) !=3) {
            System.out.println("Test 9 is not completed");
            return false;
        } else if (solution.findQuantityOfElements(testCase.array10) !=3) {
            System.out.println("Test 10 is not completed");
            return false;
        } else {
            return true;
        }
    }
}
