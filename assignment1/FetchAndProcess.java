class fetchData extends Thread{
    public void show(){
        for(int i=0;i<=3;i++)
        {
            System.out.println("Fetch Data");
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
};
class processData implements Runnable{
    public void run(){
        for(int i=0;i<=3;i++)
        {
            System.out.println("Process Data");
            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
};
public class FetchAndProcess {
    public static void main(String[] args) {
        fetchData obj=new fetchData();
        processData obj1=new processData();
        obj.show();
        obj1.run();
    }
}