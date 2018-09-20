import java.util.Stack;

public class GetMInStack {
/*
  * 实现一个特殊的栈，在实现栈的基本功能之上，再实现返回栈中最小元素的操作，
  * 要求pop push getMin的时间复杂度都是O(1)
  * 设计的栈是可以使用现成的栈结构
  * */



}

class Stack1{
    private Stack<Integer> valueStack;
    private Stack<Integer> minStack;

    public Stack1(Stack<Integer> valueStack, Stack<Integer> minStack) {
        this.valueStack = valueStack;
        this.minStack = minStack;
    }

    public void push(Integer value){
        if(minStack.isEmpty()){
            minStack.push(value);

        }else {
            if(minStack.peek() >= value){
                minStack.push(value);
            }
        }
        valueStack.push(value);
    }

    public Integer pop(){
        if(valueStack.isEmpty()){
            throw new RuntimeException("");
        }
        int value = valueStack.pop();
        if(value == minStack.peek()){
            minStack.pop();
        }
        return value;
    }

    public Integer getMin(){
        if(minStack.isEmpty()){
            throw new RuntimeException("");
        }
        return minStack.peek();

    }
}


class Stack2{
    private Stack<Integer> valueStack;
    private Stack<Integer> minStack;

    public void push(Integer value){
        if(minStack.isEmpty())
            minStack.push(value);
        else{
            if(value >= minStack.peek()){
                minStack.push(minStack.peek());
            }else{
                minStack.push(value);
            }
        }
        valueStack.push(value);

    }

    public Integer pop(){
        if(valueStack.isEmpty())
            throw new RuntimeException("");
        minStack.pop();
        return valueStack.pop();
    }

    public Integer getMin(){
        if(minStack.isEmpty())
            throw new RuntimeException("");
        return  minStack.peek();
    }
}