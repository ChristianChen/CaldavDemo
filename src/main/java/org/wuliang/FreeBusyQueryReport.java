/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.wuliang;

import org.apache.jackrabbit.webdav.DavException;
import org.apache.jackrabbit.webdav.DavResource;
import org.apache.jackrabbit.webdav.version.DeltaVConstants;
import org.apache.jackrabbit.webdav.version.report.Report;
import org.apache.jackrabbit.webdav.version.report.ReportInfo;
import org.apache.jackrabbit.webdav.version.report.ReportType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author ricky
 */
public class FreeBusyQueryReport implements Report, DeltaVConstants {

    public static final ReportType FREE_BUSY_QUERY = ReportType.register(
            CalDavConstants.CALDAV_XML_FREE_BUSY_QUERY,
            CalDavConstants.CALDAV_NAMESPACE,
            FreeBusyQueryReport.class);

    public ReportType getType() {
        return FREE_BUSY_QUERY;
    }

    public boolean isMultiStatusReport() {
        return false;
    }

    public void init(DavResource dr, ReportInfo ri) throws DavException {
    }

    public Element toXml(Document dcmnt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
