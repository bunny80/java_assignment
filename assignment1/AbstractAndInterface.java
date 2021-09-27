interface SuperHero {
	void behavior();
	void sex();
	void stream();
    void age();
}
abstract class Marvel implements SuperHero {
    public void stream(){
        System.out.println("Marvel Hero");
    }
}
abstract class DC implements SuperHero {
    public void stream(){
        System.out.println("DC Hero");
    }
}
class IronMan extends Marvel
{
    public void behavior(){
        System.out.println("Arrogant");
    }
    public void sex(){
        System.out.println("Male");
    }
    public void age(){
        System.out.println("40\n");
    }
    IronMan(){
        stream();
        behavior();
        sex();
        age();
    }
}
class BatMan extends DC
{
    public void behavior(){
        System.out.println("Violent");
    }
    public void sex(){
        System.out.println("Male");
    }
    public void age(){
        System.out.println("30\n");
    }
    BatMan(){
        stream();
        behavior();
        sex();
        age();
    }
}
class AbstractAndInterface
{
    public static void main(String[] args) {
        SuperHero hero=new IronMan();
        SuperHero hero2=new BatMan();
        
    }
}
