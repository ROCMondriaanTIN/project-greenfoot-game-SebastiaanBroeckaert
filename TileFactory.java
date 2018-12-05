/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 0:
                tile = new Tile("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 1:
                tile = new Tile("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.BOX);
                tile.isSolid = true;
                break;
            case 6:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 8:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 10:
                tile = new Water("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.WATER);
                break;
            case 11:
                tile = new Tile("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.WATER);
                break;
            case 12:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 13:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 14:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 28:
                tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 45:
                tile = new Tile("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 48:
                tile = new Tile("dirtCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 50:
                tile = new Tile("dirtCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 52:
                tile = new Tile("dirtCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 58:
                tile = new Tile("dirtHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 59:
                tile = new Tile("dirtHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 60:
                tile = new Tile("dirtHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 61:
                tile = new Tile("dirtHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 65:
                tile = new Tile("dirtMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 67:
                tile = new Tile("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 68:
                tile = new Tile("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 69:
                tile = new Tile("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 70:
                tile = new Tile("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 71:
                tile = new Tile("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 74:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 76:
                tile = new Tile("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 81:
                tile = new Tile("grassHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 82:
                tile = new Tile("grassHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 83:
                tile = new Tile("grassHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 84:
                tile = new Tile("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 85:
                tile = new Tile("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 86:
                tile = new Tile("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 87:
                tile = new Tile("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 94:
                tile = new Lader("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.LADER);
                break;
            case 95:
                tile = new Lader("ladder_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.LADER);
                break;
            case 100:
                tile = new Tile("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.BLOCK);
                tile.isSolid = true;
                break;
            case 101:
                tile = new Tile("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GLOCK);
                tile.isSolid = true;
                break;
            case 102:
                tile = new Tile("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.RLOCK);
                tile.isSolid = true;
                break;
            case 103:
                tile = new Tile("lock_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.YLOCK);
                tile.isSolid = true;
                break;
            case 106:
                tile = new Tile("ropeAttached.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 108:
                tile = new Tile("ropeVertical.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 112:
                tile = new Tile("sandCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 114:
                tile = new Tile("sandCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 120:
                tile = new Tile("sandHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 121:
                tile = new Tile("sandHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 122:
                tile = new Tile("sandHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 123:
                tile = new Tile("sandHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 127:
                tile = new Tile("sandMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 151:
                tile = new Tile("stoneCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 166:
                tile = new Tile("stoneMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT, TileType.GROUND);
                tile.isSolid = true;
                break;
            case 169:
                tile = new Tile("tochLit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 170:
                tile = new Tile("tochLit2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 172:
                tile = new Tile("window.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 173:
                tile = new Tile("Bariere.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            default:
                tile = new Tile("Bariere.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
        }
        return tile;
    }
}
