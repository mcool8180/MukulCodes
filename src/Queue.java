public class Queue {
    int queue[]=new int[100];      //created array of size 100
    int size;                      //initialize variable size
    int front;                     //front points to front element in the queue
    int rear;                      //rear points to last element in the queue
    int count;

    public void enQueue(int data){          //enqueue method to add element in queue
        queue[rear]=data;                   //queue is pointing to rear
        rear=rear +1;                       //rear is incrementing
        size=size+1;                        //after adding one element , size is increased

    }
    public int deQueue(){                   //dequeue method to remove element in queue
        int data=queue[front];
        front=front+1;
        size=size -1;
        return data;
    }
    public int size(){
        {
            if (front == rear) {
                System.out.println("Empty queue\n");
                return 0;
            }

            else{
                for (int i=front;i<rear;i++){
                    count= count+1;
                }
                return count;
            }
        }

    }
    public void show() {
        System.out.println("element : ");
        for (int i = 0; i < size; i++) {
            System.out.println(queue[front + i] + "");
        }
    }
        public static void main (String args[]){
            Queue q = new Queue();
            //object created
            q.enQueue(1);                                //calling object
            q.enQueue(2);
            q.enQueue(3);
            q.enQueue(4);
            q.enQueue(5);
            q.enQueue(6);
            q.enQueue(7);
            q.enQueue(8);
            q.enQueue(9);
            q.enQueue(10);


            System.out.println("dequeue element is :" +q.deQueue());   //showing dequeue element
            System.out.println("dequeue element is :" +q.deQueue());
            System.out.println("dequeue element is :" +q.deQueue());
            q.show();
            System.out.println("size of queue is :" + q.size());           // showing size after dequeue...
        }

}
