import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Todo {
   HashMap<Integer,String[]> todos = new HashMap<>();

   void add(int index,String[] todo){
       todos.put(index,todo);
   }

   HashMap<Integer,String[]> retrieve(){
       return todos;
   }

   void  delete(int index){
       todos.remove(index);
   }

   void update(int index,String[] todo){
       todos.replace(index,todo);
   }




    public static void main(String[] args) {
        Todo todo = new Todo();
        todo.add(1,new String[]{"DS assignemnt","false"});
        todo.add(2,new String[]{"Project work","false"});
        todo.add(3,new String[]{"Economics","false"});
        HashMap<Integer,String[]> todos =  todo.retrieve();
        System.out.println("#\t|Name\t|Completed");
        for(Map.Entry<Integer,String[]> i:todos.entrySet()){
            System.out.println(i.getKey() +":\t"+i.getValue()[0]+"\t"+i.getValue()[1]);
        }
        System.out.println("");
        System.out.println("After delete index 3");
        todo.delete(3);
        HashMap<Integer,String[]> todos1 =  todo.retrieve();
        System.out.println("#\t|Name\t|Completed");
        for(Map.Entry<Integer,String[]> i:todos1.entrySet()){
            System.out.println(i.getKey() +":\t"+i.getValue()[0]+"\t"+i.getValue()[1]);
        }

        System.out.println();
        System.out.println("After update index 1");
        todo.update(1,new String[]{"Java","false"});
        HashMap<Integer,String[]> todos3 =  todo.retrieve();
        System.out.println("#\t|Name\t|Completed");
        for(Map.Entry<Integer,String[]> i:todos3.entrySet()){
            System.out.println(i.getKey() +":\t"+i.getValue()[0]+"\t"+i.getValue()[1]);
        }

    }
}
