/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.elastic.report.engine.service;

import java.io.File;
import java.security.PrivilegedActionException;
import java.util.List;
import java.util.Map;
import st.malike.elastic.report.engine.exception.JasperGenerationException;
import st.malike.elastic.report.engine.exception.ReportFormatUnknownException;
import st.malike.elastic.report.engine.exception.TemplateNotFoundException;

/**
 * @author malike_st
 */
public interface GenerateReportService {

  public File generateReport(Map params, List data, String templateFile,
      String fileName, Generator.ReportFormat reportFormat)
      throws TemplateNotFoundException, JasperGenerationException, ReportFormatUnknownException, PrivilegedActionException;

}
