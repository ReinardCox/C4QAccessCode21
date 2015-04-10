package nyc.c4q.reinardcox;


/**
 * Created by davis on 4/4/15.
 */
public class Student {
    private String name;
    private int numOfPencilsInPocket;
    lunchbox changeColor;

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public int getNumOfPencilsInPocket(){
        return numOfPencilsInPocket;
    }
    public void setNumOfPencilsInPocket(int numOfPencilsInPocket){
        this.numOfPencilsInPocket = numOfPencilsInPocket;
    }
    public void setLunchBox(lunchbox item){
        this.changeColor = item;
    }

}

