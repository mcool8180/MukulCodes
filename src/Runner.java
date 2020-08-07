public class Runner {

    public static void main(String args[]){
        Queue q= new Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(8);
        //q.deQueue();
        //System.out.println("dequeue eleme="+q.deQueue());
        q.show();
        System.out.println("size of queue is :" +q.size);
    }
}

