package code;

public class ImplementStackUsingQueues_225 {
    class MyStack {
        Deque<Integer> queue = new ArrayDeque<>();
        Integer last;

        public MyStack() {
            this.last = null;
        }

        public void push(int x) {
            queue.offerLast(x);
            last = x;
        }

        public int pop() {
            if (queue.isEmpty()) {
                return -1;
            }
            if (queue.size() == 1) {
                last = null;
                return queue.removeFirst();
            }
            Deque<Integer> copyQueue = new ArrayDeque<>();
            while (queue.size() != 1) {
                if (queue.size() == 2) {
                    last = queue.removeFirst();
                    copyQueue.offerLast(last);
                    continue;
                }
                copyQueue.offerLast(queue.removeFirst());
            }
            Integer i = queue.removeFirst();
            queue = copyQueue;
            return i;
        }

        public int top() {
            return last;
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
