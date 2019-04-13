import java.util.*; 

public class ChandyHaasMisra {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int graph[][];
        boolean isDeadlock=false;
        System.out.println("Enter the number of processes");
        int n=sc.nextInt();
        graph=new int[n][n];
        System.out.println("Enter the wait for graph:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=sc.nextInt();
            }
        }
        System.out.println("the wait for graph is:");
        new ChandyHaasMisra().Display(graph);
        System.out.println("Enter the process initiating probe");
        int init=sc.nextInt();
        System.out.println("Initiating probe...");
        List<Message> mess_list=new ArrayList<Message>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {   
                if(graph[i][j]==1)
                {
                    Message m=new Message(init,i,j);
                    mess_list.add(m);
                    count+=1;
                }
            }
        }
        System.out.println(mess_list);  
        for(int i=0;i<count;i++)
        {
            for(int j=0;j<count;j++)
            {
                if(mess_list.get(i).initiator==mess_list.get(j).to)
                    isDeadlock=true;
            }
        }
        if(isDeadlock)
            System.out.println("The Deadlock has been detected...");
        else
            System.out.println("No Deadlock has been detected...");
       }
    void Display(int[][] mat)
    {
        int n=mat[0].length;
        int m=mat.length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
} 