package ru.geekbrains.stargame.helpers;

import com.badlogic.gdx.math.Vector2;

public class RenderHelper {
    /**
     * Создаем вектор с нужным направлнием
     * @param v1
     * @param v2
     * @param v3
     * @return
     */
    public static Vector2 getDirectionVector(Vector2 v1, Vector2 v2, Vector2 v3){
        if (v1.x == v2.y) {
            v3.x = 0;
        }
        if (v1.y == v2.y) {
            v3.y = 0;
        }
        if (v1.x > v2.x) {
            v3.x = -1;
        } else {
            v3.x = 1;
        }
        if (v1.y > v2.y) {
            v3.y = -1;
        } else {
            v3.y = 1;
        }
        return v3;
    }

}
