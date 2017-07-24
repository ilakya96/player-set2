import java.util.*;
public class Rotate
{
public static void main(String arg[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter no");
  Integer value=sc.nextInt();
  List<Integer> list=new ArrayList<Integer>();
  System.out.println("enter array elements");
  for(int i=0;i<value;i++)
  {
   list.add(sc.nextInt());
  }
  System.out.println("enter k value");
  int k=sc.nextInt();
  Collections.rotate(list,k);
  System.out.println(Arrays.toString(list.toArray()));
 }
}
