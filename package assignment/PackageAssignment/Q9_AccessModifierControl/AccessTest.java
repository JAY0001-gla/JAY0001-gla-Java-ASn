import com.access.one.Base;
import com.access.two.Derived;
public class AccessTest {
    public static void main(String[] args){
        Base b = new Base();
        b.publicMethod();
        b.callAll();
        Derived d = new Derived();
        d.testAccess();
    }
}
