package Helpers;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class DataProviders {
    public DataProviders(){
        super();
    }
    public Iterator<Object[]> parseExcel(String pathFile, String sheetName) throws IOException {
        File myFile = new File(pathFile);
        FileInputStream fis = new FileInputStream(myFile);
        List<HashMap<Object, Object>> result = new ArrayList<HashMap<Object, Object>>();
        XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
        /*Get index sheet by shee name */
        int numberSheet = myWorkBook.getNumberOfSheets();
        int indexSheet = 0;
        boolean flag = false;
        for (int i = 0; i < numberSheet; i++) {
            if (sheetName.equals(myWorkBook.getSheetName(i))) {
                flag = true;
                indexSheet = i;
            }
        }
        Assert.assertTrue(flag, "Sheet name không tồn tại trong file");
        XSSFSheet mySheet = myWorkBook.getSheetAt(indexSheet);
        FormulaEvaluator evaluator = myWorkBook.getCreationHelper().createFormulaEvaluator();
        DataFormatter df = new DataFormatter();
        Iterator<Row> rowIterator = mySheet.iterator();
        int countRow = 0;
        List<String> header = new ArrayList<>();

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            HashMap<Object, Object> map = new HashMap<>();
            if (countRow == 0) {
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    header.add(cell.getStringCellValue().trim());
                }
            } else {
                for (int i = 0; i < header.size(); i++) {
                    Cell c = row.getCell(i);
                    String cellValue = df.formatCellValue(c,evaluator);
                    map.put((header.get(i)), cellValue);
//                    if (c != null) {
//                        switch (c.getCellType()) {
//                            case STRING:
//                                map.put(header.get(i), c.getStringCellValue().trim());
//                                break;
//                            case NUMERIC:
//                                DataFormatter df = new DataFormatter();
//                                String cellValue = df.formatCellValue(c,evaluator);
//                                map.put((header.get(i)), cellValue);
//                                break;
//                            case BOOLEAN:
//                                map.put(header.get(i), c.getBooleanCellValue());
//                                break;
//                            default:
//                                break;
//                        }
//                    } else {
//                        map.put(header.get(i), "");
//                    }
                }
                result.add(map);
            }
            countRow++;
        }
        Collection<Object[]> dp = new ArrayList<Object[]>();
        for(Map<Object,Object> map:result){
            dp.add(new Object[]{map});
        }
        return dp.iterator();
    }
}
