public class Main {
    public static void main(String[] args) {
        
        LightBoard board1 = new LightBoard(3, 4);
        
       
        LightBoard sim = new LightBoard(7, 5);
        boolean[][] pattern = {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, false, false, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, true, false, true, true},
            {false, false, false, false, false}
        };
        sim.setLights(pattern);
        
        
        boolean result1 = sim.evaluateLight(0, 3);
        boolean result2 = sim.evaluateLight(6, 0);
        boolean result3 = sim.evaluateLight(4, 1);
        boolean result4 = sim.evaluateLight(5, 4);
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
