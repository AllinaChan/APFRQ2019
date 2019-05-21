import javafx.scene.effect.Light;

public class LightBoardRunner {
    public static void main(String[] args){
        LightBoard sim = new LightBoard(7,5);
        System.out.println(sim);
        if(sim.evaluateLight(0,3)) System.out.println("TEST 1 TRUE");
        if(sim.evaluateLight(6,0)) System.out.println("TEST 2 TRUE");
        if(sim.evaluateLight(4,1)) System.out.println("TEST 3 TRUE");
        if(sim.evaluateLight(5,4)) System.out.println("TEST 4 TRUE");

    }
}
