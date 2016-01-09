/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;

import dao.TeacherDao;
import entity.ExcelWorkSheet;
import entity.Teacher;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ImportTeacher extends ActionSupport{
    private File excelFile;
    private String excelFileFileName;
    private ExcelWorkSheet<Teacher> excelWorkSheet;
    private Workbook createWorkBook(InputStream is) throws Exception{
        if(getExcelFileFileName().toLowerCase().endsWith("xls")){
            return new HSSFWorkbook(is);
        }
        if(getExcelFileFileName().toLowerCase().endsWith("xlsx"))
        {
            return new XSSFWorkbook(is);
        }
        return null;
    }
    
    
    public ImportTeacher() {
    }
    
    @Override
    public String execute() throws Exception {
       Workbook workbook=createWorkBook(new FileInputStream(excelFile));
       Sheet sheet=(Sheet) workbook.getSheetAt(0);
       excelWorkSheet=new ExcelWorkSheet<Teacher>();
       excelWorkSheet.setSheetName(sheet.getSheetName());
       Row firstRow=sheet.getRow(0);
       Iterator<org.apache.poi.ss.usermodel.Cell>iterator=firstRow.iterator();
       List<String>cellNames=new ArrayList<String>();
       while(iterator.hasNext()){
           cellNames.add(iterator.next().getStringCellValue());
       }
       excelWorkSheet.setColumns(cellNames);
        for (int i = 1; i <=sheet.getLastRowNum(); i++) {
            Row row=sheet.getRow(i);
           Teacher teacher = new Teacher();
            int a=(int)row.getCell(0).getNumericCellValue();
            String s=Integer.toString(a);
                teacher.setTeaId(s);        
            teacher.setTname(row.getCell(1).getStringCellValue());
           teacher.setAge((int)row.getCell(2).getNumericCellValue());
             teacher.setTpassword("2012");
           TeacherDao td= new TeacherDao();
           td.saveTeacher(teacher);
            excelWorkSheet.getData().add(teacher);
        }
        return SUCCESS;
    }

    /**
     * @return the excelFile
     */
    public File getExcelFile() {
        return excelFile;
    }

    /**
     * @param excelFile the excelFile to set
     */
    public void setExcelFile(File excelFile) {
        this.excelFile = excelFile;
    }

 
    public ExcelWorkSheet<Teacher> getExcelWorkSheet() {
        return excelWorkSheet;
    }

    /**
     * @param excelWorkSheet the excelWorkSheet to set
     */
    public void setExcelWorkSheet(ExcelWorkSheet<Teacher> excelWorkSheet) {
        this.excelWorkSheet = excelWorkSheet;
    }

    /**
     * @return the excelFileFileName
     */
    public String getExcelFileFileName() {
        return excelFileFileName;
    }

    /**
     * @param excelFileFileName the excelFileFileName to set
     */
    public void setExcelFileFileName(String excelFileFileName) {
        this.excelFileFileName = excelFileFileName;
    }
}
