import java.util.Stack;
public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int number){
        stack1.push(number);
        System.out.println(stack1.peek());
    }

    public int dequeue(){
      if(stack2.isEmpty()){
          while(!stack1.isEmpty()){
              stack2.push(stack1.pop());
          }
      }
        return stack2.isEmpty() ? -1:stack2.pop();
    }



    public static void main(String[] args) {
    QueueUsingStack queue1 = new QueueUsingStack();
        queue1.enqueue(10); // output - 10
        queue1.enqueue(5); // output - 5
        queue1.enqueue(7);// output - 7
        System.out.println(queue1.dequeue());// output - 10
        queue1.enqueue(9);// output - 9
        System.out.println(queue1.dequeue());// output - 5


    }

}

