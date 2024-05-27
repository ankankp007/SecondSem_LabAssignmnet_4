import java.util.Scanner;
class Node
{
	protected int redg_no;
	protected float mark;
	protected Node next;
}
class SingleLinkedList
{
	static Node start=null;
	
	public static void create()
	{
		Scanner sc=new Scanner(System.in);
		Node temp=new Node();
		System.out.println("Enter redgno and mark");
		temp.redg_no=sc.nextInt();
		temp.mark=sc.nextInt();
		temp.next=null;
		start=temp;
	    System.out.println("Do you want to continue?(0/1)");
	    int ch=sc.nextInt();
	    while(ch!=0)
	    {
	    	Node newnode=new Node();
	    	System.out.println("Enter redgno and mark");
	    	newnode.redg_no=sc.nextInt();
	    	newnode.mark=sc.nextInt();
                newnode.next=null;
	    	temp.next=newnode;
	    	temp=newnode;
	    	System.out.println("Do you want to continue?(0/1)");
	    	ch=sc.nextInt();
	    }
	}
	public static Node InsBeg()
	{		
		Scanner sc=new Scanner(System.in);
		Node newnode=new Node();
		newnode.next=start;
    	System.out.println("Enter redgno and mark");
    	newnode.redg_no=sc.nextInt();
    	newnode.mark=sc.nextInt();
    	return start=newnode;
	}
	public static void display()
	 {
		 System.out.println("=============================");
		 Node p=start;
                 if(p==null)
                 {
                     System.out.println("Create a node first");
                 }
                 else
                 {
		 while(p!=null)
		 {
			 System.out.println("Redgno: "+p.redg_no);
			 System.out.println("mark: "+p.mark);
			 p=p.next;
		 }
                 }
		 System.out.println("=============================");
	 
         }
	public static void InsEnd()
	 {
		    Scanner sc=new Scanner(System.in);
			Node newnode=new Node();
	    	System.out.println("Enter redgno and mark");
	    	newnode.redg_no=sc.nextInt();
	    	newnode.mark=sc.nextInt();
	    	Node p=start;
	    	while(p.next!=null)
	    	{
	    		p=p.next;
	    	}
	    	p.next=newnode;
	    	newnode.next=null;
	    	
	 }
	public static void InsAny()
	 {
		 Node p=start;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Position");
		 int pos=sc.nextInt();
		 for(int i=0;i<pos-1;i++)
		 {
			 p=p.next;
		 }
		 Node newnode=new Node();
		 System.out.println("Enter redgno and mark");
		 newnode.redg_no=sc.nextInt();
		 newnode.mark=sc.nextInt();	 
		 newnode.next=p.next;
		 p.next=newnode;
	 }
	public static void DelBeg()
	 {
		 start=start.next;
		 System.out.println("Deleted At Beg");
	 }
	public static void DelEnd()
	 {
		 Node p=start;
		 while(p.next.next!=null)
	      {
	    		p=p.next;
	      }
		 p.next=null;
		 System.out.println("Deleted At End");
	 }
	public static void DelAny()
	 {
		 Scanner sc=new Scanner(System.in);
		 Node p = start;
		 System.out.println("Enter Position");
		 int pos=sc.nextInt();
		 for(int i=0;i<pos-1;i++)
		 {
			 p=p.next;
		 }
		 p.next=p.next.next;
		 System.out.println("Delete Successful");
	 }
	public static void DelRedg()
	   {
                 int flag=0;
		 Scanner sc=new Scanner(System.in);
		 Node p=start;
		 System.out.println("Enter redg no");
		 int redgno=sc.nextInt();
                 while(p!=null)
		 {
                     if(p.redg_no==redgno)
                     {
                         flag=1;
                     }
			 p=p.next;
		 }
                 if(flag==0)
                 {
                     System.out.println("Redg no not found");
                 }
                 else
                 {
                 p=start;
		 while(p.next.redg_no!=redgno)
		 {
			 p=p.next;
		 }
		 p.next=p.next.next;
		 System.out.println("Node with Redg no "+redgno+" has been Deleted");
	         }
            }
        public static void search()
        {
                 int flag=0;
		 Scanner sc=new Scanner(System.in);
		 Node p=start;
		 System.out.println("Enter redg no");
		 int redgno=sc.nextInt();
                 if(start==null)
                 {
                    System.out.println("Create a node 1st");
                    return;
                 }
                 while(p!=null)
		 {
                     if(p.redg_no==redgno)
                     {
                         flag=1;
                     }
			 p=p.next;
		 }
                 if(flag==0)
                 {
                     System.out.println("Redg no not found");
                 }
                 else
                 {
                 p=start;
		 while(p.redg_no!=redgno)
		 {
			 p=p.next;
		 }
                 System.out.println("Enter updated mark");
		 p.mark=sc.nextInt();
		 System.out.println("Student's mark with Redg no "+redgno+" has been updated to "+p.mark);
                 }       
        }
        public static int count()
        {
            int count=0;
            Node p=start;
            if(start==null)
            {
                System.out.println("Node not created");
            }
            else
            {
               while(p!=null)
                {
                   p=p.next;
                   count++;	           
                }
              return count;
            }
            return 0;
        }
         public static void reverse()
         {
             Node p=null;
             Node q=start;
             Node r=q.next;
             q.next=null;
             while(r!=null)
             {
                 p=q;
                 q=r;
                 r=r.next;
                 q.next=p;
             }
             start=q;
         }
         public static void sort()
         {
            for(Node p=start;p!=null;p=p.next)
            {
                for(Node q=start;q!=null;q=q.next)
                {
                   if(p.mark>q.mark) 
                   {
                      float temp=p.mark;
                      p.mark=q.mark;
                      q.mark=temp;
                   }      
                }
            }
            System.out.println("Sorted");
         }        
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
    int ch;
	do 
	{
	  System.out.println("Enter Your Choice");
	  System.out.println("0.Exit \n1.creation \n2.insertion at begining \n3.Display \n4.insertion at end \n5.insert an any position \n6.Delete at begining"
	  		   + "\n7.Delete at End \n8.Delete at Any Position \n9.Delete by Redg No \n10.Update mark by Redg No. \n11.sorting \n12.Count \n13.Reverse");
	  ch=sc.nextInt();
	  switch(ch)
	  {
	     case 1:
		   create();
		   break;
	     case 2:
		   InsBeg();
		   break;
	     case 3:
		   display();
		   break;
	     case 4:
		InsEnd();
		break;
	     case 5:
	    	 InsAny();
	    	 break;
	     case 6:
	    	 DelBeg();
	    	 break;
	     case 7:
	    	 DelEnd();
	    	 break;
	     case 8:
	    	 DelAny();
	    	 break;
	     case 9:
	    	 DelRedg();
	    	 break;
             case 10:
                 search();
                 break;
             case 11:
                 sort();
                 break;
             case 12:
                 int count=count();
                 if(count>=1)
                  System.out.println("Number of Nodes present: "+count);
                 break;
             case 13:
                 reverse();
                 break;
	  }
	}
	while(ch!=0);
}
}