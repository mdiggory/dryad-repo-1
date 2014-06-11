/*
 */
package org.datadryad.journalstatistics.extractor;

import java.sql.SQLException;
import org.datadryad.api.DryadDataFile;
import org.dspace.content.Collection;
import org.dspace.core.Context;

/**
 * Counts Dryad Data Files in the archive associated with a specified Journal
 * @author Dan Leehr <dan.leehr@nescent.org>
 */
public class DataFileCount extends DataItemCount {
    public DataFileCount(Context context) {
        super(context);
    }

    @Override
    protected Collection getCollection() throws SQLException {
        return DryadDataFile.getCollection(getContext());
    }
}
