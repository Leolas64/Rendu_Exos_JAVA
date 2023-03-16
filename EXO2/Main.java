package EXO2;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String strTrue = "([<abcdefg>])";
        String strFalse = "(<[abcdefg])>";
        checkValue(strTrue);
        checkValue(strFalse);
    }
    public static void checkValue(String str){
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            String cara= str.substring(i,i+1);
            if(cara.contentEquals("<")){
                stack.push(">");
            } else if (cara.contentEquals("(")) {
                stack.push(")");
            } else if (cara.contentEquals("[")) {
                stack.push("]");
            }
            if(!stack.isEmpty()) {
                if (cara.contentEquals(stack.peek())) {
                    stack.pop();
                } else if (cara.contentEquals("]") || cara.contentEquals(")") || cara.contentEquals(">")) {
                    break;
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valide");
        }else{
            System.out.println("Invalide");
        }
    }
}
