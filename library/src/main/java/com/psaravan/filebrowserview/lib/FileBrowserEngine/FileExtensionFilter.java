package com.psaravan.filebrowserview.lib.FileBrowserEngine;

import java.util.ArrayList;

/**
 * Class to handle filtering files by their extension. Each extension
 * is stored in a HashMap (for fast searching) which is accessible via,
 * the getFilterList() method.
 *
 * @author Saravan Pantham
 */
public class FileExtensionFilter {

    private ArrayList<String> mFilterList;

    public FileExtensionFilter() {
        //mFilterList = new HashMap<String, Boolean>();
        mFilterList = new ArrayList<String>();

    }

    /**
     * Adds the specified extension to the HashMap. The extension MUST be
     * in the following format: ".xxx", where xxx is the actual file extension.
     * If the format doesn't match up, the extension will not be added to the
     * HashMap.
     *
     * @param extension The extension String to add to the HashMap.
     * @return True, if the extension was successfully added to the HashMap. False otherwise.
     */
    public boolean addExtension(String extension) {
        if (extension.startsWith("."))
            throw new IllegalArgumentException("Invalid file extension format. You must " +
                                               "start the extension with a period (.), " +
                                               "followed by the actual extension itself. " +
                                               "Exception thrown for the following extension: " +
                                                extension);

        return getFilterList().add(extension);
    }

    /**
     * @return The HashMap that stores all the file extensions for this filter object.
     */
    public ArrayList<String> getFilterList() {
        return mFilterList;
    }

}
