package problem_2;

public class Stack {

    private char[] array;
    private int top;

    public Stack(int size){

        array = new char[size];
        top = -1;
    }

    public void push(char ch){

        array[++top] = ch;
    }

    public char pop(){
        return array[top--];
    }

    public char peek(){
        return array[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }

}
