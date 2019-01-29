package problem_2;

public class BracketsChecker {

    public static boolean check(String str){

        int size = str.length();
        Stack stack = new Stack(size);

        for(int i=0; i < size; i++){

            char ch = str.charAt(i);
            switch (ch){
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case ']':
                case ')':
                    if(!stack.isEmpty()){

                        char chx = stack.pop();
                        if (chx=='[' && ch != ']' ||
                                chx == '(' && ch != ')')
                        {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
                default:
                    break;
            }

        }
        if(!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
