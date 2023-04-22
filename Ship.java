import java.util.ArrayList;

public class Ship {
    private ArrayList<Cell> cells = new ArrayList<Cell>();
    public Ship(int x, int y, int length, int orientation){
        int stepX = x;
        int stepY = y;
        for(int i = 0; i < length; i++){
            if(orientation == 0){
                stepX = x+i;
            }
            else
                stepY = y+i;
            cells.add(new Cell(stepX, stepY, 2));
        }
    }
    boolean isOutSea(){
        for(Cell cell: cells){
            if(cell.getX() < 1 || cell.getX() > 11 ||
                    cell.getY() < 1 || cell.getY() > 11)
                return true;
        }
        return false;
    }
    boolean isInShipOrArea(Ship newShip){
        for(Cell cell: cells)
            if(newShip.isInCellOrArea(cell))
                return true;
        return false;
    }
    boolean isInCellOrArea(Cell newCell){
        for (Cell cell: cells) {
            for (int areaX = -1; areaX < 2; areaX++)
                for (int areaY = -1; areaY < 2; areaY++)
                    if (newCell.getX() == cell.getX() + areaX &&
                            newCell.getY() == cell.getY() + areaY)
                        return true;
        }
        return false;
    }
    boolean checkHit(int x, int y)
    {
        for(Cell cell: cells){
            if(cell.checkHit(x, y))
                return true;
        }
        return false;
    }
    boolean shipStatus(){
        for(Cell cell: cells)
            if(cell.getStatus() == 2)
                return true;
        return false;
    }
}
