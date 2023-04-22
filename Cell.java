public class Cell {
    private int x, y, status;
    //status: 0 - sea, 1 - miss, 2 - ship, 3 - dead ship
    Cell(int x, int y, int status){
        this.x = x;
        this.y = y;
        this.status = status;
    }
    int getX(){return x;}
    int getY(){return y;}
    int getStatus(){return status;}
    void setStatus(Cell cell, int newStatus){cell.status = newStatus;}
    boolean checkHit(int x, int y){
        if(this.x == x && this.y == y){
            if(status == 0)
                status = 1;
            else if(status == 2)
                    status = 3;
            else;
            return true;
        }
        return false;
    }
}
