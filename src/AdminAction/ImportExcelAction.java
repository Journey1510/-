
package AdminAction;

import com.opensymphony.xwork2.ActionSupport;

import dao.Usermanager;
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


public class ImportExcelAction extends ActionSupport{
    private File excelFile;
    private String excelFileFileName;
    private ExcelWorkSheet<Student> excelWorkSheet;
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
    
    
    public ImportExcelAction() {
    }
    
    @Override
    public String execute() throws Exception {
       Workbook workbook=createWorkBook(new FileInputStream(excelFile));
       Sheet sheet=(Sheet) workbook.getSheetAt(0);
       excelWorkSheet=new ExcelWorkSheet<Student>();
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
            Student student=new Student();
            int a=(int)row.getCell(0).getNumericCellValue();
            String s=Integer.toString(a);
            student.setSno(s);
            student.setUsername(row.getCell(1).getStringCellValue());
            student.setSex(row.getCell(2).getStringCellValue());      
            student.setDepartment(row.getCell(3).getStringCellValue());
            student.setJiguan(row.getCell(4).getStringCellValue());           
            student.setMaxClasses(4);
             student.setPassword("2012");
            Usermanager um=new Usermanager();
            um.saveStudent(student);
            excelWorkSheet.getData().add(student);
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

 
    public ExcelWorkSheet<Student> getExcelWorkSheet() {
        return excelWorkSheet;
    }

    /**
     * @param excelWorkSheet the excelWorkSheet to set
     */
    public void setExcelWorkSheet(ExcelWorkSheet<Student> excelWorkSheet) {
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
