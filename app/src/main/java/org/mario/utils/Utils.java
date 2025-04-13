package org.mario.utils;

import java.net.URL;

public class Utils {

	public static URL getAssetUrl(String path) {
		URL imageUrl = Utils.class.getResource("/assets/" + path);
		return imageUrl;
	}
}
