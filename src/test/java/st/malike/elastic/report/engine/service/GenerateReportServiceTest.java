/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.malike.elastic.report.engine.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import st.malike.elastic.report.engine.exception.ReportFormatUnkownException;
import st.malike.elastic.report.engine.exception.TemplateNotFoundException;
import st.malike.elastic.report.engine.util.Enums;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author malike_st
 */
@RunWith(MockitoJUnitRunner.class)
public class GenerateReportServiceTest {

    @InjectMocks
    GenerateReportService generateReportService;
    Map map;
    List list;
    String fileName;
    String templateFileName;
    String templateFileLocation;
    Enums.ReportFormat reportFormat;

    @Before
    public void setUp() throws Exception {
        map = new HashMap<>();
        list= new LinkedList<>();
        fileName = "RANDOM_REPORT";
        templateFileName ="SampleTemplate.jrxml";
        reportFormat = Enums.ReportFormat.PDF;
        ClassLoader classLoader = getClass().getClassLoader();
        File tempFile = new File(classLoader.getResource(templateFileName).getFile());
        templateFileLocation = tempFile.getAbsolutePath();

    }

    @Test
    @Ignore
    public void testGenerateReport() throws Exception {
        generateReportService.generateReport(map,list,templateFileLocation,fileName,reportFormat);
    }
    
    @Test(expected = TemplateNotFoundException.class)
    public void testGenerateReportThrowsTemplateNotFoundException() throws Exception {
        generateReportService.generateReport(map,list,null,fileName,reportFormat);
    }

    @Test(expected = ReportFormatUnkownException.class)
    public void testGenerateReportThrowsReportFormatUnknowException() throws Exception {
        generateReportService.generateReport(map,list,templateFileLocation,fileName,null);
    }


}
