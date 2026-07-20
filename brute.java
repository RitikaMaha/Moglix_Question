class brute {

    public int longestValidParenthesesSubstring(String s) {

        int maxLength = 0; 
        for (int i = 0; i < s.length(); i++) {

            int balance = 0; 
            for (int j = i; j < s.length(); j++) {

                if (s.charAt(j) == '(') {
                    balance++;      
                } else {
                    balance--;     
                }
                if (balance < 0) {
                    break;
                }
                if (balance == 0) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        brute sol = new brute();
        System.out.println(sol.longestValidParenthesesSubstring("(()())"));
    }
}