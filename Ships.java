import java.util.ArrayList;

public class Ships {
    private ArrayList<Ship> ships = new ArrayList<Ship>();
    private int[] pool = {4, 3, 2, 1};

    boolean addShip(int x, int y, int length, int orientation){
        if(length > 4 || length < 1){
            return false;
        }
        Ship newShip = new Ship(x, y, length, orientation);
        if(newShip.isOutSea() || newShip.isInShipOrArea(newShip)){
            return false;
        }
        if(pool[length-1] == 0)
        {
            return false;
        }
        ships.add(newShip);
        pool[length-1] --;
        return true;
    }
    int getPoolInd(int ind){
        return pool[ind];
    }
    boolean checkShips(){
        for(Ship ship: ships){
            if(ship.shipStatus())
                return true;
        }
        return false;
    }
}
