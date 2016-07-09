public class Circular_or_not 
{
    public static void main(String[] args) 
    {
        
        try
        {
            LinkedListNode[] nodes = new LinkedListNode[10];            
            for (int i = 0; i < 10; i++) 
            {
                nodes[i] = new LinkedListNode(i, null, i > 0 ? nodes[i - 1] : null);
            }

           
            Boolean abc= Check_Circular(nodes[0]);
            System.out.print(abc);
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException caught");
        }

    }

    public static boolean Check_Circular(LinkedListNode head) 
    {       
            LinkedListNode n1 = head;
            LinkedListNode n2 = head; 

           
            while (n2.next != null)
            { 
                n1 = n1.next; 
                n2 = n2.next.next; 
                if (n1 == n2) 
                { 
                    return true;
                }
            }
            return false;
    }

}