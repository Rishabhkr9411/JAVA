
public class preetyPrinting {
    public static void main(String[] args) {
        // place holder
        // float c = 453.234f;
        // System.out.printf("formatted number is %.2f", a);
        // System.out.printf("Pie:%.3f", Math.PI);
        // System.out.println('a' + 'b');
        // System.out.println("a" + 1);// integer will be converted to integer that will
        // call to String()
        // // this is same as after a few steps:"a"+"1"
        // System.out.println("rishabh" + new ArrayList<>());
        String name = "Rishabh Kumar is a good boy@$_";
        // System.out.println(Arrays.toString(name.toCharArray()));
        // System.out.println(name.toLowerCase());
        // System.out.println(name);
        // System.out.println(name.indexOf('i'));
        // System.out.println(" Rishabh ".strip());
        // System.out.println(Arrays.toString(name.split("name")));
        String name1 = name.replaceAll("[^a-z0-9A-Z]", "ram");
        name = name.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(name1);
        System.out.println(name);

    }
}

class palindrom {
    public static void main(String[] args) {
        String str = "abssba";
        System.out.println(isPalindrone(str));

    }

    static boolean isPalindrone(String str) {
        str = str.toLowerCase();
        if (str == null || str.length() == 0) {
            return true;
        }
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}

class shuffle {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(restoringString(s, indices));
    }

    static String restoringString(String s, int[] indices) {
        String s4 = "";
        for (int i = 0; i < indices.length; i++) {
            char s1 = s.charAt(find(indices, i));
            // char s2 = s.charAt(indices[1]);
            s4 = s4 + "" + s1;
        }
        // String s3 = s1 + "" + s2;
        return s4;

    }

    static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}