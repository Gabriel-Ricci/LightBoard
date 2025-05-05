public class LightBoard {
    
    private boolean[][] lights;
    
    
    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                
                double rand = Math.random();
                
                
                if (rand < 0.4) {
                    lights[r][c] = true;
                }
            }
        }
    }
    
    
    public boolean evaluateLight(int row, int col) {
        
        boolean currentStatus = lights[row][col];
        
        
        int onCount = 0;
        for (int r = 0; r < lights.length; r++) {
            if (lights[r][col]) {
                onCount++;
            }
        }
        
        
        if (currentStatus) {
            
            if (onCount % 2 == 0) {
                return false;
            }
        } else {
            
            if (onCount % 3 == 0) {
                return true;
            }
        }
        
        
        return currentStatus;
    }
    
    
    public void setLights(boolean[][] pattern) {
        for (int r = 0; r < lights.length; r++) {
            for (int c = 0; c < lights[0].length; c++) {
                lights[r][c] = pattern[r][c];
            }
        }
    }
}