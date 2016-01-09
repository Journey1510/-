/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;

import dao.ClassDao;
import dao.Usermanager;
import entity.Classes;
import entity.ExcelWorkSheet;
import entity.Student;
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


public class ImportClass extends ActionSupport{
    private File excelFile;
    private String excelFileFileName;
    private ExcelWorkSheet<Classes> excelWorkSheet;
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
    
    
    public ImportClass() {
    }
    
    @Override
    public String execute() throws Exception {
       Workbook workbook=createWorkBook(new FileInputStream(excelFile));
       Sheet sheet=(Sheet) workbook.getSheetAt(0);
       excelWorkSheet=new ExcelWorkSheet<Classes>();
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
           Classes cs=new Classes();
            int a=(int)row.getCell(0).getNumericCellValue();
            String s=Integer.toString(a);
           cs.setTeaId(s);
            cs.setCname(row.getCell(1).getStringCellValue());
            int b=(int)row.getCell(2).getNumericCellValue();
            String x=Integer.toString(b);
            cs.setCmark(x);
            cs.setCourTime(row.getCell(3).getStringCellValue()); 
            int c=(int)row.getCell(4).getNumericCellValue();
            String y=Integer.toString(c);
            cs.setRoomId(y);
           cs.setChooseMax((int)row.getCell(5).getNumericCellValue());
            ClassDao csd=new ClassDao();
            csd.saveClasses(cs);
            excelWorkSheet.getData().add(cs);
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

 
    public ExcelWorkSheet<Classes> getExcelWorkSheet() {
        return excelWorkSheet;
    }

    /**
     * @param excelWorkSheet the excelWorkSheet to set
     */
    public void setExcelWorkSheet(ExcelWorkSheet<Classes> excelWorkSheet) {
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
