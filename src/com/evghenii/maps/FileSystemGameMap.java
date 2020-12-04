package com.evghenii.maps;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.abstractsGame.AbstractMapObject;
import com.evghenii.create.GameObjectCreator;
import com.evghenii.enums.GameObjectType;
import com.evghenii.objects.Coordinate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileSystemGameMap extends AbstractMapObject {

    @Override
    public boolean drawMap() {
        return false;
    }

    @Override
    public boolean loadMap(Object sourse) {

        File file = new File(sourse.toString());
        if (!file.exists()) {
            throw new IllegalArgumentException("File is NOT Exists");
        }

        try {
            setExitExist(false);
            setGoldManExist(false);

            setHeight(getLineCount(file));

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str = bufferedReader.readLine().trim(); //считывает первую строку для определения длины,имени, ширины карты, убирает все пробелы
            setName(str.split(",")[0]);

            setLimit(Integer.valueOf(str.split(",")[1]).intValue());
            setWidht(Integer.valueOf(str.split(",")[2]).intValue());

            int y = 0; // номер строки в массиве
            int x = 0; // номер столбца в массиве

            while ((str = bufferedReader.readLine()) != null) {
                x = 0; // чтобы каждый раз с первого столбца начинал

                for (String line : str.split(",")) {
                    // вытаскивать все значения в строке между запятыми, чтобы заполнить карту элементами

                    createGameObject(line, new Coordinate(x, y));
                    x++;
                }
                y++;
            }
            if (!isValidMap()) {
                throw new Exception("The map is not valid!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean saveMap(Object o) {
        return false;
    }

    private void createGameObject(String str, Coordinate coordinate) {

        GameObjectType type = GameObjectType.valueOf(str.toUpperCase());

        AbstractGameObject newObj = GameObjectCreator.getInstance().createObject(type, coordinate);

        addGameObject(newObj);

        if (newObj.getType() == GameObjectType.EXIT) {
            setExitExist(true);
        } else if (newObj.getType() == GameObjectType.GOLDMAN) {
            setGoldManExist(true);
        }
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
            Logger.getLogger(FileSystemGameMap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(FileSystemGameMap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lineCount;

    }
}
