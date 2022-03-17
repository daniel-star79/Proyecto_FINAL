import org.testng.annotations.Test;

public class TestCine {

    @Test
    public void TestCine(){
        Sala sala = new Sala("A",100);
        System.out.println(sala.CrearAsientos());
    }
}
