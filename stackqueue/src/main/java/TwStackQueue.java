import java.util.Stack;

public class TwStackQueue {
    private Stack<String> pushStack;

    private Stack<String> popStack;

    public void add(String value){
        if(pushStack.isEmpty() && popStack.isEmpty()){
            popStack.push(value);
        }else if(popStack.isEmpty()){
            while(!pushStack.isEmpty()){
                popStack.push(pushStack.pop());
            }
        }
    }

    public String pop(){
        if(popStack.isEmpty())
            throw new RuntimeException("");
        else
            return popStack.pop();
    }

    public String peek(){
        if(popStack.isEmpty())
            throw new RuntimeException("");
        else
            return popStack.peek();
    }

}
