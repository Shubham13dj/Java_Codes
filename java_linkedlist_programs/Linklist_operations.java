public class Linklist_operations {
    node head;
    public class node{
        String data;
        node next;

        node(String data){
            this.data=data;
            this.next=null;
        }
    }
    // adding node at first position
    public void addfirst(String data){
        node newNode = new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addlast(String data){
        node newNode = new node(data);
        if(head==null){
            head=newNode;
            return;
        }
        node currNode=head;
        while(currNode.next!=null){
            currNode= currNode.next;
        }
        currNode.next=newNode;
    }
    public void printlist(){
        if(head==null){
           System.out.println("Link list is Empty");
            return;
        }
        node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode= currNode.next;
        }
        System.out.print("null");
        System.out.println();
    }
    
    public static void main(String args[]){
        Linklist_operations list = new Linklist_operations();
        list.addfirst("a");    
        list.addfirst("b");   
        list.printlist();  
        list.addlast("A"); 
        list.printlist();  

    }
}
