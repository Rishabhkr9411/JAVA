import java.util.ArrayList;

public class recursion {
    public static void main(String[] args) {
        print(1);
        // print1(1);
    }

    static void print(int n) {
        if (n == 5) {// base condition--condition where our recursion will stop making new calls
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n + 1);// this is tail recursion bcz its the last
    }

    // without recursion
    static void print1(int n) {
        System.out.println(n);
        print2(2);

    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    static void print5(int n) {
        System.out.println(n);
    }
}

class fibo {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);// this is not tail functon call
    }
}

class Nto1 {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        fun(n - 1);
    }
}

class fact {
    public static void main(String[] args) {
        // fun(4);
        System.out.println(fun(5));
    }

    static int fun(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fun(n - 1);
    }
}

class sumofDigits {
    public static void main(String[] args) {
        int ans = sum(1342);
        System.out.println(ans);
        System.out.println(product(1342));
    }

    static int sum(int n) {
        // int a = 0;
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) + sum(n / 10);
    }

    static int product(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * product(n / 10);
    }
}

// n-- vs --n are two different concept
// --n subtract first then pass the value
class reverseAno {
    static int sum = 0;

    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);
    }
}

// important important count zeroes in the number
// special example to return same value to above function call
class countZeroes {
    public static void main(String[] args) {
        System.out.println(helper(30204, 0));
        System.out.println(count(2340400));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}

class sorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 17, 8, 9 };
        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}

class lSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 43, 2, 2, 54, 66, 2, 0 };
        int ans = findIndexLast(arr, 2, arr.length - 1);
        System.out.println(ans);
        System.out.println(find(arr, 2, 0));
        findAll(arr, 2, 0);
        System.out.println(list);
        // ArrayList<Integer> ans1=findAllIndex(arr, 2, 0, new ArrayList<>())

        // System.out.println(ans1);
        System.out.println(findAllIndex(arr, 2, 0, new ArrayList<>()));
        System.out.println(findllIndex2(arr, 2, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAll(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        findAll(arr, target, index + 1);

    }

    // use this
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

    /*
     * goal :return the list
     * don't take it in argument
     * challenges : return type is arraylist . problem is that every arraylist will
     * have a new list
     */
    // not preferable to use always
    static ArrayList<Integer> findllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowcalls = findllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowcalls);

        return list;
    }
}

class RBS {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println(search(arr, 2, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }
        return search(arr, target, s, m - 1);
    }
}

// lect 3 patttern questions
class trianglePatt {
    public static void main(String[] args) {
        triangle(4, 0);
        triangle2(4, 0);
    }

    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);

        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("*");

        } else {
            triangle2(r - 1, 0);
            System.out.println();

        }
    }
}

class leetcodeQuestion {
    public static void main(String[] args) {
        int[] arr = { 100, 1, 1, 1, 1, 100, 1, 1, 100, 1 };
        int ans1 = minCost1(arr, 0);
        int ans2 = minCost1(arr, 1);
        // int ans=0;int answer=0;
        if (ans1 < ans2) {
            System.out.println(ans1);
        } else {
            System.out.println(ans2);
        }

    }

    static int minCost1(int[] cost, int i) {
        int ans = 0;
        if (cost.length < 3) {
            if (cost[0] < cost[1]) {
                return cost[0];
            } else {
                return cost[1];
            }
        } else if (cost.length == 3) {
            return cost[1];
        } else {
            while (i < cost.length) {
                if (cost[i + 1] < cost[i + 2]) {
                    ans += cost[i + 1];
                    i += 1;
                } else if (cost[i + 1] >= cost[i + 2]) {
                    ans += cost[i + 2];
                    i += 2;
                } else if (i == cost.length - 1) {
                    return ans;
                }
            }
        }
        return ans;
    }
}