import java.io.BufferedReader;
import java.io.InputStreamReader;

public class dynamicQueue {

        public static class CustomQueue{

            int[] data;
            int front;
            int size;

            public CustomQueue(int cap){

                data = new int[cap];
                front = 0;
                size = 0;

            }

            void add(int val){

                if(size== data.length){

                    int[] newData = new int[2* data.length];
                    for(int i=0; i<size; i++){

                        int index = (front+i)% data.length;
                        newData[i] = data[index];

                    }
                    data = newData;
                    front = 0;
                    int rear = (front+size)%data.length;
                    data[rear] = val;

                } else {

                    int rear = (front+size)%data.length;
                    data[rear] = val;

                }
                size++;
            }

            int remove(){

                if(size==0){

                    System.out.println("Queue Underflow");
                    return -1;

                } else {

                    int val = data[front];
                    front = (front+1)%data.length;
                    size--;
                    return val;

                }

            }

            int peek(){

                if(size==0){

                    System.out.println("Queue Underflow");
                    return -1;

                } else {

                    return data[front];
                }

            }

            int size(){

                return size;

            }

            void display(){

                for(int i=0; i<size; i++){

                    int index = (front+i)% data.length;
                    System.out.print(data[index]+" ");

                }

                System.out.println();

            }
        }

        public static void main(String[] args) throws Exception{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            CustomQueue queue = new CustomQueue(n);
            String str = br.readLine();

            while(!str.equals("quit")){

                if(str.startsWith("add")){

                    int val = Integer.parseInt(str.split(" ")[1]);
                    queue.add(val);

                } else if(str.startsWith("remove")){

                    int val = queue.remove();
                    if(val!=-1){
                        System.out.println(val);
                    }

                } else if(str.startsWith("peek")){

                    int val = queue.peek();
                    if(val!=-1){
                        System.out.println(val);
                    }

                } else if(str.startsWith("size")){

                    System.out.println(queue.size());

                } else if(str.startsWith("display")){

                    queue.display();

                }

                str = br.readLine();

            }
        }
}
