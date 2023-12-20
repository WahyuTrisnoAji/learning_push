package javafol;

interface StackADT {
    void push(int element);

    int pop();

    int peek();

    Boolean isEmpety();

    int size();

    class Stack implements StackADT {
        private static final int MAX_SIZE = 100;
        private int[] StackArray;
        private int top;

        public Stack() {
            StackArray = new int[MAX_SIZE];
            top = -1;
        }

        public void push(int element) {
            if (top < MAX_SIZE - 1) {
                StackArray[++top] = element;
                System.out.println("pushed: " + element);

            } else {
                System.out.println("Stack is full. Cannot push " + element);

            }

        }

        public int pop() {
            if (top >= 0) {
                int popped = StackArray[top--];
                System.out.println("popped: " + popped);
                return popped;

            } else {
                System.out.println("Stack is empty. Cannot pop");
                return -1;

            }
        }

        public int peek() {
            if (top >= 0) {
                return StackArray[top];

            } else {
                System.out.println("Stack is empty. Cannot peek");
                return -1;
            }
        }

        public Boolean isEmpety() {
            return top == -1;
        }

        public int size() {
            return top + 1;
        }
    }

    public class Adt {
        public static void main(String[] args) {
            StackADT stack = new Stack();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Size of stack " + stack.size());
            System.out.println("Top element " + stack.peek());

            stack.pop();
            System.out.println("Size of stack after pop: " + stack.size());
        }
    }
}
