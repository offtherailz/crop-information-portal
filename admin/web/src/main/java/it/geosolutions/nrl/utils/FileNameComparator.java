/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2002-2011, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package it.geosolutions.nrl.utils;

import java.io.File;
import java.util.Comparator;

/**
 * Utility to sort 
 * @author Lorenzo Natali
 *
 */
public class FileNameComparator implements Comparator<File> {
    @Override
    public int compare(File o1, File o2) {
        String p1 = o1.getAbsolutePath();
        String p2 = o2.getAbsolutePath();
        return p1.compareTo(p2);
    }
}
