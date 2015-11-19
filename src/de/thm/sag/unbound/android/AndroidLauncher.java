package de.thm.sag.unbound.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import de.thm.sag.unbound.UnboundGame;

public class AndroidLauncher extends AndroidApplication {
	@Override
	//Test
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new UnboundGame(), config);
	}
}
