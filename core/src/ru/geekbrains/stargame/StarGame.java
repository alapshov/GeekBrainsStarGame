package ru.geekbrains.stargame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.geekbrains.stargame.screen.impl.MenuScreen;

public class StarGame extends Game {


	@Override
	public void create() {
		setScreen(new MenuScreen());
	}
}
