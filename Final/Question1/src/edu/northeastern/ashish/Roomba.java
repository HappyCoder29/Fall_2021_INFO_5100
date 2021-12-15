package edu.northeastern.ashish;



public class Roomba implements  iRobot{

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }
    int[][] room;
    int x ;
    int y ;

    Direction dir;
    int rows;
    int cols;


    public Roomba(int[][] room){
        this.room = room;
        this.x = 0;
        this.y = 0;
        dir = Direction.DOWN;
        rows = room.length;
        cols = room[0].length;

    }


    @Override
    public boolean move() {

        if(dir == Direction.UP){
            if(y-1 < 0 || room[x][y-1] == -1){
                return false;
            }
            y = y-1;
        }
        else if (dir == Direction.DOWN){
            if(y + 1 >= rows  || room[x][y+1] == -1 ){
                return false;
            }
            y = y+1;
        }
        else if (dir == Direction.LEFT){
            if(x -1 < 0 || room[x-1][y] == -1){
                return false;
            }
            x = x-1;
        }
        else if (dir == Direction.RIGHT){
            if(x + 1 >= cols  || room[x+1][y] == -1){
                return false;
            }
            x = x + 1;
        }

        return true;
    }

    @Override
    public void turnLeft() {
        if(dir == Direction.DOWN){
            dir = Direction.RIGHT;
        }else if(dir == Direction.UP){
            dir = Direction.LEFT;
        }
        else if(dir == Direction.LEFT){
            dir = Direction.DOWN;
        }
        else if(dir == Direction.RIGHT){
            dir = Direction.UP;
        }
    }

    @Override
    public void turnRight() {
        if(dir == Direction.DOWN){
            dir = Direction.LEFT;
        }else if(dir == Direction.UP){
            dir = Direction.RIGHT;
        }
        else if(dir == Direction.LEFT){
            dir = Direction.UP;
        }
        else if(dir == Direction.RIGHT){
            dir = Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        room[x][y] = 1;
    }


}
