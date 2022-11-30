public class exampleeeese {
    public static void main(String[] args) {
        String backet = "(()()()()(";
        System.out.println(balancedBacket(backet));
    }

    public static String balancedBacket(String s) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0)
                    continue;
                count--;
            }
            sb.append(c);
        }

        StringBuilder result = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && count-- > 0) {
                continue;
            }
            result.append(sb.charAt(i));
        }

        if (result.length() == 0) {
            return result.append("0").toString();
        }

        return result.reverse().toString();
    }
}
