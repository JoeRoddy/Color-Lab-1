

public class ColorfulThing{
    public enum Colors {RED,BLUE,YELLOW}
    Colors colName;
    private String color;
    ColorfulThing(Colors x){
        this.colName=x;
    }

    public Colors getColor(){
        return colName;
    }
}
