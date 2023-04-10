public class printll {

        int data;
        Nodes next;
        Nodes  (int data){
            this.data= data;
            next = null;

        }

        public static void main(String[] args) {
            Nodes node1= new Nodes(10);
            Nodes node2= new Nodes(20);
            Nodes node3= new Nodes(30);
            Nodes node4= new Nodes(40);
            node1.next=node2;
            node2.next=node3;
            node3.next=node4;
            Nodes head = node1;

            while(head != null){
                System.out.println(head.data );
                head = head.next;
            }


        }
    }



