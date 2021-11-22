package ru.geekbrains.stargame.screen.impl;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import ru.geekbrains.stargame.helpers.RenderHelper;
import ru.geekbrains.stargame.screen.BaseScreen;

public class MenuScreen extends BaseScreen {

    private Texture img;
    private Texture background;
    private Vector2 touch;
    private Vector2 v;
    private Vector2 v2;


    @Override
    public void show() {
        super.show();
        img = new Texture("badlogic.jpg");
        background = new Texture("Space.png");
        touch = new Vector2();
        v = new Vector2(0, 0);
        v2 = new Vector2(0, 0);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        v = RenderHelper.getDirectionVector(v2, touch, v);
        v2.add(v);
        batch.begin();
        batch.draw(img, v2.x, v2.y);
        batch.end();
        System.out.println(v.x +"  "+ v.y);

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
        return super.touchDown(screenX, screenY, pointer, button);
    }
}
