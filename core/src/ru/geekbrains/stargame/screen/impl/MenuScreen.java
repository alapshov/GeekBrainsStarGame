package ru.geekbrains.stargame.screen.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.screen.BaseScreen;

public class MenuScreen extends BaseScreen {

    private final float V_LEN = 5f;
    private Texture img;
    private Texture background;
    private Vector2 touch;
    private Vector2 pos;
    private Vector2 v;


    @Override
    public void show() {
        super.show();
        img = new Texture("badlogic.jpg");
        background = new Texture("Space.png");
        pos = new Vector2();
        touch = new Vector2();
        v = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        batch.begin();
        batch.draw(img, pos.x, pos.y);
        batch.end();

        if(touch.dst(pos) > V_LEN) {
            pos.add(v);
        } else {
            pos.set(touch);
        }


    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
        background.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        touch.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(touch.cpy().sub(pos)).setLength(V_LEN);
        return super.touchDown(screenX, screenY, pointer, button);
    }
}
