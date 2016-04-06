/**
 * CraftenLauncher is an alternative Launcher for Minecraft developed by Mojang.
 * Copyright (C) 2013  Johannes "redbeard" Busch, Sascha "saschb2b" Becker
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * @author saschb2b
 */
package de.craften.craftenlauncher.logic.manager;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TranslationManager {
    private static final Logger LOGGER = LogManager.getLogger(TranslationManager.class);

    public static String getString(String phrase) {
        Locale.setDefault(new Locale("en", "GB"));
        String baseName = "de.craften.craftlauncher.conf.CraftenLauncher";
        try {
            ResourceBundle bundle = ResourceBundle.getBundle(baseName);
            return bundle.getString(phrase);
        } catch (MissingResourceException e) {
            LOGGER.warn("Missing translation", e);
            return "#########";
        }
    }
}
