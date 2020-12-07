package com.evghenii.gamemap.loader.impl;

import com.evghenii.gamemap.abstracts.AbstractGameMap;
import com.evghenii.gamemap.loader.abstracts.AbstractMapLoader;
import com.evghenii.gameobjects.impl.Coordinate;
import com.evghenii.objects.MapInfo;
import com.evghenii.objects.SavedMapInfo;
import com.evghenii.objects.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FSMapLoader extends AbstractMapLoader {
    private static final String SAVE_EXTENSION = ".sav";

    public FSMapLoader(AbstractGameMap gameMap) {
        super(gameMap);
    }


    @Override
    public boolean loadMap(MapInfo mapInfo) {
        File file = new File("game.map");
        if (!file.exists()) {
            throw new IllegalArgumentException("filename must not be empty!");
        }

        try {
            gameMap.getGameCollection().clear();
            
            gameMap.getMapInfo().setExitExist(false);
            gameMap.getMapInfo().setGoldManExist(false);

            gameMap.getMapInfo().setHeight(getLineCount(file));

            BufferedReader br = new BufferedReader(new FileReader(file));

            String strLine = br.readLine().trim(); // считываем первую строку для определения имени, длины, ширины карты. убираем пробела по краям

            // разбиваем первую строку на токены, разделенные запятой.            
            gameMap.getMapInfo().setMapName(strLine.split(",")[0]);
            gameMap.getMapInfo().setId(1);

            gameMap.getMapInfo().setTurnsLimit(Integer.valueOf(strLine.split(",")[1]).intValue());
            gameMap.getMapInfo().setWidth(Integer.valueOf(strLine.split(",")[2]).intValue());

            int y = 0; // номер строки в массиве
            int x = 0; // номер столбца в массиве

            while ((strLine = br.readLine()) != null) {
                x = 0; // чтобы каждый раз с первого столбца начинал

                for (String str : strLine.split(",")) {
                    // вытаскивать все значения в строке между запятыми, чтобы заполнить карту элементами

                    createGameObject(str, new Coordinate(x, y));
                    x++;
                }
                y++;
            }

            if (!gameMap.getMapInfo().isValidMap()) {
                throw new Exception("The map is not valid!");
            }

        } catch (Exception ex) {
            Logger.getLogger(FSMapLoader.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }


        return true;

    }

  

    @Override
    public boolean saveMap(SavedMapInfo mapInfo) {

        File f = new File("save");

        if (!f.exists()) {
            f.mkdir();
        }

        try {
            FileOutputStream fos = new FileOutputStream(f.getAbsoluteFile() + "/" + mapInfo.getUser().getUsername()+"_"+new Date().getTime()+SAVE_EXTENSION);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(FSMapLoader.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    private int getLineCount(File file) {
        BufferedReader reader = null;
        int lineCount = 0;
        try {
            reader = new BufferedReader(new FileReader(file));

            while (reader.readLine() != null) {
                lineCount++;
            }
            lineCount = lineCount - 1;// lineNumber-1 потому что первая строка из файла не входит в карту
        } catch (IOException ex) {
            Logger.getLogger(FSMapLoader.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(FSMapLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lineCount;

    }

    @Override
    public ArrayList<SavedMapInfo> getSavedMapList(User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean deleteSavedMap(MapInfo mapInfo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

   
   
}
