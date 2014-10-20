/*
 * Clover - 4chan browser https://github.com/Floens/Clover/
 * Copyright (C) 2014  Floens
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.floens.chan.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;

import org.floens.chan.R;

public class IconCache {
    public static BitmapDrawable stickyIcon;
    public static BitmapDrawable closedIcon;
    public static BitmapDrawable trashIcon;
    public static BitmapDrawable archivedIcon;

    public static void createIcons(final Context context) {
        Resources res = context.getResources();
        stickyIcon = new BitmapDrawable(res, BitmapFactory.decodeResource(res, R.drawable.sticky_icon));
        closedIcon = new BitmapDrawable(res, BitmapFactory.decodeResource(res, R.drawable.closed_icon));
        trashIcon = new BitmapDrawable(res, BitmapFactory.decodeResource(res, R.drawable.trash_icon));
        archivedIcon = new BitmapDrawable(res, BitmapFactory.decodeResource(res, R.drawable.archived_icon));
    }
}
