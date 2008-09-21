/*
 * This file is part of muCommander, http://www.mucommander.com
 * Copyright (C) 2002-2008 Maxence Bernard
 *
 * muCommander is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * muCommander is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.mucommander.file.impl.rar;

import com.mucommander.file.AbstractArchiveFile;
import com.mucommander.file.AbstractFile;
import com.mucommander.file.ArchiveFormatProvider;
import com.mucommander.file.filter.ExtensionFilenameFilter;
import com.mucommander.file.filter.FilenameFilter;

import java.io.IOException;

/**
 * This class is the provider for the 'Rar' archive format implemented by {@link RarArchiveFile}.
 *
 * @see com.mucommander.file.impl.rar.RarArchiveFile
 * @author Arik Hadas
 */
public class RarFormatProvider implements ArchiveFormatProvider {
	/** Static instance of the filename filter that matches archive filenames */
    private final static ExtensionFilenameFilter filenameFilter = new ExtensionFilenameFilter(new String[]
        {".rar"}
    );


    //////////////////////////////////////////
    // ArchiveFormatProvider implementation //
    //////////////////////////////////////////

    public AbstractArchiveFile getFile(AbstractFile file) throws IOException {
        return new RarArchiveFile(file);
    }

    public FilenameFilter getFilenameFilter() {
        return filenameFilter;
    }
}