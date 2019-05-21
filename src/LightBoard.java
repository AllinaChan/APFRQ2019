public class LightBoard
{
    /** The lights on the board, where true represents on and false represents off.
     */
    private boolean[][] lights;
    /** Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols)
    {
        this.lights = new boolean[numRows][numCols];
        for(int x = 0; x < numRows; x++){
            for(int y = 0; y < numCols; y++){
                if(Math.random() < 0.4) this.lights[x][y] = true;
                else this.lights[x][y] = false;
            }
        }
    }
    /** Evaluates a light in row index row and column index col and returns a status
     * as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */
    public boolean evaluateLight(int row, int col)
    {
        int numInCol = 0;
        for(int i = 0; i < this.lights.length; i++) if(this.lights[i][col]) numInCol++;
        if (this.lights[row][col]==true) if (numInCol%2==0) return false;
        else if (numInCol%3==0) return true;
        return this.lights[row][col];
    }

    @Override
    public String toString() {
        String result = "";
        for(int x = 0; x < this.lights.length; x++){
            for(int y = 0; y < this.lights[x].length; y++){
                if(this.lights[x][y]) result += "X";
                else result += "O";
            }
            result += "\n";
        }
        return result;
    }

    // There may be additional instance variables, constructors, and methods not shown.
}