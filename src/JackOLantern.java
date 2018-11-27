public class JackOLantern {
    private String[][] faceFeatures;
    public JackOLantern(String[][] faceFeatures) {
        this.faceFeatures = faceFeatures;
    }
    public void edit(String replace,int row, int column)
    {

    }
    public void fill(String str)
    {

    }



    public String toString()
    {
        int x=0;
        int y=0;
        while (x < faceFeatures[x].length())
    {
            while (y < faceFeatures[x].length())
            {
                System.out.println(faceFeatures[x][y]);
                y=y+1;
            }
            x= x+1;
    }
     
    }

}
